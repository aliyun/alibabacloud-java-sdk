// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oosops20190601.models;

import com.aliyun.tea.*;

public class ListPublicTemplateRegistrationsResponseBody extends TeaModel {
    @NameInMap("MaxResults")
    public Integer maxResults;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("Registrations")
    public java.util.List<ListPublicTemplateRegistrationsResponseBodyRegistrations> registrations;

    @NameInMap("RequestId")
    public String requestId;

    public static ListPublicTemplateRegistrationsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListPublicTemplateRegistrationsResponseBody self = new ListPublicTemplateRegistrationsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListPublicTemplateRegistrationsResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListPublicTemplateRegistrationsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListPublicTemplateRegistrationsResponseBody setRegistrations(java.util.List<ListPublicTemplateRegistrationsResponseBodyRegistrations> registrations) {
        this.registrations = registrations;
        return this;
    }
    public java.util.List<ListPublicTemplateRegistrationsResponseBodyRegistrations> getRegistrations() {
        return this.registrations;
    }

    public ListPublicTemplateRegistrationsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListPublicTemplateRegistrationsResponseBodyRegistrations extends TeaModel {
        @NameInMap("Comment")
        public String comment;

        @NameInMap("CreatedDate")
        public String createdDate;

        @NameInMap("Detail")
        public String detail;

        @NameInMap("RegistrationId")
        public String registrationId;

        @NameInMap("ShowPages")
        public String showPages;

        @NameInMap("Status")
        public String status;

        @NameInMap("TemplateId")
        public String templateId;

        @NameInMap("TemplateName")
        public String templateName;

        @NameInMap("TemplateVersion")
        public String templateVersion;

        @NameInMap("UpdatedDate")
        public String updatedDate;

        public static ListPublicTemplateRegistrationsResponseBodyRegistrations build(java.util.Map<String, ?> map) throws Exception {
            ListPublicTemplateRegistrationsResponseBodyRegistrations self = new ListPublicTemplateRegistrationsResponseBodyRegistrations();
            return TeaModel.build(map, self);
        }

        public ListPublicTemplateRegistrationsResponseBodyRegistrations setComment(String comment) {
            this.comment = comment;
            return this;
        }
        public String getComment() {
            return this.comment;
        }

        public ListPublicTemplateRegistrationsResponseBodyRegistrations setCreatedDate(String createdDate) {
            this.createdDate = createdDate;
            return this;
        }
        public String getCreatedDate() {
            return this.createdDate;
        }

        public ListPublicTemplateRegistrationsResponseBodyRegistrations setDetail(String detail) {
            this.detail = detail;
            return this;
        }
        public String getDetail() {
            return this.detail;
        }

        public ListPublicTemplateRegistrationsResponseBodyRegistrations setRegistrationId(String registrationId) {
            this.registrationId = registrationId;
            return this;
        }
        public String getRegistrationId() {
            return this.registrationId;
        }

        public ListPublicTemplateRegistrationsResponseBodyRegistrations setShowPages(String showPages) {
            this.showPages = showPages;
            return this;
        }
        public String getShowPages() {
            return this.showPages;
        }

        public ListPublicTemplateRegistrationsResponseBodyRegistrations setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListPublicTemplateRegistrationsResponseBodyRegistrations setTemplateId(String templateId) {
            this.templateId = templateId;
            return this;
        }
        public String getTemplateId() {
            return this.templateId;
        }

        public ListPublicTemplateRegistrationsResponseBodyRegistrations setTemplateName(String templateName) {
            this.templateName = templateName;
            return this;
        }
        public String getTemplateName() {
            return this.templateName;
        }

        public ListPublicTemplateRegistrationsResponseBodyRegistrations setTemplateVersion(String templateVersion) {
            this.templateVersion = templateVersion;
            return this;
        }
        public String getTemplateVersion() {
            return this.templateVersion;
        }

        public ListPublicTemplateRegistrationsResponseBodyRegistrations setUpdatedDate(String updatedDate) {
            this.updatedDate = updatedDate;
            return this;
        }
        public String getUpdatedDate() {
            return this.updatedDate;
        }

    }

}
