// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeDBInstancesByPerformanceResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("PageNumber")
    @Validation(required = true)
    public Integer pageNumber;

    @NameInMap("TotalRecordCount")
    @Validation(required = true)
    public Integer totalRecordCount;

    @NameInMap("PageRecordCount")
    @Validation(required = true)
    public Integer pageRecordCount;

    @NameInMap("Items")
    @Validation(required = true)
    public DescribeDBInstancesByPerformanceResponseItems items;

    public static DescribeDBInstancesByPerformanceResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBInstancesByPerformanceResponse self = new DescribeDBInstancesByPerformanceResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDBInstancesByPerformanceResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDBInstancesByPerformanceResponse setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeDBInstancesByPerformanceResponse setTotalRecordCount(Integer totalRecordCount) {
        this.totalRecordCount = totalRecordCount;
        return this;
    }
    public Integer getTotalRecordCount() {
        return this.totalRecordCount;
    }

    public DescribeDBInstancesByPerformanceResponse setPageRecordCount(Integer pageRecordCount) {
        this.pageRecordCount = pageRecordCount;
        return this;
    }
    public Integer getPageRecordCount() {
        return this.pageRecordCount;
    }

    public DescribeDBInstancesByPerformanceResponse setItems(DescribeDBInstancesByPerformanceResponseItems items) {
        this.items = items;
        return this;
    }
    public DescribeDBInstancesByPerformanceResponseItems getItems() {
        return this.items;
    }

    public static class DescribeDBInstancesByPerformanceResponseItemsDBInstancePerformance extends TeaModel {
        @NameInMap("CPUUsage")
        @Validation(required = true)
        public String CPUUsage;

        @NameInMap("IOPSUsage")
        @Validation(required = true)
        public String IOPSUsage;

        @NameInMap("DiskUsage")
        @Validation(required = true)
        public String diskUsage;

        @NameInMap("SessionUsage")
        @Validation(required = true)
        public String sessionUsage;

        @NameInMap("DBInstanceId")
        @Validation(required = true)
        public String DBInstanceId;

        @NameInMap("DBInstanceDescription")
        @Validation(required = true)
        public String DBInstanceDescription;

        public static DescribeDBInstancesByPerformanceResponseItemsDBInstancePerformance build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBInstancesByPerformanceResponseItemsDBInstancePerformance self = new DescribeDBInstancesByPerformanceResponseItemsDBInstancePerformance();
            return TeaModel.build(map, self);
        }

        public DescribeDBInstancesByPerformanceResponseItemsDBInstancePerformance setCPUUsage(String CPUUsage) {
            this.CPUUsage = CPUUsage;
            return this;
        }
        public String getCPUUsage() {
            return this.CPUUsage;
        }

        public DescribeDBInstancesByPerformanceResponseItemsDBInstancePerformance setIOPSUsage(String IOPSUsage) {
            this.IOPSUsage = IOPSUsage;
            return this;
        }
        public String getIOPSUsage() {
            return this.IOPSUsage;
        }

        public DescribeDBInstancesByPerformanceResponseItemsDBInstancePerformance setDiskUsage(String diskUsage) {
            this.diskUsage = diskUsage;
            return this;
        }
        public String getDiskUsage() {
            return this.diskUsage;
        }

        public DescribeDBInstancesByPerformanceResponseItemsDBInstancePerformance setSessionUsage(String sessionUsage) {
            this.sessionUsage = sessionUsage;
            return this;
        }
        public String getSessionUsage() {
            return this.sessionUsage;
        }

        public DescribeDBInstancesByPerformanceResponseItemsDBInstancePerformance setDBInstanceId(String DBInstanceId) {
            this.DBInstanceId = DBInstanceId;
            return this;
        }
        public String getDBInstanceId() {
            return this.DBInstanceId;
        }

        public DescribeDBInstancesByPerformanceResponseItemsDBInstancePerformance setDBInstanceDescription(String DBInstanceDescription) {
            this.DBInstanceDescription = DBInstanceDescription;
            return this;
        }
        public String getDBInstanceDescription() {
            return this.DBInstanceDescription;
        }

    }

    public static class DescribeDBInstancesByPerformanceResponseItems extends TeaModel {
        @NameInMap("DBInstancePerformance")
        @Validation(required = true)
        public java.util.List<DescribeDBInstancesByPerformanceResponseItemsDBInstancePerformance> DBInstancePerformance;

        public static DescribeDBInstancesByPerformanceResponseItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBInstancesByPerformanceResponseItems self = new DescribeDBInstancesByPerformanceResponseItems();
            return TeaModel.build(map, self);
        }

        public DescribeDBInstancesByPerformanceResponseItems setDBInstancePerformance(java.util.List<DescribeDBInstancesByPerformanceResponseItemsDBInstancePerformance> DBInstancePerformance) {
            this.DBInstancePerformance = DBInstancePerformance;
            return this;
        }
        public java.util.List<DescribeDBInstancesByPerformanceResponseItemsDBInstancePerformance> getDBInstancePerformance() {
            return this.DBInstancePerformance;
        }

    }

}
