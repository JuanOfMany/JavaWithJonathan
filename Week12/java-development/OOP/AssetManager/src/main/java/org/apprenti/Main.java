package org.apprenti;

import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ArrayList<Asset> assets = new ArrayList<>();

        assets.add(new House("Modern villa", "2022-05-12", 500000.00, "123 Palm Street", 3, 3500, 5000));
        assets.add(new House("Country cottage", "2021-03-25", 200000.00, "456 Oak Road", 2, 1500, 2000));
        assets.add(new House("Downtown apartment", "2023-01-15", 300000.00, "789 Maple Avenue", 1, 1200, 800));

        assets.add(new Vehicle("Tesla Model S", "2022-08-10", 80000.00));
        assets.add(new Vehicle("BMW X5", "2020-11-20", 60000.00));
        assets.add(new Vehicle("Ford F-150", "2019-06-30", 30000.00));

        for (Asset asset : assets) {
            System.out.println(asset.getDescription() + " acquired on " + asset.getDateAcquired() + " with current " +
                    "value" +
                    " " + asset.getValue());
        }
    }
}