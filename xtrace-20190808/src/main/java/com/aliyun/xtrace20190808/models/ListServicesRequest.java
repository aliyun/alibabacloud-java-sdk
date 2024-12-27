// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtrace20190808.models;

import com.aliyun.tea.*;

public class ListServicesRequest extends TeaModel {
    /**
     * <p>The type of the application. You can leave this parameter empty or set this parameter to <code>XTRACE</code>. We recommend that you leave this parameter empty.</p>
     * <ul>
     * <li>If you leave this parameter empty, applications monitored by Managed Service for OpenTelemetry or Application Real-Time Monitoring Service (ARMS) can be queried.</li>
     * <li>If you set this parameter to <code>XTRACE</code>, only applications monitored by Managed Service for OpenTelemetry can be queried.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>XTRACE</p>
     */
    @NameInMap("AppType")
    public String appType;

    /**
     * <p>The ID of the region.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static ListServicesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListServicesRequest self = new ListServicesRequest();
        return TeaModel.build(map, self);
    }

    public ListServicesRequest setAppType(String appType) {
        this.appType = appType;
        return this;
    }
    public String getAppType() {
        return this.appType;
    }

    public ListServicesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
