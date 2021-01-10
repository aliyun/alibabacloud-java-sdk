// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkeBahamutAoneinternalgreenchannelsResponseBody extends TeaModel {
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
    public java.util.List<QueryLinkeBahamutAoneinternalgreenchannelsResponseBodyResult> result;

    public static QueryLinkeBahamutAoneinternalgreenchannelsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkeBahamutAoneinternalgreenchannelsResponseBody self = new QueryLinkeBahamutAoneinternalgreenchannelsResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryLinkeBahamutAoneinternalgreenchannelsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryLinkeBahamutAoneinternalgreenchannelsResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryLinkeBahamutAoneinternalgreenchannelsResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public QueryLinkeBahamutAoneinternalgreenchannelsResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QueryLinkeBahamutAoneinternalgreenchannelsResponseBody setErrorMsgParamsMap(String errorMsgParamsMap) {
        this.errorMsgParamsMap = errorMsgParamsMap;
        return this;
    }
    public String getErrorMsgParamsMap() {
        return this.errorMsgParamsMap;
    }

    public QueryLinkeBahamutAoneinternalgreenchannelsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryLinkeBahamutAoneinternalgreenchannelsResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public QueryLinkeBahamutAoneinternalgreenchannelsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryLinkeBahamutAoneinternalgreenchannelsResponseBody setResult(java.util.List<QueryLinkeBahamutAoneinternalgreenchannelsResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<QueryLinkeBahamutAoneinternalgreenchannelsResponseBodyResult> getResult() {
        return this.result;
    }

    public static class QueryLinkeBahamutAoneinternalgreenchannelsResponseBodyResult extends TeaModel {
        @NameInMap("CodeChangeJsonObjects")
        public String codeChangeJsonObjects;

        @NameInMap("Id")
        public String id;

        @NameInMap("Name")
        public String name;

        @NameInMap("PortalUrl")
        public String portalUrl;

        @NameInMap("StatusName")
        public String statusName;

        public static QueryLinkeBahamutAoneinternalgreenchannelsResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            QueryLinkeBahamutAoneinternalgreenchannelsResponseBodyResult self = new QueryLinkeBahamutAoneinternalgreenchannelsResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public QueryLinkeBahamutAoneinternalgreenchannelsResponseBodyResult setCodeChangeJsonObjects(String codeChangeJsonObjects) {
            this.codeChangeJsonObjects = codeChangeJsonObjects;
            return this;
        }
        public String getCodeChangeJsonObjects() {
            return this.codeChangeJsonObjects;
        }

        public QueryLinkeBahamutAoneinternalgreenchannelsResponseBodyResult setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryLinkeBahamutAoneinternalgreenchannelsResponseBodyResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryLinkeBahamutAoneinternalgreenchannelsResponseBodyResult setPortalUrl(String portalUrl) {
            this.portalUrl = portalUrl;
            return this;
        }
        public String getPortalUrl() {
            return this.portalUrl;
        }

        public QueryLinkeBahamutAoneinternalgreenchannelsResponseBodyResult setStatusName(String statusName) {
            this.statusName = statusName;
            return this;
        }
        public String getStatusName() {
            return this.statusName;
        }

    }

}
