// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutStcinfoResponseBody extends TeaModel {
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
    public GetLinkeBahamutStcinfoResponseBodyResult result;

    public static GetLinkeBahamutStcinfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutStcinfoResponseBody self = new GetLinkeBahamutStcinfoResponseBody();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutStcinfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetLinkeBahamutStcinfoResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetLinkeBahamutStcinfoResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public GetLinkeBahamutStcinfoResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetLinkeBahamutStcinfoResponseBody setErrorMsgParamsMap(String errorMsgParamsMap) {
        this.errorMsgParamsMap = errorMsgParamsMap;
        return this;
    }
    public String getErrorMsgParamsMap() {
        return this.errorMsgParamsMap;
    }

    public GetLinkeBahamutStcinfoResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetLinkeBahamutStcinfoResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public GetLinkeBahamutStcinfoResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetLinkeBahamutStcinfoResponseBody setResult(GetLinkeBahamutStcinfoResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public GetLinkeBahamutStcinfoResponseBodyResult getResult() {
        return this.result;
    }

    public static class GetLinkeBahamutStcinfoResponseBodyResult extends TeaModel {
        @NameInMap("Blocked")
        public Boolean blocked;

        @NameInMap("OnlyBlockStc")
        public Boolean onlyBlockStc;

        @NameInMap("Pass")
        public Boolean pass;

        @NameInMap("StcManagerNames")
        public String stcManagerNames;

        @NameInMap("StcManagerNos")
        public String stcManagerNos;

        @NameInMap("Unit")
        public String unit;

        public static GetLinkeBahamutStcinfoResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            GetLinkeBahamutStcinfoResponseBodyResult self = new GetLinkeBahamutStcinfoResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public GetLinkeBahamutStcinfoResponseBodyResult setBlocked(Boolean blocked) {
            this.blocked = blocked;
            return this;
        }
        public Boolean getBlocked() {
            return this.blocked;
        }

        public GetLinkeBahamutStcinfoResponseBodyResult setOnlyBlockStc(Boolean onlyBlockStc) {
            this.onlyBlockStc = onlyBlockStc;
            return this;
        }
        public Boolean getOnlyBlockStc() {
            return this.onlyBlockStc;
        }

        public GetLinkeBahamutStcinfoResponseBodyResult setPass(Boolean pass) {
            this.pass = pass;
            return this;
        }
        public Boolean getPass() {
            return this.pass;
        }

        public GetLinkeBahamutStcinfoResponseBodyResult setStcManagerNames(String stcManagerNames) {
            this.stcManagerNames = stcManagerNames;
            return this;
        }
        public String getStcManagerNames() {
            return this.stcManagerNames;
        }

        public GetLinkeBahamutStcinfoResponseBodyResult setStcManagerNos(String stcManagerNos) {
            this.stcManagerNos = stcManagerNos;
            return this;
        }
        public String getStcManagerNos() {
            return this.stcManagerNos;
        }

        public GetLinkeBahamutStcinfoResponseBodyResult setUnit(String unit) {
            this.unit = unit;
            return this;
        }
        public String getUnit() {
            return this.unit;
        }

    }

}
