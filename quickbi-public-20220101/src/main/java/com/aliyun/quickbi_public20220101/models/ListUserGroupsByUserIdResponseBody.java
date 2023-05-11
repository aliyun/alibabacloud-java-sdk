// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class ListUserGroupsByUserIdResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public java.util.List<ListUserGroupsByUserIdResponseBodyResult> result;

    /**
     * <p>The user group modifier. The UserID of the Quick BI is used instead of the UID of Alibaba Cloud.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ListUserGroupsByUserIdResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListUserGroupsByUserIdResponseBody self = new ListUserGroupsByUserIdResponseBody();
        return TeaModel.build(map, self);
    }

    public ListUserGroupsByUserIdResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListUserGroupsByUserIdResponseBody setResult(java.util.List<ListUserGroupsByUserIdResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<ListUserGroupsByUserIdResponseBodyResult> getResult() {
        return this.result;
    }

    public ListUserGroupsByUserIdResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListUserGroupsByUserIdResponseBodyResult extends TeaModel {
        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("CreateUser")
        public String createUser;

        @NameInMap("IdentifiedPath")
        public String identifiedPath;

        @NameInMap("ModifiedTime")
        public String modifiedTime;

        @NameInMap("ModifyUser")
        public String modifyUser;

        @NameInMap("ParentUsergroupId")
        public String parentUsergroupId;

        @NameInMap("UsergroupDesc")
        public String usergroupDesc;

        @NameInMap("UsergroupId")
        public String usergroupId;

        @NameInMap("UsergroupName")
        public String usergroupName;

        public static ListUserGroupsByUserIdResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            ListUserGroupsByUserIdResponseBodyResult self = new ListUserGroupsByUserIdResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public ListUserGroupsByUserIdResponseBodyResult setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListUserGroupsByUserIdResponseBodyResult setCreateUser(String createUser) {
            this.createUser = createUser;
            return this;
        }
        public String getCreateUser() {
            return this.createUser;
        }

        public ListUserGroupsByUserIdResponseBodyResult setIdentifiedPath(String identifiedPath) {
            this.identifiedPath = identifiedPath;
            return this;
        }
        public String getIdentifiedPath() {
            return this.identifiedPath;
        }

        public ListUserGroupsByUserIdResponseBodyResult setModifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        public ListUserGroupsByUserIdResponseBodyResult setModifyUser(String modifyUser) {
            this.modifyUser = modifyUser;
            return this;
        }
        public String getModifyUser() {
            return this.modifyUser;
        }

        public ListUserGroupsByUserIdResponseBodyResult setParentUsergroupId(String parentUsergroupId) {
            this.parentUsergroupId = parentUsergroupId;
            return this;
        }
        public String getParentUsergroupId() {
            return this.parentUsergroupId;
        }

        public ListUserGroupsByUserIdResponseBodyResult setUsergroupDesc(String usergroupDesc) {
            this.usergroupDesc = usergroupDesc;
            return this;
        }
        public String getUsergroupDesc() {
            return this.usergroupDesc;
        }

        public ListUserGroupsByUserIdResponseBodyResult setUsergroupId(String usergroupId) {
            this.usergroupId = usergroupId;
            return this;
        }
        public String getUsergroupId() {
            return this.usergroupId;
        }

        public ListUserGroupsByUserIdResponseBodyResult setUsergroupName(String usergroupName) {
            this.usergroupName = usergroupName;
            return this;
        }
        public String getUsergroupName() {
            return this.usergroupName;
        }

    }

}
