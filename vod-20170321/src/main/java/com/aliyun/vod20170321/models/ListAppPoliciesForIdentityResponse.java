// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class ListAppPoliciesForIdentityResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("AppPolicyList")
    @Validation(required = true)
    public java.util.List<ListAppPoliciesForIdentityResponseAppPolicyList> appPolicyList;

    public static ListAppPoliciesForIdentityResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAppPoliciesForIdentityResponse self = new ListAppPoliciesForIdentityResponse();
        return TeaModel.build(map, self);
    }

    public static class ListAppPoliciesForIdentityResponseAppPolicyList extends TeaModel {
        @NameInMap("AppId")
        @Validation(required = true)
        public String appId;

        @NameInMap("CreationTime")
        @Validation(required = true)
        public String creationTime;

        @NameInMap("PolicyName")
        @Validation(required = true)
        public String policyName;

        @NameInMap("PolicyType")
        @Validation(required = true)
        public String policyType;

        @NameInMap("PolicyValue")
        @Validation(required = true)
        public String policyValue;

        @NameInMap("Description")
        @Validation(required = true)
        public String description;

        @NameInMap("ModificationTime")
        @Validation(required = true)
        public String modificationTime;

        public static ListAppPoliciesForIdentityResponseAppPolicyList build(java.util.Map<String, ?> map) throws Exception {
            ListAppPoliciesForIdentityResponseAppPolicyList self = new ListAppPoliciesForIdentityResponseAppPolicyList();
            return TeaModel.build(map, self);
        }

    }

}
