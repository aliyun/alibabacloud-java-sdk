// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.support_plan20210706.models;

import com.aliyun.tea.*;

public class EnterpriseDingtalkGroupMember extends TeaModel {
    // 是否企业钉群管理员
    @NameInMap("IsAdmin")
    public Boolean isAdmin;

    // 成员手机号
    @NameInMap("Mobile")
    public String mobile;

    // 成员姓名
    @NameInMap("Name")
    public String name;

    public static EnterpriseDingtalkGroupMember build(java.util.Map<String, ?> map) throws Exception {
        EnterpriseDingtalkGroupMember self = new EnterpriseDingtalkGroupMember();
        return TeaModel.build(map, self);
    }

    public EnterpriseDingtalkGroupMember setIsAdmin(Boolean isAdmin) {
        this.isAdmin = isAdmin;
        return this;
    }
    public Boolean getIsAdmin() {
        return this.isAdmin;
    }

    public EnterpriseDingtalkGroupMember setMobile(String mobile) {
        this.mobile = mobile;
        return this;
    }
    public String getMobile() {
        return this.mobile;
    }

    public EnterpriseDingtalkGroupMember setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
