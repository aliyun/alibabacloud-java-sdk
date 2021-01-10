// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutAoneinternaldetailResponseBody extends TeaModel {
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
    public GetLinkeBahamutAoneinternaldetailResponseBodyResult result;

    public static GetLinkeBahamutAoneinternaldetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutAoneinternaldetailResponseBody self = new GetLinkeBahamutAoneinternaldetailResponseBody();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutAoneinternaldetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetLinkeBahamutAoneinternaldetailResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetLinkeBahamutAoneinternaldetailResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public GetLinkeBahamutAoneinternaldetailResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetLinkeBahamutAoneinternaldetailResponseBody setErrorMsgParamsMap(String errorMsgParamsMap) {
        this.errorMsgParamsMap = errorMsgParamsMap;
        return this;
    }
    public String getErrorMsgParamsMap() {
        return this.errorMsgParamsMap;
    }

    public GetLinkeBahamutAoneinternaldetailResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetLinkeBahamutAoneinternaldetailResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public GetLinkeBahamutAoneinternaldetailResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetLinkeBahamutAoneinternaldetailResponseBody setResult(GetLinkeBahamutAoneinternaldetailResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public GetLinkeBahamutAoneinternaldetailResponseBodyResult getResult() {
        return this.result;
    }

    public static class GetLinkeBahamutAoneinternaldetailResponseBodyResult extends TeaModel {
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

        public static GetLinkeBahamutAoneinternaldetailResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            GetLinkeBahamutAoneinternaldetailResponseBodyResult self = new GetLinkeBahamutAoneinternaldetailResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public GetLinkeBahamutAoneinternaldetailResponseBodyResult setCodeChangeJsonObjects(String codeChangeJsonObjects) {
            this.codeChangeJsonObjects = codeChangeJsonObjects;
            return this;
        }
        public String getCodeChangeJsonObjects() {
            return this.codeChangeJsonObjects;
        }

        public GetLinkeBahamutAoneinternaldetailResponseBodyResult setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetLinkeBahamutAoneinternaldetailResponseBodyResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetLinkeBahamutAoneinternaldetailResponseBodyResult setPortalUrl(String portalUrl) {
            this.portalUrl = portalUrl;
            return this;
        }
        public String getPortalUrl() {
            return this.portalUrl;
        }

        public GetLinkeBahamutAoneinternaldetailResponseBodyResult setStatusName(String statusName) {
            this.statusName = statusName;
            return this;
        }
        public String getStatusName() {
            return this.statusName;
        }

    }

}
