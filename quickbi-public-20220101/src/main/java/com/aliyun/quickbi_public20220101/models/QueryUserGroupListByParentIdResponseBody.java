// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class QueryUserGroupListByParentIdResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>72B19D61-B37A-5C7A-9389-0856CD7935B3</p>
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
     * <ul>
     * <li>true: The request was successful.</li>
     * <li>false: The request failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
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
         * 
         * <strong>example:</strong>
         * <p>2020-10-30 10:03:09</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The creator of the sub-user group. The UserID of the Quick BI is used instead of the UID of Alibaba Cloud.</p>
         * 
         * <strong>example:</strong>
         * <p>136516262323****</p>
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
         * 
         * <strong>example:</strong>
         * <p>2020-11-16 15:49:08</p>
         */
        @NameInMap("ModifiedTime")
        public String modifiedTime;

        /**
         * <p>The user who modified the subgroup. The UserID of the Quick BI is used instead of the UID of Alibaba Cloud.</p>
         * 
         * <strong>example:</strong>
         * <p>136516262323****</p>
         */
        @NameInMap("ModifyUser")
        public String modifyUser;

        /**
         * <p>The ID of the parent user group.</p>
         * 
         * <strong>example:</strong>
         * <p>3d2c23d4-2b41-4af8-a1f5-f6390f32****</p>
         */
        @NameInMap("ParentUserGroupId")
        public String parentUserGroupId;

        /**
         * <p>The description of the sub-user group.</p>
         * 
         * <strong>example:</strong>
         * <p>User Group for Testing</p>
         */
        @NameInMap("UserGroupDescription")
        public String userGroupDescription;

        /**
         * <p>The ID of the sub-user group.</p>
         * 
         * <strong>example:</strong>
         * <p>f5eeb52e-d9c2-4a8b-80e3-47ab55c2****</p>
         */
        @NameInMap("UserGroupId")
        public String userGroupId;

        /**
         * <p>The name of the sub-user group.</p>
         * 
         * <strong>example:</strong>
         * <p>popapi test group</p>
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
