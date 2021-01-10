// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutAoneiterationResponseBody extends TeaModel {
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
    public GetLinkeBahamutAoneiterationResponseBodyResult result;

    public static GetLinkeBahamutAoneiterationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutAoneiterationResponseBody self = new GetLinkeBahamutAoneiterationResponseBody();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutAoneiterationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetLinkeBahamutAoneiterationResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetLinkeBahamutAoneiterationResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public GetLinkeBahamutAoneiterationResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetLinkeBahamutAoneiterationResponseBody setErrorMsgParamsMap(String errorMsgParamsMap) {
        this.errorMsgParamsMap = errorMsgParamsMap;
        return this;
    }
    public String getErrorMsgParamsMap() {
        return this.errorMsgParamsMap;
    }

    public GetLinkeBahamutAoneiterationResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetLinkeBahamutAoneiterationResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public GetLinkeBahamutAoneiterationResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetLinkeBahamutAoneiterationResponseBody setResult(GetLinkeBahamutAoneiterationResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public GetLinkeBahamutAoneiterationResponseBodyResult getResult() {
        return this.result;
    }

    public static class GetLinkeBahamutAoneiterationResponseBodyResult extends TeaModel {
        @NameInMap("Creator")
        public String creator;

        @NameInMap("Finished")
        public Boolean finished;

        @NameInMap("Id")
        public String id;

        @NameInMap("Link")
        public String link;

        @NameInMap("Name")
        public String name;

        @NameInMap("NewLink")
        public String newLink;

        @NameInMap("ReleaseId")
        public String releaseId;

        @NameInMap("Tenant")
        public String tenant;

        @NameInMap("Type")
        public String type;

        @NameInMap("Apps")
        public java.util.List<String> apps;

        @NameInMap("Members")
        public java.util.List<String> members;

        @NameInMap("Quality")
        public java.util.List<String> quality;

        public static GetLinkeBahamutAoneiterationResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            GetLinkeBahamutAoneiterationResponseBodyResult self = new GetLinkeBahamutAoneiterationResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public GetLinkeBahamutAoneiterationResponseBodyResult setCreator(String creator) {
            this.creator = creator;
            return this;
        }
        public String getCreator() {
            return this.creator;
        }

        public GetLinkeBahamutAoneiterationResponseBodyResult setFinished(Boolean finished) {
            this.finished = finished;
            return this;
        }
        public Boolean getFinished() {
            return this.finished;
        }

        public GetLinkeBahamutAoneiterationResponseBodyResult setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetLinkeBahamutAoneiterationResponseBodyResult setLink(String link) {
            this.link = link;
            return this;
        }
        public String getLink() {
            return this.link;
        }

        public GetLinkeBahamutAoneiterationResponseBodyResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetLinkeBahamutAoneiterationResponseBodyResult setNewLink(String newLink) {
            this.newLink = newLink;
            return this;
        }
        public String getNewLink() {
            return this.newLink;
        }

        public GetLinkeBahamutAoneiterationResponseBodyResult setReleaseId(String releaseId) {
            this.releaseId = releaseId;
            return this;
        }
        public String getReleaseId() {
            return this.releaseId;
        }

        public GetLinkeBahamutAoneiterationResponseBodyResult setTenant(String tenant) {
            this.tenant = tenant;
            return this;
        }
        public String getTenant() {
            return this.tenant;
        }

        public GetLinkeBahamutAoneiterationResponseBodyResult setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public GetLinkeBahamutAoneiterationResponseBodyResult setApps(java.util.List<String> apps) {
            this.apps = apps;
            return this;
        }
        public java.util.List<String> getApps() {
            return this.apps;
        }

        public GetLinkeBahamutAoneiterationResponseBodyResult setMembers(java.util.List<String> members) {
            this.members = members;
            return this;
        }
        public java.util.List<String> getMembers() {
            return this.members;
        }

        public GetLinkeBahamutAoneiterationResponseBodyResult setQuality(java.util.List<String> quality) {
            this.quality = quality;
            return this;
        }
        public java.util.List<String> getQuality() {
            return this.quality;
        }

    }

}
