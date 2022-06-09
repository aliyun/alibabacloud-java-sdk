// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yuqing20220301.models;

import com.aliyun.tea.*;

public class ConsoleApiProxyRequest extends TeaModel {
    // A short description of struct
    @NameInMap("body")
    public java.util.Map<String, ?> body;

    public static ConsoleApiProxyRequest build(java.util.Map<String, ?> map) throws Exception {
        ConsoleApiProxyRequest self = new ConsoleApiProxyRequest();
        return TeaModel.build(map, self);
    }

    public ConsoleApiProxyRequest setBody(java.util.Map<String, ?> body) {
        this.body = body;
        return this;
    }
    public java.util.Map<String, ?> getBody() {
        return this.body;
    }

}
