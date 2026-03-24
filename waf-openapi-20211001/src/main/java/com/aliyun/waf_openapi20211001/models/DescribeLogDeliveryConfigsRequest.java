// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeLogDeliveryConfigsRequest extends TeaModel {
    /**
     * <p>The name of the log delivery configuration that you want to query. Fuzzy match is supported.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("DeliveryNameLike")
    public String deliveryNameLike;

    /**
     * <p>The type of the log delivery configuration that you want to query. Valid values:</p>
     * <ul>
     * <li><p><strong>syslog</strong>: Log delivery to a syslog server.</p>
     * </li>
     * <li><p><strong>kafka</strong>: Log delivery to a Kafka cluster.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>kafka</p>
     */
    @NameInMap("DeliveryType")
    public String deliveryType;

    /**
     * <p>The ID of the WAF instance.</p>
     * <blockquote>
     * <p>Call the <a href="https://help.aliyun.com/document_detail/433756.html">DescribeInstance</a> operation to query the ID of the WAF instance.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>waf-cn-zz11sr5****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The maximum number of entries per page. Valid values: 1 to 50. Default value: 20.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The pagination token that is used in the next request to retrieve a new page of results. Set this parameter to the value of <strong>NextToken</strong> returned in the previous call. You do not need to specify this parameter for the first request.</p>
     * 
     * <strong>example:</strong>
     * <p>AAAAAINZ+8pH1oQnusEu1tGAc8is</p>
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
     * <p>The ID of the Alibaba Cloud resource group to which the WAF instance belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfm***q</p>
     */
    @NameInMap("ResourceManagerResourceGroupId")
    public String resourceManagerResourceGroupId;

    public static DescribeLogDeliveryConfigsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeLogDeliveryConfigsRequest self = new DescribeLogDeliveryConfigsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeLogDeliveryConfigsRequest setDeliveryNameLike(String deliveryNameLike) {
        this.deliveryNameLike = deliveryNameLike;
        return this;
    }
    public String getDeliveryNameLike() {
        return this.deliveryNameLike;
    }

    public DescribeLogDeliveryConfigsRequest setDeliveryType(String deliveryType) {
        this.deliveryType = deliveryType;
        return this;
    }
    public String getDeliveryType() {
        return this.deliveryType;
    }

    public DescribeLogDeliveryConfigsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeLogDeliveryConfigsRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public DescribeLogDeliveryConfigsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeLogDeliveryConfigsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeLogDeliveryConfigsRequest setResourceManagerResourceGroupId(String resourceManagerResourceGroupId) {
        this.resourceManagerResourceGroupId = resourceManagerResourceGroupId;
        return this;
    }
    public String getResourceManagerResourceGroupId() {
        return this.resourceManagerResourceGroupId;
    }

}
