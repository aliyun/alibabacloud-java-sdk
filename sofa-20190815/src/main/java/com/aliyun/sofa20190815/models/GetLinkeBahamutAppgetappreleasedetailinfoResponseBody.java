// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutAppgetappreleasedetailinfoResponseBody extends TeaModel {
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
    public GetLinkeBahamutAppgetappreleasedetailinfoResponseBodyResult result;

    public static GetLinkeBahamutAppgetappreleasedetailinfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutAppgetappreleasedetailinfoResponseBody self = new GetLinkeBahamutAppgetappreleasedetailinfoResponseBody();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutAppgetappreleasedetailinfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetLinkeBahamutAppgetappreleasedetailinfoResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetLinkeBahamutAppgetappreleasedetailinfoResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public GetLinkeBahamutAppgetappreleasedetailinfoResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetLinkeBahamutAppgetappreleasedetailinfoResponseBody setErrorMsgParamsMap(String errorMsgParamsMap) {
        this.errorMsgParamsMap = errorMsgParamsMap;
        return this;
    }
    public String getErrorMsgParamsMap() {
        return this.errorMsgParamsMap;
    }

    public GetLinkeBahamutAppgetappreleasedetailinfoResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetLinkeBahamutAppgetappreleasedetailinfoResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public GetLinkeBahamutAppgetappreleasedetailinfoResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetLinkeBahamutAppgetappreleasedetailinfoResponseBody setResult(GetLinkeBahamutAppgetappreleasedetailinfoResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public GetLinkeBahamutAppgetappreleasedetailinfoResponseBodyResult getResult() {
        return this.result;
    }

    public static class GetLinkeBahamutAppgetappreleasedetailinfoResponseBodyResult extends TeaModel {
        @NameInMap("AppName")
        public String appName;

        @NameInMap("Created")
        public Long created;

        @NameInMap("Deleted")
        public Boolean deleted;

        @NameInMap("Id")
        public String id;

        @NameInMap("LastModified")
        public Long lastModified;

        @NameInMap("NeedMerge")
        public Boolean needMerge;

        @NameInMap("ReleaseExternalId")
        public String releaseExternalId;

        @NameInMap("Status")
        public String status;

        @NameInMap("ActiveStages")
        public java.util.List<String> activeStages;

        @NameInMap("Stages")
        public java.util.List<String> stages;

        public static GetLinkeBahamutAppgetappreleasedetailinfoResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            GetLinkeBahamutAppgetappreleasedetailinfoResponseBodyResult self = new GetLinkeBahamutAppgetappreleasedetailinfoResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public GetLinkeBahamutAppgetappreleasedetailinfoResponseBodyResult setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public GetLinkeBahamutAppgetappreleasedetailinfoResponseBodyResult setCreated(Long created) {
            this.created = created;
            return this;
        }
        public Long getCreated() {
            return this.created;
        }

        public GetLinkeBahamutAppgetappreleasedetailinfoResponseBodyResult setDeleted(Boolean deleted) {
            this.deleted = deleted;
            return this;
        }
        public Boolean getDeleted() {
            return this.deleted;
        }

        public GetLinkeBahamutAppgetappreleasedetailinfoResponseBodyResult setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetLinkeBahamutAppgetappreleasedetailinfoResponseBodyResult setLastModified(Long lastModified) {
            this.lastModified = lastModified;
            return this;
        }
        public Long getLastModified() {
            return this.lastModified;
        }

        public GetLinkeBahamutAppgetappreleasedetailinfoResponseBodyResult setNeedMerge(Boolean needMerge) {
            this.needMerge = needMerge;
            return this;
        }
        public Boolean getNeedMerge() {
            return this.needMerge;
        }

        public GetLinkeBahamutAppgetappreleasedetailinfoResponseBodyResult setReleaseExternalId(String releaseExternalId) {
            this.releaseExternalId = releaseExternalId;
            return this;
        }
        public String getReleaseExternalId() {
            return this.releaseExternalId;
        }

        public GetLinkeBahamutAppgetappreleasedetailinfoResponseBodyResult setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetLinkeBahamutAppgetappreleasedetailinfoResponseBodyResult setActiveStages(java.util.List<String> activeStages) {
            this.activeStages = activeStages;
            return this;
        }
        public java.util.List<String> getActiveStages() {
            return this.activeStages;
        }

        public GetLinkeBahamutAppgetappreleasedetailinfoResponseBodyResult setStages(java.util.List<String> stages) {
            this.stages = stages;
            return this;
        }
        public java.util.List<String> getStages() {
            return this.stages;
        }

    }

}
