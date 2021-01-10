// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateLinkeBahamutAdminproductidupdatemenuRequest extends TeaModel {
    @NameInMap("MenuJsonStr")
    public String menuJsonStr;

    @NameInMap("ProductId")
    public String productId;

    public static UpdateLinkeBahamutAdminproductidupdatemenuRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateLinkeBahamutAdminproductidupdatemenuRequest self = new UpdateLinkeBahamutAdminproductidupdatemenuRequest();
        return TeaModel.build(map, self);
    }

    public UpdateLinkeBahamutAdminproductidupdatemenuRequest setMenuJsonStr(String menuJsonStr) {
        this.menuJsonStr = menuJsonStr;
        return this;
    }
    public String getMenuJsonStr() {
        return this.menuJsonStr;
    }

    public UpdateLinkeBahamutAdminproductidupdatemenuRequest setProductId(String productId) {
        this.productId = productId;
        return this;
    }
    public String getProductId() {
        return this.productId;
    }

}
