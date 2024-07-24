// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class ListGroupMemberRequest extends TeaModel {
    /**
     * <p>The ID of the group of which you want to query members.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>3e5***2c2</p>
     */
    @NameInMap("group_id")
    public String groupId;

    /**
     * <p>The maximum number of results to return. Valid values: 1 to 100. Default value: 100.</p>
     * 
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("limit")
    public Integer limit;

    /**
     * <p>The pagination token that is used in the next request to retrieve a new page of results. You do not need to specify this parameter for the first request. You must specify the token that is obtained from the previous query as the value of marker.\
     * By default, this parameter is left empty.</p>
     * 
     * <strong>example:</strong>
     * <p>NWQ1Yjk4YmI1ZDRlYmU1Y2E0YWE0NmJhYWJmODBhNDQ2NzhlMTRhMg</p>
     */
    @NameInMap("marker")
    public String marker;

    /**
     * <p>The member type. If you do not specify this parameter, both types of members are returned. Valid values:</p>
     * <ul>
     * <li>user</li>
     * <li>group</li>
     * </ul>
     * <p>Note: A group can be a member of only one group. It cannot be a member of multiple groups. A user can be a member of multiple groups.</p>
     * 
     * <strong>example:</strong>
     * <p>user</p>
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
