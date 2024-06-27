// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class QueryUserGroupMemberResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>48C930FF-DFCF-5986-902B-E24C202E2443</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public java.util.List<QueryUserGroupMemberResponseBodyResult> result;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static QueryUserGroupMemberResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryUserGroupMemberResponseBody self = new QueryUserGroupMemberResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryUserGroupMemberResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryUserGroupMemberResponseBody setResult(java.util.List<QueryUserGroupMemberResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<QueryUserGroupMemberResponseBodyResult> getResult() {
        return this.result;
    }

    public QueryUserGroupMemberResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryUserGroupMemberResponseBodyResult extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>3d2c23d4-2b41-4af8-a1f5-f6390f32****</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("IsUserGroup")
        public Boolean isUserGroup;

        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>2fe4fbd8-588f-489a-b3e1-e92c7af0****</p>
         */
        @NameInMap("ParentUserGroupId")
        public String parentUserGroupId;

        @NameInMap("ParentUserGroupName")
        public String parentUserGroupName;

        public static QueryUserGroupMemberResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            QueryUserGroupMemberResponseBodyResult self = new QueryUserGroupMemberResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public QueryUserGroupMemberResponseBodyResult setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryUserGroupMemberResponseBodyResult setIsUserGroup(Boolean isUserGroup) {
            this.isUserGroup = isUserGroup;
            return this;
        }
        public Boolean getIsUserGroup() {
            return this.isUserGroup;
        }

        public QueryUserGroupMemberResponseBodyResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryUserGroupMemberResponseBodyResult setParentUserGroupId(String parentUserGroupId) {
            this.parentUserGroupId = parentUserGroupId;
            return this;
        }
        public String getParentUserGroupId() {
            return this.parentUserGroupId;
        }

        public QueryUserGroupMemberResponseBodyResult setParentUserGroupName(String parentUserGroupName) {
            this.parentUserGroupName = parentUserGroupName;
            return this;
        }
        public String getParentUserGroupName() {
            return this.parentUserGroupName;
        }

    }

}
