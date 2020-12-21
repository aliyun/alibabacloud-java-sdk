// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class DeleteChannelRequest extends TeaModel {
    @NameInMap("DeviceCodes")
    public String deviceCodes;

    public static DeleteChannelRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteChannelRequest self = new DeleteChannelRequest();
        return TeaModel.build(map, self);
    }

    public DeleteChannelRequest setDeviceCodes(String deviceCodes) {
        this.deviceCodes = deviceCodes;
        return this;
    }
    public String getDeviceCodes() {
        return this.deviceCodes;
    }

}
