// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20200331.models;

import com.aliyun.tea.*;

public class ListPoliciesResponse extends TeaModel {
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

    @NameInMap("Policies")
    @Validation(required = true)
    public ListPoliciesResponsePolicies policies;

    public static ListPoliciesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListPoliciesResponse self = new ListPoliciesResponse();
        return TeaModel.build(map, self);
    }

    public ListPoliciesResponse setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public ListPoliciesResponse setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListPoliciesResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListPoliciesResponse setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListPoliciesResponse setPolicies(ListPoliciesResponsePolicies policies) {
        this.policies = policies;
        return this;
    }
    public ListPoliciesResponsePolicies getPolicies() {
        return this.policies;
    }

    public static class ListPoliciesResponsePoliciesPolicy extends TeaModel {
        @NameInMap("PolicyType")
        @Validation(required = true)
        public String policyType;

        @NameInMap("UpdateDate")
        @Validation(required = true)
        public String updateDate;

        @NameInMap("Description")
        @Validation(required = true)
        public String description;

        @NameInMap("AttachmentCount")
        @Validation(required = true)
        public Integer attachmentCount;

        @NameInMap("PolicyName")
        @Validation(required = true)
        public String policyName;

        @NameInMap("DefaultVersion")
        @Validation(required = true)
        public String defaultVersion;

        @NameInMap("CreateDate")
        @Validation(required = true)
        public String createDate;

        public static ListPoliciesResponsePoliciesPolicy build(java.util.Map<String, ?> map) throws Exception {
            ListPoliciesResponsePoliciesPolicy self = new ListPoliciesResponsePoliciesPolicy();
            return TeaModel.build(map, self);
        }

        public ListPoliciesResponsePoliciesPolicy setPolicyType(String policyType) {
            this.policyType = policyType;
            return this;
        }
        public String getPolicyType() {
            return this.policyType;
        }

        public ListPoliciesResponsePoliciesPolicy setUpdateDate(String updateDate) {
            this.updateDate = updateDate;
            return this;
        }
        public String getUpdateDate() {
            return this.updateDate;
        }

        public ListPoliciesResponsePoliciesPolicy setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListPoliciesResponsePoliciesPolicy setAttachmentCount(Integer attachmentCount) {
            this.attachmentCount = attachmentCount;
            return this;
        }
        public Integer getAttachmentCount() {
            return this.attachmentCount;
        }

        public ListPoliciesResponsePoliciesPolicy setPolicyName(String policyName) {
            this.policyName = policyName;
            return this;
        }
        public String getPolicyName() {
            return this.policyName;
        }

        public ListPoliciesResponsePoliciesPolicy setDefaultVersion(String defaultVersion) {
            this.defaultVersion = defaultVersion;
            return this;
        }
        public String getDefaultVersion() {
            return this.defaultVersion;
        }

        public ListPoliciesResponsePoliciesPolicy setCreateDate(String createDate) {
            this.createDate = createDate;
            return this;
        }
        public String getCreateDate() {
            return this.createDate;
        }

    }

    public static class ListPoliciesResponsePolicies extends TeaModel {
        @NameInMap("Policy")
        @Validation(required = true)
        public java.util.List<ListPoliciesResponsePoliciesPolicy> policy;

        public static ListPoliciesResponsePolicies build(java.util.Map<String, ?> map) throws Exception {
            ListPoliciesResponsePolicies self = new ListPoliciesResponsePolicies();
            return TeaModel.build(map, self);
        }

        public ListPoliciesResponsePolicies setPolicy(java.util.List<ListPoliciesResponsePoliciesPolicy> policy) {
            this.policy = policy;
            return this;
        }
        public java.util.List<ListPoliciesResponsePoliciesPolicy> getPolicy() {
            return this.policy;
        }

    }

}
