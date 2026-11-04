// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class DissociateSmartAGFromApplicationBandwidthPackageRequest extends TeaModel {
    /**
     * <p>The instance ID of the bandwidth plan for application acceleration.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>abwp-7963l7iqnquyj3****</p>
     */
    @NameInMap("ApplicationBandwidthPackageId")
    public String applicationBandwidthPackageId;

    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the value, and you must make sure that the value is unique among different requests. The client token can contain only ASCII characters.</p>
     * <blockquote>
     * <p>If you do not specify this parameter, the system automatically uses the RequestId of the API request as the client token. The RequestId of each API request may be different.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>02fb3da4-130e-11e9-8e44-001****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>Specifies whether to perform a dry run on the disassociation request. The dry run includes checks on permissions and instance status. Valid values:</p>
     * <ul>
     * <li><strong>false</strong> (default): Sends a normal request. If the request passes the check, the bandwidth plan for application acceleration is disassociated from the Smart Access Gateway instance.</li>
     * <li><strong>true</strong>: Sends a dry run request. Only the check is performed, and the bandwidth plan for application acceleration is not disassociated from the Smart Access Gateway instance. Check items include whether required parameters are specified and the request format. If the check fails, the corresponding error is returned. If the check passes, the <code>DryRunOperation</code> error code is returned.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>The region ID of the bandwidth plan for application acceleration.</p>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/36063.html">DescribeRegions</a> operation to query region IDs.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The instance ID of the Smart Access Gateway.</p>
     * 
     * <strong>example:</strong>
     * <p>sag-w11hk4bqxpakem****</p>
     */
    @NameInMap("SmartAGId")
    public String smartAGId;

    /**
     * <p>The list of Smart Access Gateway instance IDs.</p>
     * <p>You can enter up to 100 Smart Access Gateway instance IDs at a time.</p>
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
