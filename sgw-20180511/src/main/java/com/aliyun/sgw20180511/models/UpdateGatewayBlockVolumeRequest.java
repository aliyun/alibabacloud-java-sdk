// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sgw20180511.models;

import com.aliyun.tea.*;

public class UpdateGatewayBlockVolumeRequest extends TeaModel {
    @NameInMap("ChapEnabled")
    public Boolean chapEnabled;

    @NameInMap("ChapInPassword")
    public String chapInPassword;

    @NameInMap("ChapInUser")
    public String chapInUser;

    @NameInMap("GatewayId")
    public String gatewayId;

    @NameInMap("IndexId")
    public String indexId;

    @NameInMap("SecurityToken")
    public String securityToken;

    @NameInMap("Size")
    public Long size;

    public static UpdateGatewayBlockVolumeRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateGatewayBlockVolumeRequest self = new UpdateGatewayBlockVolumeRequest();
        return TeaModel.build(map, self);
    }

    public UpdateGatewayBlockVolumeRequest setChapEnabled(Boolean chapEnabled) {
        this.chapEnabled = chapEnabled;
        return this;
    }
    public Boolean getChapEnabled() {
        return this.chapEnabled;
    }

    public UpdateGatewayBlockVolumeRequest setChapInPassword(String chapInPassword) {
        this.chapInPassword = chapInPassword;
        return this;
    }
    public String getChapInPassword() {
        return this.chapInPassword;
    }

    public UpdateGatewayBlockVolumeRequest setChapInUser(String chapInUser) {
        this.chapInUser = chapInUser;
        return this;
    }
    public String getChapInUser() {
        return this.chapInUser;
    }

    public UpdateGatewayBlockVolumeRequest setGatewayId(String gatewayId) {
        this.gatewayId = gatewayId;
        return this;
    }
    public String getGatewayId() {
        return this.gatewayId;
    }

    public UpdateGatewayBlockVolumeRequest setIndexId(String indexId) {
        this.indexId = indexId;
        return this;
    }
    public String getIndexId() {
        return this.indexId;
    }

    public UpdateGatewayBlockVolumeRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public UpdateGatewayBlockVolumeRequest setSize(Long size) {
        this.size = size;
        return this;
    }
    public Long getSize() {
        return this.size;
    }

}
