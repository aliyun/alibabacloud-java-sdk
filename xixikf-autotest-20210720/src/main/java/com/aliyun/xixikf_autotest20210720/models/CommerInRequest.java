// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xixikf_autotest20210720.models;

import com.aliyun.tea.*;

public class CommerInRequest extends TeaModel {
    @NameInMap("body")
    public String body;

    public static CommerInRequest build(java.util.Map<String, ?> map) throws Exception {
        CommerInRequest self = new CommerInRequest();
        return TeaModel.build(map, self);
    }

    public CommerInRequest setBody(String body) {
        this.body = body;
        return this;
    }
    public String getBody() {
        return this.body;
    }

}
