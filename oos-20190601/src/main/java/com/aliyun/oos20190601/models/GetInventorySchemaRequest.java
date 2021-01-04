// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class GetInventorySchemaRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("Aggregator")
    public Boolean aggregator;

    @NameInMap("TypeName")
    public String typeName;

    @NameInMap("MaxResults")
    public Integer maxResults;

    @NameInMap("NextToken")
    public String nextToken;

    public static GetInventorySchemaRequest build(java.util.Map<String, ?> map) throws Exception {
        GetInventorySchemaRequest self = new GetInventorySchemaRequest();
        return TeaModel.build(map, self);
    }

    public GetInventorySchemaRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public GetInventorySchemaRequest setAggregator(Boolean aggregator) {
        this.aggregator = aggregator;
        return this;
    }
    public Boolean getAggregator() {
        return this.aggregator;
    }

    public GetInventorySchemaRequest setTypeName(String typeName) {
        this.typeName = typeName;
        return this;
    }
    public String getTypeName() {
        return this.typeName;
    }

    public GetInventorySchemaRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public GetInventorySchemaRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

}
