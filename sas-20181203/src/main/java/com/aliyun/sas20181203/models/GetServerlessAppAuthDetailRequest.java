// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetServerlessAppAuthDetailRequest extends TeaModel {
    /**
     * <p>The SAE application ID.</p>
     * <blockquote>
     * <p>You can call the <a href="~~ListMachineApps~~">ListMachineApps</a> operation to obtain the ID.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>3de9f2ac-f***769226df</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>The region ID of the application.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("AppRegionId")
    public String appRegionId;

    /**
     * <p>The server type. Valid values:</p>
     * <ul>
     * <li><strong>RunD</strong></li>
     * <li><strong>ECI</strong>.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>RunD</p>
     */
    @NameInMap("MachineType")
    public String machineType;

    /**
     * <p>The cloud service to which the application belongs. Valid values:</p>
     * <ul>
     * <li><strong>ASK</strong></li>
     * <li><strong>SAE</strong></li>
     * <li><strong>ACS</strong>.</li>
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
