// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class ListUserGroupsResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<ListUserGroupsResponseBodyData> data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static ListUserGroupsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListUserGroupsResponseBody self = new ListUserGroupsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListUserGroupsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListUserGroupsResponseBody setData(java.util.List<ListUserGroupsResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListUserGroupsResponseBodyData> getData() {
        return this.data;
    }

    public ListUserGroupsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListUserGroupsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListUserGroupsResponseBodyData extends TeaModel {
        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("Creator")
        public String creator;

        @NameInMap("IsvSubId")
        public String isvSubId;

        @NameInMap("ParentUserGroupId")
        public Long parentUserGroupId;

        @NameInMap("UpdateTime")
        public String updateTime;

        @NameInMap("UserCount")
        public Long userCount;

        @NameInMap("UserGroupId")
        public Long userGroupId;

        @NameInMap("UserGroupName")
        public String userGroupName;

        public static ListUserGroupsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListUserGroupsResponseBodyData self = new ListUserGroupsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListUserGroupsResponseBodyData setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListUserGroupsResponseBodyData setCreator(String creator) {
            this.creator = creator;
            return this;
        }
        public String getCreator() {
            return this.creator;
        }

        public ListUserGroupsResponseBodyData setIsvSubId(String isvSubId) {
            this.isvSubId = isvSubId;
            return this;
        }
        public String getIsvSubId() {
            return this.isvSubId;
        }

        public ListUserGroupsResponseBodyData setParentUserGroupId(Long parentUserGroupId) {
            this.parentUserGroupId = parentUserGroupId;
            return this;
        }
        public Long getParentUserGroupId() {
            return this.parentUserGroupId;
        }

        public ListUserGroupsResponseBodyData setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

        public ListUserGroupsResponseBodyData setUserCount(Long userCount) {
            this.userCount = userCount;
            return this;
        }
        public Long getUserCount() {
            return this.userCount;
        }

        public ListUserGroupsResponseBodyData setUserGroupId(Long userGroupId) {
            this.userGroupId = userGroupId;
            return this;
        }
        public Long getUserGroupId() {
            return this.userGroupId;
        }

        public ListUserGroupsResponseBodyData setUserGroupName(String userGroupName) {
            this.userGroupName = userGroupName;
            return this;
        }
        public String getUserGroupName() {
            return this.userGroupName;
        }

    }

}
