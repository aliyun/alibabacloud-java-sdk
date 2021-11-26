// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class UpdateOnPurchaseSuccessRequest extends TeaModel {
    @NameInMap("JsonStr")
    public String jsonStr;

    public static UpdateOnPurchaseSuccessRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateOnPurchaseSuccessRequest self = new UpdateOnPurchaseSuccessRequest();
        return TeaModel.build(map, self);
    }

    public UpdateOnPurchaseSuccessRequest setJsonStr(String jsonStr) {
        this.jsonStr = jsonStr;
        return this;
    }
    public String getJsonStr() {
        return this.jsonStr;
    }

}
