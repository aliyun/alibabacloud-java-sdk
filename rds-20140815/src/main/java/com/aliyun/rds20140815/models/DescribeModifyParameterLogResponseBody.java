// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeModifyParameterLogResponseBody extends TeaModel {
    /**
     * <p>The instance ID.</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <p>The database engine of the instance.</p>
     */
    @NameInMap("Engine")
    public String engine;

    /**
     * <p>The database engine version of the instance.</p>
     */
    @NameInMap("EngineVersion")
    public String engineVersion;

    /**
     * <p>An array that consists of parameter modification log entries.</p>
     */
    @NameInMap("Items")
    public DescribeModifyParameterLogResponseBodyItems items;

    /**
     * <p>The page number.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page.</p>
     */
    @NameInMap("PageRecordCount")
    public Integer pageRecordCount;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
     */
    @NameInMap("TotalRecordCount")
    public Integer totalRecordCount;

    public static DescribeModifyParameterLogResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeModifyParameterLogResponseBody self = new DescribeModifyParameterLogResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeModifyParameterLogResponseBody setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public DescribeModifyParameterLogResponseBody setEngine(String engine) {
        this.engine = engine;
        return this;
    }
    public String getEngine() {
        return this.engine;
    }

    public DescribeModifyParameterLogResponseBody setEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
        return this;
    }
    public String getEngineVersion() {
        return this.engineVersion;
    }

    public DescribeModifyParameterLogResponseBody setItems(DescribeModifyParameterLogResponseBodyItems items) {
        this.items = items;
        return this;
    }
    public DescribeModifyParameterLogResponseBodyItems getItems() {
        return this.items;
    }

    public DescribeModifyParameterLogResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeModifyParameterLogResponseBody setPageRecordCount(Integer pageRecordCount) {
        this.pageRecordCount = pageRecordCount;
        return this;
    }
    public Integer getPageRecordCount() {
        return this.pageRecordCount;
    }

    public DescribeModifyParameterLogResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeModifyParameterLogResponseBody setTotalRecordCount(Integer totalRecordCount) {
        this.totalRecordCount = totalRecordCount;
        return this;
    }
    public Integer getTotalRecordCount() {
        return this.totalRecordCount;
    }

    public static class DescribeModifyParameterLogResponseBodyItemsParameterChangeLog extends TeaModel {
        /**
         * <p>The time when the parameter was modified. This value is a UNIX timestamp. Unit: milliseconds.</p>
         */
        @NameInMap("ModifyTime")
        public String modifyTime;

        /**
         * <p>The new value of the parameter.</p>
         */
        @NameInMap("NewParameterValue")
        public String newParameterValue;

        /**
         * <p>The original value of the parameter.</p>
         */
        @NameInMap("OldParameterValue")
        public String oldParameterValue;

        /**
         * <p>The name of the parameter.</p>
         */
        @NameInMap("ParameterName")
        public String parameterName;

        /**
         * <p>The status of the new value specified for the parameter. Valid values:</p>
         * <br>
         * <p>*   **Applied:** The new value has taken effect.</p>
         * <p>*   **Syncing:** The new value is being applied and has not taken effect.</p>
         */
        @NameInMap("Status")
        public String status;

        public static DescribeModifyParameterLogResponseBodyItemsParameterChangeLog build(java.util.Map<String, ?> map) throws Exception {
            DescribeModifyParameterLogResponseBodyItemsParameterChangeLog self = new DescribeModifyParameterLogResponseBodyItemsParameterChangeLog();
            return TeaModel.build(map, self);
        }

        public DescribeModifyParameterLogResponseBodyItemsParameterChangeLog setModifyTime(String modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }
        public String getModifyTime() {
            return this.modifyTime;
        }

        public DescribeModifyParameterLogResponseBodyItemsParameterChangeLog setNewParameterValue(String newParameterValue) {
            this.newParameterValue = newParameterValue;
            return this;
        }
        public String getNewParameterValue() {
            return this.newParameterValue;
        }

        public DescribeModifyParameterLogResponseBodyItemsParameterChangeLog setOldParameterValue(String oldParameterValue) {
            this.oldParameterValue = oldParameterValue;
            return this;
        }
        public String getOldParameterValue() {
            return this.oldParameterValue;
        }

        public DescribeModifyParameterLogResponseBodyItemsParameterChangeLog setParameterName(String parameterName) {
            this.parameterName = parameterName;
            return this;
        }
        public String getParameterName() {
            return this.parameterName;
        }

        public DescribeModifyParameterLogResponseBodyItemsParameterChangeLog setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class DescribeModifyParameterLogResponseBodyItems extends TeaModel {
        @NameInMap("ParameterChangeLog")
        public java.util.List<DescribeModifyParameterLogResponseBodyItemsParameterChangeLog> parameterChangeLog;

        public static DescribeModifyParameterLogResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeModifyParameterLogResponseBodyItems self = new DescribeModifyParameterLogResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public DescribeModifyParameterLogResponseBodyItems setParameterChangeLog(java.util.List<DescribeModifyParameterLogResponseBodyItemsParameterChangeLog> parameterChangeLog) {
            this.parameterChangeLog = parameterChangeLog;
            return this;
        }
        public java.util.List<DescribeModifyParameterLogResponseBodyItemsParameterChangeLog> getParameterChangeLog() {
            return this.parameterChangeLog;
        }

    }

}
