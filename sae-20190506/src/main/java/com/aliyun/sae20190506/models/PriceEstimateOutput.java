// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class PriceEstimateOutput extends TeaModel {
    @NameInMap("Apps")
    public java.util.List<PriceEstimateOutputApps> apps;

    @NameInMap("Items")
    public java.util.List<PriceEstimateOutputItems> items;

    /**
     * <strong>example:</strong>
     * <p>235.66</p>
     */
    @NameInMap("TotalPrice")
    public Float totalPrice;

    public static PriceEstimateOutput build(java.util.Map<String, ?> map) throws Exception {
        PriceEstimateOutput self = new PriceEstimateOutput();
        return TeaModel.build(map, self);
    }

    public PriceEstimateOutput setApps(java.util.List<PriceEstimateOutputApps> apps) {
        this.apps = apps;
        return this;
    }
    public java.util.List<PriceEstimateOutputApps> getApps() {
        return this.apps;
    }

    public PriceEstimateOutput setItems(java.util.List<PriceEstimateOutputItems> items) {
        this.items = items;
        return this;
    }
    public java.util.List<PriceEstimateOutputItems> getItems() {
        return this.items;
    }

    public PriceEstimateOutput setTotalPrice(Float totalPrice) {
        this.totalPrice = totalPrice;
        return this;
    }
    public Float getTotalPrice() {
        return this.totalPrice;
    }

    public static class PriceEstimateOutputAppsUsages extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>3600.00</p>
         */
        @NameInMap("Amount")
        public Float amount;

        /**
         * <strong>example:</strong>
         * <p>Microservice_cpuUsage</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <strong>example:</strong>
         * <p>核*秒</p>
         */
        @NameInMap("Unit")
        public String unit;

        public static PriceEstimateOutputAppsUsages build(java.util.Map<String, ?> map) throws Exception {
            PriceEstimateOutputAppsUsages self = new PriceEstimateOutputAppsUsages();
            return TeaModel.build(map, self);
        }

        public PriceEstimateOutputAppsUsages setAmount(Float amount) {
            this.amount = amount;
            return this;
        }
        public Float getAmount() {
            return this.amount;
        }

        public PriceEstimateOutputAppsUsages setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public PriceEstimateOutputAppsUsages setUnit(String unit) {
            this.unit = unit;
            return this;
        }
        public String getUnit() {
            return this.unit;
        }

    }

    public static class PriceEstimateOutputApps extends TeaModel {
        @NameInMap("Feature")
        public PriceEstimateFeature feature;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Id")
        public Long id;

        @NameInMap("Usages")
        public java.util.List<PriceEstimateOutputAppsUsages> usages;

        public static PriceEstimateOutputApps build(java.util.Map<String, ?> map) throws Exception {
            PriceEstimateOutputApps self = new PriceEstimateOutputApps();
            return TeaModel.build(map, self);
        }

        public PriceEstimateOutputApps setFeature(PriceEstimateFeature feature) {
            this.feature = feature;
            return this;
        }
        public PriceEstimateFeature getFeature() {
            return this.feature;
        }

        public PriceEstimateOutputApps setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public PriceEstimateOutputApps setUsages(java.util.List<PriceEstimateOutputAppsUsages> usages) {
            this.usages = usages;
            return this;
        }
        public java.util.List<PriceEstimateOutputAppsUsages> getUsages() {
            return this.usages;
        }

    }

    public static class PriceEstimateOutputItemsSteps extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Begin")
        public Long begin;

        /**
         * <strong>example:</strong>
         * <p>10000</p>
         */
        @NameInMap("End")
        public Long end;

        /**
         * <strong>example:</strong>
         * <p>0.0001</p>
         */
        @NameInMap("Price")
        public Float price;

        @NameInMap("RegionIds")
        public java.util.List<String> regionIds;

        /**
         * <strong>example:</strong>
         * <p>核*秒</p>
         */
        @NameInMap("Unit")
        public String unit;

        public static PriceEstimateOutputItemsSteps build(java.util.Map<String, ?> map) throws Exception {
            PriceEstimateOutputItemsSteps self = new PriceEstimateOutputItemsSteps();
            return TeaModel.build(map, self);
        }

        public PriceEstimateOutputItemsSteps setBegin(Long begin) {
            this.begin = begin;
            return this;
        }
        public Long getBegin() {
            return this.begin;
        }

        public PriceEstimateOutputItemsSteps setEnd(Long end) {
            this.end = end;
            return this;
        }
        public Long getEnd() {
            return this.end;
        }

        public PriceEstimateOutputItemsSteps setPrice(Float price) {
            this.price = price;
            return this;
        }
        public Float getPrice() {
            return this.price;
        }

        public PriceEstimateOutputItemsSteps setRegionIds(java.util.List<String> regionIds) {
            this.regionIds = regionIds;
            return this;
        }
        public java.util.List<String> getRegionIds() {
            return this.regionIds;
        }

        public PriceEstimateOutputItemsSteps setUnit(String unit) {
            this.unit = unit;
            return this;
        }
        public String getUnit() {
            return this.unit;
        }

    }

    public static class PriceEstimateOutputItems extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>3600.00</p>
         */
        @NameInMap("Amount")
        public Float amount;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Count")
        public Long count;

        /**
         * <strong>example:</strong>
         * <p>p_micro_service_cpu</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <strong>example:</strong>
         * <p>1.00</p>
         */
        @NameInMap("Price")
        public Float price;

        @NameInMap("Steps")
        public java.util.List<PriceEstimateOutputItemsSteps> steps;

        /**
         * <strong>example:</strong>
         * <p>pack/post</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <strong>example:</strong>
         * <p>核*秒</p>
         */
        @NameInMap("Unit")
        public String unit;

        public static PriceEstimateOutputItems build(java.util.Map<String, ?> map) throws Exception {
            PriceEstimateOutputItems self = new PriceEstimateOutputItems();
            return TeaModel.build(map, self);
        }

        public PriceEstimateOutputItems setAmount(Float amount) {
            this.amount = amount;
            return this;
        }
        public Float getAmount() {
            return this.amount;
        }

        public PriceEstimateOutputItems setCount(Long count) {
            this.count = count;
            return this;
        }
        public Long getCount() {
            return this.count;
        }

        public PriceEstimateOutputItems setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public PriceEstimateOutputItems setPrice(Float price) {
            this.price = price;
            return this;
        }
        public Float getPrice() {
            return this.price;
        }

        public PriceEstimateOutputItems setSteps(java.util.List<PriceEstimateOutputItemsSteps> steps) {
            this.steps = steps;
            return this;
        }
        public java.util.List<PriceEstimateOutputItemsSteps> getSteps() {
            return this.steps;
        }

        public PriceEstimateOutputItems setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public PriceEstimateOutputItems setUnit(String unit) {
            this.unit = unit;
            return this;
        }
        public String getUnit() {
            return this.unit;
        }

    }

}
