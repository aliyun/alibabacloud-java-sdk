// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeApisecApiResourcesRequest extends TeaModel {
    /**
     * <p>The API.</p>
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
     * <p>The request method of the API. Valid values:</p>
     * <ul>
     * <li><strong>GET</strong></li>
     * <li><strong>POST</strong></li>
     * <li><strong>HEAD</strong></li>
     * <li><strong>PUT</strong></li>
     * <li><strong>DELETE</strong></li>
     * <li><strong>CONNECT</strong></li>
     * <li><strong>PATCH</strong></li>
     * <li><strong>OPTIONS</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>POST</p>
     */
    @NameInMap("ApiMethod")
    public String apiMethod;

    /**
     * <p>The API status. Valid values:</p>
     * <ul>
     * <li><strong>NewbornInterface</strong>: The API is newly added.</li>
     * <li><strong>OfflineInterface</strong>: The API is inactive.</li>
     * <li><strong>normal</strong>: The API is normal.</li>
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
     * <p> You can call the <a href="https://help.aliyun.com/document_detail/2859155.html">DescribeApisecRules</a> operation to query the business purposes of APIs.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>SendMail</p>
     */
    @NameInMap("ApiTag")
    public String apiTag;

    /**
     * <p>The service object. Valid values:</p>
     * <ul>
     * <li><strong>PublicAPI</strong>: public services</li>
     * <li><strong>ThirdpartAPI</strong>: cooperation with third-party partners</li>
     * <li><strong>InternalAPI</strong>: internal office</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>innerAPI</p>
     */
    @NameInMap("ApiType")
    public String apiType;

    /**
     * <p>Specifies whether authentication is required. Valid values:</p>
     * <ul>
     * <li><strong>0</strong>: Authentication is required.</li>
     * <li><strong>1</strong>: Authentication is not required.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("AuthFlag")
    public String authFlag;

    /**
     * <p>The ID of the hybrid cloud cluster.</p>
     * <blockquote>
     * <p> This parameter is available only in hybrid cloud scenarios. You can call the <a href="https://help.aliyun.com/document_detail/2849376.html">DescribeHybridCloudClusters</a> operation to query hybrid cloud clusters.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>740</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The end of the time range to query. This value is a UNIX timestamp in UTC. Unit: seconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1683388800</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>Specifies whether to follow the API. Valid values:</p>
     * <ul>
     * <li><strong>1</strong>: follows the API.</li>
     * <li><strong>0</strong>: does not follow the API.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("Follow")
    public Long follow;

    /**
     * <p>The ID of the Web Application Firewall (WAF) instance.</p>
     * <blockquote>
     * <p> You can call the <a href="https://help.aliyun.com/document_detail/433756.html">DescribeInstance</a> operation to query the ID of the WAF instance.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>waf_v2_public_cn-u***gr20j</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The domain name or IP address of the API.</p>
     * 
     * <strong>example:</strong>
     * <p>a.aliyun.com</p>
     */
    @NameInMap("MatchedHost")
    public String matchedHost;

    /**
     * <p>The remarks.</p>
     * 
     * <strong>example:</strong>
     * <p>API for logon</p>
     */
    @NameInMap("Note")
    public String note;

    /**
     * <p>The name of the sorting field. Valid values:</p>
     * <ul>
     * <li><strong>allCnt</strong>: the total number of calls to the API in the previous 30 days</li>
     * <li><strong>botCnt</strong>: the number of bot-initiated requests in the previous 30 days</li>
     * <li><strong>crossBorderCnt</strong>: the number of cross-border requests in the previous 30 days</li>
     * <li><strong>abnormalNum</strong>: the number of API-related risks</li>
     * <li><strong>eventNum</strong>: the number of API-related security events</li>
     * <li><strong>farthestTs</strong>: the time when the API was first detected</li>
     * <li><strong>lastestTs</strong>: the time of the most recent access to the API</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>allCnt</p>
     */
    @NameInMap("OrderKey")
    public String orderKey;

    /**
     * <p>The sorting method. Valid values:</p>
     * <ul>
     * <li><strong>desc</strong> (default): descending order</li>
     * <li><strong>asc</strong>: ascending order</li>
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
     * <p>The region ID of the WAF instance. Value:</p>
     * <ul>
     * <li><strong>cn-hangzhou</strong>: Chinese mainland.</li>
     * <li><strong>ap-southeast-1</strong>: outside the Chinese mainland.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The sensitive data type in the request.</p>
     * <blockquote>
     * <p> You can call the <a href="https://help.aliyun.com/document_detail/2859155.html">DescribeApisecRules</a> operation to query the supported sensitive data types.</p>
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
     * <li><strong>L1</strong>: high sensitivity</li>
     * <li><strong>L2</strong>: moderate sensitivity</li>
     * <li><strong>L3</strong>: low sensitivity</li>
     * <li><strong>N</strong>: non-sensitivity</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>L3</p>
     */
    @NameInMap("SensitiveLevel")
    public String sensitiveLevel;

    /**
     * <p>The sensitive data type in the response.</p>
     * <blockquote>
     * <p> You can call the <a href="https://help.aliyun.com/document_detail/2859155.html">DescribeApisecRules</a> operation to query the supported sensitive data types.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1004</p>
     */
    @NameInMap("SensitiveType")
    public String sensitiveType;

    /**
     * <p>The beginning of the time range to query. This value is a UNIX timestamp in UTC. Unit: seconds.</p>
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
