// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class AddLinkeBahamutAdminaddsecmenuRequest extends TeaModel {
    @NameInMap("MenuJsonStr")
    public String menuJsonStr;

    @NameInMap("ParentMenuId")
    public String parentMenuId;

    public static AddLinkeBahamutAdminaddsecmenuRequest build(java.util.Map<String, ?> map) throws Exception {
        AddLinkeBahamutAdminaddsecmenuRequest self = new AddLinkeBahamutAdminaddsecmenuRequest();
        return TeaModel.build(map, self);
    }

    public AddLinkeBahamutAdminaddsecmenuRequest setMenuJsonStr(String menuJsonStr) {
        this.menuJsonStr = menuJsonStr;
        return this;
    }
    public String getMenuJsonStr() {
        return this.menuJsonStr;
    }

    public AddLinkeBahamutAdminaddsecmenuRequest setParentMenuId(String parentMenuId) {
        this.parentMenuId = parentMenuId;
        return this;
    }
    public String getParentMenuId() {
        return this.parentMenuId;
    }

}
