// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20200331.models;

import com.aliyun.tea.*;

public class ListPolicyAttachmentsResponseBody extends TeaModel {
    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("PolicyAttachments")
    public ListPolicyAttachmentsResponseBodyPolicyAttachments policyAttachments;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    public static ListPolicyAttachmentsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListPolicyAttachmentsResponseBody self = new ListPolicyAttachmentsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListPolicyAttachmentsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public ListPolicyAttachmentsResponseBody setPolicyAttachments(ListPolicyAttachmentsResponseBodyPolicyAttachments policyAttachments) {
        this.policyAttachments = policyAttachments;
        return this;
    }
    public ListPolicyAttachmentsResponseBodyPolicyAttachments getPolicyAttachments() {
        return this.policyAttachments;
    }

    public ListPolicyAttachmentsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListPolicyAttachmentsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListPolicyAttachmentsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public static class ListPolicyAttachmentsResponseBodyPolicyAttachmentsPolicyAttachment extends TeaModel {
        @NameInMap("Description")
        public String description;

        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        @NameInMap("PolicyName")
        public String policyName;

        @NameInMap("PrincipalName")
        public String principalName;

        @NameInMap("AttachDate")
        public String attachDate;

        @NameInMap("PolicyType")
        public String policyType;

        @NameInMap("PrincipalType")
        public String principalType;

        public static ListPolicyAttachmentsResponseBodyPolicyAttachmentsPolicyAttachment build(java.util.Map<String, ?> map) throws Exception {
            ListPolicyAttachmentsResponseBodyPolicyAttachmentsPolicyAttachment self = new ListPolicyAttachmentsResponseBodyPolicyAttachmentsPolicyAttachment();
            return TeaModel.build(map, self);
        }

        public ListPolicyAttachmentsResponseBodyPolicyAttachmentsPolicyAttachment setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListPolicyAttachmentsResponseBodyPolicyAttachmentsPolicyAttachment setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public ListPolicyAttachmentsResponseBodyPolicyAttachmentsPolicyAttachment setPolicyName(String policyName) {
            this.policyName = policyName;
            return this;
        }
        public String getPolicyName() {
            return this.policyName;
        }

        public ListPolicyAttachmentsResponseBodyPolicyAttachmentsPolicyAttachment setPrincipalName(String principalName) {
            this.principalName = principalName;
            return this;
        }
        public String getPrincipalName() {
            return this.principalName;
        }

        public ListPolicyAttachmentsResponseBodyPolicyAttachmentsPolicyAttachment setAttachDate(String attachDate) {
            this.attachDate = attachDate;
            return this;
        }
        public String getAttachDate() {
            return this.attachDate;
        }

        public ListPolicyAttachmentsResponseBodyPolicyAttachmentsPolicyAttachment setPolicyType(String policyType) {
            this.policyType = policyType;
            return this;
        }
        public String getPolicyType() {
            return this.policyType;
        }

        public ListPolicyAttachmentsResponseBodyPolicyAttachmentsPolicyAttachment setPrincipalType(String principalType) {
            this.principalType = principalType;
            return this;
        }
        public String getPrincipalType() {
            return this.principalType;
        }

    }

    public static class ListPolicyAttachmentsResponseBodyPolicyAttachments extends TeaModel {
        @NameInMap("PolicyAttachment")
        public java.util.List<ListPolicyAttachmentsResponseBodyPolicyAttachmentsPolicyAttachment> policyAttachment;

        public static ListPolicyAttachmentsResponseBodyPolicyAttachments build(java.util.Map<String, ?> map) throws Exception {
            ListPolicyAttachmentsResponseBodyPolicyAttachments self = new ListPolicyAttachmentsResponseBodyPolicyAttachments();
            return TeaModel.build(map, self);
        }

        public ListPolicyAttachmentsResponseBodyPolicyAttachments setPolicyAttachment(java.util.List<ListPolicyAttachmentsResponseBodyPolicyAttachmentsPolicyAttachment> policyAttachment) {
            this.policyAttachment = policyAttachment;
            return this;
        }
        public java.util.List<ListPolicyAttachmentsResponseBodyPolicyAttachmentsPolicyAttachment> getPolicyAttachment() {
            return this.policyAttachment;
        }

    }

}
