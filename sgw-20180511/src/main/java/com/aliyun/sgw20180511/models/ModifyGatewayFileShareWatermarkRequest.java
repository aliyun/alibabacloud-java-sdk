// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sgw20180511.models;

import com.aliyun.tea.*;

public class ModifyGatewayFileShareWatermarkRequest extends TeaModel {
    @NameInMap("GatewayId")
    public String gatewayId;

    @NameInMap("IndexId")
    public String indexId;

    @NameInMap("SecurityToken")
    public String securityToken;

    @NameInMap("Watermark")
    public Integer watermark;

    public static ModifyGatewayFileShareWatermarkRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyGatewayFileShareWatermarkRequest self = new ModifyGatewayFileShareWatermarkRequest();
        return TeaModel.build(map, self);
    }

    public ModifyGatewayFileShareWatermarkRequest setGatewayId(String gatewayId) {
        this.gatewayId = gatewayId;
        return this;
    }
    public String getGatewayId() {
        return this.gatewayId;
    }

    public ModifyGatewayFileShareWatermarkRequest setIndexId(String indexId) {
        this.indexId = indexId;
        return this;
    }
    public String getIndexId() {
        return this.indexId;
    }

    public ModifyGatewayFileShareWatermarkRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public ModifyGatewayFileShareWatermarkRequest setWatermark(Integer watermark) {
        this.watermark = watermark;
        return this;
    }
    public Integer getWatermark() {
        return this.watermark;
    }

}
