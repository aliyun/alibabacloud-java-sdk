// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.tea.*;

public class PutLiveChannelStatusRequest extends TeaModel {
    @NameInMap("status")
    public String status;

    public static PutLiveChannelStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        PutLiveChannelStatusRequest self = new PutLiveChannelStatusRequest();
        return TeaModel.build(map, self);
    }

    public PutLiveChannelStatusRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
