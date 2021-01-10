// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkeBahamutAdminpipelinecomponentResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("ErrorMsgParamsMap")
    public String errorMsgParamsMap;

    @NameInMap("Message")
    public String message;

    @NameInMap("ResponseStatusCode")
    public Long responseStatusCode;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Result")
    public java.util.List<QueryLinkeBahamutAdminpipelinecomponentResponseBodyResult> result;

    public static QueryLinkeBahamutAdminpipelinecomponentResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkeBahamutAdminpipelinecomponentResponseBody self = new QueryLinkeBahamutAdminpipelinecomponentResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryLinkeBahamutAdminpipelinecomponentResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryLinkeBahamutAdminpipelinecomponentResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryLinkeBahamutAdminpipelinecomponentResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public QueryLinkeBahamutAdminpipelinecomponentResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QueryLinkeBahamutAdminpipelinecomponentResponseBody setErrorMsgParamsMap(String errorMsgParamsMap) {
        this.errorMsgParamsMap = errorMsgParamsMap;
        return this;
    }
    public String getErrorMsgParamsMap() {
        return this.errorMsgParamsMap;
    }

    public QueryLinkeBahamutAdminpipelinecomponentResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryLinkeBahamutAdminpipelinecomponentResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public QueryLinkeBahamutAdminpipelinecomponentResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryLinkeBahamutAdminpipelinecomponentResponseBody setResult(java.util.List<QueryLinkeBahamutAdminpipelinecomponentResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<QueryLinkeBahamutAdminpipelinecomponentResponseBodyResult> getResult() {
        return this.result;
    }

    public static class QueryLinkeBahamutAdminpipelinecomponentResponseBodyResult extends TeaModel {
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

        public static QueryLinkeBahamutAdminpipelinecomponentResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            QueryLinkeBahamutAdminpipelinecomponentResponseBodyResult self = new QueryLinkeBahamutAdminpipelinecomponentResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public QueryLinkeBahamutAdminpipelinecomponentResponseBodyResult setAllowSkip(Boolean allowSkip) {
            this.allowSkip = allowSkip;
            return this;
        }
        public Boolean getAllowSkip() {
            return this.allowSkip;
        }

        public QueryLinkeBahamutAdminpipelinecomponentResponseBodyResult setDisable(Boolean disable) {
            this.disable = disable;
            return this;
        }
        public Boolean getDisable() {
            return this.disable;
        }

        public QueryLinkeBahamutAdminpipelinecomponentResponseBodyResult setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public QueryLinkeBahamutAdminpipelinecomponentResponseBodyResult setExpression(String expression) {
            this.expression = expression;
            return this;
        }
        public String getExpression() {
            return this.expression;
        }

        public QueryLinkeBahamutAdminpipelinecomponentResponseBodyResult setExpressionDesc(String expressionDesc) {
            this.expressionDesc = expressionDesc;
            return this;
        }
        public String getExpressionDesc() {
            return this.expressionDesc;
        }

        public QueryLinkeBahamutAdminpipelinecomponentResponseBodyResult setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public QueryLinkeBahamutAdminpipelinecomponentResponseBodyResult setGmtModify(Long gmtModify) {
            this.gmtModify = gmtModify;
            return this;
        }
        public Long getGmtModify() {
            return this.gmtModify;
        }

        public QueryLinkeBahamutAdminpipelinecomponentResponseBodyResult setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryLinkeBahamutAdminpipelinecomponentResponseBodyResult setManual(Boolean manual) {
            this.manual = manual;
            return this;
        }
        public Boolean getManual() {
            return this.manual;
        }

        public QueryLinkeBahamutAdminpipelinecomponentResponseBodyResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryLinkeBahamutAdminpipelinecomponentResponseBodyResult setRestUrl(String restUrl) {
            this.restUrl = restUrl;
            return this;
        }
        public String getRestUrl() {
            return this.restUrl;
        }

        public QueryLinkeBahamutAdminpipelinecomponentResponseBodyResult setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
