// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class Member extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>ken_12345</p>
     */
    @NameInMap("MemberId")
    public String memberId;

    /**
     * <strong>example:</strong>
     * <p>WorkspaceAdmin</p>
     */
    @NameInMap("MemberType")
    public String memberType;

    public static Member build(java.util.Map<String, ?> map) throws Exception {
        Member self = new Member();
        return TeaModel.build(map, self);
    }

    public Member setMemberId(String memberId) {
        this.memberId = memberId;
        return this;
    }
    public String getMemberId() {
        return this.memberId;
    }

    public Member setMemberType(String memberType) {
        this.memberType = memberType;
        return this;
    }
    public String getMemberType() {
        return this.memberType;
    }

}
