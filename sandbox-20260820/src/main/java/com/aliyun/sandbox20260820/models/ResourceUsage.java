// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sandbox20260820.models;

import com.aliyun.tea.*;

public class ResourceUsage extends TeaModel {
    /**
     * <p>The end time of the requested interval, exclusive.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2026-11-05T02:00:00Z</p>
     */
    @NameInMap("endTime")
    public String endTime;

    /**
     * <p>The aggregation granularity used for this query. Valid values: All, Hour, and Day.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Hour</p>
     */
    @NameInMap("granularity")
    public String granularity;

    /**
     * <p>The grouping keys used for this query. This is an empty array if no grouping is applied.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;teamID&quot;]</p>
     */
    @NameInMap("groupBy")
    public java.util.List<String> groupBy;

    /**
     * <p>The usage for each group. If no grouping is applied, the usage is aggregated across the entire query range. An empty array is returned if no matching groups are found.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;dimensions&quot;:{&quot;teamID&quot;:&quot;70d1c834-0333-58d8-97ac-5336eb9179eb&quot;},&quot;items&quot;:[{&quot;usageName&quot;:&quot;activeVCPU&quot;,&quot;unit&quot;:&quot;CoreSecond&quot;,&quot;total&quot;:5400,&quot;buckets&quot;:[{&quot;startTime&quot;:&quot;2026-11-05T00:00:00Z&quot;,&quot;endTime&quot;:&quot;2026-11-05T01:00:00Z&quot;,&quot;quantity&quot;:3600},{&quot;startTime&quot;:&quot;2026-11-05T01:00:00Z&quot;,&quot;endTime&quot;:&quot;2026-11-05T02:00:00Z&quot;,&quot;quantity&quot;:1800}]}]}]</p>
     */
    @NameInMap("groups")
    public java.util.List<ResourceUsageGroups> groups;

    /**
     * <p>The start time of the requested interval, inclusive.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2026-11-05T00:00:00Z</p>
     */
    @NameInMap("startTime")
    public String startTime;

    public static ResourceUsage build(java.util.Map<String, ?> map) throws Exception {
        ResourceUsage self = new ResourceUsage();
        return TeaModel.build(map, self);
    }

    public ResourceUsage setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public ResourceUsage setGranularity(String granularity) {
        this.granularity = granularity;
        return this;
    }
    public String getGranularity() {
        return this.granularity;
    }

    public ResourceUsage setGroupBy(java.util.List<String> groupBy) {
        this.groupBy = groupBy;
        return this;
    }
    public java.util.List<String> getGroupBy() {
        return this.groupBy;
    }

    public ResourceUsage setGroups(java.util.List<ResourceUsageGroups> groups) {
        this.groups = groups;
        return this;
    }
    public java.util.List<ResourceUsageGroups> getGroups() {
        return this.groups;
    }

    public ResourceUsage setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public static class ResourceUsageGroupsItemsBuckets extends TeaModel {
        /**
         * <p>The end time of the usage statistics for this bucket, exclusive.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-11-05T01:00:00Z</p>
         */
        @NameInMap("endTime")
        public String endTime;

        /**
         * <p>The accumulated usage during this time bucket. The unit is specified in the unit field.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>3600</p>
         */
        @NameInMap("quantity")
        public Double quantity;

        /**
         * <p>The start time of the usage statistics for this bucket, inclusive.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-11-05T00:00:00Z</p>
         */
        @NameInMap("startTime")
        public String startTime;

        public static ResourceUsageGroupsItemsBuckets build(java.util.Map<String, ?> map) throws Exception {
            ResourceUsageGroupsItemsBuckets self = new ResourceUsageGroupsItemsBuckets();
            return TeaModel.build(map, self);
        }

        public ResourceUsageGroupsItemsBuckets setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public ResourceUsageGroupsItemsBuckets setQuantity(Double quantity) {
            this.quantity = quantity;
            return this;
        }
        public Double getQuantity() {
            return this.quantity;
        }

        public ResourceUsageGroupsItemsBuckets setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

    }

    public static class ResourceUsageGroupsItems extends TeaModel {
        /**
         * <p>The hourly or daily time buckets with usage data, returned in chronological order. An empty array is returned if no buckets are available. This field is omitted if the granularity is All.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;startTime&quot;:&quot;2026-11-05T00:00:00Z&quot;,&quot;endTime&quot;:&quot;2026-11-05T01:00:00Z&quot;,&quot;quantity&quot;:3600},{&quot;startTime&quot;:&quot;2026-11-05T01:00:00Z&quot;,&quot;endTime&quot;:&quot;2026-11-05T02:00:00Z&quot;,&quot;quantity&quot;:1800}]</p>
         */
        @NameInMap("buckets")
        public java.util.List<ResourceUsageGroupsItemsBuckets> buckets;

        /**
         * <p>The accumulated usage for the entire query interval. This field is omitted if no accumulated value is available. A value of 0 indicates that the accumulated usage is zero.</p>
         * 
         * <strong>example:</strong>
         * <p>5400</p>
         */
        @NameInMap("total")
        public Double total;

        /**
         * <p>The unit of usage. The unit is CoreSecond for CPU, and GiBSecond for memory and disks.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>CoreSecond</p>
         */
        @NameInMap("unit")
        public String unit;

        /**
         * <p>The name of the usage item specified in the request.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>activeVCPU</p>
         */
        @NameInMap("usageName")
        public String usageName;

        public static ResourceUsageGroupsItems build(java.util.Map<String, ?> map) throws Exception {
            ResourceUsageGroupsItems self = new ResourceUsageGroupsItems();
            return TeaModel.build(map, self);
        }

        public ResourceUsageGroupsItems setBuckets(java.util.List<ResourceUsageGroupsItemsBuckets> buckets) {
            this.buckets = buckets;
            return this;
        }
        public java.util.List<ResourceUsageGroupsItemsBuckets> getBuckets() {
            return this.buckets;
        }

        public ResourceUsageGroupsItems setTotal(Double total) {
            this.total = total;
            return this;
        }
        public Double getTotal() {
            return this.total;
        }

        public ResourceUsageGroupsItems setUnit(String unit) {
            this.unit = unit;
            return this;
        }
        public String getUnit() {
            return this.unit;
        }

        public ResourceUsageGroupsItems setUsageName(String usageName) {
            this.usageName = usageName;
            return this;
        }
        public String getUsageName() {
            return this.usageName;
        }

    }

    public static class ResourceUsageGroups extends TeaModel {
        /**
         * <p>The team, template, snapshot, or sandbox version corresponding to the usage in this group.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;teamID&quot;:&quot;70d1c834-0333-58d8-97ac-5336eb9179eb&quot;}</p>
         */
        @NameInMap("dimensions")
        public java.util.Map<String, String> dimensions;

        /**
         * <p>The query results for each requested usage item in this group.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;usageName&quot;:&quot;activeVCPU&quot;,&quot;unit&quot;:&quot;CoreSecond&quot;,&quot;total&quot;:5400,&quot;buckets&quot;:[{&quot;startTime&quot;:&quot;2026-11-05T00:00:00Z&quot;,&quot;endTime&quot;:&quot;2026-11-05T01:00:00Z&quot;,&quot;quantity&quot;:3600},{&quot;startTime&quot;:&quot;2026-11-05T01:00:00Z&quot;,&quot;endTime&quot;:&quot;2026-11-05T02:00:00Z&quot;,&quot;quantity&quot;:1800}]}]</p>
         */
        @NameInMap("items")
        public java.util.List<ResourceUsageGroupsItems> items;

        public static ResourceUsageGroups build(java.util.Map<String, ?> map) throws Exception {
            ResourceUsageGroups self = new ResourceUsageGroups();
            return TeaModel.build(map, self);
        }

        public ResourceUsageGroups setDimensions(java.util.Map<String, String> dimensions) {
            this.dimensions = dimensions;
            return this;
        }
        public java.util.Map<String, String> getDimensions() {
            return this.dimensions;
        }

        public ResourceUsageGroups setItems(java.util.List<ResourceUsageGroupsItems> items) {
            this.items = items;
            return this;
        }
        public java.util.List<ResourceUsageGroupsItems> getItems() {
            return this.items;
        }

    }

}
