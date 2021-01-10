// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkeLinktSubprojectsResponseBody extends TeaModel {
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
    public java.util.List<QueryLinkeLinktSubprojectsResponseBodyData> data;

    public static QueryLinkeLinktSubprojectsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkeLinktSubprojectsResponseBody self = new QueryLinkeLinktSubprojectsResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryLinkeLinktSubprojectsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryLinkeLinktSubprojectsResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryLinkeLinktSubprojectsResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public QueryLinkeLinktSubprojectsResponseBody setErrorCode(Long errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public Long getErrorCode() {
        return this.errorCode;
    }

    public QueryLinkeLinktSubprojectsResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QueryLinkeLinktSubprojectsResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public QueryLinkeLinktSubprojectsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryLinkeLinktSubprojectsResponseBody setData(java.util.List<QueryLinkeLinktSubprojectsResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<QueryLinkeLinktSubprojectsResponseBodyData> getData() {
        return this.data;
    }

    public static class QueryLinkeLinktSubprojectsResponseBodyData extends TeaModel {
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

        public static QueryLinkeLinktSubprojectsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryLinkeLinktSubprojectsResponseBodyData self = new QueryLinkeLinktSubprojectsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryLinkeLinktSubprojectsResponseBodyData setArchive(Boolean archive) {
            this.archive = archive;
            return this;
        }
        public Boolean getArchive() {
            return this.archive;
        }

        public QueryLinkeLinktSubprojectsResponseBodyData setAsPublic(Boolean asPublic) {
            this.asPublic = asPublic;
            return this;
        }
        public Boolean getAsPublic() {
            return this.asPublic;
        }

        public QueryLinkeLinktSubprojectsResponseBodyData setCreatedAt(Long createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public Long getCreatedAt() {
            return this.createdAt;
        }

        public QueryLinkeLinktSubprojectsResponseBodyData setCreator(String creator) {
            this.creator = creator;
            return this;
        }
        public String getCreator() {
            return this.creator;
        }

        public QueryLinkeLinktSubprojectsResponseBodyData setDeleted(Boolean deleted) {
            this.deleted = deleted;
            return this;
        }
        public Boolean getDeleted() {
            return this.deleted;
        }

        public QueryLinkeLinktSubprojectsResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public QueryLinkeLinktSubprojectsResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public QueryLinkeLinktSubprojectsResponseBodyData setLink(String link) {
            this.link = link;
            return this;
        }
        public String getLink() {
            return this.link;
        }

        public QueryLinkeLinktSubprojectsResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryLinkeLinktSubprojectsResponseBodyData setParentProject(String parentProject) {
            this.parentProject = parentProject;
            return this;
        }
        public String getParentProject() {
            return this.parentProject;
        }

        public QueryLinkeLinktSubprojectsResponseBodyData setParentSign(String parentSign) {
            this.parentSign = parentSign;
            return this;
        }
        public String getParentSign() {
            return this.parentSign;
        }

        public QueryLinkeLinktSubprojectsResponseBodyData setSign(String sign) {
            this.sign = sign;
            return this;
        }
        public String getSign() {
            return this.sign;
        }

        public QueryLinkeLinktSubprojectsResponseBodyData setSignPath(String signPath) {
            this.signPath = signPath;
            return this;
        }
        public String getSignPath() {
            return this.signPath;
        }

        public QueryLinkeLinktSubprojectsResponseBodyData setUpdatedAt(Long updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }
        public Long getUpdatedAt() {
            return this.updatedAt;
        }

        public QueryLinkeLinktSubprojectsResponseBodyData setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

        public QueryLinkeLinktSubprojectsResponseBodyData setAdminMembers(java.util.List<String> adminMembers) {
            this.adminMembers = adminMembers;
            return this;
        }
        public java.util.List<String> getAdminMembers() {
            return this.adminMembers;
        }

    }

}
