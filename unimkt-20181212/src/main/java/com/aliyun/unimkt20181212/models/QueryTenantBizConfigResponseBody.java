// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.unimkt20181212.models;

import com.aliyun.tea.*;

public class QueryTenantBizConfigResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("Model")
    public java.util.List<QueryTenantBizConfigResponseBodyModel> model;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static QueryTenantBizConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryTenantBizConfigResponseBody self = new QueryTenantBizConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryTenantBizConfigResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryTenantBizConfigResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryTenantBizConfigResponseBody setModel(java.util.List<QueryTenantBizConfigResponseBodyModel> model) {
        this.model = model;
        return this;
    }
    public java.util.List<QueryTenantBizConfigResponseBodyModel> getModel() {
        return this.model;
    }

    public QueryTenantBizConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryTenantBizConfigResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryTenantBizConfigResponseBodyModel extends TeaModel {
        @NameInMap("BizId")
        public String bizId;

        @NameInMap("ConfigDescription")
        public String configDescription;

        @NameInMap("ConfigValueType")
        public String configValueType;

        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static QueryTenantBizConfigResponseBodyModel build(java.util.Map<String, ?> map) throws Exception {
            QueryTenantBizConfigResponseBodyModel self = new QueryTenantBizConfigResponseBodyModel();
            return TeaModel.build(map, self);
        }

        public QueryTenantBizConfigResponseBodyModel setBizId(String bizId) {
            this.bizId = bizId;
            return this;
        }
        public String getBizId() {
            return this.bizId;
        }

        public QueryTenantBizConfigResponseBodyModel setConfigDescription(String configDescription) {
            this.configDescription = configDescription;
            return this;
        }
        public String getConfigDescription() {
            return this.configDescription;
        }

        public QueryTenantBizConfigResponseBodyModel setConfigValueType(String configValueType) {
            this.configValueType = configValueType;
            return this;
        }
        public String getConfigValueType() {
            return this.configValueType;
        }

        public QueryTenantBizConfigResponseBodyModel setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public QueryTenantBizConfigResponseBodyModel setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
