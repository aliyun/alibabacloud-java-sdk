// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ververica20220718.models;

import com.aliyun.tea.*;

public class Member extends TeaModel {
    /**
     * <p>The member ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>user: 181319557522****</p>
     */
    @NameInMap("member")
    public String member;

    /**
     * <p>The role of the member.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>EDITOR</li>
     * <li>VIEWER</li>
     * <li>ADMIN</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>VIEWER</p>
     */
    @NameInMap("role")
    public String role;

    public static Member build(java.util.Map<String, ?> map) throws Exception {
        Member self = new Member();
        return TeaModel.build(map, self);
    }

    public Member setMember(String member) {
        this.member = member;
        return this;
    }
    public String getMember() {
        return this.member;
    }

    public Member setRole(String role) {
        this.role = role;
        return this;
    }
    public String getRole() {
        return this.role;
    }

}
