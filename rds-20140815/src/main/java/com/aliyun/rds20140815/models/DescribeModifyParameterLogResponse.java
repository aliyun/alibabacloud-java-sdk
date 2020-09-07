// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeModifyParameterLogResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Engine")
    @Validation(required = true)
    public String engine;

    @NameInMap("DBInstanceId")
    @Validation(required = true)
    public String DBInstanceId;

    @NameInMap("EngineVersion")
    @Validation(required = true)
    public String engineVersion;

    @NameInMap("TotalRecordCount")
    @Validation(required = true)
    public Integer totalRecordCount;

    @NameInMap("PageNumber")
    @Validation(required = true)
    public Integer pageNumber;

    @NameInMap("PageRecordCount")
    @Validation(required = true)
    public Integer pageRecordCount;

    @NameInMap("Items")
    @Validation(required = true)
    public DescribeModifyParameterLogResponseItems items;

    public static DescribeModifyParameterLogResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeModifyParameterLogResponse self = new DescribeModifyParameterLogResponse();
        return TeaModel.build(map, self);
    }

    public DescribeModifyParameterLogResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeModifyParameterLogResponse setEngine(String engine) {
        this.engine = engine;
        return this;
    }
    public String getEngine() {
        return this.engine;
    }

    public DescribeModifyParameterLogResponse setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public DescribeModifyParameterLogResponse setEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
        return this;
    }
    public String getEngineVersion() {
        return this.engineVersion;
    }

    public DescribeModifyParameterLogResponse setTotalRecordCount(Integer totalRecordCount) {
        this.totalRecordCount = totalRecordCount;
        return this;
    }
    public Integer getTotalRecordCount() {
        return this.totalRecordCount;
    }

    public DescribeModifyParameterLogResponse setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeModifyParameterLogResponse setPageRecordCount(Integer pageRecordCount) {
        this.pageRecordCount = pageRecordCount;
        return this;
    }
    public Integer getPageRecordCount() {
        return this.pageRecordCount;
    }

    public DescribeModifyParameterLogResponse setItems(DescribeModifyParameterLogResponseItems items) {
        this.items = items;
        return this;
    }
    public DescribeModifyParameterLogResponseItems getItems() {
        return this.items;
    }

    public static class DescribeModifyParameterLogResponseItemsParameterChangeLog extends TeaModel {
        @NameInMap("ModifyTime")
        @Validation(required = true)
        public String modifyTime;

        @NameInMap("OldParameterValue")
        @Validation(required = true)
        public String oldParameterValue;

        @NameInMap("NewParameterValue")
        @Validation(required = true)
        public String newParameterValue;

        @NameInMap("ParameterName")
        @Validation(required = true)
        public String parameterName;

        @NameInMap("Status")
        @Validation(required = true)
        public String status;

        public static DescribeModifyParameterLogResponseItemsParameterChangeLog build(java.util.Map<String, ?> map) throws Exception {
            DescribeModifyParameterLogResponseItemsParameterChangeLog self = new DescribeModifyParameterLogResponseItemsParameterChangeLog();
            return TeaModel.build(map, self);
        }

        public DescribeModifyParameterLogResponseItemsParameterChangeLog setModifyTime(String modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }
        public String getModifyTime() {
            return this.modifyTime;
        }

        public DescribeModifyParameterLogResponseItemsParameterChangeLog setOldParameterValue(String oldParameterValue) {
            this.oldParameterValue = oldParameterValue;
            return this;
        }
        public String getOldParameterValue() {
            return this.oldParameterValue;
        }

        public DescribeModifyParameterLogResponseItemsParameterChangeLog setNewParameterValue(String newParameterValue) {
            this.newParameterValue = newParameterValue;
            return this;
        }
        public String getNewParameterValue() {
            return this.newParameterValue;
        }

        public DescribeModifyParameterLogResponseItemsParameterChangeLog setParameterName(String parameterName) {
            this.parameterName = parameterName;
            return this;
        }
        public String getParameterName() {
            return this.parameterName;
        }

        public DescribeModifyParameterLogResponseItemsParameterChangeLog setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class DescribeModifyParameterLogResponseItems extends TeaModel {
        @NameInMap("ParameterChangeLog")
        @Validation(required = true)
        public java.util.List<DescribeModifyParameterLogResponseItemsParameterChangeLog> parameterChangeLog;

        public static DescribeModifyParameterLogResponseItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeModifyParameterLogResponseItems self = new DescribeModifyParameterLogResponseItems();
            return TeaModel.build(map, self);
        }

        public DescribeModifyParameterLogResponseItems setParameterChangeLog(java.util.List<DescribeModifyParameterLogResponseItemsParameterChangeLog> parameterChangeLog) {
            this.parameterChangeLog = parameterChangeLog;
            return this;
        }
        public java.util.List<DescribeModifyParameterLogResponseItemsParameterChangeLog> getParameterChangeLog() {
            return this.parameterChangeLog;
        }

    }

}
