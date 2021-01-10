// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutQualitygetexternaldataResponseBody extends TeaModel {
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
    public GetLinkeBahamutQualitygetexternaldataResponseBodyResult result;

    public static GetLinkeBahamutQualitygetexternaldataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutQualitygetexternaldataResponseBody self = new GetLinkeBahamutQualitygetexternaldataResponseBody();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutQualitygetexternaldataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetLinkeBahamutQualitygetexternaldataResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetLinkeBahamutQualitygetexternaldataResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public GetLinkeBahamutQualitygetexternaldataResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetLinkeBahamutQualitygetexternaldataResponseBody setErrorMsgParamsMap(String errorMsgParamsMap) {
        this.errorMsgParamsMap = errorMsgParamsMap;
        return this;
    }
    public String getErrorMsgParamsMap() {
        return this.errorMsgParamsMap;
    }

    public GetLinkeBahamutQualitygetexternaldataResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetLinkeBahamutQualitygetexternaldataResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public GetLinkeBahamutQualitygetexternaldataResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetLinkeBahamutQualitygetexternaldataResponseBody setResult(GetLinkeBahamutQualitygetexternaldataResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public GetLinkeBahamutQualitygetexternaldataResponseBodyResult getResult() {
        return this.result;
    }

    public static class GetLinkeBahamutQualitygetexternaldataResponseBodyResult extends TeaModel {
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

        public static GetLinkeBahamutQualitygetexternaldataResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            GetLinkeBahamutQualitygetexternaldataResponseBodyResult self = new GetLinkeBahamutQualitygetexternaldataResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public GetLinkeBahamutQualitygetexternaldataResponseBodyResult setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public GetLinkeBahamutQualitygetexternaldataResponseBodyResult setBranch(String branch) {
            this.branch = branch;
            return this;
        }
        public String getBranch() {
            return this.branch;
        }

        public GetLinkeBahamutQualitygetexternaldataResponseBodyResult setCodeName(String codeName) {
            this.codeName = codeName;
            return this;
        }
        public String getCodeName() {
            return this.codeName;
        }

        public GetLinkeBahamutQualitygetexternaldataResponseBodyResult setPass(Boolean pass) {
            this.pass = pass;
            return this;
        }
        public Boolean getPass() {
            return this.pass;
        }

        public GetLinkeBahamutQualitygetexternaldataResponseBodyResult setItems(java.util.List<String> items) {
            this.items = items;
            return this;
        }
        public java.util.List<String> getItems() {
            return this.items;
        }

    }

}
