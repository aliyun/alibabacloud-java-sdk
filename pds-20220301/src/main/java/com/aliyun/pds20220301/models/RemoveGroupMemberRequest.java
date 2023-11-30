// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class RemoveGroupMemberRequest extends TeaModel {
    /**
     * <p>The ID of the group from which you want to remove a member.</p>
     */
    @NameInMap("group_id")
    public String groupId;

    /**
     * <p>The ID of the member. If member_type is set to user, set this parameter to the ID of the corresponding user.</p>
     */
    @NameInMap("member_id")
    public String memberId;

    /**
     * <p>The type of the member that you want to remove from the group. Only common users can be removed. If you want to remove all members from a group, you can directly delete the group. Valid value:</p>
     * <br>
     * <p>*   user</p>
     * <br>
     * <p>Note: A group can be a member of only one group. It cannot be a member of multiple groups. A user can be a member of multiple groups.</p>
     */
    @NameInMap("member_type")
    public String memberType;

    public static RemoveGroupMemberRequest build(java.util.Map<String, ?> map) throws Exception {
        RemoveGroupMemberRequest self = new RemoveGroupMemberRequest();
        return TeaModel.build(map, self);
    }

    public RemoveGroupMemberRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public RemoveGroupMemberRequest setMemberId(String memberId) {
        this.memberId = memberId;
        return this;
    }
    public String getMemberId() {
        return this.memberId;
    }

    public RemoveGroupMemberRequest setMemberType(String memberType) {
        this.memberType = memberType;
        return this;
    }
    public String getMemberType() {
        return this.memberType;
    }

}
