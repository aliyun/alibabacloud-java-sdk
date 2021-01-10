// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkeBahamutCloudtenantapplevelResponseBody extends TeaModel {
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
    public java.util.List<QueryLinkeBahamutCloudtenantapplevelResponseBodyResult> result;

    public static QueryLinkeBahamutCloudtenantapplevelResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkeBahamutCloudtenantapplevelResponseBody self = new QueryLinkeBahamutCloudtenantapplevelResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryLinkeBahamutCloudtenantapplevelResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryLinkeBahamutCloudtenantapplevelResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryLinkeBahamutCloudtenantapplevelResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public QueryLinkeBahamutCloudtenantapplevelResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QueryLinkeBahamutCloudtenantapplevelResponseBody setErrorMsgParamsMap(String errorMsgParamsMap) {
        this.errorMsgParamsMap = errorMsgParamsMap;
        return this;
    }
    public String getErrorMsgParamsMap() {
        return this.errorMsgParamsMap;
    }

    public QueryLinkeBahamutCloudtenantapplevelResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryLinkeBahamutCloudtenantapplevelResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public QueryLinkeBahamutCloudtenantapplevelResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryLinkeBahamutCloudtenantapplevelResponseBody setResult(java.util.List<QueryLinkeBahamutCloudtenantapplevelResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<QueryLinkeBahamutCloudtenantapplevelResponseBodyResult> getResult() {
        return this.result;
    }

    public static class QueryLinkeBahamutCloudtenantapplevelResponseBodyResult extends TeaModel {
        @NameInMap("Id")
        public String id;

        @NameInMap("Name")
        public String name;

        @NameInMap("OwnerLoginName")
        public String ownerLoginName;

        public static QueryLinkeBahamutCloudtenantapplevelResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            QueryLinkeBahamutCloudtenantapplevelResponseBodyResult self = new QueryLinkeBahamutCloudtenantapplevelResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public QueryLinkeBahamutCloudtenantapplevelResponseBodyResult setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryLinkeBahamutCloudtenantapplevelResponseBodyResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryLinkeBahamutCloudtenantapplevelResponseBodyResult setOwnerLoginName(String ownerLoginName) {
            this.ownerLoginName = ownerLoginName;
            return this;
        }
        public String getOwnerLoginName() {
            return this.ownerLoginName;
        }

    }

}
