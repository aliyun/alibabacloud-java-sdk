// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.selectdb20230522.models;

import com.aliyun.tea.*;

public class DescribeDBClusterConfigResponseBody extends TeaModel {
    /**
     * <p>The details about the access denial. This parameter is returned only if Resource Access Management (RAM) authentication failed.</p>
     * 
     * <strong>example:</strong>
     * <p>failed</p>
     */
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <p>The information returned.</p>
     */
    @NameInMap("Data")
    public DescribeDBClusterConfigResponseBodyData data;

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
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>ADF42B18-43FD-5100-83A9-BE81AB70C863</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeDBClusterConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBClusterConfigResponseBody self = new DescribeDBClusterConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDBClusterConfigResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public DescribeDBClusterConfigResponseBody setData(DescribeDBClusterConfigResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeDBClusterConfigResponseBodyData getData() {
        return this.data;
    }

    public DescribeDBClusterConfigResponseBody setDynamicCode(String dynamicCode) {
        this.dynamicCode = dynamicCode;
        return this;
    }
    public String getDynamicCode() {
        return this.dynamicCode;
    }

    public DescribeDBClusterConfigResponseBody setDynamicMessage(String dynamicMessage) {
        this.dynamicMessage = dynamicMessage;
        return this;
    }
    public String getDynamicMessage() {
        return this.dynamicMessage;
    }

    public DescribeDBClusterConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeDBClusterConfigResponseBodyDataParams extends TeaModel {
        /**
         * <p>The comments on the parameter.</p>
         */
        @NameInMap("Comment")
        public String comment;

        /**
         * <p>The default value of the parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>15</p>
         */
        @NameInMap("DefaultValue")
        public String defaultValue;

        /**
         * <p>Indicates whether the parameter immediately takes effect without requiring a restart.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("IsDynamic")
        public Integer isDynamic;

        /**
         * <p>Indicates whether the parameter is modifiable.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("IsUserModifiable")
        public Integer isUserModifiable;

        /**
         * <p>The name of the parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>doris_scanner_thread_pool_thread_num</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The value range of the parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>[0-20000]</p>
         */
        @NameInMap("Optional")
        public String optional;

        /**
         * <p>The category of the parameter.</p>
         */
        @NameInMap("ParamCategory")
        public String paramCategory;

        /**
         * <p>The current value of the parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Value")
        public String value;

        public static DescribeDBClusterConfigResponseBodyDataParams build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBClusterConfigResponseBodyDataParams self = new DescribeDBClusterConfigResponseBodyDataParams();
            return TeaModel.build(map, self);
        }

        public DescribeDBClusterConfigResponseBodyDataParams setComment(String comment) {
            this.comment = comment;
            return this;
        }
        public String getComment() {
            return this.comment;
        }

        public DescribeDBClusterConfigResponseBodyDataParams setDefaultValue(String defaultValue) {
            this.defaultValue = defaultValue;
            return this;
        }
        public String getDefaultValue() {
            return this.defaultValue;
        }

        public DescribeDBClusterConfigResponseBodyDataParams setIsDynamic(Integer isDynamic) {
            this.isDynamic = isDynamic;
            return this;
        }
        public Integer getIsDynamic() {
            return this.isDynamic;
        }

        public DescribeDBClusterConfigResponseBodyDataParams setIsUserModifiable(Integer isUserModifiable) {
            this.isUserModifiable = isUserModifiable;
            return this;
        }
        public Integer getIsUserModifiable() {
            return this.isUserModifiable;
        }

        public DescribeDBClusterConfigResponseBodyDataParams setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeDBClusterConfigResponseBodyDataParams setOptional(String optional) {
            this.optional = optional;
            return this;
        }
        public String getOptional() {
            return this.optional;
        }

        public DescribeDBClusterConfigResponseBodyDataParams setParamCategory(String paramCategory) {
            this.paramCategory = paramCategory;
            return this;
        }
        public String getParamCategory() {
            return this.paramCategory;
        }

        public DescribeDBClusterConfigResponseBodyDataParams setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeDBClusterConfigResponseBodyData extends TeaModel {
        /**
         * <p>The cluster ID.</p>
         * 
         * <strong>example:</strong>
         * <p>selectdb-cn-wny3li00g02-be</p>
         */
        @NameInMap("DbClusterId")
        public String dbClusterId;

        /**
         * <p>The numeric ID of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>6585</p>
         */
        @NameInMap("DbInstanceId")
        public String dbInstanceId;

        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>selectdb-cn-wny3li00g02</p>
         */
        @NameInMap("DbInstanceName")
        public String dbInstanceName;

        /**
         * <p>The details about each parameter returned.</p>
         */
        @NameInMap("Params")
        public java.util.List<DescribeDBClusterConfigResponseBodyDataParams> params;

        /**
         * <p>The task ID.</p>
         * 
         * <strong>example:</strong>
         * <p>107841167</p>
         */
        @NameInMap("TaskId")
        public Integer taskId;

        public static DescribeDBClusterConfigResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBClusterConfigResponseBodyData self = new DescribeDBClusterConfigResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeDBClusterConfigResponseBodyData setDbClusterId(String dbClusterId) {
            this.dbClusterId = dbClusterId;
            return this;
        }
        public String getDbClusterId() {
            return this.dbClusterId;
        }

        public DescribeDBClusterConfigResponseBodyData setDbInstanceId(String dbInstanceId) {
            this.dbInstanceId = dbInstanceId;
            return this;
        }
        public String getDbInstanceId() {
            return this.dbInstanceId;
        }

        public DescribeDBClusterConfigResponseBodyData setDbInstanceName(String dbInstanceName) {
            this.dbInstanceName = dbInstanceName;
            return this;
        }
        public String getDbInstanceName() {
            return this.dbInstanceName;
        }

        public DescribeDBClusterConfigResponseBodyData setParams(java.util.List<DescribeDBClusterConfigResponseBodyDataParams> params) {
            this.params = params;
            return this;
        }
        public java.util.List<DescribeDBClusterConfigResponseBodyDataParams> getParams() {
            return this.params;
        }

        public DescribeDBClusterConfigResponseBodyData setTaskId(Integer taskId) {
            this.taskId = taskId;
            return this;
        }
        public Integer getTaskId() {
            return this.taskId;
        }

    }

}
