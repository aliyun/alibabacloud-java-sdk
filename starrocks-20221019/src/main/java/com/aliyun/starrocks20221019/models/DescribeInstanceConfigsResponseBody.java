// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.starrocks20221019.models;

import com.aliyun.tea.*;

public class DescribeInstanceConfigsResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>{     &quot;PolicyType&quot;: &quot;AccountLevelIdentityBasedPolicy&quot;,     &quot;AuthPrincipalOwnerId&quot;: &quot;xxx&quot;,     &quot;EncodedDiagnosticMessage&quot;: &quot;xxx&quot;,     &quot;AuthPrincipalType&quot;: &quot;xxx&quot;,     &quot;AuthPrincipalDisplayName&quot;: &quot;xxx&quot;,     &quot;NoPermissionType&quot;: &quot;ImplicitDeny&quot;,     &quot;AuthAction&quot;: &quot;sr:xxx&quot;   }</p>
     */
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    @NameInMap("Data")
    public java.util.List<DescribeInstanceConfigsResponseBodyData> data;

    /**
     * <strong>example:</strong>
     * <p>InvalidParams</p>
     */
    @NameInMap("ErrCode")
    public String errCode;

    /**
     * <strong>example:</strong>
     * <p>Invalid params: [instance not exists].</p>
     */
    @NameInMap("ErrMessage")
    public String errMessage;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <strong>example:</strong>
     * <p>32A44F0D-BFF6-5664-999A-218BBDE7****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <strong>example:</strong>
     * <p>4</p>
     */
    @NameInMap("Total")
    public Integer total;

    public static DescribeInstanceConfigsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceConfigsResponseBody self = new DescribeInstanceConfigsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceConfigsResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public DescribeInstanceConfigsResponseBody setData(java.util.List<DescribeInstanceConfigsResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<DescribeInstanceConfigsResponseBodyData> getData() {
        return this.data;
    }

    public DescribeInstanceConfigsResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public DescribeInstanceConfigsResponseBody setErrMessage(String errMessage) {
        this.errMessage = errMessage;
        return this;
    }
    public String getErrMessage() {
        return this.errMessage;
    }

    public DescribeInstanceConfigsResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public DescribeInstanceConfigsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeInstanceConfigsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DescribeInstanceConfigsResponseBody setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

    public static class DescribeInstanceConfigsResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("AllowModify")
        public String allowModify;

        /**
         * <strong>example:</strong>
         * <p>enable_udf</p>
         */
        @NameInMap("ConfigKey")
        public String configKey;

        /**
         * <strong>example:</strong>
         * <p>FE</p>
         */
        @NameInMap("ConfigType")
        public String configType;

        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("ConfigValue")
        public String configValue;

        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Custom")
        public Boolean custom;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("DefaultNodeGroup")
        public Boolean defaultNodeGroup;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("DefaultValue")
        public String defaultValue;

        @NameInMap("Description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>A boolean value to control whether to enable the synchronization of the tablet metadata. true indicates enabling synchronization, and false indicates disabling it.</p>
         */
        @NameInMap("DescriptionEn")
        public String descriptionEn;

        /**
         * <strong>example:</strong>
         * <p>ng-3d5ce6454354****</p>
         */
        @NameInMap("NodeGroupId")
        public String nodeGroupId;

        /**
         * <strong>example:</strong>
         * <p>ng_1</p>
         */
        @NameInMap("NodeGroupName")
        public String nodeGroupName;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Restart")
        public Boolean restart;

        /**
         * <strong>example:</strong>
         * <p>s</p>
         */
        @NameInMap("Unit")
        public String unit;

        /**
         * <strong>example:</strong>
         * <p>true,false</p>
         */
        @NameInMap("ValueRange")
        public String valueRange;

        /**
         * <strong>example:</strong>
         * <p>INT</p>
         */
        @NameInMap("ValueType")
        public String valueType;

        public static DescribeInstanceConfigsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceConfigsResponseBodyData self = new DescribeInstanceConfigsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceConfigsResponseBodyData setAllowModify(String allowModify) {
            this.allowModify = allowModify;
            return this;
        }
        public String getAllowModify() {
            return this.allowModify;
        }

        public DescribeInstanceConfigsResponseBodyData setConfigKey(String configKey) {
            this.configKey = configKey;
            return this;
        }
        public String getConfigKey() {
            return this.configKey;
        }

        public DescribeInstanceConfigsResponseBodyData setConfigType(String configType) {
            this.configType = configType;
            return this;
        }
        public String getConfigType() {
            return this.configType;
        }

        public DescribeInstanceConfigsResponseBodyData setConfigValue(String configValue) {
            this.configValue = configValue;
            return this;
        }
        public String getConfigValue() {
            return this.configValue;
        }

        public DescribeInstanceConfigsResponseBodyData setCustom(Boolean custom) {
            this.custom = custom;
            return this;
        }
        public Boolean getCustom() {
            return this.custom;
        }

        public DescribeInstanceConfigsResponseBodyData setDefaultNodeGroup(Boolean defaultNodeGroup) {
            this.defaultNodeGroup = defaultNodeGroup;
            return this;
        }
        public Boolean getDefaultNodeGroup() {
            return this.defaultNodeGroup;
        }

        public DescribeInstanceConfigsResponseBodyData setDefaultValue(String defaultValue) {
            this.defaultValue = defaultValue;
            return this;
        }
        public String getDefaultValue() {
            return this.defaultValue;
        }

        public DescribeInstanceConfigsResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeInstanceConfigsResponseBodyData setDescriptionEn(String descriptionEn) {
            this.descriptionEn = descriptionEn;
            return this;
        }
        public String getDescriptionEn() {
            return this.descriptionEn;
        }

        public DescribeInstanceConfigsResponseBodyData setNodeGroupId(String nodeGroupId) {
            this.nodeGroupId = nodeGroupId;
            return this;
        }
        public String getNodeGroupId() {
            return this.nodeGroupId;
        }

        public DescribeInstanceConfigsResponseBodyData setNodeGroupName(String nodeGroupName) {
            this.nodeGroupName = nodeGroupName;
            return this;
        }
        public String getNodeGroupName() {
            return this.nodeGroupName;
        }

        public DescribeInstanceConfigsResponseBodyData setRestart(Boolean restart) {
            this.restart = restart;
            return this;
        }
        public Boolean getRestart() {
            return this.restart;
        }

        public DescribeInstanceConfigsResponseBodyData setUnit(String unit) {
            this.unit = unit;
            return this;
        }
        public String getUnit() {
            return this.unit;
        }

        public DescribeInstanceConfigsResponseBodyData setValueRange(String valueRange) {
            this.valueRange = valueRange;
            return this;
        }
        public String getValueRange() {
            return this.valueRange;
        }

        public DescribeInstanceConfigsResponseBodyData setValueType(String valueType) {
            this.valueType = valueType;
            return this;
        }
        public String getValueType() {
            return this.valueType;
        }

    }

}
