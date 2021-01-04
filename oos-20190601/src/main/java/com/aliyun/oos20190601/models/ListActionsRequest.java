// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class ListActionsRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("OOSActionName")
    public String OOSActionName;

    @NameInMap("MaxResults")
    public Integer maxResults;

    @NameInMap("NextToken")
    public String nextToken;

    public static ListActionsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListActionsRequest self = new ListActionsRequest();
        return TeaModel.build(map, self);
    }

    public ListActionsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListActionsRequest setOOSActionName(String OOSActionName) {
        this.OOSActionName = OOSActionName;
        return this;
    }
    public String getOOSActionName() {
        return this.OOSActionName;
    }

    public ListActionsRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListActionsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

}
