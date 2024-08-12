// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.wyota20210420.models;

import com.aliyun.tea.*;

public class AddOrUpdateDeviceSeatsRequest extends TeaModel {
    @NameInMap("FileName")
    public String fileName;

    @NameInMap("UserCustomId")
    public String userCustomId;

    @NameInMap("ZoneId")
    public String zoneId;

    public static AddOrUpdateDeviceSeatsRequest build(java.util.Map<String, ?> map) throws Exception {
        AddOrUpdateDeviceSeatsRequest self = new AddOrUpdateDeviceSeatsRequest();
        return TeaModel.build(map, self);
    }

    public AddOrUpdateDeviceSeatsRequest setFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }
    public String getFileName() {
        return this.fileName;
    }

    public AddOrUpdateDeviceSeatsRequest setUserCustomId(String userCustomId) {
        this.userCustomId = userCustomId;
        return this;
    }
    public String getUserCustomId() {
        return this.userCustomId;
    }

    public AddOrUpdateDeviceSeatsRequest setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

}
