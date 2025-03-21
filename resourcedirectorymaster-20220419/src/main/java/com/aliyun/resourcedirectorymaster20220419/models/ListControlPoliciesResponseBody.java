// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcedirectorymaster20220419.models;

import com.aliyun.tea.*;

public class ListControlPoliciesResponseBody extends TeaModel {
    /**
     * <p>The access control policies.</p>
     */
    @NameInMap("ControlPolicies")
    public ListControlPoliciesResponseBodyControlPolicies controlPolicies;

    /**
     * <p>The page number of the returned page.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries returned per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>9424A34C-3471-45AD-B6AB-924BBDFE42F9</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The number of access control policies.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListControlPoliciesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListControlPoliciesResponseBody self = new ListControlPoliciesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListControlPoliciesResponseBody setControlPolicies(ListControlPoliciesResponseBodyControlPolicies controlPolicies) {
        this.controlPolicies = controlPolicies;
        return this;
    }
    public ListControlPoliciesResponseBodyControlPolicies getControlPolicies() {
        return this.controlPolicies;
    }

    public ListControlPoliciesResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListControlPoliciesResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListControlPoliciesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListControlPoliciesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListControlPoliciesResponseBodyControlPoliciesControlPolicyTagsTag extends TeaModel {
        /**
         * <p>The tag key.</p>
         * 
         * <strong>example:</strong>
         * <p>tag_key</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value.</p>
         * 
         * <strong>example:</strong>
         * <p>tag_value</p>
         */
        @NameInMap("Value")
        public String value;

        public static ListControlPoliciesResponseBodyControlPoliciesControlPolicyTagsTag build(java.util.Map<String, ?> map) throws Exception {
            ListControlPoliciesResponseBodyControlPoliciesControlPolicyTagsTag self = new ListControlPoliciesResponseBodyControlPoliciesControlPolicyTagsTag();
            return TeaModel.build(map, self);
        }

        public ListControlPoliciesResponseBodyControlPoliciesControlPolicyTagsTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListControlPoliciesResponseBodyControlPoliciesControlPolicyTagsTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListControlPoliciesResponseBodyControlPoliciesControlPolicyTags extends TeaModel {
        @NameInMap("Tag")
        public java.util.List<ListControlPoliciesResponseBodyControlPoliciesControlPolicyTagsTag> tag;

        public static ListControlPoliciesResponseBodyControlPoliciesControlPolicyTags build(java.util.Map<String, ?> map) throws Exception {
            ListControlPoliciesResponseBodyControlPoliciesControlPolicyTags self = new ListControlPoliciesResponseBodyControlPoliciesControlPolicyTags();
            return TeaModel.build(map, self);
        }

        public ListControlPoliciesResponseBodyControlPoliciesControlPolicyTags setTag(java.util.List<ListControlPoliciesResponseBodyControlPoliciesControlPolicyTagsTag> tag) {
            this.tag = tag;
            return this;
        }
        public java.util.List<ListControlPoliciesResponseBodyControlPoliciesControlPolicyTagsTag> getTag() {
            return this.tag;
        }

    }

    public static class ListControlPoliciesResponseBodyControlPoliciesControlPolicy extends TeaModel {
        /**
         * <p>The number of times that the access control policy is referenced.</p>
         * 
         * <strong>example:</strong>
         * <p>44</p>
         */
        @NameInMap("AttachmentCount")
        public String attachmentCount;

        /**
         * <p>The time when the access control policy was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-08-05T06:32:24Z</p>
         */
        @NameInMap("CreateDate")
        public String createDate;

        /**
         * <p>The description of the access control policy.</p>
         * 
         * <strong>example:</strong>
         * <p>System access control policy available for all operations on the cloud</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The effective scope of the access control policy. Valid values:</p>
         * <ul>
         * <li>All: The access control policy is in effect for Alibaba Cloud accounts, RAM users, and RAM roles.</li>
         * <li>RAM: The access control policy is in effect only for RAM users and RAM roles.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>All</p>
         */
        @NameInMap("EffectScope")
        public String effectScope;

        /**
         * <p>The ID of the access control policy.</p>
         * 
         * <strong>example:</strong>
         * <p>cp-FullAliyunAccess</p>
         */
        @NameInMap("PolicyId")
        public String policyId;

        /**
         * <p>The name of the access control policy.</p>
         * 
         * <strong>example:</strong>
         * <p>FullAliyunAccess</p>
         */
        @NameInMap("PolicyName")
        public String policyName;

        /**
         * <p>The type of the access control policy. Valid values:</p>
         * <ul>
         * <li>System: system access control policy</li>
         * <li>Custom: custom access control policy</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>System</p>
         */
        @NameInMap("PolicyType")
        public String policyType;

        /**
         * <p>The tags.</p>
         */
        @NameInMap("Tags")
        public ListControlPoliciesResponseBodyControlPoliciesControlPolicyTags tags;

        /**
         * <p>The time when the access control policy was updated.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-08-05T06:32:24Z</p>
         */
        @NameInMap("UpdateDate")
        public String updateDate;

        public static ListControlPoliciesResponseBodyControlPoliciesControlPolicy build(java.util.Map<String, ?> map) throws Exception {
            ListControlPoliciesResponseBodyControlPoliciesControlPolicy self = new ListControlPoliciesResponseBodyControlPoliciesControlPolicy();
            return TeaModel.build(map, self);
        }

        public ListControlPoliciesResponseBodyControlPoliciesControlPolicy setAttachmentCount(String attachmentCount) {
            this.attachmentCount = attachmentCount;
            return this;
        }
        public String getAttachmentCount() {
            return this.attachmentCount;
        }

        public ListControlPoliciesResponseBodyControlPoliciesControlPolicy setCreateDate(String createDate) {
            this.createDate = createDate;
            return this;
        }
        public String getCreateDate() {
            return this.createDate;
        }

        public ListControlPoliciesResponseBodyControlPoliciesControlPolicy setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListControlPoliciesResponseBodyControlPoliciesControlPolicy setEffectScope(String effectScope) {
            this.effectScope = effectScope;
            return this;
        }
        public String getEffectScope() {
            return this.effectScope;
        }

        public ListControlPoliciesResponseBodyControlPoliciesControlPolicy setPolicyId(String policyId) {
            this.policyId = policyId;
            return this;
        }
        public String getPolicyId() {
            return this.policyId;
        }

        public ListControlPoliciesResponseBodyControlPoliciesControlPolicy setPolicyName(String policyName) {
            this.policyName = policyName;
            return this;
        }
        public String getPolicyName() {
            return this.policyName;
        }

        public ListControlPoliciesResponseBodyControlPoliciesControlPolicy setPolicyType(String policyType) {
            this.policyType = policyType;
            return this;
        }
        public String getPolicyType() {
            return this.policyType;
        }

        public ListControlPoliciesResponseBodyControlPoliciesControlPolicy setTags(ListControlPoliciesResponseBodyControlPoliciesControlPolicyTags tags) {
            this.tags = tags;
            return this;
        }
        public ListControlPoliciesResponseBodyControlPoliciesControlPolicyTags getTags() {
            return this.tags;
        }

        public ListControlPoliciesResponseBodyControlPoliciesControlPolicy setUpdateDate(String updateDate) {
            this.updateDate = updateDate;
            return this;
        }
        public String getUpdateDate() {
            return this.updateDate;
        }

    }

    public static class ListControlPoliciesResponseBodyControlPolicies extends TeaModel {
        @NameInMap("ControlPolicy")
        public java.util.List<ListControlPoliciesResponseBodyControlPoliciesControlPolicy> controlPolicy;

        public static ListControlPoliciesResponseBodyControlPolicies build(java.util.Map<String, ?> map) throws Exception {
            ListControlPoliciesResponseBodyControlPolicies self = new ListControlPoliciesResponseBodyControlPolicies();
            return TeaModel.build(map, self);
        }

        public ListControlPoliciesResponseBodyControlPolicies setControlPolicy(java.util.List<ListControlPoliciesResponseBodyControlPoliciesControlPolicy> controlPolicy) {
            this.controlPolicy = controlPolicy;
            return this;
        }
        public java.util.List<ListControlPoliciesResponseBodyControlPoliciesControlPolicy> getControlPolicy() {
            return this.controlPolicy;
        }

    }

}
