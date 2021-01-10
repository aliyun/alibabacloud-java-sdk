// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateHasCloudarchZoneRequest extends TeaModel {
    @NameInMap("Dummy")
    public String dummy;

    @NameInMap("RequestBodyJsonStr")
    public String requestBodyJsonStr;

    @NameInMap("ZoneId")
    public String zoneId;

    public static UpdateHasCloudarchZoneRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateHasCloudarchZoneRequest self = new UpdateHasCloudarchZoneRequest();
        return TeaModel.build(map, self);
    }

    public UpdateHasCloudarchZoneRequest setDummy(String dummy) {
        this.dummy = dummy;
        return this;
    }
    public String getDummy() {
        return this.dummy;
    }

    public UpdateHasCloudarchZoneRequest setRequestBodyJsonStr(String requestBodyJsonStr) {
        this.requestBodyJsonStr = requestBodyJsonStr;
        return this;
    }
    public String getRequestBodyJsonStr() {
        return this.requestBodyJsonStr;
    }

    public UpdateHasCloudarchZoneRequest setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

}
