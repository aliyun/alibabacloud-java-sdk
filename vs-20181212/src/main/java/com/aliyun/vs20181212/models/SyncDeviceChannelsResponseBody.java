// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class SyncDeviceChannelsResponseBody extends TeaModel {
    @NameInMap("Id")
    public String id;

    @NameInMap("RequestId")
    public String requestId;

    public static SyncDeviceChannelsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SyncDeviceChannelsResponseBody self = new SyncDeviceChannelsResponseBody();
        return TeaModel.build(map, self);
    }

    public SyncDeviceChannelsResponseBody setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public SyncDeviceChannelsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
