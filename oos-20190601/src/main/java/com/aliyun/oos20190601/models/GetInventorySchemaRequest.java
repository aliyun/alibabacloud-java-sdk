// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class GetInventorySchemaRequest extends TeaModel {
    /**
     * <p>Specifies whether to return only properties that support the aggregate feature in the configuration list. Valid values:</p>
     * <ul>
     * <li>true: only returns properties that support the aggregate feature in the configuration list.</li>
     * <li>false: returns all properties in the configuration list.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("Aggregator")
    public Boolean aggregator;

    /**
     * <p>The number of entries per page. Valid values: 1 to 100. Default value: 50.</p>
     * 
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>A pagination token. It can be used in the next request to retrieve a new page of results.</p>
     * 
     * <strong>example:</strong>
     * <p>gAAAAABfh8MVLQI9AuKGACLgjbsXbWs-Mna47IDM6tr6wK7TZ1</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The configuration list type name. Valid values:</p>
     * <ul>
     * <li>ACS:InstanceInformation</li>
     * <li>ACS:Application</li>
     * <li>ACS:File</li>
     * <li>ACS:Network</li>
     * <li>ACS:WindowsRole</li>
     * <li>ACS:Service</li>
     * <li>ACS:WindowsUpdate</li>
     * <li>ACS:WindowsRegistry</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ACS:Application</p>
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
