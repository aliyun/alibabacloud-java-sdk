// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20200331.models;

import com.aliyun.tea.*;

public class ListControlPoliciesResponseBody extends TeaModel {
    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("ControlPolicies")
    public ListControlPoliciesResponseBodyControlPolicies controlPolicies;

    public static ListControlPoliciesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListControlPoliciesResponseBody self = new ListControlPoliciesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListControlPoliciesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public ListControlPoliciesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListControlPoliciesResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListControlPoliciesResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListControlPoliciesResponseBody setControlPolicies(ListControlPoliciesResponseBodyControlPolicies controlPolicies) {
        this.controlPolicies = controlPolicies;
        return this;
    }
    public ListControlPoliciesResponseBodyControlPolicies getControlPolicies() {
        return this.controlPolicies;
    }

    public static class ListControlPoliciesResponseBodyControlPoliciesControlPolicy extends TeaModel {
        @NameInMap("UpdateDate")
        public String updateDate;

        @NameInMap("Description")
        public String description;

        @NameInMap("EffectScope")
        public String effectScope;

        @NameInMap("AttachmentCount")
        public String attachmentCount;

        @NameInMap("PolicyName")
        public String policyName;

        @NameInMap("PolicyId")
        public String policyId;

        @NameInMap("CreateDate")
        public String createDate;

        @NameInMap("PolicyType")
        public String policyType;

        public static ListControlPoliciesResponseBodyControlPoliciesControlPolicy build(java.util.Map<String, ?> map) throws Exception {
            ListControlPoliciesResponseBodyControlPoliciesControlPolicy self = new ListControlPoliciesResponseBodyControlPoliciesControlPolicy();
            return TeaModel.build(map, self);
        }

        public ListControlPoliciesResponseBodyControlPoliciesControlPolicy setUpdateDate(String updateDate) {
            this.updateDate = updateDate;
            return this;
        }
        public String getUpdateDate() {
            return this.updateDate;
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

        public ListControlPoliciesResponseBodyControlPoliciesControlPolicy setAttachmentCount(String attachmentCount) {
            this.attachmentCount = attachmentCount;
            return this;
        }
        public String getAttachmentCount() {
            return this.attachmentCount;
        }

        public ListControlPoliciesResponseBodyControlPoliciesControlPolicy setPolicyName(String policyName) {
            this.policyName = policyName;
            return this;
        }
        public String getPolicyName() {
            return this.policyName;
        }

        public ListControlPoliciesResponseBodyControlPoliciesControlPolicy setPolicyId(String policyId) {
            this.policyId = policyId;
            return this;
        }
        public String getPolicyId() {
            return this.policyId;
        }

        public ListControlPoliciesResponseBodyControlPoliciesControlPolicy setCreateDate(String createDate) {
            this.createDate = createDate;
            return this;
        }
        public String getCreateDate() {
            return this.createDate;
        }

        public ListControlPoliciesResponseBodyControlPoliciesControlPolicy setPolicyType(String policyType) {
            this.policyType = policyType;
            return this;
        }
        public String getPolicyType() {
            return this.policyType;
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
