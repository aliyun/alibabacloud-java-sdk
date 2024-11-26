// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yuqing20220301.models;

import com.aliyun.tea.*;

public class ConsoleApiProxyRequest extends TeaModel {
    @NameInMap("body")
    public ConsoleBody body;

    public static ConsoleApiProxyRequest build(java.util.Map<String, ?> map) throws Exception {
        ConsoleApiProxyRequest self = new ConsoleApiProxyRequest();
        return TeaModel.build(map, self);
    }

    public ConsoleApiProxyRequest setBody(ConsoleBody body) {
        this.body = body;
        return this;
    }
    public ConsoleBody getBody() {
        return this.body;
    }

}
