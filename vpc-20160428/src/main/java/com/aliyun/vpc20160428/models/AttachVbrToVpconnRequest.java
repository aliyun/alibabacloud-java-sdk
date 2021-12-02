// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class AttachVbrToVpconnRequest extends TeaModel {
    // DryRun
    @NameInMap("DryRun")
    public Boolean dryRun;

    @NameInMap("RegionId")
    public String regionId;

    // 幂等Token
    @NameInMap("Token")
    public String token;

    // 待迁移的vbr
    @NameInMap("VbrId")
    public String vbrId;

    // 迁移到目标vpconn
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
