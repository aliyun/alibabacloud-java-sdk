// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class CreateDomainShrinkRequest extends TeaModel {
    /**
     * <p>$.parameters[3].schema.properties.ExclusiveIp.description</p>
     */
    @NameInMap("AccessType")
    public String accessType;

    /**
     * <p>$.parameters[3].schema.properties.Http2Enabled.description</p>
     */
    @NameInMap("Domain")
    public String domain;

    /**
     * <p>$.parameters[3].schema.properties.HttpPorts.enumValueTitles</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>$.parameters[3].schema.properties.Http2Enabled.example</p>
     */
    @NameInMap("Listen")
    public String listenShrink;

    /**
     * <p>$.parameters[3].schema.properties.CustomCiphers.enumValueTitles</p>
     */
    @NameInMap("Redirect")
    public String redirectShrink;

    /**
     * <p>$.parameters[3].schema.properties.ProtectionResource.enumValueTitles</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceManagerResourceGroupId")
    public String resourceManagerResourceGroupId;

    /**
     * <p>$.parameters[3].schema.properties.ExclusiveIp.example</p>
     */
    @NameInMap("SourceIp")
    public String sourceIp;

    public static CreateDomainShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDomainShrinkRequest self = new CreateDomainShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateDomainShrinkRequest setAccessType(String accessType) {
        this.accessType = accessType;
        return this;
    }
    public String getAccessType() {
        return this.accessType;
    }

    public CreateDomainShrinkRequest setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

    public CreateDomainShrinkRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateDomainShrinkRequest setListenShrink(String listenShrink) {
        this.listenShrink = listenShrink;
        return this;
    }
    public String getListenShrink() {
        return this.listenShrink;
    }

    public CreateDomainShrinkRequest setRedirectShrink(String redirectShrink) {
        this.redirectShrink = redirectShrink;
        return this;
    }
    public String getRedirectShrink() {
        return this.redirectShrink;
    }

    public CreateDomainShrinkRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateDomainShrinkRequest setResourceManagerResourceGroupId(String resourceManagerResourceGroupId) {
        this.resourceManagerResourceGroupId = resourceManagerResourceGroupId;
        return this;
    }
    public String getResourceManagerResourceGroupId() {
        return this.resourceManagerResourceGroupId;
    }

    public CreateDomainShrinkRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

}
