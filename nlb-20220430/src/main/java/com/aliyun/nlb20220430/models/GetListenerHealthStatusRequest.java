// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nlb20220430.models;

import com.aliyun.tea.*;

public class GetListenerHealthStatusRequest extends TeaModel {
    /**
     * <p>The ID of the listener of the NLB instance.</p>
     */
    @NameInMap("ListenerId")
    public String listenerId;

    /**
     * <p>The number of entries to return on each page. Valid values: **1** to **100**. Default value: **20**.</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The token that is used for the next query. Valid values:</p>
     * <br>
     * <p>*   If this is your first query or no next query is to be sent, ignore this parameter.</p>
     * <p>*   If a next query is to be sent, set the parameter to the value of NextToken that is returned from the last call.</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The ID of the region where the NLB instance is deployed.</p>
     * <br>
     * <p>You can call the [DescribeRegions](~~443657~~) operation to query the most recent region list.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static GetListenerHealthStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        GetListenerHealthStatusRequest self = new GetListenerHealthStatusRequest();
        return TeaModel.build(map, self);
    }

    public GetListenerHealthStatusRequest setListenerId(String listenerId) {
        this.listenerId = listenerId;
        return this;
    }
    public String getListenerId() {
        return this.listenerId;
    }

    public GetListenerHealthStatusRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public GetListenerHealthStatusRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public GetListenerHealthStatusRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
