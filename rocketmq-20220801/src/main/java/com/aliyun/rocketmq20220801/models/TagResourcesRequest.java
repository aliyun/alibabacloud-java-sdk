// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rocketmq20220801.models;

import com.aliyun.tea.*;

public class TagResourcesRequest extends TeaModel {
    /**
     * <p>The region ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("regionId")
    public String regionId;

    /**
     * <p>The resource IDs, in the JSON format.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>rmq-cn-pe3355cs707</p>
     */
    @NameInMap("resourceId")
    public String resourceId;

    /**
     * <p>The type of resource.</p>
     * <p>Set this parameter to <strong>instance</strong>. The value of this parameter cannot be changed.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>instance</p>
     */
    @NameInMap("resourceType")
    public String resourceType;

    /**
     * <p>tag, in JSON format.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;key&quot;: &quot;rmq-test&quot;, &quot;value&quot;: &quot;test&quot;}]</p>
     */
    @NameInMap("tag")
    public String tag;

    public static TagResourcesRequest build(java.util.Map<String, ?> map) throws Exception {
        TagResourcesRequest self = new TagResourcesRequest();
        return TeaModel.build(map, self);
    }

    public TagResourcesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public TagResourcesRequest setResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }
    public String getResourceId() {
        return this.resourceId;
    }

    public TagResourcesRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public TagResourcesRequest setTag(String tag) {
        this.tag = tag;
        return this;
    }
    public String getTag() {
        return this.tag;
    }

}
