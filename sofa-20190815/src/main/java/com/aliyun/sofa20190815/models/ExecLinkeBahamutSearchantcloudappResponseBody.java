// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ExecLinkeBahamutSearchantcloudappResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Message")
    public String message;

    @NameInMap("ResponseStatusCode")
    public Long responseStatusCode;

    @NameInMap("ErrorMsgParamsMap")
    public String errorMsgParamsMap;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("Result")
    public java.util.List<ExecLinkeBahamutSearchantcloudappResponseBodyResult> result;

    public static ExecLinkeBahamutSearchantcloudappResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ExecLinkeBahamutSearchantcloudappResponseBody self = new ExecLinkeBahamutSearchantcloudappResponseBody();
        return TeaModel.build(map, self);
    }

    public ExecLinkeBahamutSearchantcloudappResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ExecLinkeBahamutSearchantcloudappResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ExecLinkeBahamutSearchantcloudappResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public ExecLinkeBahamutSearchantcloudappResponseBody setErrorMsgParamsMap(String errorMsgParamsMap) {
        this.errorMsgParamsMap = errorMsgParamsMap;
        return this;
    }
    public String getErrorMsgParamsMap() {
        return this.errorMsgParamsMap;
    }

    public ExecLinkeBahamutSearchantcloudappResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ExecLinkeBahamutSearchantcloudappResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public ExecLinkeBahamutSearchantcloudappResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ExecLinkeBahamutSearchantcloudappResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ExecLinkeBahamutSearchantcloudappResponseBody setResult(java.util.List<ExecLinkeBahamutSearchantcloudappResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<ExecLinkeBahamutSearchantcloudappResponseBodyResult> getResult() {
        return this.result;
    }

    public static class ExecLinkeBahamutSearchantcloudappResponseBodyResult extends TeaModel {
        @NameInMap("Status")
        public String status;

        @NameInMap("CreationTime")
        public String creationTime;

        @NameInMap("HasImported")
        public Boolean hasImported;

        @NameInMap("ApplicationName")
        public String applicationName;

        @NameInMap("BuildpackName")
        public String buildpackName;

        @NameInMap("AppLevel")
        public String appLevel;

        @NameInMap("Description")
        public String description;

        @NameInMap("AppGroupName")
        public String appGroupName;

        @NameInMap("OwnerLoginName")
        public String ownerLoginName;

        @NameInMap("BuildpackVersion")
        public String buildpackVersion;

        @NameInMap("TechV2")
        public Boolean techV2;

        @NameInMap("Alias")
        public String alias;

        public static ExecLinkeBahamutSearchantcloudappResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            ExecLinkeBahamutSearchantcloudappResponseBodyResult self = new ExecLinkeBahamutSearchantcloudappResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public ExecLinkeBahamutSearchantcloudappResponseBodyResult setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ExecLinkeBahamutSearchantcloudappResponseBodyResult setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public ExecLinkeBahamutSearchantcloudappResponseBodyResult setHasImported(Boolean hasImported) {
            this.hasImported = hasImported;
            return this;
        }
        public Boolean getHasImported() {
            return this.hasImported;
        }

        public ExecLinkeBahamutSearchantcloudappResponseBodyResult setApplicationName(String applicationName) {
            this.applicationName = applicationName;
            return this;
        }
        public String getApplicationName() {
            return this.applicationName;
        }

        public ExecLinkeBahamutSearchantcloudappResponseBodyResult setBuildpackName(String buildpackName) {
            this.buildpackName = buildpackName;
            return this;
        }
        public String getBuildpackName() {
            return this.buildpackName;
        }

        public ExecLinkeBahamutSearchantcloudappResponseBodyResult setAppLevel(String appLevel) {
            this.appLevel = appLevel;
            return this;
        }
        public String getAppLevel() {
            return this.appLevel;
        }

        public ExecLinkeBahamutSearchantcloudappResponseBodyResult setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ExecLinkeBahamutSearchantcloudappResponseBodyResult setAppGroupName(String appGroupName) {
            this.appGroupName = appGroupName;
            return this;
        }
        public String getAppGroupName() {
            return this.appGroupName;
        }

        public ExecLinkeBahamutSearchantcloudappResponseBodyResult setOwnerLoginName(String ownerLoginName) {
            this.ownerLoginName = ownerLoginName;
            return this;
        }
        public String getOwnerLoginName() {
            return this.ownerLoginName;
        }

        public ExecLinkeBahamutSearchantcloudappResponseBodyResult setBuildpackVersion(String buildpackVersion) {
            this.buildpackVersion = buildpackVersion;
            return this;
        }
        public String getBuildpackVersion() {
            return this.buildpackVersion;
        }

        public ExecLinkeBahamutSearchantcloudappResponseBodyResult setTechV2(Boolean techV2) {
            this.techV2 = techV2;
            return this;
        }
        public Boolean getTechV2() {
            return this.techV2;
        }

        public ExecLinkeBahamutSearchantcloudappResponseBodyResult setAlias(String alias) {
            this.alias = alias;
            return this;
        }
        public String getAlias() {
            return this.alias;
        }

    }

}
