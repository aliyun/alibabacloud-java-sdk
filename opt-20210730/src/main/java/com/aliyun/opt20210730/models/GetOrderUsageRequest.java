// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opt20210730.models;

import com.aliyun.tea.*;

public class GetOrderUsageRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("LicenseKey")
    public String licenseKey;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("RelService")
    public String relService;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ResourceType")
    public Integer resourceType;

    @NameInMap("TimeRange")
    public Integer timeRange;

    public static GetOrderUsageRequest build(java.util.Map<String, ?> map) throws Exception {
        GetOrderUsageRequest self = new GetOrderUsageRequest();
        return TeaModel.build(map, self);
    }

    public GetOrderUsageRequest setLicenseKey(String licenseKey) {
        this.licenseKey = licenseKey;
        return this;
    }
    public String getLicenseKey() {
        return this.licenseKey;
    }

    public GetOrderUsageRequest setRelService(String relService) {
        this.relService = relService;
        return this;
    }
    public String getRelService() {
        return this.relService;
    }

    public GetOrderUsageRequest setResourceType(Integer resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public Integer getResourceType() {
        return this.resourceType;
    }

    public GetOrderUsageRequest setTimeRange(Integer timeRange) {
        this.timeRange = timeRange;
        return this;
    }
    public Integer getTimeRange() {
        return this.timeRange;
    }

}
