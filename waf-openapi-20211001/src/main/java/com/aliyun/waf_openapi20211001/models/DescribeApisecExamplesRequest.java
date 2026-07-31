// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeApisecExamplesRequest extends TeaModel {
    /**
     * <p>The risk type.</p>
     * 
     * <strong>example:</strong>
     * <p>LackOfSpeedLimit</p>
     */
    @NameInMap("AbnormalTag")
    public String abnormalTag;

    /**
     * <p>The ID of the API.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>867ade***24ee6e205b8da82b8f84</p>
     */
    @NameInMap("ApiId")
    public String apiId;

    /**
     * <p>The ID of the hybrid cloud cluster.</p>
     * <blockquote>
     * <p>This parameter applies only to hybrid cloud scenarios. You can call the <a href="https://help.aliyun.com/document_detail/2849376.html">DescribeHybridCloudClusters</a> operation to query hybrid cloud cluster information.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>176</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The type of the sample.</p>
     * 
     * <strong>example:</strong>
     * <p>sensitive</p>
     */
    @NameInMap("ExampleType")
    public String exampleType;

    /**
     * <p>Instance ID of the WAF instance.</p>
     * <blockquote>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/433756.html">DescribeInstance</a> operation to query instance ID of the WAF instance.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>waf_elasticity-cn-0xldbqtm005</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The number of entries per page in a paged query. Valid values: 1 to 5. Default value: 5. This parameter is used for paging.</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The pagination token.</p>
     * 
     * <strong>example:</strong>
     * <p>AAAAAGBgV9tolsLfijC4wam2htS*****D/46H3X2wIS</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The region where the WAF instance is deployed. Valid values:</p>
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
     * <p>The list of request sensitive information types.</p>
     */
    @NameInMap("RequestSensitiveTypeList")
    public java.util.List<String> requestSensitiveTypeList;

    /**
     * <p>The ID of the Alibaba Cloud resource group.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfm***q</p>
     */
    @NameInMap("ResourceManagerResourceGroupId")
    public String resourceManagerResourceGroupId;

    /**
     * <p>The list of response sensitive information types.</p>
     */
    @NameInMap("ResponseSensitiveTypeList")
    public java.util.List<String> responseSensitiveTypeList;

    public static DescribeApisecExamplesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeApisecExamplesRequest self = new DescribeApisecExamplesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeApisecExamplesRequest setAbnormalTag(String abnormalTag) {
        this.abnormalTag = abnormalTag;
        return this;
    }
    public String getAbnormalTag() {
        return this.abnormalTag;
    }

    public DescribeApisecExamplesRequest setApiId(String apiId) {
        this.apiId = apiId;
        return this;
    }
    public String getApiId() {
        return this.apiId;
    }

    public DescribeApisecExamplesRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public DescribeApisecExamplesRequest setExampleType(String exampleType) {
        this.exampleType = exampleType;
        return this;
    }
    public String getExampleType() {
        return this.exampleType;
    }

    public DescribeApisecExamplesRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeApisecExamplesRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public DescribeApisecExamplesRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeApisecExamplesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeApisecExamplesRequest setRequestSensitiveTypeList(java.util.List<String> requestSensitiveTypeList) {
        this.requestSensitiveTypeList = requestSensitiveTypeList;
        return this;
    }
    public java.util.List<String> getRequestSensitiveTypeList() {
        return this.requestSensitiveTypeList;
    }

    public DescribeApisecExamplesRequest setResourceManagerResourceGroupId(String resourceManagerResourceGroupId) {
        this.resourceManagerResourceGroupId = resourceManagerResourceGroupId;
        return this;
    }
    public String getResourceManagerResourceGroupId() {
        return this.resourceManagerResourceGroupId;
    }

    public DescribeApisecExamplesRequest setResponseSensitiveTypeList(java.util.List<String> responseSensitiveTypeList) {
        this.responseSensitiveTypeList = responseSensitiveTypeList;
        return this;
    }
    public java.util.List<String> getResponseSensitiveTypeList() {
        return this.responseSensitiveTypeList;
    }

}
