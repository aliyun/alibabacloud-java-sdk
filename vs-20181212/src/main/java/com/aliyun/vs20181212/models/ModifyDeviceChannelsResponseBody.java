// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class ModifyDeviceChannelsResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>8F4D95B6-EB19-5245-AD77-95EDA83E53B7</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyDeviceChannelsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyDeviceChannelsResponseBody self = new ModifyDeviceChannelsResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyDeviceChannelsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
