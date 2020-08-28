// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ram20150501.models;

import com.aliyun.tea.*;

public class ListGroupsResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("IsTruncated")
    @Validation(required = true)
    public Boolean isTruncated;

    @NameInMap("Marker")
    @Validation(required = true)
    public String marker;

    @NameInMap("Groups")
    @Validation(required = true)
    public ListGroupsResponseGroups groups;

    public static ListGroupsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListGroupsResponse self = new ListGroupsResponse();
        return TeaModel.build(map, self);
    }

    public static class ListGroupsResponseGroupsGroup extends TeaModel {
        @NameInMap("GroupName")
        @Validation(required = true)
        public String groupName;

        @NameInMap("Comments")
        @Validation(required = true)
        public String comments;

        @NameInMap("CreateDate")
        @Validation(required = true)
        public String createDate;

        @NameInMap("UpdateDate")
        @Validation(required = true)
        public String updateDate;

        public static ListGroupsResponseGroupsGroup build(java.util.Map<String, ?> map) throws Exception {
            ListGroupsResponseGroupsGroup self = new ListGroupsResponseGroupsGroup();
            return TeaModel.build(map, self);
        }

    }

    public static class ListGroupsResponseGroups extends TeaModel {
        @NameInMap("Group")
        @Validation(required = true)
        public java.util.List<ListGroupsResponseGroupsGroup> group;

        public static ListGroupsResponseGroups build(java.util.Map<String, ?> map) throws Exception {
            ListGroupsResponseGroups self = new ListGroupsResponseGroups();
            return TeaModel.build(map, self);
        }

    }

}
