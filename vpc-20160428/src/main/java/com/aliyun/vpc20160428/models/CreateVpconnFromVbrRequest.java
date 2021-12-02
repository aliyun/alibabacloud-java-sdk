// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class CreateVpconnFromVbrRequest extends TeaModel {
    // DryRun
    @NameInMap("DryRun")
    public Boolean dryRun;

    // vpconn的支付方
    @NameInMap("OrderMode")
    public String orderMode;

    @NameInMap("RegionId")
    public String regionId;

    // 幂等Token
    @NameInMap("Token")
    public String token;

    // 跨帐号的VBR
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
