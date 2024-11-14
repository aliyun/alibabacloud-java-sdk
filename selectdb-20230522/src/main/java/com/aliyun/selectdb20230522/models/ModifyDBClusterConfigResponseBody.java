// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.selectdb20230522.models;

import com.aliyun.tea.*;

public class ModifyDBClusterConfigResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>failed</p>
     */
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    @NameInMap("Data")
    public ModifyDBClusterConfigResponseBodyData data;

    /**
     * <p>The dynamic code. This parameter is not returned.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("DynamicCode")
    public String dynamicCode;

    /**
     * <p>The dynamic message. This parameter is not returned.</p>
     * 
     * <strong>example:</strong>
     * <p>An error occurred while processing your request.</p>
     */
    @NameInMap("DynamicMessage")
    public String dynamicMessage;

    /**
     * <strong>example:</strong>
     * <p>BC854513-E85E-54F3-9842-B9CCD3308CDD</p>
     */
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
        /**
         * <strong>example:</strong>
         * <p>selectdb-cn-wny3li00g02-be</p>
         */
        @NameInMap("DbClusterId")
        public String dbClusterId;

        /**
         * <strong>example:</strong>
         * <p>6585</p>
         */
        @NameInMap("DbInstanceId")
        public String dbInstanceId;

        /**
         * <strong>example:</strong>
         * <p>selectdb-cn-wny3li00g02</p>
         */
        @NameInMap("DbInstanceName")
        public String dbInstanceName;

        /**
         * <strong>example:</strong>
         * <p>107878719</p>
         */
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
