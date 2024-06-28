// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class CreateVpconnFromVbrRequest extends TeaModel {
    /**
     * <p>Specifies whether to perform only a dry run, without performing the actual request. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: performs only a dry run. The system checks the request for potential issues, including missing parameter values, incorrect request syntax, and instance status. If the request fails the dry run, an error message is returned. If the request passes the dry run, the system returns the ID of the request.</li>
     * <li><strong>false</strong> (default): performs a dry run and performs the actual request. If the request passes the dry run, a 2xx HTTP status code is returned and the operation is performed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>The payer for the shared Express Connect circuit. Valid values:</p>
     * <ul>
     * <li><strong>PayByPhysicalConnectionOwner</strong>: the owner of the shared Express Connect circuit</li>
     * <li><strong>PayByVirtualPhysicalConnectionOwner</strong>: the owner of the hosted connection</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>PayByVirtualPhysicalConnectionOwner</p>
     */
    @NameInMap("OrderMode")
    public String orderMode;

    /**
     * <p>The region ID of the hosted connection.</p>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/36063.html">DescribeRegions</a> operation to query the most recent region list.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <p>You can use the client to generate the value, but you must ensure that it is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>CBCE910E-D396-4944-8****</p>
     */
    @NameInMap("Token")
    public String token;

    /**
     * <p>The ID of the associated VBR.</p>
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
