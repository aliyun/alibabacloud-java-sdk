// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkeBahamutCloudtenanttechstacksResponseBody extends TeaModel {
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
    public java.util.List<QueryLinkeBahamutCloudtenanttechstacksResponseBodyResult> result;

    public static QueryLinkeBahamutCloudtenanttechstacksResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkeBahamutCloudtenanttechstacksResponseBody self = new QueryLinkeBahamutCloudtenanttechstacksResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryLinkeBahamutCloudtenanttechstacksResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryLinkeBahamutCloudtenanttechstacksResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryLinkeBahamutCloudtenanttechstacksResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public QueryLinkeBahamutCloudtenanttechstacksResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QueryLinkeBahamutCloudtenanttechstacksResponseBody setErrorMsgParamsMap(String errorMsgParamsMap) {
        this.errorMsgParamsMap = errorMsgParamsMap;
        return this;
    }
    public String getErrorMsgParamsMap() {
        return this.errorMsgParamsMap;
    }

    public QueryLinkeBahamutCloudtenanttechstacksResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryLinkeBahamutCloudtenanttechstacksResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public QueryLinkeBahamutCloudtenanttechstacksResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryLinkeBahamutCloudtenanttechstacksResponseBody setResult(java.util.List<QueryLinkeBahamutCloudtenanttechstacksResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<QueryLinkeBahamutCloudtenanttechstacksResponseBodyResult> getResult() {
        return this.result;
    }

    public static class QueryLinkeBahamutCloudtenanttechstacksResponseBodyResult extends TeaModel {
        @NameInMap("Description")
        public String description;

        @NameInMap("Id")
        public String id;

        @NameInMap("Identity")
        public String identity;

        @NameInMap("Name")
        public String name;

        @NameInMap("Scope")
        public String scope;

        @NameInMap("Status")
        public String status;

        public static QueryLinkeBahamutCloudtenanttechstacksResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            QueryLinkeBahamutCloudtenanttechstacksResponseBodyResult self = new QueryLinkeBahamutCloudtenanttechstacksResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public QueryLinkeBahamutCloudtenanttechstacksResponseBodyResult setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public QueryLinkeBahamutCloudtenanttechstacksResponseBodyResult setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryLinkeBahamutCloudtenanttechstacksResponseBodyResult setIdentity(String identity) {
            this.identity = identity;
            return this;
        }
        public String getIdentity() {
            return this.identity;
        }

        public QueryLinkeBahamutCloudtenanttechstacksResponseBodyResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryLinkeBahamutCloudtenanttechstacksResponseBodyResult setScope(String scope) {
            this.scope = scope;
            return this;
        }
        public String getScope() {
            return this.scope;
        }

        public QueryLinkeBahamutCloudtenanttechstacksResponseBodyResult setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
