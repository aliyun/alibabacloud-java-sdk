// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutWebapigetdataResponseBody extends TeaModel {
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
    public GetLinkeBahamutWebapigetdataResponseBodyResult result;

    public static GetLinkeBahamutWebapigetdataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutWebapigetdataResponseBody self = new GetLinkeBahamutWebapigetdataResponseBody();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutWebapigetdataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetLinkeBahamutWebapigetdataResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetLinkeBahamutWebapigetdataResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public GetLinkeBahamutWebapigetdataResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetLinkeBahamutWebapigetdataResponseBody setErrorMsgParamsMap(String errorMsgParamsMap) {
        this.errorMsgParamsMap = errorMsgParamsMap;
        return this;
    }
    public String getErrorMsgParamsMap() {
        return this.errorMsgParamsMap;
    }

    public GetLinkeBahamutWebapigetdataResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetLinkeBahamutWebapigetdataResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public GetLinkeBahamutWebapigetdataResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetLinkeBahamutWebapigetdataResponseBody setResult(GetLinkeBahamutWebapigetdataResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public GetLinkeBahamutWebapigetdataResponseBodyResult getResult() {
        return this.result;
    }

    public static class GetLinkeBahamutWebapigetdataResponseBodyResult extends TeaModel {
        @NameInMap("AppName")
        public String appName;

        @NameInMap("Branch")
        public String branch;

        @NameInMap("CodeName")
        public String codeName;

        @NameInMap("Pass")
        public Boolean pass;

        @NameInMap("Items")
        public java.util.List<String> items;

        public static GetLinkeBahamutWebapigetdataResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            GetLinkeBahamutWebapigetdataResponseBodyResult self = new GetLinkeBahamutWebapigetdataResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public GetLinkeBahamutWebapigetdataResponseBodyResult setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public GetLinkeBahamutWebapigetdataResponseBodyResult setBranch(String branch) {
            this.branch = branch;
            return this;
        }
        public String getBranch() {
            return this.branch;
        }

        public GetLinkeBahamutWebapigetdataResponseBodyResult setCodeName(String codeName) {
            this.codeName = codeName;
            return this;
        }
        public String getCodeName() {
            return this.codeName;
        }

        public GetLinkeBahamutWebapigetdataResponseBodyResult setPass(Boolean pass) {
            this.pass = pass;
            return this;
        }
        public Boolean getPass() {
            return this.pass;
        }

        public GetLinkeBahamutWebapigetdataResponseBodyResult setItems(java.util.List<String> items) {
            this.items = items;
            return this;
        }
        public java.util.List<String> getItems() {
            return this.items;
        }

    }

}
