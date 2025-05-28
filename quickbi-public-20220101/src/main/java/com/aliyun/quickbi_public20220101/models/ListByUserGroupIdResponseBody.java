// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class ListByUserGroupIdResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>D8749D65-E80A-433C-AF1B-CE9C180FF3B4</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The user group query result is returned.</p>
     */
    @NameInMap("Result")
    public ListByUserGroupIdResponseBodyResult result;

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

    public static ListByUserGroupIdResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListByUserGroupIdResponseBody self = new ListByUserGroupIdResponseBody();
        return TeaModel.build(map, self);
    }

    public ListByUserGroupIdResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListByUserGroupIdResponseBody setResult(ListByUserGroupIdResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public ListByUserGroupIdResponseBodyResult getResult() {
        return this.result;
    }

    public ListByUserGroupIdResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListByUserGroupIdResponseBodyResultUserGroupModels extends TeaModel {
        /**
         * <p>The time when the Secret was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-03-15 17:13:55</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The UserID of the creator in the Quick BI.</p>
         * 
         * <strong>example:</strong>
         * <p>46e5*******ee22e2a292704c8</p>
         */
        @NameInMap("CreateUser")
        public String createUser;

        /**
         * <p>The path of the user group.</p>
         * 
         * <strong>example:</strong>
         * <p>2fe4fbd8-<strong><strong>-af083ea/34fd1-</strong></strong>-dcbc33f</p>
         */
        @NameInMap("IdentifiedPath")
        public String identifiedPath;

        /**
         * <p>The time when the protection policy was last modified.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-03-15 20:36:40</p>
         */
        @NameInMap("ModifiedTime")
        public String modifiedTime;

        /**
         * <p>The UserID of the modifier in the Quick BI.</p>
         * 
         * <strong>example:</strong>
         * <p>46e5*******ee22e2a292704c8</p>
         */
        @NameInMap("ModifyUser")
        public String modifyUser;

        /**
         * <p>The ID of the parent user group.</p>
         * 
         * <strong>example:</strong>
         * <p>2fe4fbd8-588f-489a-b3e1-e92c7af083ea</p>
         */
        @NameInMap("ParentUsergroupId")
        public String parentUsergroupId;

        /**
         * <p>The description of the user group.</p>
         * 
         * <strong>example:</strong>
         * <p>Description</p>
         */
        @NameInMap("UsergroupDesc")
        public String usergroupDesc;

        /**
         * <p>The ID of the user group.</p>
         * 
         * <strong>example:</strong>
         * <p>34fd141d-****-4093-8c33-8e066dcbc33f</p>
         */
        @NameInMap("UsergroupId")
        public String usergroupId;

        /**
         * <p>The name of the user group.</p>
         * 
         * <strong>example:</strong>
         * <p>Test user group</p>
         */
        @NameInMap("UsergroupName")
        public String usergroupName;

        public static ListByUserGroupIdResponseBodyResultUserGroupModels build(java.util.Map<String, ?> map) throws Exception {
            ListByUserGroupIdResponseBodyResultUserGroupModels self = new ListByUserGroupIdResponseBodyResultUserGroupModels();
            return TeaModel.build(map, self);
        }

        public ListByUserGroupIdResponseBodyResultUserGroupModels setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListByUserGroupIdResponseBodyResultUserGroupModels setCreateUser(String createUser) {
            this.createUser = createUser;
            return this;
        }
        public String getCreateUser() {
            return this.createUser;
        }

        public ListByUserGroupIdResponseBodyResultUserGroupModels setIdentifiedPath(String identifiedPath) {
            this.identifiedPath = identifiedPath;
            return this;
        }
        public String getIdentifiedPath() {
            return this.identifiedPath;
        }

        public ListByUserGroupIdResponseBodyResultUserGroupModels setModifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        public ListByUserGroupIdResponseBodyResultUserGroupModels setModifyUser(String modifyUser) {
            this.modifyUser = modifyUser;
            return this;
        }
        public String getModifyUser() {
            return this.modifyUser;
        }

        public ListByUserGroupIdResponseBodyResultUserGroupModels setParentUsergroupId(String parentUsergroupId) {
            this.parentUsergroupId = parentUsergroupId;
            return this;
        }
        public String getParentUsergroupId() {
            return this.parentUsergroupId;
        }

        public ListByUserGroupIdResponseBodyResultUserGroupModels setUsergroupDesc(String usergroupDesc) {
            this.usergroupDesc = usergroupDesc;
            return this;
        }
        public String getUsergroupDesc() {
            return this.usergroupDesc;
        }

        public ListByUserGroupIdResponseBodyResultUserGroupModels setUsergroupId(String usergroupId) {
            this.usergroupId = usergroupId;
            return this;
        }
        public String getUsergroupId() {
            return this.usergroupId;
        }

        public ListByUserGroupIdResponseBodyResultUserGroupModels setUsergroupName(String usergroupName) {
            this.usergroupName = usergroupName;
            return this;
        }
        public String getUsergroupName() {
            return this.usergroupName;
        }

    }

    public static class ListByUserGroupIdResponseBodyResult extends TeaModel {
        /**
         * <p>List of failed user groups.</p>
         */
        @NameInMap("FailedUserGroupIds")
        public java.util.List<String> failedUserGroupIds;

        /**
         * <p>The details of the user group that was queried.</p>
         */
        @NameInMap("UserGroupModels")
        public java.util.List<ListByUserGroupIdResponseBodyResultUserGroupModels> userGroupModels;

        public static ListByUserGroupIdResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            ListByUserGroupIdResponseBodyResult self = new ListByUserGroupIdResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public ListByUserGroupIdResponseBodyResult setFailedUserGroupIds(java.util.List<String> failedUserGroupIds) {
            this.failedUserGroupIds = failedUserGroupIds;
            return this;
        }
        public java.util.List<String> getFailedUserGroupIds() {
            return this.failedUserGroupIds;
        }

        public ListByUserGroupIdResponseBodyResult setUserGroupModels(java.util.List<ListByUserGroupIdResponseBodyResultUserGroupModels> userGroupModels) {
            this.userGroupModels = userGroupModels;
            return this;
        }
        public java.util.List<ListByUserGroupIdResponseBodyResultUserGroupModels> getUserGroupModels() {
            return this.userGroupModels;
        }

    }

}
