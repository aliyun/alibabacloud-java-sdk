// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.wyota20210420.models;

import com.aliyun.tea.*;

public class GetExportDeviceInfoOssUrlRequest extends TeaModel {
    @NameInMap("TenantId")
    public String tenantId;

    @NameInMap("ZoneId")
    public String zoneId;

    @NameInMap("ZoneName")
    public String zoneName;

    public static GetExportDeviceInfoOssUrlRequest build(java.util.Map<String, ?> map) throws Exception {
        GetExportDeviceInfoOssUrlRequest self = new GetExportDeviceInfoOssUrlRequest();
        return TeaModel.build(map, self);
    }

    public GetExportDeviceInfoOssUrlRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public GetExportDeviceInfoOssUrlRequest setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

    public GetExportDeviceInfoOssUrlRequest setZoneName(String zoneName) {
        this.zoneName = zoneName;
        return this;
    }
    public String getZoneName() {
        return this.zoneName;
    }

}
