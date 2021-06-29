// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class DeleteDevicesRequest extends TeaModel {
    @NameInMap("DeviceIdList")
    public String deviceIdList;

    public static DeleteDevicesRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteDevicesRequest self = new DeleteDevicesRequest();
        return TeaModel.build(map, self);
    }

    public DeleteDevicesRequest setDeviceIdList(String deviceIdList) {
        this.deviceIdList = deviceIdList;
        return this;
    }
    public String getDeviceIdList() {
        return this.deviceIdList;
    }

}
