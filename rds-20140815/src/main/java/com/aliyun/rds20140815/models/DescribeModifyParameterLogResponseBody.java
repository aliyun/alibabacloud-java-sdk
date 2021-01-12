// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeModifyParameterLogResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Engine")
    public String engine;

    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    @NameInMap("EngineVersion")
    public String engineVersion;

    @NameInMap("TotalRecordCount")
    public Integer totalRecordCount;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageRecordCount")
    public Integer pageRecordCount;

    @NameInMap("Items")
    public DescribeModifyParameterLogResponseBodyItems items;

    public static DescribeModifyParameterLogResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeModifyParameterLogResponseBody self = new DescribeModifyParameterLogResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeModifyParameterLogResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeModifyParameterLogResponseBody setEngine(String engine) {
        this.engine = engine;
        return this;
    }
    public String getEngine() {
        return this.engine;
    }

    public DescribeModifyParameterLogResponseBody setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public DescribeModifyParameterLogResponseBody setEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
        return this;
    }
    public String getEngineVersion() {
        return this.engineVersion;
    }

    public DescribeModifyParameterLogResponseBody setTotalRecordCount(Integer totalRecordCount) {
        this.totalRecordCount = totalRecordCount;
        return this;
    }
    public Integer getTotalRecordCount() {
        return this.totalRecordCount;
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

    public DescribeModifyParameterLogResponseBody setItems(DescribeModifyParameterLogResponseBodyItems items) {
        this.items = items;
        return this;
    }
    public DescribeModifyParameterLogResponseBodyItems getItems() {
        return this.items;
    }

    public static class DescribeModifyParameterLogResponseBodyItemsParameterChangeLog extends TeaModel {
        @NameInMap("ModifyTime")
        public String modifyTime;

        @NameInMap("OldParameterValue")
        public String oldParameterValue;

        @NameInMap("NewParameterValue")
        public String newParameterValue;

        @NameInMap("ParameterName")
        public String parameterName;

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

        public DescribeModifyParameterLogResponseBodyItemsParameterChangeLog setOldParameterValue(String oldParameterValue) {
            this.oldParameterValue = oldParameterValue;
            return this;
        }
        public String getOldParameterValue() {
            return this.oldParameterValue;
        }

        public DescribeModifyParameterLogResponseBodyItemsParameterChangeLog setNewParameterValue(String newParameterValue) {
            this.newParameterValue = newParameterValue;
            return this;
        }
        public String getNewParameterValue() {
            return this.newParameterValue;
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
