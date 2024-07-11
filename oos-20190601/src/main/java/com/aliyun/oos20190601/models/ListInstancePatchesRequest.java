// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class ListInstancePatchesRequest extends TeaModel {
    /**
     * <p>The ID of the instance.</p>
     * 
     * <strong>example:</strong>
     * <p>i-bp1jaxa2bs4bps7*****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

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
     * <p>gAAAAABfTgv5ewUWmNdJ3g7JVLvX70sPH90GZOVGC6KPDUL0FIIb</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The status of the patches that you want to query. If you do not set this parameter, patches are not filtered.</p>
     * 
     * <strong>example:</strong>
     * <p>Installed</p>
     */
    @NameInMap("PatchStatuses")
    public String patchStatuses;

    /**
     * <p>The ID of the region in which the instance whose patches you want to query resides.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static ListInstancePatchesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListInstancePatchesRequest self = new ListInstancePatchesRequest();
        return TeaModel.build(map, self);
    }

    public ListInstancePatchesRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListInstancePatchesRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListInstancePatchesRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListInstancePatchesRequest setPatchStatuses(String patchStatuses) {
        this.patchStatuses = patchStatuses;
        return this;
    }
    public String getPatchStatuses() {
        return this.patchStatuses;
    }

    public ListInstancePatchesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
