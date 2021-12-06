// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailbot20210224.models;

import com.aliyun.tea.*;

public class CanRefundRequest extends TeaModel {
    @NameInMap("Data")
    public String data;

    public static CanRefundRequest build(java.util.Map<String, ?> map) throws Exception {
        CanRefundRequest self = new CanRefundRequest();
        return TeaModel.build(map, self);
    }

    public CanRefundRequest setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

}
