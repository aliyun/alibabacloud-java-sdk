// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpcipam20230228.models;

import com.aliyun.tea.*;

public class CreateIpamResponseBody extends TeaModel {
    /**
     * <p>The ID of the default resource discovery association.</p>
     * 
     * <strong>example:</strong>
     * <p>ipam-res-disco-assoc-jt5fac8twugdbbgip****</p>
     */
    @NameInMap("DefaultResourceDiscoveryAssociationId")
    public String defaultResourceDiscoveryAssociationId;

    /**
     * <p>The ID of the default resource discovery instance.</p>
     * 
     * <strong>example:</strong>
     * <p>ipam-res-disco-jt5f2af2u6nk2z321****</p>
     */
    @NameInMap("DefaultResourceDiscoveryId")
    public String defaultResourceDiscoveryId;

    /**
     * <p>The ID of the IPAM.</p>
     * 
     * <strong>example:</strong>
     * <p>ipam-ccxbnsbhew0d6t****</p>
     */
    @NameInMap("IpamId")
    public String ipamId;

    /**
     * <p>The default private scope created by the system after the IPAM is created.</p>
     * 
     * <strong>example:</strong>
     * <p>ipam-scope-8wiontzmiy6cg0****</p>
     */
    @NameInMap("PrivateDefaultScopeId")
    public String privateDefaultScopeId;

    /**
     * <p>The default public scope created by the system after the IPAM is created.</p>
     * 
     * <strong>example:</strong>
     * <p>ipam-scope-r5c5c7bmym1brc****</p>
     */
    @NameInMap("PublicDefaultScopeId")
    public String publicDefaultScopeId;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>0ED8D006-F706-4D23-88ED-E11ED39DCAC0</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The number of discovered resources.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
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
