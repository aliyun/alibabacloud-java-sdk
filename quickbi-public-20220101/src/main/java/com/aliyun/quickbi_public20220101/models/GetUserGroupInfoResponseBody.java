// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class GetUserGroupInfoResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public java.util.List<GetUserGroupInfoResponseBodyResult> result;

    @NameInMap("Success")
    public Boolean success;

    public static GetUserGroupInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetUserGroupInfoResponseBody self = new GetUserGroupInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public GetUserGroupInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetUserGroupInfoResponseBody setResult(java.util.List<GetUserGroupInfoResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<GetUserGroupInfoResponseBodyResult> getResult() {
        return this.result;
    }

    public GetUserGroupInfoResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetUserGroupInfoResponseBodyResult extends TeaModel {
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

        public static GetUserGroupInfoResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            GetUserGroupInfoResponseBodyResult self = new GetUserGroupInfoResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public GetUserGroupInfoResponseBodyResult setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public GetUserGroupInfoResponseBodyResult setCreateUser(String createUser) {
            this.createUser = createUser;
            return this;
        }
        public String getCreateUser() {
            return this.createUser;
        }

        public GetUserGroupInfoResponseBodyResult setIdentifiedPath(String identifiedPath) {
            this.identifiedPath = identifiedPath;
            return this;
        }
        public String getIdentifiedPath() {
            return this.identifiedPath;
        }

        public GetUserGroupInfoResponseBodyResult setModifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        public GetUserGroupInfoResponseBodyResult setModifyUser(String modifyUser) {
            this.modifyUser = modifyUser;
            return this;
        }
        public String getModifyUser() {
            return this.modifyUser;
        }

        public GetUserGroupInfoResponseBodyResult setParentUsergroupId(String parentUsergroupId) {
            this.parentUsergroupId = parentUsergroupId;
            return this;
        }
        public String getParentUsergroupId() {
            return this.parentUsergroupId;
        }

        public GetUserGroupInfoResponseBodyResult setUsergroupDesc(String usergroupDesc) {
            this.usergroupDesc = usergroupDesc;
            return this;
        }
        public String getUsergroupDesc() {
            return this.usergroupDesc;
        }

        public GetUserGroupInfoResponseBodyResult setUsergroupId(String usergroupId) {
            this.usergroupId = usergroupId;
            return this;
        }
        public String getUsergroupId() {
            return this.usergroupId;
        }

        public GetUserGroupInfoResponseBodyResult setUsergroupName(String usergroupName) {
            this.usergroupName = usergroupName;
            return this;
        }
        public String getUsergroupName() {
            return this.usergroupName;
        }

    }

}
