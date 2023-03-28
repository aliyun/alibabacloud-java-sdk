// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class CreateVpconnFromVbrRequest extends TeaModel {
    /**
     * <p>Specifies whether to only precheck the request. Valid values:</p>
     * <br>
     * <p>*   **true**: checks the API request. If the request passes the precheck, the operation is not performed. Check items include the request format, instance status, and whether the required parameters are specified. If the request fails the precheck, the system returns an error. If the request passes the precheck, the system returns the ID of the request.</p>
     * <p>*   **false** (default): sends the API request. If the request passes the precheck, the operation is performed.</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>Specifies the party that must pay for the shared Express Connect circuit. Valid values:</p>
     * <br>
     * <p>*   **PayByPhysicalConnectionOwner**: If you set the value to PayByPhysicalConnectionOwner, the Express Connect partner must pay for the shared Express Connect circuit.</p>
     * <p>*   **PayByVirtualPhysicalConnectionOwner**: If you set the value to PayByVirtualPhysicalConnectionOwner, the tenant must pay for the shared Express Connect circuit.</p>
     */
    @NameInMap("OrderMode")
    public String orderMode;

    /**
     * <p>The region ID of the shared Express Connect circuit.</p>
     * <br>
     * <p>You can call the [DescribeRegions](~~36063~~) operation to query the most recent region list.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <br>
     * <p>You can use the client to generate the value, but you must ensure that it is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length.</p>
     */
    @NameInMap("Token")
    public String token;

    /**
     * <p>The ID of the associated VBR.</p>
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
