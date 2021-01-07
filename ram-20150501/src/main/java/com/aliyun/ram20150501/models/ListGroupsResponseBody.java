// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ram20150501.models;

import com.aliyun.tea.*;

public class ListGroupsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Groups")
    public ListGroupsResponseBodyGroups groups;

    @NameInMap("IsTruncated")
    public Boolean isTruncated;

    @NameInMap("Marker")
    public String marker;

    public static ListGroupsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListGroupsResponseBody self = new ListGroupsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListGroupsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListGroupsResponseBody setGroups(ListGroupsResponseBodyGroups groups) {
        this.groups = groups;
        return this;
    }
    public ListGroupsResponseBodyGroups getGroups() {
        return this.groups;
    }

    public ListGroupsResponseBody setIsTruncated(Boolean isTruncated) {
        this.isTruncated = isTruncated;
        return this;
    }
    public Boolean getIsTruncated() {
        return this.isTruncated;
    }

    public ListGroupsResponseBody setMarker(String marker) {
        this.marker = marker;
        return this;
    }
    public String getMarker() {
        return this.marker;
    }

    public static class ListGroupsResponseBodyGroupsGroup extends TeaModel {
        @NameInMap("GroupId")
        public String groupId;

        @NameInMap("UpdateDate")
        public String updateDate;

        @NameInMap("GroupName")
        public String groupName;

        @NameInMap("Comments")
        public String comments;

        @NameInMap("CreateDate")
        public String createDate;

        public static ListGroupsResponseBodyGroupsGroup build(java.util.Map<String, ?> map) throws Exception {
            ListGroupsResponseBodyGroupsGroup self = new ListGroupsResponseBodyGroupsGroup();
            return TeaModel.build(map, self);
        }

        public ListGroupsResponseBodyGroupsGroup setGroupId(String groupId) {
            this.groupId = groupId;
            return this;
        }
        public String getGroupId() {
            return this.groupId;
        }

        public ListGroupsResponseBodyGroupsGroup setUpdateDate(String updateDate) {
            this.updateDate = updateDate;
            return this;
        }
        public String getUpdateDate() {
            return this.updateDate;
        }

        public ListGroupsResponseBodyGroupsGroup setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public ListGroupsResponseBodyGroupsGroup setComments(String comments) {
            this.comments = comments;
            return this;
        }
        public String getComments() {
            return this.comments;
        }

        public ListGroupsResponseBodyGroupsGroup setCreateDate(String createDate) {
            this.createDate = createDate;
            return this;
        }
        public String getCreateDate() {
            return this.createDate;
        }

    }

    public static class ListGroupsResponseBodyGroups extends TeaModel {
        @NameInMap("Group")
        public java.util.List<ListGroupsResponseBodyGroupsGroup> group;

        public static ListGroupsResponseBodyGroups build(java.util.Map<String, ?> map) throws Exception {
            ListGroupsResponseBodyGroups self = new ListGroupsResponseBodyGroups();
            return TeaModel.build(map, self);
        }

        public ListGroupsResponseBodyGroups setGroup(java.util.List<ListGroupsResponseBodyGroupsGroup> group) {
            this.group = group;
            return this;
        }
        public java.util.List<ListGroupsResponseBodyGroupsGroup> getGroup() {
            return this.group;
        }

    }

}
