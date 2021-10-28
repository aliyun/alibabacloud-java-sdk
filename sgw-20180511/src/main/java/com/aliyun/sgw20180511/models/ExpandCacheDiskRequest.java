// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sgw20180511.models;

import com.aliyun.tea.*;

public class ExpandCacheDiskRequest extends TeaModel {
    @NameInMap("GatewayId")
    public String gatewayId;

    @NameInMap("LocalFilePath")
    public String localFilePath;

    @NameInMap("NewSizeInGB")
    public Integer newSizeInGB;

    @NameInMap("SecurityToken")
    public String securityToken;

    public static ExpandCacheDiskRequest build(java.util.Map<String, ?> map) throws Exception {
        ExpandCacheDiskRequest self = new ExpandCacheDiskRequest();
        return TeaModel.build(map, self);
    }

    public ExpandCacheDiskRequest setGatewayId(String gatewayId) {
        this.gatewayId = gatewayId;
        return this;
    }
    public String getGatewayId() {
        return this.gatewayId;
    }

    public ExpandCacheDiskRequest setLocalFilePath(String localFilePath) {
        this.localFilePath = localFilePath;
        return this;
    }
    public String getLocalFilePath() {
        return this.localFilePath;
    }

    public ExpandCacheDiskRequest setNewSizeInGB(Integer newSizeInGB) {
        this.newSizeInGB = newSizeInGB;
        return this;
    }
    public Integer getNewSizeInGB() {
        return this.newSizeInGB;
    }

    public ExpandCacheDiskRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

}
