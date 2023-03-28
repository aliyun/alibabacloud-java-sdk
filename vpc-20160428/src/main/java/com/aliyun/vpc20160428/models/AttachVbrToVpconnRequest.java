// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class AttachVbrToVpconnRequest extends TeaModel {
    /**
     * <p>Specifies whether to precheck the request only. Valid values:</p>
     * <br>
     * <p>*   **true**: only prechecks the request but does not associate the VBR with the hosted connection. The system prechecks the request syntax, instance status, and whether the required parameters are specified. An error message is returned if the request fails to pass the precheck. If the request passes the precheck, the system returns the ID of the request.</p>
     * <p>*   **false** (default): sends the request. If the request passes the precheck, the VBR is associated with the hosted connection.</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>The region ID of the hosted connection.</p>
     * <br>
     * <p>You can call the [DescribeRegions](~~36063~~) operation to query the most recent region list.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <br>
     * <p>The client token must be unique among different requests. It can contain only ASCII characters and cannot exceed 64 characters in length.</p>
     */
    @NameInMap("Token")
    public String token;

    /**
     * <p>The ID of the VBR.</p>
     */
    @NameInMap("VbrId")
    public String vbrId;

    /**
     * <p>The ID of the hosted connection.</p>
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
