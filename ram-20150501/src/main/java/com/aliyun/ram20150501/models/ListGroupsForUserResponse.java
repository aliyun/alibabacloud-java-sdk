// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ram20150501.models;

import com.aliyun.tea.*;

public class ListGroupsForUserResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Groups")
    @Validation(required = true)
    public ListGroupsForUserResponseGroups groups;

    public static ListGroupsForUserResponse build(java.util.Map<String, ?> map) throws Exception {
        ListGroupsForUserResponse self = new ListGroupsForUserResponse();
        return TeaModel.build(map, self);
    }

    public static class ListGroupsForUserResponseGroupsGroup extends TeaModel {
        @NameInMap("GroupName")
        @Validation(required = true)
        public String groupName;

        @NameInMap("Comments")
        @Validation(required = true)
        public String comments;

        @NameInMap("JoinDate")
        @Validation(required = true)
        public String joinDate;

        public static ListGroupsForUserResponseGroupsGroup build(java.util.Map<String, ?> map) throws Exception {
            ListGroupsForUserResponseGroupsGroup self = new ListGroupsForUserResponseGroupsGroup();
            return TeaModel.build(map, self);
        }

    }

    public static class ListGroupsForUserResponseGroups extends TeaModel {
        @NameInMap("Group")
        @Validation(required = true)
        public java.util.List<ListGroupsForUserResponseGroupsGroup> group;

        public static ListGroupsForUserResponseGroups build(java.util.Map<String, ?> map) throws Exception {
            ListGroupsForUserResponseGroups self = new ListGroupsForUserResponseGroups();
            return TeaModel.build(map, self);
        }

    }

}
