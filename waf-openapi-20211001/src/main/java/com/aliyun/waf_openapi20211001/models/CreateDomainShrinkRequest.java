// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class CreateDomainShrinkRequest extends TeaModel {
    @NameInMap("AccessType")
    public String accessType;

    @NameInMap("Domain")
    public String domain;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("Listen")
    public String listenShrink;

    @NameInMap("Redirect")
    public String redirectShrink;

    @NameInMap("RegionId")
    public String regionId;

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

}
