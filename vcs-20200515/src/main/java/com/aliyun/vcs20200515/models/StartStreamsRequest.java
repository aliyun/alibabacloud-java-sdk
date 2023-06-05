// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class StartStreamsRequest extends TeaModel {
    @NameInMap("Description")
    public String description;

    @NameInMap("DeviceIdList")
    public String deviceIdList;

    public static StartStreamsRequest build(java.util.Map<String, ?> map) throws Exception {
        StartStreamsRequest self = new StartStreamsRequest();
        return TeaModel.build(map, self);
    }

    public StartStreamsRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public StartStreamsRequest setDeviceIdList(String deviceIdList) {
        this.deviceIdList = deviceIdList;
        return this;
    }
    public String getDeviceIdList() {
        return this.deviceIdList;
    }

}
