// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xgippop20220520.models;

import com.aliyun.tea.*;

public class ValidControllerAuthorRequest extends TeaModel {
    @NameInMap("AliUid")
    public Long aliUid;

    @NameInMap("ItemCode")
    public String itemCode;

    public static ValidControllerAuthorRequest build(java.util.Map<String, ?> map) throws Exception {
        ValidControllerAuthorRequest self = new ValidControllerAuthorRequest();
        return TeaModel.build(map, self);
    }

    public ValidControllerAuthorRequest setAliUid(Long aliUid) {
        this.aliUid = aliUid;
        return this;
    }
    public Long getAliUid() {
        return this.aliUid;
    }

    public ValidControllerAuthorRequest setItemCode(String itemCode) {
        this.itemCode = itemCode;
        return this;
    }
    public String getItemCode() {
        return this.itemCode;
    }

}
