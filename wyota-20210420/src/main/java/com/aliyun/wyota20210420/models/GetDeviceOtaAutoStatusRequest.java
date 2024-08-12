// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.wyota20210420.models;

import com.aliyun.tea.*;

public class GetDeviceOtaAutoStatusRequest extends TeaModel {
    @NameInMap("ClientType")
    public Integer clientType;

    public static GetDeviceOtaAutoStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDeviceOtaAutoStatusRequest self = new GetDeviceOtaAutoStatusRequest();
        return TeaModel.build(map, self);
    }

    public GetDeviceOtaAutoStatusRequest setClientType(Integer clientType) {
        this.clientType = clientType;
        return this;
    }
    public Integer getClientType() {
        return this.clientType;
    }

}
