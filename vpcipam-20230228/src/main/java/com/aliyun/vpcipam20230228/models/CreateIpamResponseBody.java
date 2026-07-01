// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpcipam20230228.models;

import com.aliyun.tea.*;

public class CreateIpamResponseBody extends TeaModel {
    @NameInMap("DefaultResourceDiscoveryAssociationId")
    public String defaultResourceDiscoveryAssociationId;

    @NameInMap("DefaultResourceDiscoveryId")
    public String defaultResourceDiscoveryId;

    @NameInMap("IpamId")
    public String ipamId;

    @NameInMap("PrivateDefaultScopeId")
    public String privateDefaultScopeId;

    @NameInMap("PublicDefaultScopeId")
    public String publicDefaultScopeId;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResourceDiscoveryAssociationCount")
    public Integer resourceDiscoveryAssociationCount;

    public static CreateIpamResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateIpamResponseBody self = new CreateIpamResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateIpamResponseBody setDefaultResourceDiscoveryAssociationId(String defaultResourceDiscoveryAssociationId) {
        this.defaultResourceDiscoveryAssociationId = defaultResourceDiscoveryAssociationId;
        return this;
    }
    public String getDefaultResourceDiscoveryAssociationId() {
        return this.defaultResourceDiscoveryAssociationId;
    }

    public CreateIpamResponseBody setDefaultResourceDiscoveryId(String defaultResourceDiscoveryId) {
        this.defaultResourceDiscoveryId = defaultResourceDiscoveryId;
        return this;
    }
    public String getDefaultResourceDiscoveryId() {
        return this.defaultResourceDiscoveryId;
    }

    public CreateIpamResponseBody setIpamId(String ipamId) {
        this.ipamId = ipamId;
        return this;
    }
    public String getIpamId() {
        return this.ipamId;
    }

    public CreateIpamResponseBody setPrivateDefaultScopeId(String privateDefaultScopeId) {
        this.privateDefaultScopeId = privateDefaultScopeId;
        return this;
    }
    public String getPrivateDefaultScopeId() {
        return this.privateDefaultScopeId;
    }

    public CreateIpamResponseBody setPublicDefaultScopeId(String publicDefaultScopeId) {
        this.publicDefaultScopeId = publicDefaultScopeId;
        return this;
    }
    public String getPublicDefaultScopeId() {
        return this.publicDefaultScopeId;
    }

    public CreateIpamResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateIpamResponseBody setResourceDiscoveryAssociationCount(Integer resourceDiscoveryAssociationCount) {
        this.resourceDiscoveryAssociationCount = resourceDiscoveryAssociationCount;
        return this;
    }
    public Integer getResourceDiscoveryAssociationCount() {
        return this.resourceDiscoveryAssociationCount;
    }

}
