// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class AddLinkeBahamutAdminproductidaddmenuRequest extends TeaModel {
    @NameInMap("MenuJsonStr")
    public String menuJsonStr;

    @NameInMap("ProductId")
    public String productId;

    public static AddLinkeBahamutAdminproductidaddmenuRequest build(java.util.Map<String, ?> map) throws Exception {
        AddLinkeBahamutAdminproductidaddmenuRequest self = new AddLinkeBahamutAdminproductidaddmenuRequest();
        return TeaModel.build(map, self);
    }

    public AddLinkeBahamutAdminproductidaddmenuRequest setMenuJsonStr(String menuJsonStr) {
        this.menuJsonStr = menuJsonStr;
        return this;
    }
    public String getMenuJsonStr() {
        return this.menuJsonStr;
    }

    public AddLinkeBahamutAdminproductidaddmenuRequest setProductId(String productId) {
        this.productId = productId;
        return this;
    }
    public String getProductId() {
        return this.productId;
    }

}
