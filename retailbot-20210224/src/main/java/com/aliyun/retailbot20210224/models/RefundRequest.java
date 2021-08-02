// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailbot20210224.models;

import com.aliyun.tea.*;

public class RefundRequest extends TeaModel {
    @NameInMap("data")
    public String data;

    public static RefundRequest build(java.util.Map<String, ?> map) throws Exception {
        RefundRequest self = new RefundRequest();
        return TeaModel.build(map, self);
    }

    public RefundRequest setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

}
