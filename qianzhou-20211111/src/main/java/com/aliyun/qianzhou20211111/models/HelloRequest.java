// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qianzhou20211111.models;

import com.aliyun.tea.*;

public class HelloRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>binzhi</p>
     */
    @NameInMap("user")
    public String user;

    public static HelloRequest build(java.util.Map<String, ?> map) throws Exception {
        HelloRequest self = new HelloRequest();
        return TeaModel.build(map, self);
    }

    public HelloRequest setUser(String user) {
        this.user = user;
        return this;
    }
    public String getUser() {
        return this.user;
    }

}
