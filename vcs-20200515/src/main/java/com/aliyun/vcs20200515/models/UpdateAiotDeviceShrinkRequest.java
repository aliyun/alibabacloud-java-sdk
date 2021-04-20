// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class UpdateAiotDeviceShrinkRequest extends TeaModel {
    @NameInMap("Id")
    public String id;

    @NameInMap("AiotDevice")
    public String aiotDeviceShrink;

    public static UpdateAiotDeviceShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateAiotDeviceShrinkRequest self = new UpdateAiotDeviceShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateAiotDeviceShrinkRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public UpdateAiotDeviceShrinkRequest setAiotDeviceShrink(String aiotDeviceShrink) {
        this.aiotDeviceShrink = aiotDeviceShrink;
        return this;
    }
    public String getAiotDeviceShrink() {
        return this.aiotDeviceShrink;
    }

}
