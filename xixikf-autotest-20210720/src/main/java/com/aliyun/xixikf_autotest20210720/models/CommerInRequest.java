// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xixikf_autotest20210720.models;

import com.aliyun.tea.*;

public class CommerInRequest extends TeaModel {
    @NameInMap("Data")
    public String data;

    public static CommerInRequest build(java.util.Map<String, ?> map) throws Exception {
        CommerInRequest self = new CommerInRequest();
        return TeaModel.build(map, self);
    }

    public CommerInRequest setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

}
