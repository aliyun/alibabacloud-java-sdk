// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.wyota20210420.models;

import com.aliyun.tea.*;

public class GetDeviceOtaInfoTestRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("BaseVersion")
    public String baseVersion;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("DeviceId")
    public String deviceId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Model")
    public String model;

    @NameInMap("TenantId")
    public String tenantId;

    public static GetDeviceOtaInfoTestRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDeviceOtaInfoTestRequest self = new GetDeviceOtaInfoTestRequest();
        return TeaModel.build(map, self);
    }

    public GetDeviceOtaInfoTestRequest setBaseVersion(String baseVersion) {
        this.baseVersion = baseVersion;
        return this;
    }
    public String getBaseVersion() {
        return this.baseVersion;
    }

    public GetDeviceOtaInfoTestRequest setDeviceId(String deviceId) {
        this.deviceId = deviceId;
        return this;
    }
    public String getDeviceId() {
        return this.deviceId;
    }

    public GetDeviceOtaInfoTestRequest setModel(String model) {
        this.model = model;
        return this;
    }
    public String getModel() {
        return this.model;
    }

    public GetDeviceOtaInfoTestRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
