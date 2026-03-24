// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeApisecApiResourcesRequest extends TeaModel {
    /**
     * <p>The API endpoint path used to filter the query results.</p>
     * 
     * <strong>example:</strong>
     * <p>/auth/login</p>
     */
    @NameInMap("ApiFormat")
    public String apiFormat;

    /**
     * <p>The ID of the API.</p>
     * 
     * <strong>example:</strong>
     * <p>867ade***24ee6e205b8da82b8f84</p>
     */
    @NameInMap("ApiId")
    public String apiId;

    /**
     * <p>The HTTP request method of the API. Valid values: <strong>GET</strong>, <strong>POST</strong>, <strong>HEAD</strong>, <strong>PUT</strong>, <strong>DELETE</strong>, <strong>CONNECT</strong>, <strong>PATCH</strong>, and <strong>OPTIONS</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>POST</p>
     */
    @NameInMap("ApiMethod")
    public String apiMethod;

    /**
     * <p>The lifecycle status of the API. Valid values:</p>
     * <ul>
     * <li><p><strong>NewbornInterface</strong>: newly discovered.</p>
     * </li>
     * <li><p><strong>OfflineInterface</strong>: inactive.</p>
     * </li>
     * <li><p><strong>normal</strong>: active.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>OfflineInterface</p>
     */
    @NameInMap("ApiStatus")
    public String apiStatus;

    /**
     * <p>The business purpose of the API.</p>
     * <blockquote>
     * <p>Call the <a href="https://help.aliyun.com/document_detail/2859155.html">DescribeApisecRules</a> operation to obtain the supported business purposes.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>SendMail</p>
     */
    @NameInMap("ApiTag")
    public String apiTag;

    /**
     * <p>The type of service that the API serves. Valid values:</p>
     * <ul>
     * <li><p><strong>PublicAPI</strong>: public-facing service.</p>
     * </li>
     * <li><p><strong>ThirdpartAPI</strong>: third-party service.</p>
     * </li>
     * <li><p><strong>InternalAPI</strong>: internal service.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>innerAPI</p>
     */
    @NameInMap("ApiType")
    public String apiType;

    /**
     * <p>Indicates whether the API requires authentication. Valid values:</p>
     * <ul>
     * <li><p><strong>0</strong>: The API requires authentication.</p>
     * </li>
     * <li><p><strong>1</strong>: The API does not require authentication.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("AuthFlag")
    public String authFlag;

    /**
     * <p>The ID of the Hybrid Cloud WAF cluster.</p>
     * <blockquote>
     * <p>This parameter is available only for hybrid cloud scenarios. Call the <a href="https://help.aliyun.com/document_detail/2849376.html">DescribeHybridCloudClusters</a> operation to obtain information about Hybrid Cloud WAF clusters.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>740</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The end of the time range to query. Specify a UNIX timestamp in seconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1683388800</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>Indicates whether the API is followed. Valid values:</p>
     * <ul>
     * <li><p><strong>1</strong>: The API is followed.</p>
     * </li>
     * <li><p><strong>0</strong>: The API is not followed.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("Follow")
    public Long follow;

    /**
     * <p>The ID of the WAF instance.</p>
     * <blockquote>
     * <p>Call the <a href="https://help.aliyun.com/document_detail/433756.html">DescribeInstance</a> operation to obtain the ID of the WAF instance.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>waf_v2_public_cn-u***gr20j</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The domain name or IP address of the API used to filter the query results.</p>
     * 
     * <strong>example:</strong>
     * <p>a.aliyun.com</p>
     */
    @NameInMap("MatchedHost")
    public String matchedHost;

    /**
     * <p>The remarks of the API asset used to filter the query results.</p>
     * 
     * <strong>example:</strong>
     * <p>loginApi</p>
     */
    @NameInMap("Note")
    public String note;

    /**
     * <p>The field by which to sort the results. Valid values:</p>
     * <ul>
     * <li><p><strong>allCnt</strong>: sorts by the total number of requests in the last 30 days.</p>
     * </li>
     * <li><p><strong>botCnt</strong>: sorts by the number of bot requests in the last 30 days.</p>
     * </li>
     * <li><p><strong>crossBorderCnt</strong>: sorts by the number of cross-border requests in the last 30 days.</p>
     * </li>
     * <li><p><strong>abnormalNum</strong>: sorts by the number of threats associated with the API.</p>
     * </li>
     * <li><p><strong>eventNum</strong>: sorts by the number of security events associated with the API.</p>
     * </li>
     * <li><p><strong>farthestTs</strong>: sorts by the time when the API was first discovered.</p>
     * </li>
     * <li><p><strong>lastestTs</strong>: sorts by the time of the most recent access.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>allCnt</p>
     */
    @NameInMap("OrderKey")
    public String orderKey;

    /**
     * <p>The sort order. Valid values:</p>
     * <ul>
     * <li><p><strong>desc</strong>: descending order (default).</p>
     * </li>
     * <li><p><strong>asc</strong>: ascending order.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>desc</p>
     */
    @NameInMap("OrderWay")
    public String orderWay;

    /**
     * <p>The page number. Default value: <strong>1</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Long pageNumber;

    /**
     * <p>The number of entries per page. Default value: <strong>10</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <p>The region ID of the WAF instance. Valid values:</p>
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
     * <p>The type of sensitive data in the request.</p>
     * <blockquote>
     * <p>Call the <a href="https://help.aliyun.com/document_detail/2859155.html">DescribeApisecRules</a> operation to obtain the supported sensitive data types.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1004,1005</p>
     */
    @NameInMap("RequestSensitiveType")
    public String requestSensitiveType;

    /**
     * <p>The ID of the Alibaba Cloud resource group.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfm***q</p>
     */
    @NameInMap("ResourceManagerResourceGroupId")
    public String resourceManagerResourceGroupId;

    /**
     * <p>The sensitivity level of the API. Valid values:</p>
     * <ul>
     * <li><p><strong>L1</strong>: High.</p>
     * </li>
     * <li><p><strong>L2</strong>: Medium.</p>
     * </li>
     * <li><p><strong>L3</strong>: Low.</p>
     * </li>
     * <li><p><strong>N</strong>: Non-sensitive.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>L3</p>
     */
    @NameInMap("SensitiveLevel")
    public String sensitiveLevel;

    /**
     * <p>The type of sensitive data in the response.</p>
     * <blockquote>
     * <p>Call the <a href="https://help.aliyun.com/document_detail/2859155.html">DescribeApisecRules</a> operation to obtain the supported sensitive data types.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1004</p>
     */
    @NameInMap("SensitiveType")
    public String sensitiveType;

    /**
     * <p>The beginning of the time range to query. Specify a UNIX timestamp in seconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1681833600</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    public static DescribeApisecApiResourcesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeApisecApiResourcesRequest self = new DescribeApisecApiResourcesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeApisecApiResourcesRequest setApiFormat(String apiFormat) {
        this.apiFormat = apiFormat;
        return this;
    }
    public String getApiFormat() {
        return this.apiFormat;
    }

    public DescribeApisecApiResourcesRequest setApiId(String apiId) {
        this.apiId = apiId;
        return this;
    }
    public String getApiId() {
        return this.apiId;
    }

    public DescribeApisecApiResourcesRequest setApiMethod(String apiMethod) {
        this.apiMethod = apiMethod;
        return this;
    }
    public String getApiMethod() {
        return this.apiMethod;
    }

    public DescribeApisecApiResourcesRequest setApiStatus(String apiStatus) {
        this.apiStatus = apiStatus;
        return this;
    }
    public String getApiStatus() {
        return this.apiStatus;
    }

    public DescribeApisecApiResourcesRequest setApiTag(String apiTag) {
        this.apiTag = apiTag;
        return this;
    }
    public String getApiTag() {
        return this.apiTag;
    }

    public DescribeApisecApiResourcesRequest setApiType(String apiType) {
        this.apiType = apiType;
        return this;
    }
    public String getApiType() {
        return this.apiType;
    }

    public DescribeApisecApiResourcesRequest setAuthFlag(String authFlag) {
        this.authFlag = authFlag;
        return this;
    }
    public String getAuthFlag() {
        return this.authFlag;
    }

    public DescribeApisecApiResourcesRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public DescribeApisecApiResourcesRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeApisecApiResourcesRequest setFollow(Long follow) {
        this.follow = follow;
        return this;
    }
    public Long getFollow() {
        return this.follow;
    }

    public DescribeApisecApiResourcesRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeApisecApiResourcesRequest setMatchedHost(String matchedHost) {
        this.matchedHost = matchedHost;
        return this;
    }
    public String getMatchedHost() {
        return this.matchedHost;
    }

    public DescribeApisecApiResourcesRequest setNote(String note) {
        this.note = note;
        return this;
    }
    public String getNote() {
        return this.note;
    }

    public DescribeApisecApiResourcesRequest setOrderKey(String orderKey) {
        this.orderKey = orderKey;
        return this;
    }
    public String getOrderKey() {
        return this.orderKey;
    }

    public DescribeApisecApiResourcesRequest setOrderWay(String orderWay) {
        this.orderWay = orderWay;
        return this;
    }
    public String getOrderWay() {
        return this.orderWay;
    }

    public DescribeApisecApiResourcesRequest setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public DescribeApisecApiResourcesRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public DescribeApisecApiResourcesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeApisecApiResourcesRequest setRequestSensitiveType(String requestSensitiveType) {
        this.requestSensitiveType = requestSensitiveType;
        return this;
    }
    public String getRequestSensitiveType() {
        return this.requestSensitiveType;
    }

    public DescribeApisecApiResourcesRequest setResourceManagerResourceGroupId(String resourceManagerResourceGroupId) {
        this.resourceManagerResourceGroupId = resourceManagerResourceGroupId;
        return this;
    }
    public String getResourceManagerResourceGroupId() {
        return this.resourceManagerResourceGroupId;
    }

    public DescribeApisecApiResourcesRequest setSensitiveLevel(String sensitiveLevel) {
        this.sensitiveLevel = sensitiveLevel;
        return this;
    }
    public String getSensitiveLevel() {
        return this.sensitiveLevel;
    }

    public DescribeApisecApiResourcesRequest setSensitiveType(String sensitiveType) {
        this.sensitiveType = sensitiveType;
        return this;
    }
    public String getSensitiveType() {
        return this.sensitiveType;
    }

    public DescribeApisecApiResourcesRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
