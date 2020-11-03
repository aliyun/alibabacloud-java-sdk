// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.uisplus20200707.models;

import com.aliyun.tea.*;

public class DeleteVnetRequest extends TeaModel {
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("UisId")
    @Validation(required = true)
    public String uisId;

    @NameInMap("VnetId")
    @Validation(required = true)
    public String vnetId;

    public static DeleteVnetRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteVnetRequest self = new DeleteVnetRequest();
        return TeaModel.build(map, self);
    }

    public DeleteVnetRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public DeleteVnetRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DeleteVnetRequest setUisId(String uisId) {
        this.uisId = uisId;
        return this;
    }
    public String getUisId() {
        return this.uisId;
    }

    public DeleteVnetRequest setVnetId(String vnetId) {
        this.vnetId = vnetId;
        return this;
    }
    public String getVnetId() {
        return this.vnetId;
    }

}
