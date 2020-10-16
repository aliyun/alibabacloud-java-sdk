// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class ListUserGroupsResponse extends TeaModel {
    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("Message")
    @Validation(required = true)
    public String message;

    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Data")
    @Validation(required = true)
    public java.util.List<ListUserGroupsResponseData> data;

    public static ListUserGroupsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListUserGroupsResponse self = new ListUserGroupsResponse();
        return TeaModel.build(map, self);
    }

    public ListUserGroupsResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListUserGroupsResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListUserGroupsResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListUserGroupsResponse setData(java.util.List<ListUserGroupsResponseData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListUserGroupsResponseData> getData() {
        return this.data;
    }

    public static class ListUserGroupsResponseData extends TeaModel {
        @NameInMap("Creator")
        @Validation(required = true)
        public String creator;

        @NameInMap("UserGroupName")
        @Validation(required = true)
        public String userGroupName;

        @NameInMap("IsvSubId")
        @Validation(required = true)
        public String isvSubId;

        @NameInMap("UserGroupId")
        @Validation(required = true)
        public Long userGroupId;

        @NameInMap("UserCount")
        @Validation(required = true)
        public Long userCount;

        @NameInMap("CreateTime")
        @Validation(required = true)
        public String createTime;

        @NameInMap("UpdateTime")
        @Validation(required = true)
        public String updateTime;

        @NameInMap("ParentUserGroupId")
        @Validation(required = true)
        public Long parentUserGroupId;

        public static ListUserGroupsResponseData build(java.util.Map<String, ?> map) throws Exception {
            ListUserGroupsResponseData self = new ListUserGroupsResponseData();
            return TeaModel.build(map, self);
        }

        public ListUserGroupsResponseData setCreator(String creator) {
            this.creator = creator;
            return this;
        }
        public String getCreator() {
            return this.creator;
        }

        public ListUserGroupsResponseData setUserGroupName(String userGroupName) {
            this.userGroupName = userGroupName;
            return this;
        }
        public String getUserGroupName() {
            return this.userGroupName;
        }

        public ListUserGroupsResponseData setIsvSubId(String isvSubId) {
            this.isvSubId = isvSubId;
            return this;
        }
        public String getIsvSubId() {
            return this.isvSubId;
        }

        public ListUserGroupsResponseData setUserGroupId(Long userGroupId) {
            this.userGroupId = userGroupId;
            return this;
        }
        public Long getUserGroupId() {
            return this.userGroupId;
        }

        public ListUserGroupsResponseData setUserCount(Long userCount) {
            this.userCount = userCount;
            return this;
        }
        public Long getUserCount() {
            return this.userCount;
        }

        public ListUserGroupsResponseData setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListUserGroupsResponseData setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

        public ListUserGroupsResponseData setParentUserGroupId(Long parentUserGroupId) {
            this.parentUserGroupId = parentUserGroupId;
            return this;
        }
        public Long getParentUserGroupId() {
            return this.parentUserGroupId;
        }

    }

}
