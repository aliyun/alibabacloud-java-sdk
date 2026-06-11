// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.privatelink20200415.models;

import com.aliyun.tea.*;

public class ListVpcEndpointZonesRequest extends TeaModel {
    /**
     * <p>The ID of the endpoint.</p>
     * <p>After you specify the endpoint ID, the system queries the zones of the endpoint.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ep-hp33b2e43fays7s8****</p>
     */
    @NameInMap("EndpointId")
    public String endpointId;

    /**
     * <p>The number of entries to return on each page. Valid values: <strong>1</strong> to <strong>1000</strong>. Default value: <strong>50</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The token that is used to retrieve the next page of results. Valid values:</p>
     * <ul>
     * <li><p>If this is your first query, you do not need to specify this parameter.</p>
     * </li>
     * <li><p>If a next page exists, set the value to the <strong>NextToken</strong> value that is returned from the previous call.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>caeba0bbb2be03f84eb48b699f0a4883</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The ID of the region.</p>
     * <p>Call the <a href="https://help.aliyun.com/document_detail/120468.html">DescribeRegions</a> operation to obtain the region ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-huhehaote</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static ListVpcEndpointZonesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListVpcEndpointZonesRequest self = new ListVpcEndpointZonesRequest();
        return TeaModel.build(map, self);
    }

    public ListVpcEndpointZonesRequest setEndpointId(String endpointId) {
        this.endpointId = endpointId;
        return this;
    }
    public String getEndpointId() {
        return this.endpointId;
    }

    public ListVpcEndpointZonesRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListVpcEndpointZonesRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListVpcEndpointZonesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
