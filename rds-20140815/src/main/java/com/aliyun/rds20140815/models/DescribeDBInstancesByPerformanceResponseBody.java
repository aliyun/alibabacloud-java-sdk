// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeDBInstancesByPerformanceResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("TotalRecordCount")
    public Integer totalRecordCount;

    @NameInMap("PageRecordCount")
    public Integer pageRecordCount;

    @NameInMap("Items")
    public DescribeDBInstancesByPerformanceResponseBodyItems items;

    public static DescribeDBInstancesByPerformanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBInstancesByPerformanceResponseBody self = new DescribeDBInstancesByPerformanceResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDBInstancesByPerformanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDBInstancesByPerformanceResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeDBInstancesByPerformanceResponseBody setTotalRecordCount(Integer totalRecordCount) {
        this.totalRecordCount = totalRecordCount;
        return this;
    }
    public Integer getTotalRecordCount() {
        return this.totalRecordCount;
    }

    public DescribeDBInstancesByPerformanceResponseBody setPageRecordCount(Integer pageRecordCount) {
        this.pageRecordCount = pageRecordCount;
        return this;
    }
    public Integer getPageRecordCount() {
        return this.pageRecordCount;
    }

    public DescribeDBInstancesByPerformanceResponseBody setItems(DescribeDBInstancesByPerformanceResponseBodyItems items) {
        this.items = items;
        return this;
    }
    public DescribeDBInstancesByPerformanceResponseBodyItems getItems() {
        return this.items;
    }

    public static class DescribeDBInstancesByPerformanceResponseBodyItemsDBInstancePerformance extends TeaModel {
        @NameInMap("CPUUsage")
        public String CPUUsage;

        @NameInMap("IOPSUsage")
        public String IOPSUsage;

        @NameInMap("DiskUsage")
        public String diskUsage;

        @NameInMap("SessionUsage")
        public String sessionUsage;

        @NameInMap("DBInstanceId")
        public String DBInstanceId;

        @NameInMap("DBInstanceDescription")
        public String DBInstanceDescription;

        public static DescribeDBInstancesByPerformanceResponseBodyItemsDBInstancePerformance build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBInstancesByPerformanceResponseBodyItemsDBInstancePerformance self = new DescribeDBInstancesByPerformanceResponseBodyItemsDBInstancePerformance();
            return TeaModel.build(map, self);
        }

        public DescribeDBInstancesByPerformanceResponseBodyItemsDBInstancePerformance setCPUUsage(String CPUUsage) {
            this.CPUUsage = CPUUsage;
            return this;
        }
        public String getCPUUsage() {
            return this.CPUUsage;
        }

        public DescribeDBInstancesByPerformanceResponseBodyItemsDBInstancePerformance setIOPSUsage(String IOPSUsage) {
            this.IOPSUsage = IOPSUsage;
            return this;
        }
        public String getIOPSUsage() {
            return this.IOPSUsage;
        }

        public DescribeDBInstancesByPerformanceResponseBodyItemsDBInstancePerformance setDiskUsage(String diskUsage) {
            this.diskUsage = diskUsage;
            return this;
        }
        public String getDiskUsage() {
            return this.diskUsage;
        }

        public DescribeDBInstancesByPerformanceResponseBodyItemsDBInstancePerformance setSessionUsage(String sessionUsage) {
            this.sessionUsage = sessionUsage;
            return this;
        }
        public String getSessionUsage() {
            return this.sessionUsage;
        }

        public DescribeDBInstancesByPerformanceResponseBodyItemsDBInstancePerformance setDBInstanceId(String DBInstanceId) {
            this.DBInstanceId = DBInstanceId;
            return this;
        }
        public String getDBInstanceId() {
            return this.DBInstanceId;
        }

        public DescribeDBInstancesByPerformanceResponseBodyItemsDBInstancePerformance setDBInstanceDescription(String DBInstanceDescription) {
            this.DBInstanceDescription = DBInstanceDescription;
            return this;
        }
        public String getDBInstanceDescription() {
            return this.DBInstanceDescription;
        }

    }

    public static class DescribeDBInstancesByPerformanceResponseBodyItems extends TeaModel {
        @NameInMap("DBInstancePerformance")
        public java.util.List<DescribeDBInstancesByPerformanceResponseBodyItemsDBInstancePerformance> DBInstancePerformance;

        public static DescribeDBInstancesByPerformanceResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBInstancesByPerformanceResponseBodyItems self = new DescribeDBInstancesByPerformanceResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public DescribeDBInstancesByPerformanceResponseBodyItems setDBInstancePerformance(java.util.List<DescribeDBInstancesByPerformanceResponseBodyItemsDBInstancePerformance> DBInstancePerformance) {
            this.DBInstancePerformance = DBInstancePerformance;
            return this;
        }
        public java.util.List<DescribeDBInstancesByPerformanceResponseBodyItemsDBInstancePerformance> getDBInstancePerformance() {
            return this.DBInstancePerformance;
        }

    }

}
