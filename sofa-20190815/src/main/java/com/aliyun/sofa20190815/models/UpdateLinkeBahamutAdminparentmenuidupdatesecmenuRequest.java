// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateLinkeBahamutAdminparentmenuidupdatesecmenuRequest extends TeaModel {
    @NameInMap("MenuJsonStr")
    public String menuJsonStr;

    @NameInMap("ParentMenuId")
    public String parentMenuId;

    public static UpdateLinkeBahamutAdminparentmenuidupdatesecmenuRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateLinkeBahamutAdminparentmenuidupdatesecmenuRequest self = new UpdateLinkeBahamutAdminparentmenuidupdatesecmenuRequest();
        return TeaModel.build(map, self);
    }

    public UpdateLinkeBahamutAdminparentmenuidupdatesecmenuRequest setMenuJsonStr(String menuJsonStr) {
        this.menuJsonStr = menuJsonStr;
        return this;
    }
    public String getMenuJsonStr() {
        return this.menuJsonStr;
    }

    public UpdateLinkeBahamutAdminparentmenuidupdatesecmenuRequest setParentMenuId(String parentMenuId) {
        this.parentMenuId = parentMenuId;
        return this;
    }
    public String getParentMenuId() {
        return this.parentMenuId;
    }

}
