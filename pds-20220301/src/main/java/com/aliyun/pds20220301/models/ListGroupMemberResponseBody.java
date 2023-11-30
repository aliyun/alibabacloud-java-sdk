// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class ListGroupMemberResponseBody extends TeaModel {
    /**
     * <p>The information about the groups.</p>
     */
    @NameInMap("group_items")
    public java.util.List<Group> groupItems;

    /**
     * <p>A pagination token. It can be used in the next request to retrieve a new page of results. If next_marker is empty, no next page exists.</p>
     */
    @NameInMap("next_marker")
    public String nextMarker;

    /**
     * <p>The information about the users.</p>
     */
    @NameInMap("user_items")
    public java.util.List<User> userItems;

    public static ListGroupMemberResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListGroupMemberResponseBody self = new ListGroupMemberResponseBody();
        return TeaModel.build(map, self);
    }

    public ListGroupMemberResponseBody setGroupItems(java.util.List<Group> groupItems) {
        this.groupItems = groupItems;
        return this;
    }
    public java.util.List<Group> getGroupItems() {
        return this.groupItems;
    }

    public ListGroupMemberResponseBody setNextMarker(String nextMarker) {
        this.nextMarker = nextMarker;
        return this;
    }
    public String getNextMarker() {
        return this.nextMarker;
    }

    public ListGroupMemberResponseBody setUserItems(java.util.List<User> userItems) {
        this.userItems = userItems;
        return this;
    }
    public java.util.List<User> getUserItems() {
        return this.userItems;
    }

}
