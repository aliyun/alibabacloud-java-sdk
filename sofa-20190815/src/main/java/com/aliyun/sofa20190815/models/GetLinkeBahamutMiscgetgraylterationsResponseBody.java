// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutMiscgetgraylterationsResponseBody extends TeaModel {
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
    public java.util.List<GetLinkeBahamutMiscgetgraylterationsResponseBodyResult> result;

    public static GetLinkeBahamutMiscgetgraylterationsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutMiscgetgraylterationsResponseBody self = new GetLinkeBahamutMiscgetgraylterationsResponseBody();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutMiscgetgraylterationsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetLinkeBahamutMiscgetgraylterationsResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetLinkeBahamutMiscgetgraylterationsResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public GetLinkeBahamutMiscgetgraylterationsResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetLinkeBahamutMiscgetgraylterationsResponseBody setErrorMsgParamsMap(String errorMsgParamsMap) {
        this.errorMsgParamsMap = errorMsgParamsMap;
        return this;
    }
    public String getErrorMsgParamsMap() {
        return this.errorMsgParamsMap;
    }

    public GetLinkeBahamutMiscgetgraylterationsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetLinkeBahamutMiscgetgraylterationsResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public GetLinkeBahamutMiscgetgraylterationsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetLinkeBahamutMiscgetgraylterationsResponseBody setResult(java.util.List<GetLinkeBahamutMiscgetgraylterationsResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<GetLinkeBahamutMiscgetgraylterationsResponseBodyResult> getResult() {
        return this.result;
    }

    public static class GetLinkeBahamutMiscgetgraylterationsResponseBodyResult extends TeaModel {
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

        public static GetLinkeBahamutMiscgetgraylterationsResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            GetLinkeBahamutMiscgetgraylterationsResponseBodyResult self = new GetLinkeBahamutMiscgetgraylterationsResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public GetLinkeBahamutMiscgetgraylterationsResponseBodyResult setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public GetLinkeBahamutMiscgetgraylterationsResponseBodyResult setCreator(String creator) {
            this.creator = creator;
            return this;
        }
        public String getCreator() {
            return this.creator;
        }

        public GetLinkeBahamutMiscgetgraylterationsResponseBodyResult setFinished(Boolean finished) {
            this.finished = finished;
            return this;
        }
        public Boolean getFinished() {
            return this.finished;
        }

        public GetLinkeBahamutMiscgetgraylterationsResponseBodyResult setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetLinkeBahamutMiscgetgraylterationsResponseBodyResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetLinkeBahamutMiscgetgraylterationsResponseBodyResult setReleaseId(String releaseId) {
            this.releaseId = releaseId;
            return this;
        }
        public String getReleaseId() {
            return this.releaseId;
        }

        public GetLinkeBahamutMiscgetgraylterationsResponseBodyResult setReleaseTime(Long releaseTime) {
            this.releaseTime = releaseTime;
            return this;
        }
        public Long getReleaseTime() {
            return this.releaseTime;
        }

        public GetLinkeBahamutMiscgetgraylterationsResponseBodyResult setStage(String stage) {
            this.stage = stage;
            return this;
        }
        public String getStage() {
            return this.stage;
        }

        public GetLinkeBahamutMiscgetgraylterationsResponseBodyResult setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public GetLinkeBahamutMiscgetgraylterationsResponseBodyResult setApps(java.util.List<String> apps) {
            this.apps = apps;
            return this;
        }
        public java.util.List<String> getApps() {
            return this.apps;
        }

    }

}
