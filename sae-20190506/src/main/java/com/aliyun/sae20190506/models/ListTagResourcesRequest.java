// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class ListTagResourcesRequest extends TeaModel {
    /**
     * <p>A2RN</p>
     * 
     * <strong>example:</strong>
     * <p>A2RN</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>cn-beijing</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>[&quot;d42921c4-5433-4abd-8075-0e536f8b\<em>\</em>\<em>\</em>&quot;]</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;d42921c4-5433-4abd-8075-0e536f8b****&quot;]</p>
     */
    @NameInMap("ResourceIds")
    public String resourceIds;

    /**
     * <p>application</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>application</p>
     */
    @NameInMap("ResourceType")
    public String resourceType;

    /**
     * <p>[{&quot;key&quot;:&quot;k1&quot;,&quot;value&quot;:&quot;v1&quot;}]</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;key&quot;:&quot;k1&quot;,&quot;value&quot;:&quot;v1&quot;}]</p>
     */
    @NameInMap("Tags")
    public String tags;

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

    public ListTagResourcesRequest setResourceIds(String resourceIds) {
        this.resourceIds = resourceIds;
        return this;
    }
    public String getResourceIds() {
        return this.resourceIds;
    }

    public ListTagResourcesRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public ListTagResourcesRequest setTags(String tags) {
        this.tags = tags;
        return this;
    }
    public String getTags() {
        return this.tags;
    }

}
