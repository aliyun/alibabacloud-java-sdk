// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class CreateVpconnFromVbrRequest extends TeaModel {
    /**
     * <p>Specifies whether to perform a dry run. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: sends a check request without transforming the shared Express Connect circuits mode. The system checks the required parameters, request format, and instance status. If the check fails, the corresponding error is returned. If the check succeeds, the request ID is returned.</li>
     * <li><strong>false</strong> (default): sends a Normal request and transforms the shared Express Connect circuits mode after the check succeeds.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>The payer of the shared Express Connect circuits. Valid values:</p>
     * <ul>
     * <li><strong>PayByPhysicalConnectionOwner</strong>: The owner of the Express Connect circuit associated with the shared Express Connect circuits pays the fee.</li>
     * <li><strong>PayByVirtualPhysicalConnectionOwner</strong>: The owner of the shared Express Connect circuits pays the fee.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>PayByVirtualPhysicalConnectionOwner</p>
     */
    @NameInMap("OrderMode")
    public String orderMode;

    /**
     * <p>The region ID of the shared Express Connect circuits.</p>
     * <p>You can invoke the <a href="https://help.aliyun.com/document_detail/36063.html">DescribeRegions</a> operation to query the region ID.</p>
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
     * <p>The instance ID of the cross-account VBR.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>vbr-bp136flp1mf8mlq6r****</p>
     */
    @NameInMap("VbrId")
    public String vbrId;

    public static CreateVpconnFromVbrRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateVpconnFromVbrRequest self = new CreateVpconnFromVbrRequest();
        return TeaModel.build(map, self);
    }

    public CreateVpconnFromVbrRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public CreateVpconnFromVbrRequest setOrderMode(String orderMode) {
        this.orderMode = orderMode;
        return this;
    }
    public String getOrderMode() {
        return this.orderMode;
    }

    public CreateVpconnFromVbrRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateVpconnFromVbrRequest setToken(String token) {
        this.token = token;
        return this;
    }
    public String getToken() {
        return this.token;
    }

    public CreateVpconnFromVbrRequest setVbrId(String vbrId) {
        this.vbrId = vbrId;
        return this;
    }
    public String getVbrId() {
        return this.vbrId;
    }

}
