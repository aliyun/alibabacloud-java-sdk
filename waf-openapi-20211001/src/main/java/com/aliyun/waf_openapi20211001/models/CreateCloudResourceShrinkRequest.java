// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class CreateCloudResourceShrinkRequest extends TeaModel {
    /**
     * <p>The ID of the WAF instance.</p>
     * <blockquote>
     * <p> You can call the <a href="https://help.aliyun.com/document_detail/433756.html">DescribeInstance</a> operation to query the ID of the WAF instance.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>waf_v3prepaid_public_cn-***</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The configurations of the listeners.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Listen")
    public String listenShrink;

    /**
     * <p>The ID of the Alibaba Cloud account to which the resource belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>123</p>
     */
    @NameInMap("OwnerUserId")
    public String ownerUserId;

    /**
     * <p>The configurations of the forwarding rule.</p>
     */
    @NameInMap("Redirect")
    public String redirectShrink;

    /**
     * <p>The region in which the WAF instance is deployed. Valid values:</p>
     * <ul>
     * <li><strong>cn-hangzhou</strong>: the Chinese mainland.</li>
     * <li><strong>ap-southeast-1</strong>: outside the Chinese mainland.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the Alibaba Cloud resource group.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfm***q</p>
     */
    @NameInMap("ResourceManagerResourceGroupId")
    public String resourceManagerResourceGroupId;

    public static CreateCloudResourceShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateCloudResourceShrinkRequest self = new CreateCloudResourceShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateCloudResourceShrinkRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateCloudResourceShrinkRequest setListenShrink(String listenShrink) {
        this.listenShrink = listenShrink;
        return this;
    }
    public String getListenShrink() {
        return this.listenShrink;
    }

    public CreateCloudResourceShrinkRequest setOwnerUserId(String ownerUserId) {
        this.ownerUserId = ownerUserId;
        return this;
    }
    public String getOwnerUserId() {
        return this.ownerUserId;
    }

    public CreateCloudResourceShrinkRequest setRedirectShrink(String redirectShrink) {
        this.redirectShrink = redirectShrink;
        return this;
    }
    public String getRedirectShrink() {
        return this.redirectShrink;
    }

    public CreateCloudResourceShrinkRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateCloudResourceShrinkRequest setResourceManagerResourceGroupId(String resourceManagerResourceGroupId) {
        this.resourceManagerResourceGroupId = resourceManagerResourceGroupId;
        return this;
    }
    public String getResourceManagerResourceGroupId() {
        return this.resourceManagerResourceGroupId;
    }

}
