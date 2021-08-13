// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xixikf_autotest20210720.models;

import com.aliyun.tea.*;

public class CommerOutRequest extends TeaModel {
    @NameInMap("body")
    public String body;

    public static CommerOutRequest build(java.util.Map<String, ?> map) throws Exception {
        CommerOutRequest self = new CommerOutRequest();
        return TeaModel.build(map, self);
    }

    public CommerOutRequest setBody(String body) {
        this.body = body;
        return this;
    }
    public String getBody() {
        return this.body;
    }

}
