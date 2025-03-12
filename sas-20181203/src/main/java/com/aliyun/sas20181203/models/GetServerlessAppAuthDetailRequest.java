// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetServerlessAppAuthDetailRequest extends TeaModel {
    /**
     * <p>SAE application ID.</p>
     * <blockquote>
     * <p>Obtain through the <a href="~~ListMachineApps~~">ListMachineApps</a> interface.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>3de9f2ac-f***769226df</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>Application region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("AppRegionId")
    public String appRegionId;

    /**
     * <p>Server type: </p>
     * <ul>
     * <li><strong>RunD</strong></li>
     * <li><strong>ECI</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>RunD</p>
     */
    @NameInMap("MachineType")
    public String machineType;

    /**
     * <p>Cloud product: </p>
     * <ul>
     * <li><strong>ASK</strong></li>
     * <li><strong>SAE</strong></li>
     * <li><strong>ACS</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>SAE</p>
     */
    @NameInMap("VendorType")
    public String vendorType;

    public static GetServerlessAppAuthDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        GetServerlessAppAuthDetailRequest self = new GetServerlessAppAuthDetailRequest();
        return TeaModel.build(map, self);
    }

    public GetServerlessAppAuthDetailRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public GetServerlessAppAuthDetailRequest setAppRegionId(String appRegionId) {
        this.appRegionId = appRegionId;
        return this;
    }
    public String getAppRegionId() {
        return this.appRegionId;
    }

    public GetServerlessAppAuthDetailRequest setMachineType(String machineType) {
        this.machineType = machineType;
        return this;
    }
    public String getMachineType() {
        return this.machineType;
    }

    public GetServerlessAppAuthDetailRequest setVendorType(String vendorType) {
        this.vendorType = vendorType;
        return this;
    }
    public String getVendorType() {
        return this.vendorType;
    }

}
