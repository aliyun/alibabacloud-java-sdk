// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkeBahamutComponentsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("Message")
    public String message;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Result")
    public java.util.List<QueryLinkeBahamutComponentsResponseBodyResult> result;

    public static QueryLinkeBahamutComponentsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkeBahamutComponentsResponseBody self = new QueryLinkeBahamutComponentsResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryLinkeBahamutComponentsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryLinkeBahamutComponentsResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryLinkeBahamutComponentsResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public QueryLinkeBahamutComponentsResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QueryLinkeBahamutComponentsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryLinkeBahamutComponentsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryLinkeBahamutComponentsResponseBody setResult(java.util.List<QueryLinkeBahamutComponentsResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<QueryLinkeBahamutComponentsResponseBodyResult> getResult() {
        return this.result;
    }

    public static class QueryLinkeBahamutComponentsResponseBodyResult extends TeaModel {
        @NameInMap("AllowSkip")
        public Boolean allowSkip;

        @NameInMap("Disable")
        public Boolean disable;

        @NameInMap("DisplayName")
        public String displayName;

        @NameInMap("Expression")
        public String expression;

        @NameInMap("ExpressionDesc")
        public String expressionDesc;

        @NameInMap("GmtCreate")
        public Long gmtCreate;

        @NameInMap("GmtModify")
        public Long gmtModify;

        @NameInMap("Id")
        public String id;

        @NameInMap("Manual")
        public Boolean manual;

        @NameInMap("Name")
        public String name;

        @NameInMap("RestUrl")
        public String restUrl;

        @NameInMap("Type")
        public String type;

        public static QueryLinkeBahamutComponentsResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            QueryLinkeBahamutComponentsResponseBodyResult self = new QueryLinkeBahamutComponentsResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public QueryLinkeBahamutComponentsResponseBodyResult setAllowSkip(Boolean allowSkip) {
            this.allowSkip = allowSkip;
            return this;
        }
        public Boolean getAllowSkip() {
            return this.allowSkip;
        }

        public QueryLinkeBahamutComponentsResponseBodyResult setDisable(Boolean disable) {
            this.disable = disable;
            return this;
        }
        public Boolean getDisable() {
            return this.disable;
        }

        public QueryLinkeBahamutComponentsResponseBodyResult setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public QueryLinkeBahamutComponentsResponseBodyResult setExpression(String expression) {
            this.expression = expression;
            return this;
        }
        public String getExpression() {
            return this.expression;
        }

        public QueryLinkeBahamutComponentsResponseBodyResult setExpressionDesc(String expressionDesc) {
            this.expressionDesc = expressionDesc;
            return this;
        }
        public String getExpressionDesc() {
            return this.expressionDesc;
        }

        public QueryLinkeBahamutComponentsResponseBodyResult setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public QueryLinkeBahamutComponentsResponseBodyResult setGmtModify(Long gmtModify) {
            this.gmtModify = gmtModify;
            return this;
        }
        public Long getGmtModify() {
            return this.gmtModify;
        }

        public QueryLinkeBahamutComponentsResponseBodyResult setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryLinkeBahamutComponentsResponseBodyResult setManual(Boolean manual) {
            this.manual = manual;
            return this;
        }
        public Boolean getManual() {
            return this.manual;
        }

        public QueryLinkeBahamutComponentsResponseBodyResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryLinkeBahamutComponentsResponseBodyResult setRestUrl(String restUrl) {
            this.restUrl = restUrl;
            return this;
        }
        public String getRestUrl() {
            return this.restUrl;
        }

        public QueryLinkeBahamutComponentsResponseBodyResult setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
