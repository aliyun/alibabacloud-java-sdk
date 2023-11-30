// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class ListGroupMemberRequest extends TeaModel {
    /**
     * <p>The ID of the group of which you want to query members.</p>
     */
    @NameInMap("group_id")
    public String groupId;

    /**
     * <p>The total number of returned entries.</p>
     */
    @NameInMap("limit")
    public Integer limit;

    /**
     * <p>The pagination token that is used in the next request to retrieve a new page of results. You do not need to specify this parameter for the first request. You must specify the token that is obtained from the previous query as the value of marker.\</p>
     * <p>By default, this parameter is left empty.</p>
     */
    @NameInMap("marker")
    public String marker;

    /**
     * <p>The member type. If you do not specify this parameter, both types of members are returned. Valid values:</p>
     * <br>
     * <p>*   user</p>
     * <p>*   group</p>
     * <br>
     * <p>Note: A group can be a member of only one group. It cannot be a member of multiple groups. A user can be a member of multiple groups.</p>
     */
    @NameInMap("member_type")
    public String memberType;

    public static ListGroupMemberRequest build(java.util.Map<String, ?> map) throws Exception {
        ListGroupMemberRequest self = new ListGroupMemberRequest();
        return TeaModel.build(map, self);
    }

    public ListGroupMemberRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public ListGroupMemberRequest setLimit(Integer limit) {
        this.limit = limit;
        return this;
    }
    public Integer getLimit() {
        return this.limit;
    }

    public ListGroupMemberRequest setMarker(String marker) {
        this.marker = marker;
        return this;
    }
    public String getMarker() {
        return this.marker;
    }

    public ListGroupMemberRequest setMemberType(String memberType) {
        this.memberType = memberType;
        return this;
    }
    public String getMemberType() {
        return this.memberType;
    }

}
