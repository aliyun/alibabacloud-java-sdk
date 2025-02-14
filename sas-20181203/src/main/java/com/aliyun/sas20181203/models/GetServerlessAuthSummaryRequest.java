// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetServerlessAuthSummaryRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("AppRegionId")
    public String appRegionId;

    /**
     * <strong>example:</strong>
     * <p>RunD</p>
     */
    @NameInMap("MachineType")
    public String machineType;

    /**
     * <strong>example:</strong>
     * <p>SAE</p>
     */
    @NameInMap("VendorType")
    public String vendorType;

    public static GetServerlessAuthSummaryRequest build(java.util.Map<String, ?> map) throws Exception {
        GetServerlessAuthSummaryRequest self = new GetServerlessAuthSummaryRequest();
        return TeaModel.build(map, self);
    }

    public GetServerlessAuthSummaryRequest setAppRegionId(String appRegionId) {
        this.appRegionId = appRegionId;
        return this;
    }
    public String getAppRegionId() {
        return this.appRegionId;
    }

    public GetServerlessAuthSummaryRequest setMachineType(String machineType) {
        this.machineType = machineType;
        return this;
    }
    public String getMachineType() {
        return this.machineType;
    }

    public GetServerlessAuthSummaryRequest setVendorType(String vendorType) {
        this.vendorType = vendorType;
        return this;
    }
    public String getVendorType() {
        return this.vendorType;
    }

}
