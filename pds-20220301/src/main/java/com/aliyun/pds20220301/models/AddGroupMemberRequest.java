// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class AddGroupMemberRequest extends TeaModel {
    @NameInMap("group_id")
    public String groupId;

    @NameInMap("member_id")
    public String memberId;

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
