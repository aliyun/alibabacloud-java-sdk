// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class ModifyDomainShrinkRequest extends TeaModel {
    /**
     * <p>The mode in which you want to add the domain name to WAF. Set the value to share.</p>
     * <br>
     * <p>*   **share:** adds the domain name to WAF in CNAME record mode. This is the default value.</p>
     */
    @NameInMap("AccessType")
    public String accessType;

    /**
     * <p>The domain name whose access configurations you want to modify.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Domain")
    public String domain;

    /**
     * <p>The ID of the WAF instance.</p>
     * <br>
     * <p>>  You can call the [DescribeInstance](https://help.aliyun.com/document_detail/433756.html) operation to obtain the ID of the WAF instance.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The configurations of the listeners.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Listen")
    public String listenShrink;

    /**
     * <p>The configurations of the forwarding rule.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Redirect")
    public String redirectShrink;

    /**
     * <p>The region where the WAF instance resides. Valid values:</p>
     * <br>
     * <p>*   **cn-hangzhou:** the Chinese mainland.</p>
     * <p>*   **ap-southeast-1:** outside the Chinese mainland.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static ModifyDomainShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyDomainShrinkRequest self = new ModifyDomainShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ModifyDomainShrinkRequest setAccessType(String accessType) {
        this.accessType = accessType;
        return this;
    }
    public String getAccessType() {
        return this.accessType;
    }

    public ModifyDomainShrinkRequest setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

    public ModifyDomainShrinkRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ModifyDomainShrinkRequest setListenShrink(String listenShrink) {
        this.listenShrink = listenShrink;
        return this;
    }
    public String getListenShrink() {
        return this.listenShrink;
    }

    public ModifyDomainShrinkRequest setRedirectShrink(String redirectShrink) {
        this.redirectShrink = redirectShrink;
        return this;
    }
    public String getRedirectShrink() {
        return this.redirectShrink;
    }

    public ModifyDomainShrinkRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
