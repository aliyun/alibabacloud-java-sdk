// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutStagebranchinfoResponseBody extends TeaModel {
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
    public GetLinkeBahamutStagebranchinfoResponseBodyResult result;

    public static GetLinkeBahamutStagebranchinfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutStagebranchinfoResponseBody self = new GetLinkeBahamutStagebranchinfoResponseBody();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutStagebranchinfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetLinkeBahamutStagebranchinfoResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetLinkeBahamutStagebranchinfoResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public GetLinkeBahamutStagebranchinfoResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetLinkeBahamutStagebranchinfoResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetLinkeBahamutStagebranchinfoResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetLinkeBahamutStagebranchinfoResponseBody setResult(GetLinkeBahamutStagebranchinfoResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public GetLinkeBahamutStagebranchinfoResponseBodyResult getResult() {
        return this.result;
    }

    public static class GetLinkeBahamutStagebranchinfoResponseBodyResult extends TeaModel {
        @NameInMap("AppName")
        public String appName;

        @NameInMap("ArchDomainName")
        public String archDomainName;

        @NameInMap("Branch")
        public String branch;

        @NameInMap("GrayRelease")
        public Boolean grayRelease;

        @NameInMap("Stage")
        public String stage;

        public static GetLinkeBahamutStagebranchinfoResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            GetLinkeBahamutStagebranchinfoResponseBodyResult self = new GetLinkeBahamutStagebranchinfoResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public GetLinkeBahamutStagebranchinfoResponseBodyResult setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public GetLinkeBahamutStagebranchinfoResponseBodyResult setArchDomainName(String archDomainName) {
            this.archDomainName = archDomainName;
            return this;
        }
        public String getArchDomainName() {
            return this.archDomainName;
        }

        public GetLinkeBahamutStagebranchinfoResponseBodyResult setBranch(String branch) {
            this.branch = branch;
            return this;
        }
        public String getBranch() {
            return this.branch;
        }

        public GetLinkeBahamutStagebranchinfoResponseBodyResult setGrayRelease(Boolean grayRelease) {
            this.grayRelease = grayRelease;
            return this;
        }
        public Boolean getGrayRelease() {
            return this.grayRelease;
        }

        public GetLinkeBahamutStagebranchinfoResponseBodyResult setStage(String stage) {
            this.stage = stage;
            return this;
        }
        public String getStage() {
            return this.stage;
        }

    }

}
