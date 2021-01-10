// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutMiscgetgraylterationResponseBody extends TeaModel {
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
    public GetLinkeBahamutMiscgetgraylterationResponseBodyResult result;

    public static GetLinkeBahamutMiscgetgraylterationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutMiscgetgraylterationResponseBody self = new GetLinkeBahamutMiscgetgraylterationResponseBody();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutMiscgetgraylterationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetLinkeBahamutMiscgetgraylterationResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetLinkeBahamutMiscgetgraylterationResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public GetLinkeBahamutMiscgetgraylterationResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetLinkeBahamutMiscgetgraylterationResponseBody setErrorMsgParamsMap(String errorMsgParamsMap) {
        this.errorMsgParamsMap = errorMsgParamsMap;
        return this;
    }
    public String getErrorMsgParamsMap() {
        return this.errorMsgParamsMap;
    }

    public GetLinkeBahamutMiscgetgraylterationResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetLinkeBahamutMiscgetgraylterationResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public GetLinkeBahamutMiscgetgraylterationResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetLinkeBahamutMiscgetgraylterationResponseBody setResult(GetLinkeBahamutMiscgetgraylterationResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public GetLinkeBahamutMiscgetgraylterationResponseBodyResult getResult() {
        return this.result;
    }

    public static class GetLinkeBahamutMiscgetgraylterationResponseBodyResult extends TeaModel {
        @NameInMap("CreateTime")
        public Long createTime;

        @NameInMap("Creator")
        public String creator;

        @NameInMap("Finished")
        public Boolean finished;

        @NameInMap("Id")
        public String id;

        @NameInMap("Name")
        public String name;

        @NameInMap("ReleaseId")
        public String releaseId;

        @NameInMap("ReleaseTime")
        public Long releaseTime;

        @NameInMap("Stage")
        public String stage;

        @NameInMap("Type")
        public String type;

        @NameInMap("Apps")
        public java.util.List<String> apps;

        public static GetLinkeBahamutMiscgetgraylterationResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            GetLinkeBahamutMiscgetgraylterationResponseBodyResult self = new GetLinkeBahamutMiscgetgraylterationResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public GetLinkeBahamutMiscgetgraylterationResponseBodyResult setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public GetLinkeBahamutMiscgetgraylterationResponseBodyResult setCreator(String creator) {
            this.creator = creator;
            return this;
        }
        public String getCreator() {
            return this.creator;
        }

        public GetLinkeBahamutMiscgetgraylterationResponseBodyResult setFinished(Boolean finished) {
            this.finished = finished;
            return this;
        }
        public Boolean getFinished() {
            return this.finished;
        }

        public GetLinkeBahamutMiscgetgraylterationResponseBodyResult setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetLinkeBahamutMiscgetgraylterationResponseBodyResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetLinkeBahamutMiscgetgraylterationResponseBodyResult setReleaseId(String releaseId) {
            this.releaseId = releaseId;
            return this;
        }
        public String getReleaseId() {
            return this.releaseId;
        }

        public GetLinkeBahamutMiscgetgraylterationResponseBodyResult setReleaseTime(Long releaseTime) {
            this.releaseTime = releaseTime;
            return this;
        }
        public Long getReleaseTime() {
            return this.releaseTime;
        }

        public GetLinkeBahamutMiscgetgraylterationResponseBodyResult setStage(String stage) {
            this.stage = stage;
            return this;
        }
        public String getStage() {
            return this.stage;
        }

        public GetLinkeBahamutMiscgetgraylterationResponseBodyResult setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public GetLinkeBahamutMiscgetgraylterationResponseBodyResult setApps(java.util.List<String> apps) {
            this.apps = apps;
            return this;
        }
        public java.util.List<String> getApps() {
            return this.apps;
        }

    }

}
