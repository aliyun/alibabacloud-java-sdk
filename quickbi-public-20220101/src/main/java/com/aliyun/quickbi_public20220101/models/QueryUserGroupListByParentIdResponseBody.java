// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class QueryUserGroupListByParentIdResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The information about the sub-user group.</p>
     */
    @NameInMap("Result")
    public java.util.List<QueryUserGroupListByParentIdResponseBodyResult> result;

    /**
     * <p>Indicates whether the request is successful. Valid values:</p>
     * <br>
     * <p>*   true: The request was successful.</p>
     * <p>*   false: The request failed.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static QueryUserGroupListByParentIdResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryUserGroupListByParentIdResponseBody self = new QueryUserGroupListByParentIdResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryUserGroupListByParentIdResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryUserGroupListByParentIdResponseBody setResult(java.util.List<QueryUserGroupListByParentIdResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<QueryUserGroupListByParentIdResponseBodyResult> getResult() {
        return this.result;
    }

    public QueryUserGroupListByParentIdResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryUserGroupListByParentIdResponseBodyResult extends TeaModel {
        /**
         * <p>The time when the sub-user group was created.</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The creator of the sub-user group. The UserID of the Quick BI is used instead of the UID of Alibaba Cloud.</p>
         */
        @NameInMap("CreateUser")
        public String createUser;

        /**
         * <p>Directory level of the sub-user group.</p>
         */
        @NameInMap("IdentifiedPath")
        public String identifiedPath;

        /**
         * <p>The time when the sub-user group was last modified.</p>
         */
        @NameInMap("ModifiedTime")
        public String modifiedTime;

        /**
         * <p>The user who modified the subgroup. The UserID of the Quick BI is used instead of the UID of Alibaba Cloud.</p>
         */
        @NameInMap("ModifyUser")
        public String modifyUser;

        /**
         * <p>The ID of the parent user group.</p>
         */
        @NameInMap("ParentUserGroupId")
        public String parentUserGroupId;

        /**
         * <p>The description of the sub-user group.</p>
         */
        @NameInMap("UserGroupDescription")
        public String userGroupDescription;

        /**
         * <p>The ID of the sub-user group.</p>
         */
        @NameInMap("UserGroupId")
        public String userGroupId;

        /**
         * <p>The name of the sub-user group.</p>
         */
        @NameInMap("UserGroupName")
        public String userGroupName;

        public static QueryUserGroupListByParentIdResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            QueryUserGroupListByParentIdResponseBodyResult self = new QueryUserGroupListByParentIdResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public QueryUserGroupListByParentIdResponseBodyResult setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public QueryUserGroupListByParentIdResponseBodyResult setCreateUser(String createUser) {
            this.createUser = createUser;
            return this;
        }
        public String getCreateUser() {
            return this.createUser;
        }

        public QueryUserGroupListByParentIdResponseBodyResult setIdentifiedPath(String identifiedPath) {
            this.identifiedPath = identifiedPath;
            return this;
        }
        public String getIdentifiedPath() {
            return this.identifiedPath;
        }

        public QueryUserGroupListByParentIdResponseBodyResult setModifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        public QueryUserGroupListByParentIdResponseBodyResult setModifyUser(String modifyUser) {
            this.modifyUser = modifyUser;
            return this;
        }
        public String getModifyUser() {
            return this.modifyUser;
        }

        public QueryUserGroupListByParentIdResponseBodyResult setParentUserGroupId(String parentUserGroupId) {
            this.parentUserGroupId = parentUserGroupId;
            return this;
        }
        public String getParentUserGroupId() {
            return this.parentUserGroupId;
        }

        public QueryUserGroupListByParentIdResponseBodyResult setUserGroupDescription(String userGroupDescription) {
            this.userGroupDescription = userGroupDescription;
            return this;
        }
        public String getUserGroupDescription() {
            return this.userGroupDescription;
        }

        public QueryUserGroupListByParentIdResponseBodyResult setUserGroupId(String userGroupId) {
            this.userGroupId = userGroupId;
            return this;
        }
        public String getUserGroupId() {
            return this.userGroupId;
        }

        public QueryUserGroupListByParentIdResponseBodyResult setUserGroupName(String userGroupName) {
            this.userGroupName = userGroupName;
            return this;
        }
        public String getUserGroupName() {
            return this.userGroupName;
        }

    }

}
