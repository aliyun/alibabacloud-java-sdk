// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class ListResourceExecutionStatusRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ExecutionId")
    public String executionId;

    @NameInMap("MaxResults")
    public Integer maxResults;

    @NameInMap("NextToken")
    public String nextToken;

    public static ListResourceExecutionStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        ListResourceExecutionStatusRequest self = new ListResourceExecutionStatusRequest();
        return TeaModel.build(map, self);
    }

    public ListResourceExecutionStatusRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListResourceExecutionStatusRequest setExecutionId(String executionId) {
        this.executionId = executionId;
        return this;
    }
    public String getExecutionId() {
        return this.executionId;
    }

    public ListResourceExecutionStatusRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListResourceExecutionStatusRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

}
