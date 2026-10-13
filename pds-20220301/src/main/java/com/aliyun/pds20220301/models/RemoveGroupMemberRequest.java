// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class RemoveGroupMemberRequest extends TeaModel {
    /**
     * <p>The ID of the group to remove the member from.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>3e5***2c2</p>
     */
    @NameInMap("group_id")
    public String groupId;

    /**
     * <p>The member ID. If <code>member_type</code> is <code>user</code>, this is the <code>userID</code>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2e4***1b1</p>
     */
    @NameInMap("member_id")
    public String memberId;

    /**
     * <p>The member type. This operation only removes users. To remove a member that is a group, delete the group instead.</p>
     * <ul>
     * <li>user</li>
     * </ul>
     * <p>Note: A group can be a member of only one other group. A user can be a member of multiple groups.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>user</p>
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
