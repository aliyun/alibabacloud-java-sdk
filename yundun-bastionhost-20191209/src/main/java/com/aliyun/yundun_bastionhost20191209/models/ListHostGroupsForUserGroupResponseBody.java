// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class ListHostGroupsForUserGroupResponseBody extends TeaModel {
    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("HostGroups")
    public java.util.List<ListHostGroupsForUserGroupResponseBodyHostGroups> hostGroups;

    public static ListHostGroupsForUserGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListHostGroupsForUserGroupResponseBody self = new ListHostGroupsForUserGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public ListHostGroupsForUserGroupResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public ListHostGroupsForUserGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListHostGroupsForUserGroupResponseBody setHostGroups(java.util.List<ListHostGroupsForUserGroupResponseBodyHostGroups> hostGroups) {
        this.hostGroups = hostGroups;
        return this;
    }
    public java.util.List<ListHostGroupsForUserGroupResponseBodyHostGroups> getHostGroups() {
        return this.hostGroups;
    }

    public static class ListHostGroupsForUserGroupResponseBodyHostGroups extends TeaModel {
        @NameInMap("HostGroupId")
        public String hostGroupId;

        @NameInMap("Comment")
        public String comment;

        @NameInMap("HostGroupName")
        public String hostGroupName;

        public static ListHostGroupsForUserGroupResponseBodyHostGroups build(java.util.Map<String, ?> map) throws Exception {
            ListHostGroupsForUserGroupResponseBodyHostGroups self = new ListHostGroupsForUserGroupResponseBodyHostGroups();
            return TeaModel.build(map, self);
        }

        public ListHostGroupsForUserGroupResponseBodyHostGroups setHostGroupId(String hostGroupId) {
            this.hostGroupId = hostGroupId;
            return this;
        }
        public String getHostGroupId() {
            return this.hostGroupId;
        }

        public ListHostGroupsForUserGroupResponseBodyHostGroups setComment(String comment) {
            this.comment = comment;
            return this;
        }
        public String getComment() {
            return this.comment;
        }

        public ListHostGroupsForUserGroupResponseBodyHostGroups setHostGroupName(String hostGroupName) {
            this.hostGroupName = hostGroupName;
            return this;
        }
        public String getHostGroupName() {
            return this.hostGroupName;
        }

    }

}
