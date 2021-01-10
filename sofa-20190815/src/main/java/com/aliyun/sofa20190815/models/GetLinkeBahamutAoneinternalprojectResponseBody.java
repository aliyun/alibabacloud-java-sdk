// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutAoneinternalprojectResponseBody extends TeaModel {
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
    public GetLinkeBahamutAoneinternalprojectResponseBodyResult result;

    public static GetLinkeBahamutAoneinternalprojectResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutAoneinternalprojectResponseBody self = new GetLinkeBahamutAoneinternalprojectResponseBody();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutAoneinternalprojectResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetLinkeBahamutAoneinternalprojectResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetLinkeBahamutAoneinternalprojectResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public GetLinkeBahamutAoneinternalprojectResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetLinkeBahamutAoneinternalprojectResponseBody setErrorMsgParamsMap(String errorMsgParamsMap) {
        this.errorMsgParamsMap = errorMsgParamsMap;
        return this;
    }
    public String getErrorMsgParamsMap() {
        return this.errorMsgParamsMap;
    }

    public GetLinkeBahamutAoneinternalprojectResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetLinkeBahamutAoneinternalprojectResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public GetLinkeBahamutAoneinternalprojectResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetLinkeBahamutAoneinternalprojectResponseBody setResult(GetLinkeBahamutAoneinternalprojectResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public GetLinkeBahamutAoneinternalprojectResponseBodyResult getResult() {
        return this.result;
    }

    public static class GetLinkeBahamutAoneinternalprojectResponseBodyResult extends TeaModel {
        @NameInMap("Creator")
        public String creator;

        @NameInMap("FullName")
        public String fullName;

        @NameInMap("Id")
        public String id;

        @NameInMap("IdPath")
        public String idPath;

        @NameInMap("Link")
        public String link;

        @NameInMap("Mode")
        public String mode;

        @NameInMap("Name")
        public String name;

        @NameInMap("ParentId")
        public Long parentId;

        @NameInMap("Status")
        public String status;

        @NameInMap("Type")
        public String type;

        @NameInMap("Admins")
        public java.util.List<String> admins;

        public static GetLinkeBahamutAoneinternalprojectResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            GetLinkeBahamutAoneinternalprojectResponseBodyResult self = new GetLinkeBahamutAoneinternalprojectResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public GetLinkeBahamutAoneinternalprojectResponseBodyResult setCreator(String creator) {
            this.creator = creator;
            return this;
        }
        public String getCreator() {
            return this.creator;
        }

        public GetLinkeBahamutAoneinternalprojectResponseBodyResult setFullName(String fullName) {
            this.fullName = fullName;
            return this;
        }
        public String getFullName() {
            return this.fullName;
        }

        public GetLinkeBahamutAoneinternalprojectResponseBodyResult setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetLinkeBahamutAoneinternalprojectResponseBodyResult setIdPath(String idPath) {
            this.idPath = idPath;
            return this;
        }
        public String getIdPath() {
            return this.idPath;
        }

        public GetLinkeBahamutAoneinternalprojectResponseBodyResult setLink(String link) {
            this.link = link;
            return this;
        }
        public String getLink() {
            return this.link;
        }

        public GetLinkeBahamutAoneinternalprojectResponseBodyResult setMode(String mode) {
            this.mode = mode;
            return this;
        }
        public String getMode() {
            return this.mode;
        }

        public GetLinkeBahamutAoneinternalprojectResponseBodyResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetLinkeBahamutAoneinternalprojectResponseBodyResult setParentId(Long parentId) {
            this.parentId = parentId;
            return this;
        }
        public Long getParentId() {
            return this.parentId;
        }

        public GetLinkeBahamutAoneinternalprojectResponseBodyResult setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetLinkeBahamutAoneinternalprojectResponseBodyResult setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public GetLinkeBahamutAoneinternalprojectResponseBodyResult setAdmins(java.util.List<String> admins) {
            this.admins = admins;
            return this;
        }
        public java.util.List<String> getAdmins() {
            return this.admins;
        }

    }

}
