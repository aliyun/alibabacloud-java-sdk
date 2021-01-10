// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryMsSGFormConfigResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("AuthRuleConfig")
    public QueryMsSGFormConfigResponseBodyAuthRuleConfig authRuleConfig;

    public static QueryMsSGFormConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryMsSGFormConfigResponseBody self = new QueryMsSGFormConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryMsSGFormConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryMsSGFormConfigResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryMsSGFormConfigResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public QueryMsSGFormConfigResponseBody setAuthRuleConfig(QueryMsSGFormConfigResponseBodyAuthRuleConfig authRuleConfig) {
        this.authRuleConfig = authRuleConfig;
        return this;
    }
    public QueryMsSGFormConfigResponseBodyAuthRuleConfig getAuthRuleConfig() {
        return this.authRuleConfig;
    }

    public static class QueryMsSGFormConfigResponseBodyAuthRuleConfigFields extends TeaModel {
        @NameInMap("DescCn")
        public String descCn;

        @NameInMap("DescEn")
        public String descEn;

        @NameInMap("Value")
        public String value;

        public static QueryMsSGFormConfigResponseBodyAuthRuleConfigFields build(java.util.Map<String, ?> map) throws Exception {
            QueryMsSGFormConfigResponseBodyAuthRuleConfigFields self = new QueryMsSGFormConfigResponseBodyAuthRuleConfigFields();
            return TeaModel.build(map, self);
        }

        public QueryMsSGFormConfigResponseBodyAuthRuleConfigFields setDescCn(String descCn) {
            this.descCn = descCn;
            return this;
        }
        public String getDescCn() {
            return this.descCn;
        }

        public QueryMsSGFormConfigResponseBodyAuthRuleConfigFields setDescEn(String descEn) {
            this.descEn = descEn;
            return this;
        }
        public String getDescEn() {
            return this.descEn;
        }

        public QueryMsSGFormConfigResponseBodyAuthRuleConfigFields setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class QueryMsSGFormConfigResponseBodyAuthRuleConfigOperations extends TeaModel {
        @NameInMap("DescCn")
        public String descCn;

        @NameInMap("DescEn")
        public String descEn;

        @NameInMap("Value")
        public String value;

        public static QueryMsSGFormConfigResponseBodyAuthRuleConfigOperations build(java.util.Map<String, ?> map) throws Exception {
            QueryMsSGFormConfigResponseBodyAuthRuleConfigOperations self = new QueryMsSGFormConfigResponseBodyAuthRuleConfigOperations();
            return TeaModel.build(map, self);
        }

        public QueryMsSGFormConfigResponseBodyAuthRuleConfigOperations setDescCn(String descCn) {
            this.descCn = descCn;
            return this;
        }
        public String getDescCn() {
            return this.descCn;
        }

        public QueryMsSGFormConfigResponseBodyAuthRuleConfigOperations setDescEn(String descEn) {
            this.descEn = descEn;
            return this;
        }
        public String getDescEn() {
            return this.descEn;
        }

        public QueryMsSGFormConfigResponseBodyAuthRuleConfigOperations setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class QueryMsSGFormConfigResponseBodyAuthRuleConfigTypes extends TeaModel {
        @NameInMap("DescCn")
        public String descCn;

        @NameInMap("DescEn")
        public String descEn;

        @NameInMap("Value")
        public String value;

        public static QueryMsSGFormConfigResponseBodyAuthRuleConfigTypes build(java.util.Map<String, ?> map) throws Exception {
            QueryMsSGFormConfigResponseBodyAuthRuleConfigTypes self = new QueryMsSGFormConfigResponseBodyAuthRuleConfigTypes();
            return TeaModel.build(map, self);
        }

        public QueryMsSGFormConfigResponseBodyAuthRuleConfigTypes setDescCn(String descCn) {
            this.descCn = descCn;
            return this;
        }
        public String getDescCn() {
            return this.descCn;
        }

        public QueryMsSGFormConfigResponseBodyAuthRuleConfigTypes setDescEn(String descEn) {
            this.descEn = descEn;
            return this;
        }
        public String getDescEn() {
            return this.descEn;
        }

        public QueryMsSGFormConfigResponseBodyAuthRuleConfigTypes setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class QueryMsSGFormConfigResponseBodyAuthRuleConfig extends TeaModel {
        @NameInMap("Fields")
        public java.util.List<QueryMsSGFormConfigResponseBodyAuthRuleConfigFields> fields;

        @NameInMap("Operations")
        public java.util.List<QueryMsSGFormConfigResponseBodyAuthRuleConfigOperations> operations;

        @NameInMap("Types")
        public java.util.List<QueryMsSGFormConfigResponseBodyAuthRuleConfigTypes> types;

        public static QueryMsSGFormConfigResponseBodyAuthRuleConfig build(java.util.Map<String, ?> map) throws Exception {
            QueryMsSGFormConfigResponseBodyAuthRuleConfig self = new QueryMsSGFormConfigResponseBodyAuthRuleConfig();
            return TeaModel.build(map, self);
        }

        public QueryMsSGFormConfigResponseBodyAuthRuleConfig setFields(java.util.List<QueryMsSGFormConfigResponseBodyAuthRuleConfigFields> fields) {
            this.fields = fields;
            return this;
        }
        public java.util.List<QueryMsSGFormConfigResponseBodyAuthRuleConfigFields> getFields() {
            return this.fields;
        }

        public QueryMsSGFormConfigResponseBodyAuthRuleConfig setOperations(java.util.List<QueryMsSGFormConfigResponseBodyAuthRuleConfigOperations> operations) {
            this.operations = operations;
            return this;
        }
        public java.util.List<QueryMsSGFormConfigResponseBodyAuthRuleConfigOperations> getOperations() {
            return this.operations;
        }

        public QueryMsSGFormConfigResponseBodyAuthRuleConfig setTypes(java.util.List<QueryMsSGFormConfigResponseBodyAuthRuleConfigTypes> types) {
            this.types = types;
            return this;
        }
        public java.util.List<QueryMsSGFormConfigResponseBodyAuthRuleConfigTypes> getTypes() {
            return this.types;
        }

    }

}
