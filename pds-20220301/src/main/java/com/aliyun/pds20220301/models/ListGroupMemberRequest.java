// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class ListGroupMemberRequest extends TeaModel {
    /**
     * <p>The ID of the group.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>3e5***2c2</p>
     */
    @NameInMap("group_id")
    public String groupId;

    /**
     * <p>The maximum number of results to return. The value must be an integer from 1 to 100. The API may return fewer results than the specified limit.<br>default value: 100<br></p>
     * 
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("limit")
    public Integer limit;

    /**
     * <p>The pagination marker. The API returns results starting from the first entry that follows the marker in alphabetical order. If you do not specify this parameter, the API returns results from the beginning of the collection.<br>default value: none<br></p>
     * 
     * <strong>example:</strong>
     * <p>NWQ1Yjk4YmI1ZDRlYmU1Y2E0YWE0NmJhYWJmODBhNDQ2NzhlMTRhMg</p>
     */
    @NameInMap("marker")
    public String marker;

    /**
     * <p>The member type to list. If you do not specify this parameter, the API returns both users and groups.</p>
     * <ul>
     * <li><p>user</p>
     * </li>
     * <li><p>group</p>
     * </li>
     * </ul>
     * <p>Note: A group can be a member of only one other group. A user can be a member of multiple groups.</p>
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
