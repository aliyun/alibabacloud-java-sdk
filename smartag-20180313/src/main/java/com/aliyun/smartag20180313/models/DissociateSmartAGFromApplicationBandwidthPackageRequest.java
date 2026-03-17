// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class DissociateSmartAGFromApplicationBandwidthPackageRequest extends TeaModel {
    /**
     * <p>The ID of the bandwidth plan for application acceleration.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>abwp-7963l7iqnquyj3****</p>
     */
    @NameInMap("ApplicationBandwidthPackageId")
    public String applicationBandwidthPackageId;

    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <p>You can use the client to generate the value, but you must make sure that it is unique among different requests. The token can contain only ASCII characters.</p>
     * <blockquote>
     * <p> If you do not set this parameter, ClientToken is set to the value of RequestId. The value of RequestId for each API request may be different.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>02fb3da4-130e-11e9-8e44-001****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>Specifies whether to precheck the request. Check items include permissions and the status of the specified cloud resources. Valid values:</p>
     * <ul>
     * <li><strong>false</strong> (default): sends the request. After the request passes the check, the SAG instance is disassociated from the bandwidth plan for application acceleration.</li>
     * <li><strong>true</strong>: prechecks the request but does not disassociate the SAG instance from the bandwidth plan for application acceleration. If you use this value, the system checks the required parameters and the request syntax. If the request fails the precheck, an error message is returned. If the request passes the precheck, the <code>DryRunOperation</code> error code is returned.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>The region ID of the bandwidth plan for application acceleration.</p>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/36063.html">DescribeRegions</a> operation to query the most recent region list.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the SAG instance.</p>
     * 
     * <strong>example:</strong>
     * <p>sag-w11hk4bqxpakem****</p>
     */
    @NameInMap("SmartAGId")
    public String smartAGId;

    /**
     * <p>The list of the SAG instance id.</p>
     */
    @NameInMap("SmartAGIdList")
    public java.util.List<String> smartAGIdList;

    public static DissociateSmartAGFromApplicationBandwidthPackageRequest build(java.util.Map<String, ?> map) throws Exception {
        DissociateSmartAGFromApplicationBandwidthPackageRequest self = new DissociateSmartAGFromApplicationBandwidthPackageRequest();
        return TeaModel.build(map, self);
    }

    public DissociateSmartAGFromApplicationBandwidthPackageRequest setApplicationBandwidthPackageId(String applicationBandwidthPackageId) {
        this.applicationBandwidthPackageId = applicationBandwidthPackageId;
        return this;
    }
    public String getApplicationBandwidthPackageId() {
        return this.applicationBandwidthPackageId;
    }

    public DissociateSmartAGFromApplicationBandwidthPackageRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public DissociateSmartAGFromApplicationBandwidthPackageRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public DissociateSmartAGFromApplicationBandwidthPackageRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DissociateSmartAGFromApplicationBandwidthPackageRequest setSmartAGId(String smartAGId) {
        this.smartAGId = smartAGId;
        return this;
    }
    public String getSmartAGId() {
        return this.smartAGId;
    }

    public DissociateSmartAGFromApplicationBandwidthPackageRequest setSmartAGIdList(java.util.List<String> smartAGIdList) {
        this.smartAGIdList = smartAGIdList;
        return this;
    }
    public java.util.List<String> getSmartAGIdList() {
        return this.smartAGIdList;
    }

}
