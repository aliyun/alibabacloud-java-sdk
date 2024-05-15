// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.selectdb20230522.models;

import com.aliyun.tea.*;

public class DescribeDBClusterConfigResponseBody extends TeaModel {
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    @NameInMap("Data")
    public DescribeDBClusterConfigResponseBodyData data;

    @NameInMap("DynamicCode")
    public String dynamicCode;

    @NameInMap("DynamicMessage")
    public String dynamicMessage;

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
        @NameInMap("Comment")
        public String comment;

        @NameInMap("DefaultValue")
        public String defaultValue;

        @NameInMap("IsDynamic")
        public Integer isDynamic;

        @NameInMap("IsUserModifiable")
        public Integer isUserModifiable;

        @NameInMap("Name")
        public String name;

        @NameInMap("Optional")
        public String optional;

        @NameInMap("ParamCategory")
        public String paramCategory;

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
        @NameInMap("DbClusterId")
        public String dbClusterId;

        @NameInMap("DbInstanceId")
        public String dbInstanceId;

        @NameInMap("DbInstanceName")
        public String dbInstanceName;

        @NameInMap("Params")
        public java.util.List<DescribeDBClusterConfigResponseBodyDataParams> params;

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
