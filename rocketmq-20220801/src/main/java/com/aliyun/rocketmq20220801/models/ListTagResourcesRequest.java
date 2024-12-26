// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rocketmq20220801.models;

import com.aliyun.tea.*;

public class ListTagResourcesRequest extends TeaModel {
    /**
     * <p>The position from which the next query starts.</p>
     * 
     * <strong>example:</strong>
     * <p>d09e2b63e1b12d905b7080ff70</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    /**
     * <p>Region ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("regionId")
    public String regionId;

    /**
     * <p>Resource group ID.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfmx7caj******</p>
     */
    @NameInMap("resourceGroupId")
    public String resourceGroupId;

    /**
     * <p>List of resource IDs, in JSON format.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;rmq-cn-pe334n08h08&quot;]</p>
     */
    @NameInMap("resourceId")
    public String resourceId;

    /**
     * <p>Resource type.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>instance</p>
     */
    @NameInMap("resourceType")
    public String resourceType;

    /**
     * <p>List of tags, in JSON format.</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;key&quot;: &quot;rmq-test&quot;, &quot;value&quot;: &quot;test&quot;}]</p>
     */
    @NameInMap("tag")
    public String tag;

    public static ListTagResourcesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListTagResourcesRequest self = new ListTagResourcesRequest();
        return TeaModel.build(map, self);
    }

    public ListTagResourcesRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListTagResourcesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListTagResourcesRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public ListTagResourcesRequest setResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }
    public String getResourceId() {
        return this.resourceId;
    }

    public ListTagResourcesRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public ListTagResourcesRequest setTag(String tag) {
        this.tag = tag;
        return this;
    }
    public String getTag() {
        return this.tag;
    }

}
