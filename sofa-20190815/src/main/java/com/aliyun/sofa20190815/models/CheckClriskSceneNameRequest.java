// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CheckClriskSceneNameRequest extends TeaModel {
    @NameInMap("NewName")
    public String newName;

    @NameInMap("ProductId")
    public Long productId;

    public static CheckClriskSceneNameRequest build(java.util.Map<String, ?> map) throws Exception {
        CheckClriskSceneNameRequest self = new CheckClriskSceneNameRequest();
        return TeaModel.build(map, self);
    }

    public CheckClriskSceneNameRequest setNewName(String newName) {
        this.newName = newName;
        return this;
    }
    public String getNewName() {
        return this.newName;
    }

    public CheckClriskSceneNameRequest setProductId(Long productId) {
        this.productId = productId;
        return this;
    }
    public Long getProductId() {
        return this.productId;
    }

}
