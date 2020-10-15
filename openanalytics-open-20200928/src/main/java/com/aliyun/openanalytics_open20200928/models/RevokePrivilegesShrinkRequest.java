// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.openanalytics_open20200928.models;

import com.aliyun.tea.*;

public class RevokePrivilegesShrinkRequest extends TeaModel {
    // 权限信息
    @NameInMap("PrivilegeBag")
    public String privilegeBagShrink;

    public static RevokePrivilegesShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        RevokePrivilegesShrinkRequest self = new RevokePrivilegesShrinkRequest();
        return TeaModel.build(map, self);
    }

    public RevokePrivilegesShrinkRequest setPrivilegeBagShrink(String privilegeBagShrink) {
        this.privilegeBagShrink = privilegeBagShrink;
        return this;
    }
    public String getPrivilegeBagShrink() {
        return this.privilegeBagShrink;
    }

}
