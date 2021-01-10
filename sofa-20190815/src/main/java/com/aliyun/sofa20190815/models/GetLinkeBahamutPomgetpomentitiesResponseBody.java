// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutPomgetpomentitiesResponseBody extends TeaModel {
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
    public java.util.List<GetLinkeBahamutPomgetpomentitiesResponseBodyResult> result;

    public static GetLinkeBahamutPomgetpomentitiesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutPomgetpomentitiesResponseBody self = new GetLinkeBahamutPomgetpomentitiesResponseBody();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutPomgetpomentitiesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetLinkeBahamutPomgetpomentitiesResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetLinkeBahamutPomgetpomentitiesResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public GetLinkeBahamutPomgetpomentitiesResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetLinkeBahamutPomgetpomentitiesResponseBody setErrorMsgParamsMap(String errorMsgParamsMap) {
        this.errorMsgParamsMap = errorMsgParamsMap;
        return this;
    }
    public String getErrorMsgParamsMap() {
        return this.errorMsgParamsMap;
    }

    public GetLinkeBahamutPomgetpomentitiesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetLinkeBahamutPomgetpomentitiesResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public GetLinkeBahamutPomgetpomentitiesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetLinkeBahamutPomgetpomentitiesResponseBody setResult(java.util.List<GetLinkeBahamutPomgetpomentitiesResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<GetLinkeBahamutPomgetpomentitiesResponseBodyResult> getResult() {
        return this.result;
    }

    public static class GetLinkeBahamutPomgetpomentitiesResponseBodyResult extends TeaModel {
        @NameInMap("ArtifactId")
        public String artifactId;

        @NameInMap("GroupId")
        public String groupId;

        @NameInMap("Packaging")
        public String packaging;

        @NameInMap("ParentArtifactId")
        public String parentArtifactId;

        @NameInMap("ParentGroupId")
        public String parentGroupId;

        @NameInMap("PomKeyString")
        public String pomKeyString;

        @NameInMap("Properties")
        public String properties;

        @NameInMap("RelativePath")
        public String relativePath;

        @NameInMap("Version")
        public String version;

        public static GetLinkeBahamutPomgetpomentitiesResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            GetLinkeBahamutPomgetpomentitiesResponseBodyResult self = new GetLinkeBahamutPomgetpomentitiesResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public GetLinkeBahamutPomgetpomentitiesResponseBodyResult setArtifactId(String artifactId) {
            this.artifactId = artifactId;
            return this;
        }
        public String getArtifactId() {
            return this.artifactId;
        }

        public GetLinkeBahamutPomgetpomentitiesResponseBodyResult setGroupId(String groupId) {
            this.groupId = groupId;
            return this;
        }
        public String getGroupId() {
            return this.groupId;
        }

        public GetLinkeBahamutPomgetpomentitiesResponseBodyResult setPackaging(String packaging) {
            this.packaging = packaging;
            return this;
        }
        public String getPackaging() {
            return this.packaging;
        }

        public GetLinkeBahamutPomgetpomentitiesResponseBodyResult setParentArtifactId(String parentArtifactId) {
            this.parentArtifactId = parentArtifactId;
            return this;
        }
        public String getParentArtifactId() {
            return this.parentArtifactId;
        }

        public GetLinkeBahamutPomgetpomentitiesResponseBodyResult setParentGroupId(String parentGroupId) {
            this.parentGroupId = parentGroupId;
            return this;
        }
        public String getParentGroupId() {
            return this.parentGroupId;
        }

        public GetLinkeBahamutPomgetpomentitiesResponseBodyResult setPomKeyString(String pomKeyString) {
            this.pomKeyString = pomKeyString;
            return this;
        }
        public String getPomKeyString() {
            return this.pomKeyString;
        }

        public GetLinkeBahamutPomgetpomentitiesResponseBodyResult setProperties(String properties) {
            this.properties = properties;
            return this;
        }
        public String getProperties() {
            return this.properties;
        }

        public GetLinkeBahamutPomgetpomentitiesResponseBodyResult setRelativePath(String relativePath) {
            this.relativePath = relativePath;
            return this;
        }
        public String getRelativePath() {
            return this.relativePath;
        }

        public GetLinkeBahamutPomgetpomentitiesResponseBodyResult setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

}
