// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.selectdb20230522.models;

import com.aliyun.tea.*;

public class DescribeDBClusterConfigChangeLogsResponseBody extends TeaModel {
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    @NameInMap("Data")
    public DescribeDBClusterConfigChangeLogsResponseBodyData data;

    @NameInMap("DynamicCode")
    public String dynamicCode;

    @NameInMap("DynamicMessage")
    public String dynamicMessage;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeDBClusterConfigChangeLogsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBClusterConfigChangeLogsResponseBody self = new DescribeDBClusterConfigChangeLogsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDBClusterConfigChangeLogsResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public DescribeDBClusterConfigChangeLogsResponseBody setData(DescribeDBClusterConfigChangeLogsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeDBClusterConfigChangeLogsResponseBodyData getData() {
        return this.data;
    }

    public DescribeDBClusterConfigChangeLogsResponseBody setDynamicCode(String dynamicCode) {
        this.dynamicCode = dynamicCode;
        return this;
    }
    public String getDynamicCode() {
        return this.dynamicCode;
    }

    public DescribeDBClusterConfigChangeLogsResponseBody setDynamicMessage(String dynamicMessage) {
        this.dynamicMessage = dynamicMessage;
        return this;
    }
    public String getDynamicMessage() {
        return this.dynamicMessage;
    }

    public DescribeDBClusterConfigChangeLogsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeDBClusterConfigChangeLogsResponseBodyDataParamChangeLogs extends TeaModel {
        @NameInMap("GmtCreated")
        public String gmtCreated;

        @NameInMap("GmtModified")
        public String gmtModified;

        @NameInMap("Id")
        public Long id;

        @NameInMap("IsApplied")
        public Boolean isApplied;

        @NameInMap("Name")
        public String name;

        @NameInMap("NewValue")
        public String newValue;

        @NameInMap("OldValue")
        public String oldValue;

        public static DescribeDBClusterConfigChangeLogsResponseBodyDataParamChangeLogs build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBClusterConfigChangeLogsResponseBodyDataParamChangeLogs self = new DescribeDBClusterConfigChangeLogsResponseBodyDataParamChangeLogs();
            return TeaModel.build(map, self);
        }

        public DescribeDBClusterConfigChangeLogsResponseBodyDataParamChangeLogs setGmtCreated(String gmtCreated) {
            this.gmtCreated = gmtCreated;
            return this;
        }
        public String getGmtCreated() {
            return this.gmtCreated;
        }

        public DescribeDBClusterConfigChangeLogsResponseBodyDataParamChangeLogs setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public DescribeDBClusterConfigChangeLogsResponseBodyDataParamChangeLogs setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public DescribeDBClusterConfigChangeLogsResponseBodyDataParamChangeLogs setIsApplied(Boolean isApplied) {
            this.isApplied = isApplied;
            return this;
        }
        public Boolean getIsApplied() {
            return this.isApplied;
        }

        public DescribeDBClusterConfigChangeLogsResponseBodyDataParamChangeLogs setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeDBClusterConfigChangeLogsResponseBodyDataParamChangeLogs setNewValue(String newValue) {
            this.newValue = newValue;
            return this;
        }
        public String getNewValue() {
            return this.newValue;
        }

        public DescribeDBClusterConfigChangeLogsResponseBodyDataParamChangeLogs setOldValue(String oldValue) {
            this.oldValue = oldValue;
            return this;
        }
        public String getOldValue() {
            return this.oldValue;
        }

    }

    public static class DescribeDBClusterConfigChangeLogsResponseBodyData extends TeaModel {
        @NameInMap("DbClusterId")
        public String dbClusterId;

        @NameInMap("DbInstanceId")
        public String dbInstanceId;

        @NameInMap("DbInstanceName")
        public String dbInstanceName;

        @NameInMap("ParamChangeLogs")
        public java.util.List<DescribeDBClusterConfigChangeLogsResponseBodyDataParamChangeLogs> paramChangeLogs;

        @NameInMap("TaskId")
        public Integer taskId;

        public static DescribeDBClusterConfigChangeLogsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBClusterConfigChangeLogsResponseBodyData self = new DescribeDBClusterConfigChangeLogsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeDBClusterConfigChangeLogsResponseBodyData setDbClusterId(String dbClusterId) {
            this.dbClusterId = dbClusterId;
            return this;
        }
        public String getDbClusterId() {
            return this.dbClusterId;
        }

        public DescribeDBClusterConfigChangeLogsResponseBodyData setDbInstanceId(String dbInstanceId) {
            this.dbInstanceId = dbInstanceId;
            return this;
        }
        public String getDbInstanceId() {
            return this.dbInstanceId;
        }

        public DescribeDBClusterConfigChangeLogsResponseBodyData setDbInstanceName(String dbInstanceName) {
            this.dbInstanceName = dbInstanceName;
            return this;
        }
        public String getDbInstanceName() {
            return this.dbInstanceName;
        }

        public DescribeDBClusterConfigChangeLogsResponseBodyData setParamChangeLogs(java.util.List<DescribeDBClusterConfigChangeLogsResponseBodyDataParamChangeLogs> paramChangeLogs) {
            this.paramChangeLogs = paramChangeLogs;
            return this;
        }
        public java.util.List<DescribeDBClusterConfigChangeLogsResponseBodyDataParamChangeLogs> getParamChangeLogs() {
            return this.paramChangeLogs;
        }

        public DescribeDBClusterConfigChangeLogsResponseBodyData setTaskId(Integer taskId) {
            this.taskId = taskId;
            return this;
        }
        public Integer getTaskId() {
            return this.taskId;
        }

    }

}
