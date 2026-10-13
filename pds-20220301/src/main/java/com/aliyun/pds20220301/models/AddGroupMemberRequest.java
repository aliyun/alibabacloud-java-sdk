// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class AddGroupMemberRequest extends TeaModel {
    /**
     * <p>The ID of the group to add a member to.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>3e5***2c2</p>
     */
    @NameInMap("group_id")
    public String groupId;

    /**
     * <p>The user ID of the member to add.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2e4***1b1</p>
     */
    @NameInMap("member_id")
    public String memberId;

    /**
     * <p>The type of member to add. For this operation, the only valid value is <code>user</code>. To add a group as a member of another group, you must specify the parent group when creating that group.</p>
     * <ul>
     * <li>user</li>
     * </ul>
     * <p>Note: A group can belong to only one parent group, but a user can belong to multiple groups.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>user</p>
     */
    @NameInMap("member_type")
    public String memberType;

    public static AddGroupMemberRequest build(java.util.Map<String, ?> map) throws Exception {
        AddGroupMemberRequest self = new AddGroupMemberRequest();
        return TeaModel.build(map, self);
    }

    public AddGroupMemberRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public AddGroupMemberRequest setMemberId(String memberId) {
        this.memberId = memberId;
        return this;
    }
    public String getMemberId() {
        return this.memberId;
    }

    public AddGroupMemberRequest setMemberType(String memberType) {
        this.memberType = memberType;
        return this;
    }
    public String getMemberType() {
        return this.memberType;
    }

}
