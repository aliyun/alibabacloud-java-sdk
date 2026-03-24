// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeApisecAbnormalsRequest extends TeaModel {
    /**
     * <p>The ID of the security risk.</p>
     * 
     * <strong>example:</strong>
     * <p>29c6401****99a2bad3943e26d8</p>
     */
    @NameInMap("AbnormalId")
    public String abnormalId;

    /**
     * <p>The severity level of the security risk. Valid values:</p>
     * <ul>
     * <li><p><strong>high</strong>: High.</p>
     * </li>
     * <li><p><strong>medium</strong>: Medium.</p>
     * </li>
     * <li><p><strong>low</strong>: Low.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>medium</p>
     */
    @NameInMap("AbnormalLevel")
    public String abnormalLevel;

    /**
     * <p>The type of the security risk.</p>
     * <blockquote>
     * <p>Call <a href="https://help.aliyun.com/document_detail/2859155.html">DescribeApisecRules</a> to query the supported risk types.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>LackOfSpeedLimit</p>
     */
    @NameInMap("AbnormalTag")
    public String abnormalTag;

    /**
     * <p>The path of the API that is associated with the security risk.</p>
     * 
     * <strong>example:</strong>
     * <p>/api/users/login</p>
     */
    @NameInMap("ApiFormat")
    public String apiFormat;

    /**
     * <p>The ID of the API that is associated with the security risk.</p>
     * 
     * <strong>example:</strong>
     * <p>bd9efb8ad******d9ca6</p>
     */
    @NameInMap("ApiId")
    public String apiId;

    /**
     * <p>The business purpose of the API.</p>
     * <blockquote>
     * <p>Call <a href="https://help.aliyun.com/document_detail/2859155.html">DescribeApisecRules</a> to query the supported business purposes.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>RegisterAPI</p>
     */
    @NameInMap("ApiTag")
    public String apiTag;

    /**
     * <p>The ID of the hybrid cloud WAF cluster.</p>
     * <blockquote>
     * <p>This parameter is required only for hybrid cloud scenarios. Call <a href="https://help.aliyun.com/document_detail/2849376.html">DescribeHybridCloudClusters</a> to query the IDs of hybrid cloud WAF clusters.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>546</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The end of the time range to query. The value is a UNIX timestamp. Unit: seconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1684382100</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The ID of the WAF instance.</p>
     * <blockquote>
     * <p>Call <a href="https://help.aliyun.com/document_detail/433756.html">DescribeInstance</a> to query the ID of the WAF instance.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>waf_v2_public_cn-z***9g301</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The domain name or IP address that the API resides on.</p>
     * 
     * <strong>example:</strong>
     * <p>a.aliyun.com</p>
     */
    @NameInMap("MatchedHost")
    public String matchedHost;

    /**
     * <p>The field by which the query results are sorted. Valid values:</p>
     * <ul>
     * <li><p><strong>discoverTime</strong> (default): The time when the risk was first detected.</p>
     * </li>
     * <li><p><strong>abnormalLevel</strong>: The risk level.</p>
     * </li>
     * <li><p><strong>latestDiscoverTime</strong>: The most recent time when the risk was detected.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>firstTime</p>
     */
    @NameInMap("OrderKey")
    public String orderKey;

    /**
     * <p>The sorting order. Valid values:</p>
     * <ul>
     * <li><p><strong>desc</strong> (default): Descending order.</p>
     * </li>
     * <li><p><strong>asc</strong>: Ascending order.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>desc</p>
     */
    @NameInMap("OrderWay")
    public String orderWay;

    /**
     * <p>The source of the risk detection rule. Valid values:</p>
     * <ul>
     * <li><p><strong>custom</strong>: Custom rule.</p>
     * </li>
     * <li><p><strong>default</strong>: Built-in rule.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>custom</p>
     */
    @NameInMap("Origin")
    public String origin;

    /**
     * <p>The page number of the returned page. Default value: <strong>1</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("PageNumber")
    public Long pageNumber;

    /**
     * <p>The number of entries per page. Default value: <strong>10</strong>. Maximum value: 100.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <p>The region in which the WAF instance resides. Valid values:</p>
     * <ul>
     * <li><p><strong>cn-hangzhou</strong>: Chinese mainland.</p>
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
     * <p>The ID of the resource group.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfm***q</p>
     */
    @NameInMap("ResourceManagerResourceGroupId")
    public String resourceManagerResourceGroupId;

    /**
     * <p>The start of the time range to query. The value is a UNIX timestamp. Unit: seconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1684252800</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>The handling status of the security risk. Valid values:</p>
     * <ul>
     * <li><p><strong>toBeConfirmed</strong>: To be confirmed.</p>
     * </li>
     * <li><p><strong>confirmed</strong>: Confirmed.</p>
     * </li>
     * <li><p><strong>toBeFixed</strong>: To be fixed.</p>
     * </li>
     * <li><p><strong>fixed</strong>: Fixed (manually verified).</p>
     * </li>
     * <li><p><strong>ignored</strong>: Ignored.</p>
     * </li>
     * <li><p><strong>toBeVerified</strong>: To be verified by the system.</p>
     * </li>
     * <li><p><strong>notFixed</strong>: Verification failed.</p>
     * </li>
     * <li><p><strong>systemFixed</strong>: Fixed (verified by the system).</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Confirmed</p>
     */
    @NameInMap("UserStatus")
    public String userStatus;

    public static DescribeApisecAbnormalsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeApisecAbnormalsRequest self = new DescribeApisecAbnormalsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeApisecAbnormalsRequest setAbnormalId(String abnormalId) {
        this.abnormalId = abnormalId;
        return this;
    }
    public String getAbnormalId() {
        return this.abnormalId;
    }

    public DescribeApisecAbnormalsRequest setAbnormalLevel(String abnormalLevel) {
        this.abnormalLevel = abnormalLevel;
        return this;
    }
    public String getAbnormalLevel() {
        return this.abnormalLevel;
    }

    public DescribeApisecAbnormalsRequest setAbnormalTag(String abnormalTag) {
        this.abnormalTag = abnormalTag;
        return this;
    }
    public String getAbnormalTag() {
        return this.abnormalTag;
    }

    public DescribeApisecAbnormalsRequest setApiFormat(String apiFormat) {
        this.apiFormat = apiFormat;
        return this;
    }
    public String getApiFormat() {
        return this.apiFormat;
    }

    public DescribeApisecAbnormalsRequest setApiId(String apiId) {
        this.apiId = apiId;
        return this;
    }
    public String getApiId() {
        return this.apiId;
    }

    public DescribeApisecAbnormalsRequest setApiTag(String apiTag) {
        this.apiTag = apiTag;
        return this;
    }
    public String getApiTag() {
        return this.apiTag;
    }

    public DescribeApisecAbnormalsRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public DescribeApisecAbnormalsRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeApisecAbnormalsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeApisecAbnormalsRequest setMatchedHost(String matchedHost) {
        this.matchedHost = matchedHost;
        return this;
    }
    public String getMatchedHost() {
        return this.matchedHost;
    }

    public DescribeApisecAbnormalsRequest setOrderKey(String orderKey) {
        this.orderKey = orderKey;
        return this;
    }
    public String getOrderKey() {
        return this.orderKey;
    }

    public DescribeApisecAbnormalsRequest setOrderWay(String orderWay) {
        this.orderWay = orderWay;
        return this;
    }
    public String getOrderWay() {
        return this.orderWay;
    }

    public DescribeApisecAbnormalsRequest setOrigin(String origin) {
        this.origin = origin;
        return this;
    }
    public String getOrigin() {
        return this.origin;
    }

    public DescribeApisecAbnormalsRequest setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public DescribeApisecAbnormalsRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public DescribeApisecAbnormalsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeApisecAbnormalsRequest setResourceManagerResourceGroupId(String resourceManagerResourceGroupId) {
        this.resourceManagerResourceGroupId = resourceManagerResourceGroupId;
        return this;
    }
    public String getResourceManagerResourceGroupId() {
        return this.resourceManagerResourceGroupId;
    }

    public DescribeApisecAbnormalsRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public DescribeApisecAbnormalsRequest setUserStatus(String userStatus) {
        this.userStatus = userStatus;
        return this;
    }
    public String getUserStatus() {
        return this.userStatus;
    }

}
