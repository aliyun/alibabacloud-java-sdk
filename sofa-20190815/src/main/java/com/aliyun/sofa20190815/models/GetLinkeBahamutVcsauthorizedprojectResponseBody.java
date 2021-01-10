// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutVcsauthorizedprojectResponseBody extends TeaModel {
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
    public java.util.List<GetLinkeBahamutVcsauthorizedprojectResponseBodyResult> result;

    public static GetLinkeBahamutVcsauthorizedprojectResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutVcsauthorizedprojectResponseBody self = new GetLinkeBahamutVcsauthorizedprojectResponseBody();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutVcsauthorizedprojectResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetLinkeBahamutVcsauthorizedprojectResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetLinkeBahamutVcsauthorizedprojectResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public GetLinkeBahamutVcsauthorizedprojectResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetLinkeBahamutVcsauthorizedprojectResponseBody setErrorMsgParamsMap(String errorMsgParamsMap) {
        this.errorMsgParamsMap = errorMsgParamsMap;
        return this;
    }
    public String getErrorMsgParamsMap() {
        return this.errorMsgParamsMap;
    }

    public GetLinkeBahamutVcsauthorizedprojectResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetLinkeBahamutVcsauthorizedprojectResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public GetLinkeBahamutVcsauthorizedprojectResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetLinkeBahamutVcsauthorizedprojectResponseBody setResult(java.util.List<GetLinkeBahamutVcsauthorizedprojectResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<GetLinkeBahamutVcsauthorizedprojectResponseBodyResult> getResult() {
        return this.result;
    }

    public static class GetLinkeBahamutVcsauthorizedprojectResponseBodyResult extends TeaModel {
        @NameInMap("Description")
        public String description;

        @NameInMap("Encoding")
        public String encoding;

        @NameInMap("HttpUrlToRepo")
        public String httpUrlToRepo;

        @NameInMap("Id")
        public String id;

        @NameInMap("Name")
        public String name;

        @NameInMap("Namespace")
        public String namespace;

        @NameInMap("PublicStatus")
        public Boolean publicStatus;

        @NameInMap("SshUrlToRepo")
        public String sshUrlToRepo;

        @NameInMap("Visibility")
        public String visibility;

        @NameInMap("VisibilityLevel")
        public Long visibilityLevel;

        @NameInMap("WebUrl")
        public String webUrl;

        public static GetLinkeBahamutVcsauthorizedprojectResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            GetLinkeBahamutVcsauthorizedprojectResponseBodyResult self = new GetLinkeBahamutVcsauthorizedprojectResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public GetLinkeBahamutVcsauthorizedprojectResponseBodyResult setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetLinkeBahamutVcsauthorizedprojectResponseBodyResult setEncoding(String encoding) {
            this.encoding = encoding;
            return this;
        }
        public String getEncoding() {
            return this.encoding;
        }

        public GetLinkeBahamutVcsauthorizedprojectResponseBodyResult setHttpUrlToRepo(String httpUrlToRepo) {
            this.httpUrlToRepo = httpUrlToRepo;
            return this;
        }
        public String getHttpUrlToRepo() {
            return this.httpUrlToRepo;
        }

        public GetLinkeBahamutVcsauthorizedprojectResponseBodyResult setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetLinkeBahamutVcsauthorizedprojectResponseBodyResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetLinkeBahamutVcsauthorizedprojectResponseBodyResult setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public GetLinkeBahamutVcsauthorizedprojectResponseBodyResult setPublicStatus(Boolean publicStatus) {
            this.publicStatus = publicStatus;
            return this;
        }
        public Boolean getPublicStatus() {
            return this.publicStatus;
        }

        public GetLinkeBahamutVcsauthorizedprojectResponseBodyResult setSshUrlToRepo(String sshUrlToRepo) {
            this.sshUrlToRepo = sshUrlToRepo;
            return this;
        }
        public String getSshUrlToRepo() {
            return this.sshUrlToRepo;
        }

        public GetLinkeBahamutVcsauthorizedprojectResponseBodyResult setVisibility(String visibility) {
            this.visibility = visibility;
            return this;
        }
        public String getVisibility() {
            return this.visibility;
        }

        public GetLinkeBahamutVcsauthorizedprojectResponseBodyResult setVisibilityLevel(Long visibilityLevel) {
            this.visibilityLevel = visibilityLevel;
            return this;
        }
        public Long getVisibilityLevel() {
            return this.visibilityLevel;
        }

        public GetLinkeBahamutVcsauthorizedprojectResponseBodyResult setWebUrl(String webUrl) {
            this.webUrl = webUrl;
            return this;
        }
        public String getWebUrl() {
            return this.webUrl;
        }

    }

}
