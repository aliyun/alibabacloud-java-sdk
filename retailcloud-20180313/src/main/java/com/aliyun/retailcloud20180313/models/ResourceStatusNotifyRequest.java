// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailcloud20180313.models;

import com.aliyun.tea.*;

public class ResourceStatusNotifyRequest extends TeaModel {
    @NameInMap("data")
    public String data;

    public static ResourceStatusNotifyRequest build(java.util.Map<String, ?> map) throws Exception {
        ResourceStatusNotifyRequest self = new ResourceStatusNotifyRequest();
        return TeaModel.build(map, self);
    }

    public ResourceStatusNotifyRequest setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

}
