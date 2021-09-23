// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class ListHostGroupsResponseBody extends TeaModel {
    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("HostGroups")
    public java.util.List<ListHostGroupsResponseBodyHostGroups> hostGroups;

    public static ListHostGroupsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListHostGroupsResponseBody self = new ListHostGroupsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListHostGroupsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public ListHostGroupsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListHostGroupsResponseBody setHostGroups(java.util.List<ListHostGroupsResponseBodyHostGroups> hostGroups) {
        this.hostGroups = hostGroups;
        return this;
    }
    public java.util.List<ListHostGroupsResponseBodyHostGroups> getHostGroups() {
        return this.hostGroups;
    }

    public static class ListHostGroupsResponseBodyHostGroups extends TeaModel {
        @NameInMap("MemberCount")
        public Integer memberCount;

        @NameInMap("HostGroupId")
        public String hostGroupId;

        @NameInMap("Comment")
        public String comment;

        @NameInMap("HostGroupName")
        public String hostGroupName;

        public static ListHostGroupsResponseBodyHostGroups build(java.util.Map<String, ?> map) throws Exception {
            ListHostGroupsResponseBodyHostGroups self = new ListHostGroupsResponseBodyHostGroups();
            return TeaModel.build(map, self);
        }

        public ListHostGroupsResponseBodyHostGroups setMemberCount(Integer memberCount) {
            this.memberCount = memberCount;
            return this;
        }
        public Integer getMemberCount() {
            return this.memberCount;
        }

        public ListHostGroupsResponseBodyHostGroups setHostGroupId(String hostGroupId) {
            this.hostGroupId = hostGroupId;
            return this;
        }
        public String getHostGroupId() {
            return this.hostGroupId;
        }

        public ListHostGroupsResponseBodyHostGroups setComment(String comment) {
            this.comment = comment;
            return this;
        }
        public String getComment() {
            return this.comment;
        }

        public ListHostGroupsResponseBodyHostGroups setHostGroupName(String hostGroupName) {
            this.hostGroupName = hostGroupName;
            return this;
        }
        public String getHostGroupName() {
            return this.hostGroupName;
        }

    }

}
