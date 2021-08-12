// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class SetStreamModeRequest extends TeaModel {
    @NameInMap("DeviceIdList")
    public String deviceIdList;

    @NameInMap("StreamMode")
    public String streamMode;

    public static SetStreamModeRequest build(java.util.Map<String, ?> map) throws Exception {
        SetStreamModeRequest self = new SetStreamModeRequest();
        return TeaModel.build(map, self);
    }

    public SetStreamModeRequest setDeviceIdList(String deviceIdList) {
        this.deviceIdList = deviceIdList;
        return this;
    }
    public String getDeviceIdList() {
        return this.deviceIdList;
    }

    public SetStreamModeRequest setStreamMode(String streamMode) {
        this.streamMode = streamMode;
        return this;
    }
    public String getStreamMode() {
        return this.streamMode;
    }

}
