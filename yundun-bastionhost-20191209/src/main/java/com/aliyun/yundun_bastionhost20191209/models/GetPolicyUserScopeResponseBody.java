// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class GetPolicyUserScopeResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("UserScope")
    public GetPolicyUserScopeResponseBodyUserScope userScope;

    public static GetPolicyUserScopeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetPolicyUserScopeResponseBody self = new GetPolicyUserScopeResponseBody();
        return TeaModel.build(map, self);
    }

    public GetPolicyUserScopeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetPolicyUserScopeResponseBody setUserScope(GetPolicyUserScopeResponseBodyUserScope userScope) {
        this.userScope = userScope;
        return this;
    }
    public GetPolicyUserScopeResponseBodyUserScope getUserScope() {
        return this.userScope;
    }

    public static class GetPolicyUserScopeResponseBodyUserScope extends TeaModel {
        @NameInMap("ScopeType")
        public String scopeType;

        @NameInMap("UserGroupIds")
        public java.util.List<String> userGroupIds;

        @NameInMap("UserIds")
        public java.util.List<String> userIds;

        public static GetPolicyUserScopeResponseBodyUserScope build(java.util.Map<String, ?> map) throws Exception {
            GetPolicyUserScopeResponseBodyUserScope self = new GetPolicyUserScopeResponseBodyUserScope();
            return TeaModel.build(map, self);
        }

        public GetPolicyUserScopeResponseBodyUserScope setScopeType(String scopeType) {
            this.scopeType = scopeType;
            return this;
        }
        public String getScopeType() {
            return this.scopeType;
        }

        public GetPolicyUserScopeResponseBodyUserScope setUserGroupIds(java.util.List<String> userGroupIds) {
            this.userGroupIds = userGroupIds;
            return this;
        }
        public java.util.List<String> getUserGroupIds() {
            return this.userGroupIds;
        }

        public GetPolicyUserScopeResponseBodyUserScope setUserIds(java.util.List<String> userIds) {
            this.userIds = userIds;
            return this;
        }
        public java.util.List<String> getUserIds() {
            return this.userIds;
        }

    }

}
