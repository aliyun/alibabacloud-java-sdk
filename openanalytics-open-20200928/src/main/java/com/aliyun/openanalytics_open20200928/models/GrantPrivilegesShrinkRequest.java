// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.openanalytics_open20200928.models;

import com.aliyun.tea.*;

public class GrantPrivilegesShrinkRequest extends TeaModel {
    // 权限信息
    @NameInMap("PrivilegeBag")
    public String privilegeBagShrink;

    public static GrantPrivilegesShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        GrantPrivilegesShrinkRequest self = new GrantPrivilegesShrinkRequest();
        return TeaModel.build(map, self);
    }

    public GrantPrivilegesShrinkRequest setPrivilegeBagShrink(String privilegeBagShrink) {
        this.privilegeBagShrink = privilegeBagShrink;
        return this;
    }
    public String getPrivilegeBagShrink() {
        return this.privilegeBagShrink;
    }

}
