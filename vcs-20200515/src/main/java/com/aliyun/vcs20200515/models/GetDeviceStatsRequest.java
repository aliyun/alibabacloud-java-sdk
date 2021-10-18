// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class GetDeviceStatsRequest extends TeaModel {
    @NameInMap("CorpIdList")
    public String corpIdList;

    @NameInMap("DeviceType")
    public String deviceType;

    @NameInMap("DeviceStatus")
    public String deviceStatus;

    public static GetDeviceStatsRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDeviceStatsRequest self = new GetDeviceStatsRequest();
        return TeaModel.build(map, self);
    }

    public GetDeviceStatsRequest setCorpIdList(String corpIdList) {
        this.corpIdList = corpIdList;
        return this;
    }
    public String getCorpIdList() {
        return this.corpIdList;
    }

    public GetDeviceStatsRequest setDeviceType(String deviceType) {
        this.deviceType = deviceType;
        return this;
    }
    public String getDeviceType() {
        return this.deviceType;
    }

    public GetDeviceStatsRequest setDeviceStatus(String deviceStatus) {
        this.deviceStatus = deviceStatus;
        return this;
    }
    public String getDeviceStatus() {
        return this.deviceStatus;
    }

}
