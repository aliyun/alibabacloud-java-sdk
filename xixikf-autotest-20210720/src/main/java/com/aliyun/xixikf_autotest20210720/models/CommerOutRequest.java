// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xixikf_autotest20210720.models;

import com.aliyun.tea.*;

public class CommerOutRequest extends TeaModel {
    @NameInMap("Data")
    public String data;

    public static CommerOutRequest build(java.util.Map<String, ?> map) throws Exception {
        CommerOutRequest self = new CommerOutRequest();
        return TeaModel.build(map, self);
    }

    public CommerOutRequest setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

}
