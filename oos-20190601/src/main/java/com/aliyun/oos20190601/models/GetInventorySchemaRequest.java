// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class GetInventorySchemaRequest extends TeaModel {
    /**
     * <p>Specifies whether only to return a combination of specified properties.</p>
     * <br>
     * <p>Valid values:</p>
     * <br>
     * <p>*   true: only returns a combination of specified properties</p>
     * <p>*   false: returns all properties of the component</p>
     */
    @NameInMap("Aggregator")
    public Boolean aggregator;

    /**
     * <p>The number of entries to return on each page. Valid values: 1 to 100. Default value: 50.</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The token that is used to retrieve the next page of results.</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The ID of the region.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The name of the component. Valid values:</p>
     * <br>
     * <p>*   ACS:InstanceInformation</p>
     * <p>*   ACS:Application</p>
     * <p>*   ACS:File</p>
     * <p>*   ACS:Network</p>
     * <p>*   ACS:WindowsRole</p>
     * <p>*   ACS:Service</p>
     * <p>*   ACS:WindowsUpdate</p>
     * <p>*   ACS:WindowsRegistry</p>
     */
    @NameInMap("TypeName")
    public String typeName;

    public static GetInventorySchemaRequest build(java.util.Map<String, ?> map) throws Exception {
        GetInventorySchemaRequest self = new GetInventorySchemaRequest();
        return TeaModel.build(map, self);
    }

    public GetInventorySchemaRequest setAggregator(Boolean aggregator) {
        this.aggregator = aggregator;
        return this;
    }
    public Boolean getAggregator() {
        return this.aggregator;
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

    public GetInventorySchemaRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public GetInventorySchemaRequest setTypeName(String typeName) {
        this.typeName = typeName;
        return this;
    }
    public String getTypeName() {
        return this.typeName;
    }

}
