// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeLinktBelongtoprojectsbasedonrelevantprojectResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("ErrorCode")
    public Long errorCode;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("ResponseStatusCode")
    public Long responseStatusCode;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Data")
    public java.util.List<GetLinkeLinktBelongtoprojectsbasedonrelevantprojectResponseBodyData> data;

    public static GetLinkeLinktBelongtoprojectsbasedonrelevantprojectResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeLinktBelongtoprojectsbasedonrelevantprojectResponseBody self = new GetLinkeLinktBelongtoprojectsbasedonrelevantprojectResponseBody();
        return TeaModel.build(map, self);
    }

    public GetLinkeLinktBelongtoprojectsbasedonrelevantprojectResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetLinkeLinktBelongtoprojectsbasedonrelevantprojectResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetLinkeLinktBelongtoprojectsbasedonrelevantprojectResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public GetLinkeLinktBelongtoprojectsbasedonrelevantprojectResponseBody setErrorCode(Long errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public Long getErrorCode() {
        return this.errorCode;
    }

    public GetLinkeLinktBelongtoprojectsbasedonrelevantprojectResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetLinkeLinktBelongtoprojectsbasedonrelevantprojectResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public GetLinkeLinktBelongtoprojectsbasedonrelevantprojectResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetLinkeLinktBelongtoprojectsbasedonrelevantprojectResponseBody setData(java.util.List<GetLinkeLinktBelongtoprojectsbasedonrelevantprojectResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<GetLinkeLinktBelongtoprojectsbasedonrelevantprojectResponseBodyData> getData() {
        return this.data;
    }

    public static class GetLinkeLinktBelongtoprojectsbasedonrelevantprojectResponseBodyData extends TeaModel {
        @NameInMap("Archive")
        public Boolean archive;

        @NameInMap("AsPublic")
        public Boolean asPublic;

        @NameInMap("CreatedAt")
        public Long createdAt;

        @NameInMap("Creator")
        public String creator;

        @NameInMap("Deleted")
        public Boolean deleted;

        @NameInMap("Description")
        public String description;

        @NameInMap("Id")
        public Long id;

        @NameInMap("Link")
        public String link;

        @NameInMap("Name")
        public String name;

        @NameInMap("ParentSign")
        public String parentSign;

        @NameInMap("Sign")
        public String sign;

        @NameInMap("SignPath")
        public String signPath;

        @NameInMap("UpdatedAt")
        public Long updatedAt;

        @NameInMap("Url")
        public String url;

        public static GetLinkeLinktBelongtoprojectsbasedonrelevantprojectResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetLinkeLinktBelongtoprojectsbasedonrelevantprojectResponseBodyData self = new GetLinkeLinktBelongtoprojectsbasedonrelevantprojectResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetLinkeLinktBelongtoprojectsbasedonrelevantprojectResponseBodyData setArchive(Boolean archive) {
            this.archive = archive;
            return this;
        }
        public Boolean getArchive() {
            return this.archive;
        }

        public GetLinkeLinktBelongtoprojectsbasedonrelevantprojectResponseBodyData setAsPublic(Boolean asPublic) {
            this.asPublic = asPublic;
            return this;
        }
        public Boolean getAsPublic() {
            return this.asPublic;
        }

        public GetLinkeLinktBelongtoprojectsbasedonrelevantprojectResponseBodyData setCreatedAt(Long createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public Long getCreatedAt() {
            return this.createdAt;
        }

        public GetLinkeLinktBelongtoprojectsbasedonrelevantprojectResponseBodyData setCreator(String creator) {
            this.creator = creator;
            return this;
        }
        public String getCreator() {
            return this.creator;
        }

        public GetLinkeLinktBelongtoprojectsbasedonrelevantprojectResponseBodyData setDeleted(Boolean deleted) {
            this.deleted = deleted;
            return this;
        }
        public Boolean getDeleted() {
            return this.deleted;
        }

        public GetLinkeLinktBelongtoprojectsbasedonrelevantprojectResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetLinkeLinktBelongtoprojectsbasedonrelevantprojectResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetLinkeLinktBelongtoprojectsbasedonrelevantprojectResponseBodyData setLink(String link) {
            this.link = link;
            return this;
        }
        public String getLink() {
            return this.link;
        }

        public GetLinkeLinktBelongtoprojectsbasedonrelevantprojectResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetLinkeLinktBelongtoprojectsbasedonrelevantprojectResponseBodyData setParentSign(String parentSign) {
            this.parentSign = parentSign;
            return this;
        }
        public String getParentSign() {
            return this.parentSign;
        }

        public GetLinkeLinktBelongtoprojectsbasedonrelevantprojectResponseBodyData setSign(String sign) {
            this.sign = sign;
            return this;
        }
        public String getSign() {
            return this.sign;
        }

        public GetLinkeLinktBelongtoprojectsbasedonrelevantprojectResponseBodyData setSignPath(String signPath) {
            this.signPath = signPath;
            return this;
        }
        public String getSignPath() {
            return this.signPath;
        }

        public GetLinkeLinktBelongtoprojectsbasedonrelevantprojectResponseBodyData setUpdatedAt(Long updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }
        public Long getUpdatedAt() {
            return this.updatedAt;
        }

        public GetLinkeLinktBelongtoprojectsbasedonrelevantprojectResponseBodyData setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

}
