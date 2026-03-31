// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ram20150501.models;

import com.aliyun.tea.*;

public class ListPoliciesResponseBody extends TeaModel {
    /**
     * <p>Indicates whether the response is truncated.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("IsTruncated")
    public Boolean isTruncated;

    /**
     * <p>The marker. This parameter is returned only if the value of <code>IsTruncated</code> is <code>true</code>. If the parameter is returned, you can call this operation again and set <code>Marker</code> to obtain the truncated part.``</p>
     * 
     * <strong>example:</strong>
     * <p>EXAMPLE</p>
     */
    @NameInMap("Marker")
    public String marker;

    @NameInMap("Policies")
    public ListPoliciesResponseBodyPolicies policies;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>7B8A4E7D-6CFF-471D-84DF-195A7A241ECB</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListPoliciesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListPoliciesResponseBody self = new ListPoliciesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListPoliciesResponseBody setIsTruncated(Boolean isTruncated) {
        this.isTruncated = isTruncated;
        return this;
    }
    public Boolean getIsTruncated() {
        return this.isTruncated;
    }

    public ListPoliciesResponseBody setMarker(String marker) {
        this.marker = marker;
        return this;
    }
    public String getMarker() {
        return this.marker;
    }

    public ListPoliciesResponseBody setPolicies(ListPoliciesResponseBodyPolicies policies) {
        this.policies = policies;
        return this;
    }
    public ListPoliciesResponseBodyPolicies getPolicies() {
        return this.policies;
    }

    public ListPoliciesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListPoliciesResponseBodyPoliciesPolicyTagsTag extends TeaModel {
        @NameInMap("TagKey")
        public String tagKey;

        @NameInMap("TagValue")
        public String tagValue;

        public static ListPoliciesResponseBodyPoliciesPolicyTagsTag build(java.util.Map<String, ?> map) throws Exception {
            ListPoliciesResponseBodyPoliciesPolicyTagsTag self = new ListPoliciesResponseBodyPoliciesPolicyTagsTag();
            return TeaModel.build(map, self);
        }

        public ListPoliciesResponseBodyPoliciesPolicyTagsTag setTagKey(String tagKey) {
            this.tagKey = tagKey;
            return this;
        }
        public String getTagKey() {
            return this.tagKey;
        }

        public ListPoliciesResponseBodyPoliciesPolicyTagsTag setTagValue(String tagValue) {
            this.tagValue = tagValue;
            return this;
        }
        public String getTagValue() {
            return this.tagValue;
        }

    }

    public static class ListPoliciesResponseBodyPoliciesPolicyTags extends TeaModel {
        @NameInMap("Tag")
        public java.util.List<ListPoliciesResponseBodyPoliciesPolicyTagsTag> tag;

        public static ListPoliciesResponseBodyPoliciesPolicyTags build(java.util.Map<String, ?> map) throws Exception {
            ListPoliciesResponseBodyPoliciesPolicyTags self = new ListPoliciesResponseBodyPoliciesPolicyTags();
            return TeaModel.build(map, self);
        }

        public ListPoliciesResponseBodyPoliciesPolicyTags setTag(java.util.List<ListPoliciesResponseBodyPoliciesPolicyTagsTag> tag) {
            this.tag = tag;
            return this;
        }
        public java.util.List<ListPoliciesResponseBodyPoliciesPolicyTagsTag> getTag() {
            return this.tag;
        }

    }

    public static class ListPoliciesResponseBodyPoliciesPolicy extends TeaModel {
        @NameInMap("AttachmentCount")
        public Integer attachmentCount;

        @NameInMap("CreateDate")
        public String createDate;

        @NameInMap("DefaultVersion")
        public String defaultVersion;

        @NameInMap("Description")
        public String description;

        @NameInMap("PolicyName")
        public String policyName;

        @NameInMap("PolicyType")
        public String policyType;

        @NameInMap("Tags")
        public ListPoliciesResponseBodyPoliciesPolicyTags tags;

        @NameInMap("UpdateDate")
        public String updateDate;

        public static ListPoliciesResponseBodyPoliciesPolicy build(java.util.Map<String, ?> map) throws Exception {
            ListPoliciesResponseBodyPoliciesPolicy self = new ListPoliciesResponseBodyPoliciesPolicy();
            return TeaModel.build(map, self);
        }

        public ListPoliciesResponseBodyPoliciesPolicy setAttachmentCount(Integer attachmentCount) {
            this.attachmentCount = attachmentCount;
            return this;
        }
        public Integer getAttachmentCount() {
            return this.attachmentCount;
        }

        public ListPoliciesResponseBodyPoliciesPolicy setCreateDate(String createDate) {
            this.createDate = createDate;
            return this;
        }
        public String getCreateDate() {
            return this.createDate;
        }

        public ListPoliciesResponseBodyPoliciesPolicy setDefaultVersion(String defaultVersion) {
            this.defaultVersion = defaultVersion;
            return this;
        }
        public String getDefaultVersion() {
            return this.defaultVersion;
        }

        public ListPoliciesResponseBodyPoliciesPolicy setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListPoliciesResponseBodyPoliciesPolicy setPolicyName(String policyName) {
            this.policyName = policyName;
            return this;
        }
        public String getPolicyName() {
            return this.policyName;
        }

        public ListPoliciesResponseBodyPoliciesPolicy setPolicyType(String policyType) {
            this.policyType = policyType;
            return this;
        }
        public String getPolicyType() {
            return this.policyType;
        }

        public ListPoliciesResponseBodyPoliciesPolicy setTags(ListPoliciesResponseBodyPoliciesPolicyTags tags) {
            this.tags = tags;
            return this;
        }
        public ListPoliciesResponseBodyPoliciesPolicyTags getTags() {
            return this.tags;
        }

        public ListPoliciesResponseBodyPoliciesPolicy setUpdateDate(String updateDate) {
            this.updateDate = updateDate;
            return this;
        }
        public String getUpdateDate() {
            return this.updateDate;
        }

    }

    public static class ListPoliciesResponseBodyPolicies extends TeaModel {
        @NameInMap("Policy")
        public java.util.List<ListPoliciesResponseBodyPoliciesPolicy> policy;

        public static ListPoliciesResponseBodyPolicies build(java.util.Map<String, ?> map) throws Exception {
            ListPoliciesResponseBodyPolicies self = new ListPoliciesResponseBodyPolicies();
            return TeaModel.build(map, self);
        }

        public ListPoliciesResponseBodyPolicies setPolicy(java.util.List<ListPoliciesResponseBodyPoliciesPolicy> policy) {
            this.policy = policy;
            return this;
        }
        public java.util.List<ListPoliciesResponseBodyPoliciesPolicy> getPolicy() {
            return this.policy;
        }

    }

}
