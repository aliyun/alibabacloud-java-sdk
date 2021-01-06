// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20200331.models;

import com.aliyun.tea.*;

public class ListPolicyAttachmentsResponse extends TeaModel {
    @NameInMap("TotalCount")
    @Validation(required = true)
    public Integer totalCount;

    @NameInMap("PageSize")
    @Validation(required = true)
    public Integer pageSize;

    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("PageNumber")
    @Validation(required = true)
    public Integer pageNumber;

    @NameInMap("PolicyAttachments")
    @Validation(required = true)
    public ListPolicyAttachmentsResponsePolicyAttachments policyAttachments;

    public static ListPolicyAttachmentsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListPolicyAttachmentsResponse self = new ListPolicyAttachmentsResponse();
        return TeaModel.build(map, self);
    }

    public ListPolicyAttachmentsResponse setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public ListPolicyAttachmentsResponse setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListPolicyAttachmentsResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListPolicyAttachmentsResponse setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListPolicyAttachmentsResponse setPolicyAttachments(ListPolicyAttachmentsResponsePolicyAttachments policyAttachments) {
        this.policyAttachments = policyAttachments;
        return this;
    }
    public ListPolicyAttachmentsResponsePolicyAttachments getPolicyAttachments() {
        return this.policyAttachments;
    }

    public static class ListPolicyAttachmentsResponsePolicyAttachmentsPolicyAttachment extends TeaModel {
        @NameInMap("PolicyType")
        @Validation(required = true)
        public String policyType;

        @NameInMap("Description")
        @Validation(required = true)
        public String description;

        @NameInMap("ResourceGroupId")
        @Validation(required = true)
        public String resourceGroupId;

        @NameInMap("AttachDate")
        @Validation(required = true)
        public String attachDate;

        @NameInMap("PolicyName")
        @Validation(required = true)
        public String policyName;

        @NameInMap("PrincipalName")
        @Validation(required = true)
        public String principalName;

        @NameInMap("PrincipalType")
        @Validation(required = true)
        public String principalType;

        public static ListPolicyAttachmentsResponsePolicyAttachmentsPolicyAttachment build(java.util.Map<String, ?> map) throws Exception {
            ListPolicyAttachmentsResponsePolicyAttachmentsPolicyAttachment self = new ListPolicyAttachmentsResponsePolicyAttachmentsPolicyAttachment();
            return TeaModel.build(map, self);
        }

        public ListPolicyAttachmentsResponsePolicyAttachmentsPolicyAttachment setPolicyType(String policyType) {
            this.policyType = policyType;
            return this;
        }
        public String getPolicyType() {
            return this.policyType;
        }

        public ListPolicyAttachmentsResponsePolicyAttachmentsPolicyAttachment setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListPolicyAttachmentsResponsePolicyAttachmentsPolicyAttachment setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public ListPolicyAttachmentsResponsePolicyAttachmentsPolicyAttachment setAttachDate(String attachDate) {
            this.attachDate = attachDate;
            return this;
        }
        public String getAttachDate() {
            return this.attachDate;
        }

        public ListPolicyAttachmentsResponsePolicyAttachmentsPolicyAttachment setPolicyName(String policyName) {
            this.policyName = policyName;
            return this;
        }
        public String getPolicyName() {
            return this.policyName;
        }

        public ListPolicyAttachmentsResponsePolicyAttachmentsPolicyAttachment setPrincipalName(String principalName) {
            this.principalName = principalName;
            return this;
        }
        public String getPrincipalName() {
            return this.principalName;
        }

        public ListPolicyAttachmentsResponsePolicyAttachmentsPolicyAttachment setPrincipalType(String principalType) {
            this.principalType = principalType;
            return this;
        }
        public String getPrincipalType() {
            return this.principalType;
        }

    }

    public static class ListPolicyAttachmentsResponsePolicyAttachments extends TeaModel {
        @NameInMap("PolicyAttachment")
        @Validation(required = true)
        public java.util.List<ListPolicyAttachmentsResponsePolicyAttachmentsPolicyAttachment> policyAttachment;

        public static ListPolicyAttachmentsResponsePolicyAttachments build(java.util.Map<String, ?> map) throws Exception {
            ListPolicyAttachmentsResponsePolicyAttachments self = new ListPolicyAttachmentsResponsePolicyAttachments();
            return TeaModel.build(map, self);
        }

        public ListPolicyAttachmentsResponsePolicyAttachments setPolicyAttachment(java.util.List<ListPolicyAttachmentsResponsePolicyAttachmentsPolicyAttachment> policyAttachment) {
            this.policyAttachment = policyAttachment;
            return this;
        }
        public java.util.List<ListPolicyAttachmentsResponsePolicyAttachmentsPolicyAttachment> getPolicyAttachment() {
            return this.policyAttachment;
        }

    }

}
