// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20200331.models;

import com.aliyun.tea.*;

public class ListPolicyAttachmentsResponseBody extends TeaModel {
    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The information about the permission policies.</p>
     */
    @NameInMap("PolicyAttachments")
    public ListPolicyAttachmentsResponseBodyPolicyAttachments policyAttachments;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>7B8A4E7D-6CFF-471D-84DF-195A7A241ECB</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListPolicyAttachmentsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListPolicyAttachmentsResponseBody self = new ListPolicyAttachmentsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListPolicyAttachmentsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListPolicyAttachmentsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
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

    public ListPolicyAttachmentsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListPolicyAttachmentsResponseBodyPolicyAttachmentsPolicyAttachment extends TeaModel {
        /**
         * <p>The time when the permission policy is attached.</p>
         * 
         * <strong>example:</strong>
         * <p>2015-01-23T12:33:18Z</p>
         */
        @NameInMap("AttachDate")
        public String attachDate;

        /**
         * <p>The description of the permission policy.</p>
         * 
         * <strong>example:</strong>
         * <p>The description of the policy.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The name of the permission policy.</p>
         * 
         * <strong>example:</strong>
         * <p>AdministratorAccess</p>
         */
        @NameInMap("PolicyName")
        public String policyName;

        /**
         * <p>The type of the permission policy. Valid values:</p>
         * <ul>
         * <li>Custom</li>
         * <li>System</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>System</p>
         */
        @NameInMap("PolicyType")
        public String policyType;

        /**
         * <p>The name of the object to which the permission policy is attached.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="mailto:alice@demo.onaliyun.com">alice@demo.onaliyun.com</a></p>
         */
        @NameInMap("PrincipalName")
        public String principalName;

        /**
         * <p>The type of the object to which the permission policy is attached. Valid values:</p>
         * <ul>
         * <li>IMSUser: RAM user</li>
         * <li>IMSGroup: RAM user group</li>
         * <li>ServiceRole: RAM role</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>IMSUser</p>
         */
        @NameInMap("PrincipalType")
        public String principalType;

        /**
         * <p>The ID of the resource group or the ID of the Alibaba Cloud account to which the resource group belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-9gLOoK****</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        public static ListPolicyAttachmentsResponseBodyPolicyAttachmentsPolicyAttachment build(java.util.Map<String, ?> map) throws Exception {
            ListPolicyAttachmentsResponseBodyPolicyAttachmentsPolicyAttachment self = new ListPolicyAttachmentsResponseBodyPolicyAttachmentsPolicyAttachment();
            return TeaModel.build(map, self);
        }

        public ListPolicyAttachmentsResponseBodyPolicyAttachmentsPolicyAttachment setAttachDate(String attachDate) {
            this.attachDate = attachDate;
            return this;
        }
        public String getAttachDate() {
            return this.attachDate;
        }

        public ListPolicyAttachmentsResponseBodyPolicyAttachmentsPolicyAttachment setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListPolicyAttachmentsResponseBodyPolicyAttachmentsPolicyAttachment setPolicyName(String policyName) {
            this.policyName = policyName;
            return this;
        }
        public String getPolicyName() {
            return this.policyName;
        }

        public ListPolicyAttachmentsResponseBodyPolicyAttachmentsPolicyAttachment setPolicyType(String policyType) {
            this.policyType = policyType;
            return this;
        }
        public String getPolicyType() {
            return this.policyType;
        }

        public ListPolicyAttachmentsResponseBodyPolicyAttachmentsPolicyAttachment setPrincipalName(String principalName) {
            this.principalName = principalName;
            return this;
        }
        public String getPrincipalName() {
            return this.principalName;
        }

        public ListPolicyAttachmentsResponseBodyPolicyAttachmentsPolicyAttachment setPrincipalType(String principalType) {
            this.principalType = principalType;
            return this;
        }
        public String getPrincipalType() {
            return this.principalType;
        }

        public ListPolicyAttachmentsResponseBodyPolicyAttachmentsPolicyAttachment setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
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
