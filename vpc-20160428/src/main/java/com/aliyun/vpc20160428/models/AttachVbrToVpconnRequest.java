// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class AttachVbrToVpconnRequest extends TeaModel {
    /**
     * <p>Specifies whether to perform a dry run. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: performs a dry run without associating the VBR instance with shared Express Connect circuits. The system checks whether the required parameters are specified, the request format is valid, and the instance status is correct. If the check fails, the corresponding error is returned. If the check passes, the request ID is returned.</li>
     * <li><strong>false</strong> (default): sends a normal request. After the check passes, the VBR instance is directly associated with shared Express Connect circuits.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>The region ID of the shared Express Connect circuits.</p>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/36063.html">DescribeRegions</a> operation to query region IDs.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <p>The client token must be unique among different requests. The maximum length is 64 ASCII characters.</p>
     * 
     * <strong>example:</strong>
     * <p>CBCE910E-D396-4944-8****</p>
     */
    @NameInMap("Token")
    public String token;

    /**
     * <p>The VBR instance ID.</p>
     * <blockquote>
     * <p>The ID of the VBR instance to be migrated. The VBR must currently be directly attached to an Express Connect circuit owned by the caller, and must be the same VBR specified in CreateVpconnFromVbr.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>vbr-bp133sn3nwjvu7twc****</p>
     */
    @NameInMap("VbrId")
    public String vbrId;

    /**
     * <p>The ID of the shared Express Connect circuits (VirtualPhysicalConnection) instance.</p>
     * <blockquote>
     * <p>The shared Express Connect circuits instance ID returned by CreateVpconnFromVbr. The instance must have been confirmed and accepted by the tenant (Confirmed) and be in the Enabled state.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pc-bp1mrgfbtmc9brre7****</p>
     */
    @NameInMap("VpconnId")
    public String vpconnId;

    public static AttachVbrToVpconnRequest build(java.util.Map<String, ?> map) throws Exception {
        AttachVbrToVpconnRequest self = new AttachVbrToVpconnRequest();
        return TeaModel.build(map, self);
    }

    public AttachVbrToVpconnRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public AttachVbrToVpconnRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public AttachVbrToVpconnRequest setToken(String token) {
        this.token = token;
        return this;
    }
    public String getToken() {
        return this.token;
    }

    public AttachVbrToVpconnRequest setVbrId(String vbrId) {
        this.vbrId = vbrId;
        return this;
    }
    public String getVbrId() {
        return this.vbrId;
    }

    public AttachVbrToVpconnRequest setVpconnId(String vpconnId) {
        this.vpconnId = vpconnId;
        return this;
    }
    public String getVpconnId() {
        return this.vpconnId;
    }

}
