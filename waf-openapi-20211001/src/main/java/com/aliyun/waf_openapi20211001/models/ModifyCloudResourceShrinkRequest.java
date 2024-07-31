// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class ModifyCloudResourceShrinkRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>waf_v3prepaid_public_cn-***</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Listen")
    public String listenShrink;

    @NameInMap("Redirect")
    public String redirectShrink;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <strong>example:</strong>
     * <p>rg-acfm***q</p>
     */
    @NameInMap("ResourceManagerResourceGroupId")
    public String resourceManagerResourceGroupId;

    public static ModifyCloudResourceShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyCloudResourceShrinkRequest self = new ModifyCloudResourceShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ModifyCloudResourceShrinkRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ModifyCloudResourceShrinkRequest setListenShrink(String listenShrink) {
        this.listenShrink = listenShrink;
        return this;
    }
    public String getListenShrink() {
        return this.listenShrink;
    }

    public ModifyCloudResourceShrinkRequest setRedirectShrink(String redirectShrink) {
        this.redirectShrink = redirectShrink;
        return this;
    }
    public String getRedirectShrink() {
        return this.redirectShrink;
    }

    public ModifyCloudResourceShrinkRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyCloudResourceShrinkRequest setResourceManagerResourceGroupId(String resourceManagerResourceGroupId) {
        this.resourceManagerResourceGroupId = resourceManagerResourceGroupId;
        return this;
    }
    public String getResourceManagerResourceGroupId() {
        return this.resourceManagerResourceGroupId;
    }

}
