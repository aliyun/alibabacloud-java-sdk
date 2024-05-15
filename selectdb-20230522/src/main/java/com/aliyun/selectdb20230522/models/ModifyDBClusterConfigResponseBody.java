// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.selectdb20230522.models;

import com.aliyun.tea.*;

public class ModifyDBClusterConfigResponseBody extends TeaModel {
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    @NameInMap("Data")
    public ModifyDBClusterConfigResponseBodyData data;

    @NameInMap("DynamicCode")
    public String dynamicCode;

    @NameInMap("DynamicMessage")
    public String dynamicMessage;

    @NameInMap("RequestId")
    public String requestId;

    public static ModifyDBClusterConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyDBClusterConfigResponseBody self = new ModifyDBClusterConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyDBClusterConfigResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public ModifyDBClusterConfigResponseBody setData(ModifyDBClusterConfigResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ModifyDBClusterConfigResponseBodyData getData() {
        return this.data;
    }

    public ModifyDBClusterConfigResponseBody setDynamicCode(String dynamicCode) {
        this.dynamicCode = dynamicCode;
        return this;
    }
    public String getDynamicCode() {
        return this.dynamicCode;
    }

    public ModifyDBClusterConfigResponseBody setDynamicMessage(String dynamicMessage) {
        this.dynamicMessage = dynamicMessage;
        return this;
    }
    public String getDynamicMessage() {
        return this.dynamicMessage;
    }

    public ModifyDBClusterConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ModifyDBClusterConfigResponseBodyData extends TeaModel {
        @NameInMap("DbClusterId")
        public String dbClusterId;

        @NameInMap("DbInstanceId")
        public String dbInstanceId;

        @NameInMap("DbInstanceName")
        public String dbInstanceName;

        @NameInMap("TaskId")
        public Integer taskId;

        public static ModifyDBClusterConfigResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ModifyDBClusterConfigResponseBodyData self = new ModifyDBClusterConfigResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ModifyDBClusterConfigResponseBodyData setDbClusterId(String dbClusterId) {
            this.dbClusterId = dbClusterId;
            return this;
        }
        public String getDbClusterId() {
            return this.dbClusterId;
        }

        public ModifyDBClusterConfigResponseBodyData setDbInstanceId(String dbInstanceId) {
            this.dbInstanceId = dbInstanceId;
            return this;
        }
        public String getDbInstanceId() {
            return this.dbInstanceId;
        }

        public ModifyDBClusterConfigResponseBodyData setDbInstanceName(String dbInstanceName) {
            this.dbInstanceName = dbInstanceName;
            return this;
        }
        public String getDbInstanceName() {
            return this.dbInstanceName;
        }

        public ModifyDBClusterConfigResponseBodyData setTaskId(Integer taskId) {
            this.taskId = taskId;
            return this;
        }
        public Integer getTaskId() {
            return this.taskId;
        }

    }

}
