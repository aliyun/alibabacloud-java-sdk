// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trusted_server20200613.models;

import com.aliyun.tea.*;

public class UnregisterMessageRequest extends TeaModel {
    @NameInMap("Properties")
    public String properties;

    public static UnregisterMessageRequest build(java.util.Map<String, ?> map) throws Exception {
        UnregisterMessageRequest self = new UnregisterMessageRequest();
        return TeaModel.build(map, self);
    }

    public UnregisterMessageRequest setProperties(String properties) {
        this.properties = properties;
        return this;
    }
    public String getProperties() {
        return this.properties;
    }

}
