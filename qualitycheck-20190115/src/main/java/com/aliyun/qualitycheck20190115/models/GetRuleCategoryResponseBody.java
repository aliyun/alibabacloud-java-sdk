// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class GetRuleCategoryResponseBody extends TeaModel {
    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public GetRuleCategoryResponseBodyData data;

    @NameInMap("Code")
    public String code;

    @NameInMap("Success")
    public Boolean success;

    public static GetRuleCategoryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetRuleCategoryResponseBody self = new GetRuleCategoryResponseBody();
        return TeaModel.build(map, self);
    }

    public GetRuleCategoryResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetRuleCategoryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetRuleCategoryResponseBody setData(GetRuleCategoryResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetRuleCategoryResponseBodyData getData() {
        return this.data;
    }

    public GetRuleCategoryResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetRuleCategoryResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetRuleCategoryResponseBodyDataRuleCountInfo extends TeaModel {
        @NameInMap("Type")
        public Integer type;

        @NameInMap("Select")
        public Boolean select;

        @NameInMap("TypeName")
        public String typeName;

        public static GetRuleCategoryResponseBodyDataRuleCountInfo build(java.util.Map<String, ?> map) throws Exception {
            GetRuleCategoryResponseBodyDataRuleCountInfo self = new GetRuleCategoryResponseBodyDataRuleCountInfo();
            return TeaModel.build(map, self);
        }

        public GetRuleCategoryResponseBodyDataRuleCountInfo setType(Integer type) {
            this.type = type;
            return this;
        }
        public Integer getType() {
            return this.type;
        }

        public GetRuleCategoryResponseBodyDataRuleCountInfo setSelect(Boolean select) {
            this.select = select;
            return this;
        }
        public Boolean getSelect() {
            return this.select;
        }

        public GetRuleCategoryResponseBodyDataRuleCountInfo setTypeName(String typeName) {
            this.typeName = typeName;
            return this;
        }
        public String getTypeName() {
            return this.typeName;
        }

    }

    public static class GetRuleCategoryResponseBodyData extends TeaModel {
        @NameInMap("RuleCountInfo")
        public java.util.List<GetRuleCategoryResponseBodyDataRuleCountInfo> ruleCountInfo;

        public static GetRuleCategoryResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetRuleCategoryResponseBodyData self = new GetRuleCategoryResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetRuleCategoryResponseBodyData setRuleCountInfo(java.util.List<GetRuleCategoryResponseBodyDataRuleCountInfo> ruleCountInfo) {
            this.ruleCountInfo = ruleCountInfo;
            return this;
        }
        public java.util.List<GetRuleCategoryResponseBodyDataRuleCountInfo> getRuleCountInfo() {
            return this.ruleCountInfo;
        }

    }

}
