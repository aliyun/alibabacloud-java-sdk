// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class HTTPHeader extends TeaModel {
    @NameInMap("name")
    public String name;

    @NameInMap("value")
    public String value;

    public static HTTPHeader build(java.util.Map<String, ?> map) throws Exception {
        HTTPHeader self = new HTTPHeader();
        return TeaModel.build(map, self);
    }

    public HTTPHeader setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public HTTPHeader setValue(String value) {
        this.value = value;
        return this;
    }
    public String getValue() {
        return this.value;
    }

}
