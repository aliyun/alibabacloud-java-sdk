// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkeLinktMyentryprojectsResponseBody extends TeaModel {
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
    public java.util.List<QueryLinkeLinktMyentryprojectsResponseBodyData> data;

    public static QueryLinkeLinktMyentryprojectsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkeLinktMyentryprojectsResponseBody self = new QueryLinkeLinktMyentryprojectsResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryLinkeLinktMyentryprojectsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryLinkeLinktMyentryprojectsResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryLinkeLinktMyentryprojectsResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public QueryLinkeLinktMyentryprojectsResponseBody setErrorCode(Long errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public Long getErrorCode() {
        return this.errorCode;
    }

    public QueryLinkeLinktMyentryprojectsResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QueryLinkeLinktMyentryprojectsResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public QueryLinkeLinktMyentryprojectsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryLinkeLinktMyentryprojectsResponseBody setData(java.util.List<QueryLinkeLinktMyentryprojectsResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<QueryLinkeLinktMyentryprojectsResponseBodyData> getData() {
        return this.data;
    }

    public static class QueryLinkeLinktMyentryprojectsResponseBodyData extends TeaModel {
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

        @NameInMap("ParentProject")
        public String parentProject;

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

        @NameInMap("AdminMembers")
        public java.util.List<String> adminMembers;

        public static QueryLinkeLinktMyentryprojectsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryLinkeLinktMyentryprojectsResponseBodyData self = new QueryLinkeLinktMyentryprojectsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryLinkeLinktMyentryprojectsResponseBodyData setArchive(Boolean archive) {
            this.archive = archive;
            return this;
        }
        public Boolean getArchive() {
            return this.archive;
        }

        public QueryLinkeLinktMyentryprojectsResponseBodyData setAsPublic(Boolean asPublic) {
            this.asPublic = asPublic;
            return this;
        }
        public Boolean getAsPublic() {
            return this.asPublic;
        }

        public QueryLinkeLinktMyentryprojectsResponseBodyData setCreatedAt(Long createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public Long getCreatedAt() {
            return this.createdAt;
        }

        public QueryLinkeLinktMyentryprojectsResponseBodyData setCreator(String creator) {
            this.creator = creator;
            return this;
        }
        public String getCreator() {
            return this.creator;
        }

        public QueryLinkeLinktMyentryprojectsResponseBodyData setDeleted(Boolean deleted) {
            this.deleted = deleted;
            return this;
        }
        public Boolean getDeleted() {
            return this.deleted;
        }

        public QueryLinkeLinktMyentryprojectsResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public QueryLinkeLinktMyentryprojectsResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public QueryLinkeLinktMyentryprojectsResponseBodyData setLink(String link) {
            this.link = link;
            return this;
        }
        public String getLink() {
            return this.link;
        }

        public QueryLinkeLinktMyentryprojectsResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryLinkeLinktMyentryprojectsResponseBodyData setParentProject(String parentProject) {
            this.parentProject = parentProject;
            return this;
        }
        public String getParentProject() {
            return this.parentProject;
        }

        public QueryLinkeLinktMyentryprojectsResponseBodyData setParentSign(String parentSign) {
            this.parentSign = parentSign;
            return this;
        }
        public String getParentSign() {
            return this.parentSign;
        }

        public QueryLinkeLinktMyentryprojectsResponseBodyData setSign(String sign) {
            this.sign = sign;
            return this;
        }
        public String getSign() {
            return this.sign;
        }

        public QueryLinkeLinktMyentryprojectsResponseBodyData setSignPath(String signPath) {
            this.signPath = signPath;
            return this;
        }
        public String getSignPath() {
            return this.signPath;
        }

        public QueryLinkeLinktMyentryprojectsResponseBodyData setUpdatedAt(Long updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }
        public Long getUpdatedAt() {
            return this.updatedAt;
        }

        public QueryLinkeLinktMyentryprojectsResponseBodyData setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

        public QueryLinkeLinktMyentryprojectsResponseBodyData setAdminMembers(java.util.List<String> adminMembers) {
            this.adminMembers = adminMembers;
            return this;
        }
        public java.util.List<String> getAdminMembers() {
            return this.adminMembers;
        }

    }

}
