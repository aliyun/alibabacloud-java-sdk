// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeIpAbroadCountryInfosRequest extends TeaModel {
    /**
     * <p>The overseas region to query. You can perform a fuzzy match by using the region ID or the region name in Chinese or English.</p>
     * 
     * <strong>example:</strong>
     * <p>US-CA</p>
     */
    @NameInMap("AbroadRegion")
    public String abroadRegion;

    /**
     * <p>The overseas country to query. You can perform a fuzzy match by using the country ID or the country name in Chinese or English.</p>
     * 
     * <strong>example:</strong>
     * <p>US</p>
     */
    @NameInMap("Country")
    public String country;

    /**
     * <p>Instance ID of the WAF instance.</p>
     * <blockquote>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/433756.html">DescribeInstance</a> operation to query instance ID of the WAF instance.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>waf_elasticity-cn-0xl*******005</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The language used for the country and region names in the response. Valid values:</p>
     * <ul>
     * <li><p><strong>en</strong> (<strong>default</strong>): English.</p>
     * </li>
     * <li><p><strong>cn</strong>: Simplified Chinese.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>en</p>
     */
    @NameInMap("Language")
    public String language;

    /**
     * <p>The number of entries to return on each page for a paging query. Valid values: 1 to 500. Default value: 20.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The paging token that is used to query the next page. Set the value to the <strong>NextToken</strong> value returned from the previous API call. You do not need to specify this parameter for the first call.</p>
     * 
     * <strong>example:</strong>
     * <p>caeba0bbb2be03f84eb48b699f0*****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The region where the WAF instance resides. Valid values:</p>
     * <ul>
     * <li><p><strong>cn-hangzhou</strong>: the Chinese mainland.</p>
     * </li>
     * <li><p><strong>ap-southeast-1</strong>: outside the Chinese mainland.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the Alibaba Cloud resource group.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-aekzwwk****cv5i</p>
     */
    @NameInMap("ResourceManagerResourceGroupId")
    public String resourceManagerResourceGroupId;

    public static DescribeIpAbroadCountryInfosRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeIpAbroadCountryInfosRequest self = new DescribeIpAbroadCountryInfosRequest();
        return TeaModel.build(map, self);
    }

    public DescribeIpAbroadCountryInfosRequest setAbroadRegion(String abroadRegion) {
        this.abroadRegion = abroadRegion;
        return this;
    }
    public String getAbroadRegion() {
        return this.abroadRegion;
    }

    public DescribeIpAbroadCountryInfosRequest setCountry(String country) {
        this.country = country;
        return this;
    }
    public String getCountry() {
        return this.country;
    }

    public DescribeIpAbroadCountryInfosRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeIpAbroadCountryInfosRequest setLanguage(String language) {
        this.language = language;
        return this;
    }
    public String getLanguage() {
        return this.language;
    }

    public DescribeIpAbroadCountryInfosRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public DescribeIpAbroadCountryInfosRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeIpAbroadCountryInfosRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeIpAbroadCountryInfosRequest setResourceManagerResourceGroupId(String resourceManagerResourceGroupId) {
        this.resourceManagerResourceGroupId = resourceManagerResourceGroupId;
        return this;
    }
    public String getResourceManagerResourceGroupId() {
        return this.resourceManagerResourceGroupId;
    }

}
