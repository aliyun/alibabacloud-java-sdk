// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DeleteVodSpecificConfigRequest extends TeaModel {
    /**
     * <p>The ID of the configuration.</p>
     */
    @NameInMap("ConfigId")
    public String configId;

    /**
     * <p>The domain name for CDN.</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    @NameInMap("Env")
    public String env;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("SecurityToken")
    public String securityToken;

    public static DeleteVodSpecificConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteVodSpecificConfigRequest self = new DeleteVodSpecificConfigRequest();
        return TeaModel.build(map, self);
    }

    public DeleteVodSpecificConfigRequest setConfigId(String configId) {
        this.configId = configId;
        return this;
    }
    public String getConfigId() {
        return this.configId;
    }

    public DeleteVodSpecificConfigRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public DeleteVodSpecificConfigRequest setEnv(String env) {
        this.env = env;
        return this;
    }
    public String getEnv() {
        return this.env;
    }

    public DeleteVodSpecificConfigRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DeleteVodSpecificConfigRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

}
