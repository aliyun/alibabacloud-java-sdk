// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.savingplan20200715.models;

import com.aliyun.tea.*;

public class CompleteTradeRequest extends TeaModel {
    @NameInMap("data")
    public String data;

    public static CompleteTradeRequest build(java.util.Map<String, ?> map) throws Exception {
        CompleteTradeRequest self = new CompleteTradeRequest();
        return TeaModel.build(map, self);
    }

    public CompleteTradeRequest setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

}
