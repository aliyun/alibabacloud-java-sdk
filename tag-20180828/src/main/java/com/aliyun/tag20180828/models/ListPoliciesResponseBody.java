// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tag20180828.models;

import com.aliyun.tea.*;

public class ListPoliciesResponseBody extends TeaModel {
    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("PolicyList")
    public java.util.List<ListPoliciesResponseBodyPolicyList> policyList;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    public static ListPoliciesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListPoliciesResponseBody self = new ListPoliciesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListPoliciesResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListPoliciesResponseBody setPolicyList(java.util.List<ListPoliciesResponseBodyPolicyList> policyList) {
        this.policyList = policyList;
        return this;
    }
    public java.util.List<ListPoliciesResponseBodyPolicyList> getPolicyList() {
        return this.policyList;
    }

    public ListPoliciesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListPoliciesResponseBodyPolicyList extends TeaModel {
        @NameInMap("PolicyContent")
        public String policyContent;

        @NameInMap("PolicyDesc")
        public String policyDesc;

        @NameInMap("PolicyId")
        public String policyId;

        @NameInMap("PolicyName")
        public String policyName;

        @NameInMap("UserType")
        public String userType;

        public static ListPoliciesResponseBodyPolicyList build(java.util.Map<String, ?> map) throws Exception {
            ListPoliciesResponseBodyPolicyList self = new ListPoliciesResponseBodyPolicyList();
            return TeaModel.build(map, self);
        }

        public ListPoliciesResponseBodyPolicyList setPolicyContent(String policyContent) {
            this.policyContent = policyContent;
            return this;
        }
        public String getPolicyContent() {
            return this.policyContent;
        }

        public ListPoliciesResponseBodyPolicyList setPolicyDesc(String policyDesc) {
            this.policyDesc = policyDesc;
            return this;
        }
        public String getPolicyDesc() {
            return this.policyDesc;
        }

        public ListPoliciesResponseBodyPolicyList setPolicyId(String policyId) {
            this.policyId = policyId;
            return this;
        }
        public String getPolicyId() {
            return this.policyId;
        }

        public ListPoliciesResponseBodyPolicyList setPolicyName(String policyName) {
            this.policyName = policyName;
            return this;
        }
        public String getPolicyName() {
            return this.policyName;
        }

        public ListPoliciesResponseBodyPolicyList setUserType(String userType) {
            this.userType = userType;
            return this;
        }
        public String getUserType() {
            return this.userType;
        }

    }

}
