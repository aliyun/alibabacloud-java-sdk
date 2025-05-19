// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paifeaturestore20230621.models;

import com.aliyun.tea.*;

public class ListDatasourceFeatureViewsResponseBody extends TeaModel {
    @NameInMap("FeatureViews")
    public java.util.List<ListDatasourceFeatureViewsResponseBodyFeatureViews> featureViews;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    @NameInMap("TotalUsageStatistics")
    public ListDatasourceFeatureViewsResponseBodyTotalUsageStatistics totalUsageStatistics;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>514F82AF-3C04-5C3D-8F38-A11261BF37B0</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static ListDatasourceFeatureViewsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDatasourceFeatureViewsResponseBody self = new ListDatasourceFeatureViewsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDatasourceFeatureViewsResponseBody setFeatureViews(java.util.List<ListDatasourceFeatureViewsResponseBodyFeatureViews> featureViews) {
        this.featureViews = featureViews;
        return this;
    }
    public java.util.List<ListDatasourceFeatureViewsResponseBodyFeatureViews> getFeatureViews() {
        return this.featureViews;
    }

    public ListDatasourceFeatureViewsResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public ListDatasourceFeatureViewsResponseBody setTotalUsageStatistics(ListDatasourceFeatureViewsResponseBodyTotalUsageStatistics totalUsageStatistics) {
        this.totalUsageStatistics = totalUsageStatistics;
        return this;
    }
    public ListDatasourceFeatureViewsResponseBodyTotalUsageStatistics getTotalUsageStatistics() {
        return this.totalUsageStatistics;
    }

    public ListDatasourceFeatureViewsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListDatasourceFeatureViewsResponseBodyFeatureViewsUsageStatisticsReadWriteCount extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>2025-03-18T00:00:00+08:00</p>
         */
        @NameInMap("Date")
        public String date;

        /**
         * <strong>example:</strong>
         * <p>200</p>
         */
        @NameInMap("ReadCount")
        public Long readCount;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("WriteCount")
        public Long writeCount;

        public static ListDatasourceFeatureViewsResponseBodyFeatureViewsUsageStatisticsReadWriteCount build(java.util.Map<String, ?> map) throws Exception {
            ListDatasourceFeatureViewsResponseBodyFeatureViewsUsageStatisticsReadWriteCount self = new ListDatasourceFeatureViewsResponseBodyFeatureViewsUsageStatisticsReadWriteCount();
            return TeaModel.build(map, self);
        }

        public ListDatasourceFeatureViewsResponseBodyFeatureViewsUsageStatisticsReadWriteCount setDate(String date) {
            this.date = date;
            return this;
        }
        public String getDate() {
            return this.date;
        }

        public ListDatasourceFeatureViewsResponseBodyFeatureViewsUsageStatisticsReadWriteCount setReadCount(Long readCount) {
            this.readCount = readCount;
            return this;
        }
        public Long getReadCount() {
            return this.readCount;
        }

        public ListDatasourceFeatureViewsResponseBodyFeatureViewsUsageStatisticsReadWriteCount setWriteCount(Long writeCount) {
            this.writeCount = writeCount;
            return this;
        }
        public Long getWriteCount() {
            return this.writeCount;
        }

    }

    public static class ListDatasourceFeatureViewsResponseBodyFeatureViewsUsageStatistics extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1.23</p>
         */
        @NameInMap("DiskUsage")
        public Double diskUsage;

        /**
         * <strong>example:</strong>
         * <p>0.12</p>
         */
        @NameInMap("MemoryUsage")
        public Double memoryUsage;

        @NameInMap("ReadWriteCount")
        public java.util.List<ListDatasourceFeatureViewsResponseBodyFeatureViewsUsageStatisticsReadWriteCount> readWriteCount;

        /**
         * <strong>example:</strong>
         * <p>10000</p>
         */
        @NameInMap("RowCount")
        public Long rowCount;

        public static ListDatasourceFeatureViewsResponseBodyFeatureViewsUsageStatistics build(java.util.Map<String, ?> map) throws Exception {
            ListDatasourceFeatureViewsResponseBodyFeatureViewsUsageStatistics self = new ListDatasourceFeatureViewsResponseBodyFeatureViewsUsageStatistics();
            return TeaModel.build(map, self);
        }

        public ListDatasourceFeatureViewsResponseBodyFeatureViewsUsageStatistics setDiskUsage(Double diskUsage) {
            this.diskUsage = diskUsage;
            return this;
        }
        public Double getDiskUsage() {
            return this.diskUsage;
        }

        public ListDatasourceFeatureViewsResponseBodyFeatureViewsUsageStatistics setMemoryUsage(Double memoryUsage) {
            this.memoryUsage = memoryUsage;
            return this;
        }
        public Double getMemoryUsage() {
            return this.memoryUsage;
        }

        public ListDatasourceFeatureViewsResponseBodyFeatureViewsUsageStatistics setReadWriteCount(java.util.List<ListDatasourceFeatureViewsResponseBodyFeatureViewsUsageStatisticsReadWriteCount> readWriteCount) {
            this.readWriteCount = readWriteCount;
            return this;
        }
        public java.util.List<ListDatasourceFeatureViewsResponseBodyFeatureViewsUsageStatisticsReadWriteCount> getReadWriteCount() {
            return this.readWriteCount;
        }

        public ListDatasourceFeatureViewsResponseBodyFeatureViewsUsageStatistics setRowCount(Long rowCount) {
            this.rowCount = rowCount;
            return this;
        }
        public Long getRowCount() {
            return this.rowCount;
        }

    }

    public static class ListDatasourceFeatureViewsResponseBodyFeatureViews extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>{&quot;shard_count&quot;:5,&quot;replication_count&quot;:1}</p>
         */
        @NameInMap("Config")
        public String config;

        /**
         * <strong>example:</strong>
         * <p>user</p>
         */
        @NameInMap("FeatureEntityName")
        public String featureEntityName;

        /**
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("FeatureViewId")
        public String featureViewId;

        /**
         * <strong>example:</strong>
         * <p>fv1</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>p1</p>
         */
        @NameInMap("ProjectName")
        public String projectName;

        /**
         * <strong>example:</strong>
         * <p>86400</p>
         */
        @NameInMap("TTL")
        public Integer TTL;

        /**
         * <strong>example:</strong>
         * <p>Batch</p>
         */
        @NameInMap("Type")
        public String type;

        @NameInMap("UsageStatistics")
        public ListDatasourceFeatureViewsResponseBodyFeatureViewsUsageStatistics usageStatistics;

        public static ListDatasourceFeatureViewsResponseBodyFeatureViews build(java.util.Map<String, ?> map) throws Exception {
            ListDatasourceFeatureViewsResponseBodyFeatureViews self = new ListDatasourceFeatureViewsResponseBodyFeatureViews();
            return TeaModel.build(map, self);
        }

        public ListDatasourceFeatureViewsResponseBodyFeatureViews setConfig(String config) {
            this.config = config;
            return this;
        }
        public String getConfig() {
            return this.config;
        }

        public ListDatasourceFeatureViewsResponseBodyFeatureViews setFeatureEntityName(String featureEntityName) {
            this.featureEntityName = featureEntityName;
            return this;
        }
        public String getFeatureEntityName() {
            return this.featureEntityName;
        }

        public ListDatasourceFeatureViewsResponseBodyFeatureViews setFeatureViewId(String featureViewId) {
            this.featureViewId = featureViewId;
            return this;
        }
        public String getFeatureViewId() {
            return this.featureViewId;
        }

        public ListDatasourceFeatureViewsResponseBodyFeatureViews setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListDatasourceFeatureViewsResponseBodyFeatureViews setProjectName(String projectName) {
            this.projectName = projectName;
            return this;
        }
        public String getProjectName() {
            return this.projectName;
        }

        public ListDatasourceFeatureViewsResponseBodyFeatureViews setTTL(Integer TTL) {
            this.TTL = TTL;
            return this;
        }
        public Integer getTTL() {
            return this.TTL;
        }

        public ListDatasourceFeatureViewsResponseBodyFeatureViews setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListDatasourceFeatureViewsResponseBodyFeatureViews setUsageStatistics(ListDatasourceFeatureViewsResponseBodyFeatureViewsUsageStatistics usageStatistics) {
            this.usageStatistics = usageStatistics;
            return this;
        }
        public ListDatasourceFeatureViewsResponseBodyFeatureViewsUsageStatistics getUsageStatistics() {
            return this.usageStatistics;
        }

    }

    public static class ListDatasourceFeatureViewsResponseBodyTotalUsageStatisticsTotalReadWriteCount extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>2025-03-18T00:00:00+08:00</p>
         */
        @NameInMap("Date")
        public String date;

        /**
         * <strong>example:</strong>
         * <p>456</p>
         */
        @NameInMap("TotalReadCount")
        public Long totalReadCount;

        /**
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("TotalWriteCount")
        public Long totalWriteCount;

        public static ListDatasourceFeatureViewsResponseBodyTotalUsageStatisticsTotalReadWriteCount build(java.util.Map<String, ?> map) throws Exception {
            ListDatasourceFeatureViewsResponseBodyTotalUsageStatisticsTotalReadWriteCount self = new ListDatasourceFeatureViewsResponseBodyTotalUsageStatisticsTotalReadWriteCount();
            return TeaModel.build(map, self);
        }

        public ListDatasourceFeatureViewsResponseBodyTotalUsageStatisticsTotalReadWriteCount setDate(String date) {
            this.date = date;
            return this;
        }
        public String getDate() {
            return this.date;
        }

        public ListDatasourceFeatureViewsResponseBodyTotalUsageStatisticsTotalReadWriteCount setTotalReadCount(Long totalReadCount) {
            this.totalReadCount = totalReadCount;
            return this;
        }
        public Long getTotalReadCount() {
            return this.totalReadCount;
        }

        public ListDatasourceFeatureViewsResponseBodyTotalUsageStatisticsTotalReadWriteCount setTotalWriteCount(Long totalWriteCount) {
            this.totalWriteCount = totalWriteCount;
            return this;
        }
        public Long getTotalWriteCount() {
            return this.totalWriteCount;
        }

    }

    public static class ListDatasourceFeatureViewsResponseBodyTotalUsageStatistics extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>12.3</p>
         */
        @NameInMap("TotalDiskUsage")
        public Double totalDiskUsage;

        /**
         * <strong>example:</strong>
         * <p>1.23</p>
         */
        @NameInMap("TotalMemoryUsage")
        public Double totalMemoryUsage;

        @NameInMap("TotalReadWriteCount")
        public java.util.List<ListDatasourceFeatureViewsResponseBodyTotalUsageStatisticsTotalReadWriteCount> totalReadWriteCount;

        public static ListDatasourceFeatureViewsResponseBodyTotalUsageStatistics build(java.util.Map<String, ?> map) throws Exception {
            ListDatasourceFeatureViewsResponseBodyTotalUsageStatistics self = new ListDatasourceFeatureViewsResponseBodyTotalUsageStatistics();
            return TeaModel.build(map, self);
        }

        public ListDatasourceFeatureViewsResponseBodyTotalUsageStatistics setTotalDiskUsage(Double totalDiskUsage) {
            this.totalDiskUsage = totalDiskUsage;
            return this;
        }
        public Double getTotalDiskUsage() {
            return this.totalDiskUsage;
        }

        public ListDatasourceFeatureViewsResponseBodyTotalUsageStatistics setTotalMemoryUsage(Double totalMemoryUsage) {
            this.totalMemoryUsage = totalMemoryUsage;
            return this;
        }
        public Double getTotalMemoryUsage() {
            return this.totalMemoryUsage;
        }

        public ListDatasourceFeatureViewsResponseBodyTotalUsageStatistics setTotalReadWriteCount(java.util.List<ListDatasourceFeatureViewsResponseBodyTotalUsageStatisticsTotalReadWriteCount> totalReadWriteCount) {
            this.totalReadWriteCount = totalReadWriteCount;
            return this;
        }
        public java.util.List<ListDatasourceFeatureViewsResponseBodyTotalUsageStatisticsTotalReadWriteCount> getTotalReadWriteCount() {
            return this.totalReadWriteCount;
        }

    }

}
