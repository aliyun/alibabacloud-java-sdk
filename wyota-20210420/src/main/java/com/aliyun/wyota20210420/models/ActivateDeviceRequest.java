// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.wyota20210420.models;

import com.aliyun.tea.*;

public class ActivateDeviceRequest extends TeaModel {
    @NameInMap("Uuid")
    public String uuid;

    public static ActivateDeviceRequest build(java.util.Map<String, ?> map) throws Exception {
        ActivateDeviceRequest self = new ActivateDeviceRequest();
        return TeaModel.build(map, self);
    }

    public ActivateDeviceRequest setUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }
    public String getUuid() {
        return this.uuid;
    }

}
