// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkeLinktProjectResponseBody extends TeaModel {
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
    public QueryLinkeLinktProjectResponseBodyData data;

    public static QueryLinkeLinktProjectResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkeLinktProjectResponseBody self = new QueryLinkeLinktProjectResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryLinkeLinktProjectResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryLinkeLinktProjectResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryLinkeLinktProjectResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public QueryLinkeLinktProjectResponseBody setErrorCode(Long errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public Long getErrorCode() {
        return this.errorCode;
    }

    public QueryLinkeLinktProjectResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QueryLinkeLinktProjectResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public QueryLinkeLinktProjectResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryLinkeLinktProjectResponseBody setData(QueryLinkeLinktProjectResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryLinkeLinktProjectResponseBodyData getData() {
        return this.data;
    }

    public static class QueryLinkeLinktProjectResponseBodyData extends TeaModel {
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

        @NameInMap("Notice")
        public String notice;

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

        @NameInMap("CustomFieldList")
        public java.util.List<String> customFieldList;

        @NameInMap("MemberList")
        public java.util.List<String> memberList;

        @NameInMap("StatusList")
        public java.util.List<String> statusList;

        @NameInMap("TemplateList")
        public java.util.List<String> templateList;

        public static QueryLinkeLinktProjectResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryLinkeLinktProjectResponseBodyData self = new QueryLinkeLinktProjectResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryLinkeLinktProjectResponseBodyData setArchive(Boolean archive) {
            this.archive = archive;
            return this;
        }
        public Boolean getArchive() {
            return this.archive;
        }

        public QueryLinkeLinktProjectResponseBodyData setAsPublic(Boolean asPublic) {
            this.asPublic = asPublic;
            return this;
        }
        public Boolean getAsPublic() {
            return this.asPublic;
        }

        public QueryLinkeLinktProjectResponseBodyData setCreatedAt(Long createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public Long getCreatedAt() {
            return this.createdAt;
        }

        public QueryLinkeLinktProjectResponseBodyData setCreator(String creator) {
            this.creator = creator;
            return this;
        }
        public String getCreator() {
            return this.creator;
        }

        public QueryLinkeLinktProjectResponseBodyData setDeleted(Boolean deleted) {
            this.deleted = deleted;
            return this;
        }
        public Boolean getDeleted() {
            return this.deleted;
        }

        public QueryLinkeLinktProjectResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public QueryLinkeLinktProjectResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public QueryLinkeLinktProjectResponseBodyData setLink(String link) {
            this.link = link;
            return this;
        }
        public String getLink() {
            return this.link;
        }

        public QueryLinkeLinktProjectResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryLinkeLinktProjectResponseBodyData setNotice(String notice) {
            this.notice = notice;
            return this;
        }
        public String getNotice() {
            return this.notice;
        }

        public QueryLinkeLinktProjectResponseBodyData setParentProject(String parentProject) {
            this.parentProject = parentProject;
            return this;
        }
        public String getParentProject() {
            return this.parentProject;
        }

        public QueryLinkeLinktProjectResponseBodyData setParentSign(String parentSign) {
            this.parentSign = parentSign;
            return this;
        }
        public String getParentSign() {
            return this.parentSign;
        }

        public QueryLinkeLinktProjectResponseBodyData setSign(String sign) {
            this.sign = sign;
            return this;
        }
        public String getSign() {
            return this.sign;
        }

        public QueryLinkeLinktProjectResponseBodyData setSignPath(String signPath) {
            this.signPath = signPath;
            return this;
        }
        public String getSignPath() {
            return this.signPath;
        }

        public QueryLinkeLinktProjectResponseBodyData setUpdatedAt(Long updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }
        public Long getUpdatedAt() {
            return this.updatedAt;
        }

        public QueryLinkeLinktProjectResponseBodyData setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

        public QueryLinkeLinktProjectResponseBodyData setAdminMembers(java.util.List<String> adminMembers) {
            this.adminMembers = adminMembers;
            return this;
        }
        public java.util.List<String> getAdminMembers() {
            return this.adminMembers;
        }

        public QueryLinkeLinktProjectResponseBodyData setCustomFieldList(java.util.List<String> customFieldList) {
            this.customFieldList = customFieldList;
            return this;
        }
        public java.util.List<String> getCustomFieldList() {
            return this.customFieldList;
        }

        public QueryLinkeLinktProjectResponseBodyData setMemberList(java.util.List<String> memberList) {
            this.memberList = memberList;
            return this;
        }
        public java.util.List<String> getMemberList() {
            return this.memberList;
        }

        public QueryLinkeLinktProjectResponseBodyData setStatusList(java.util.List<String> statusList) {
            this.statusList = statusList;
            return this;
        }
        public java.util.List<String> getStatusList() {
            return this.statusList;
        }

        public QueryLinkeLinktProjectResponseBodyData setTemplateList(java.util.List<String> templateList) {
            this.templateList = templateList;
            return this;
        }
        public java.util.List<String> getTemplateList() {
            return this.templateList;
        }

    }

}
