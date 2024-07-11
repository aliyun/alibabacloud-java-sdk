// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class ListInstancePatchStatesRequest extends TeaModel {
    /**
     * <p>The ID of the Elastic Compute Service (ECS) instance. The value can be a JSON array that consists of up to 100 instance IDs. Separate the instance IDs with commas (,).</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;i-bp1jaxa2bs4bps7*****&quot;, &quot;i-bp67acfmxazb4p****&quot;, … &quot;i-bp67acfmxazb4p****&quot;]</p>
     */
    @NameInMap("InstanceIds")
    public String instanceIds;

    /**
     * <p>The number of entries to return on each page.</p>
     * 
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The token that is used to retrieve the next page of results.</p>
     * 
     * <strong>example:</strong>
     * <ul>
     * <li></li>
     * </ul>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The ID of the region in which the instance whose patches you want to query resides.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static ListInstancePatchStatesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListInstancePatchStatesRequest self = new ListInstancePatchStatesRequest();
        return TeaModel.build(map, self);
    }

    public ListInstancePatchStatesRequest setInstanceIds(String instanceIds) {
        this.instanceIds = instanceIds;
        return this;
    }
    public String getInstanceIds() {
        return this.instanceIds;
    }

    public ListInstancePatchStatesRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListInstancePatchStatesRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListInstancePatchStatesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
