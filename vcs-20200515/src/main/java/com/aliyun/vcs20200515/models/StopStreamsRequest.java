// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class StopStreamsRequest extends TeaModel {
    @NameInMap("Description")
    public String description;

    @NameInMap("DeviceIdList")
    public String deviceIdList;

    public static StopStreamsRequest build(java.util.Map<String, ?> map) throws Exception {
        StopStreamsRequest self = new StopStreamsRequest();
        return TeaModel.build(map, self);
    }

    public StopStreamsRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public StopStreamsRequest setDeviceIdList(String deviceIdList) {
        this.deviceIdList = deviceIdList;
        return this;
    }
    public String getDeviceIdList() {
        return this.deviceIdList;
    }

}
