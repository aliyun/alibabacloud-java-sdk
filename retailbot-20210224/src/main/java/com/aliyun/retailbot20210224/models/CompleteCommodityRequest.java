// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailbot20210224.models;

import com.aliyun.tea.*;

public class CompleteCommodityRequest extends TeaModel {
    @NameInMap("data")
    public String data;

    public static CompleteCommodityRequest build(java.util.Map<String, ?> map) throws Exception {
        CompleteCommodityRequest self = new CompleteCommodityRequest();
        return TeaModel.build(map, self);
    }

    public CompleteCommodityRequest setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

}
