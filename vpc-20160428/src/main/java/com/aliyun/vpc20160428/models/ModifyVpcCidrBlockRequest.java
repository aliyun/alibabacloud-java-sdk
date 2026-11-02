// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ModifyVpcCidrBlockRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <p>Generate a parameter value from your client and ensure that the value is unique among different requests. The ClientToken parameter supports only ASCII characters.</p>
     * <blockquote>
     * <p>If you do not specify this parameter, the system automatically uses the <strong>RequestId</strong> of the API request as the <strong>ClientToken</strong> identifier. The <strong>RequestId</strong> of each API request is different.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>123e4567-e89b-12d3-a456-426655440000</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>Specifies whether to perform only a dry run for this request. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: The system sends a check request and does not modify the CIDR block of the virtual private cloud (VPC). If the check fails, the system returns the corresponding error. If the check succeeds, the system returns the error code <code>DryRunOperation</code>.</li>
     * <li><strong>false</strong> (default): The system sends a normal request. After the request passes the check, the system returns an HTTP 2xx status code and directly performs the modification.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>The CIDR block of the VPC that you want to modify. Both primary and secondary CIDR blocks are supported.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10.0.0.0/8</p>
     */
    @NameInMap("OriginalCidrBlock")
    public String originalCidrBlock;

    /**
     * <p>The ID of the region where the VPC is deployed.</p>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/36063.html">DescribeRegions</a> operation to query the region ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The target CIDR block of the VPC after the modification.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10.0.0.0/16</p>
     */
    @NameInMap("TargetCidrBlock")
    public String targetCidrBlock;

    /**
     * <p>The ID of the VPC that you want to modify.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>vpc-bp1di7uewzmtvfuq8****</p>
     */
    @NameInMap("VpcId")
    public String vpcId;

    public static ModifyVpcCidrBlockRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyVpcCidrBlockRequest self = new ModifyVpcCidrBlockRequest();
        return TeaModel.build(map, self);
    }

    public ModifyVpcCidrBlockRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public ModifyVpcCidrBlockRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public ModifyVpcCidrBlockRequest setOriginalCidrBlock(String originalCidrBlock) {
        this.originalCidrBlock = originalCidrBlock;
        return this;
    }
    public String getOriginalCidrBlock() {
        return this.originalCidrBlock;
    }

    public ModifyVpcCidrBlockRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyVpcCidrBlockRequest setTargetCidrBlock(String targetCidrBlock) {
        this.targetCidrBlock = targetCidrBlock;
        return this;
    }
    public String getTargetCidrBlock() {
        return this.targetCidrBlock;
    }

    public ModifyVpcCidrBlockRequest setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

}
