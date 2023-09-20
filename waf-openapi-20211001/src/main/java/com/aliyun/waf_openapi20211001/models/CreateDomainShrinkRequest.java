// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class CreateDomainShrinkRequest extends TeaModel {
    /**
     * <p>The mode in which you want to add the domain name to WAF. Valid values:</p>
     * <br>
     * <p>*   **share:** adds the domain name to WAF in CNAME record mode. This is the default value.</p>
     * <p>*   **hybrid_cloud_cname:** adds the domain name to WAF in hybrid cloud reverse proxy mode.</p>
     */
    @NameInMap("AccessType")
    public String accessType;

    /**
     * <p>The domain name that you want to add to WAF.</p>
     */
    @NameInMap("Domain")
    public String domain;

    /**
     * <p>The ID of the Web Application Firewall (WAF) instance.</p>
     * <br>
     * <p>> You can call the [DescribeInstance](~~433756~~) operation to obtain the ID of the WAF instance.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The configurations of the listeners.</p>
     */
    @NameInMap("Listen")
    public String listenShrink;

    /**
     * <p>The configurations of the forwarding rule.</p>
     */
    @NameInMap("Redirect")
    public String redirectShrink;

    /**
     * <p>The region where the WAF instance resides. Valid values:</p>
     * <br>
     * <p>*   **cn-hangzhou**: the Chinese mainland</p>
     * <p>*   **ap-southeast-1**: outside the Chinese mainland</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the resource group.</p>
     */
    @NameInMap("ResourceManagerResourceGroupId")
    public String resourceManagerResourceGroupId;

    /**
     * <p>The source IP address of the request. You do not need to specify this parameter. It is automatically obtained by the system.</p>
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
