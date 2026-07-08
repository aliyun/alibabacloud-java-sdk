// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeApisecApiResourcesRequest extends TeaModel {
    /**
     * <p>The API operation.</p>
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
     * <li><strong>GET</strong>: GET request.</li>
     * <li><strong>POST</strong>: POST request.</li>
     * <li><strong>HEAD</strong>: HEAD request.</li>
     * <li><strong>PUT</strong>: PUT request.</li>
     * <li><strong>DELETE</strong>: DELETE request.</li>
     * <li><strong>CONNECT</strong>: CONNECT request.</li>
     * <li><strong>PATCH</strong>: PATCH request.</li>
     * <li><strong>OPTIONS</strong>: OPTIONS request.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>POST</p>
     */
    @NameInMap("ApiMethod")
    public String apiMethod;

    /**
     * <p>The status of the API. Valid values:</p>
     * <ul>
     * <li><strong>NewbornInterface</strong>: newly added.</li>
     * <li><strong>OfflineInterface</strong>: inactive.</li>
     * <li><strong>normal</strong>: normal.</li>
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
     * <p>You can call <a href="https://help.aliyun.com/document_detail/2859155.html">DescribeApisecRules</a> to obtain the supported business purposes.</p>
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
     * <li><strong>PublicAPI</strong>: public service.</li>
     * <li><strong>ThirdpartAPI</strong>: third-party collaboration.</li>
     * <li><strong>InternalAPI</strong>: internal office.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>innerAPI</p>
     */
    @NameInMap("ApiType")
    public String apiType;

    /**
     * <p>Specifies whether the API has an authentication field. Valid values:</p>
     * <ul>
     * <li><strong>0</strong>: has authentication.</li>
     * <li><strong>1</strong>: does not have authentication.</li>
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
     * <p>This parameter applies only to hybrid cloud scenarios. You can call <a href="https://help.aliyun.com/document_detail/2849376.html">DescribeHybridCloudClusters</a> to obtain hybrid cloud cluster information.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>740</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The end time of the query, in UNIX timestamp (UTC) format. Unit: seconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1683388800</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>Specifies whether the API is followed. Valid values:</p>
     * <ul>
     * <li><strong>1</strong>: followed.</li>
     * <li><strong>0</strong>: not followed.</li>
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
     * <p>You can call <a href="https://help.aliyun.com/document_detail/433756.html">DescribeInstance</a> to obtain the ID of the current WAF instance.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>waf_v2_public_cn-u***gr20j</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The domain name or IP address to which the API operation belongs.</p>
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
     * <p>loginApi</p>
     */
    @NameInMap("Note")
    public String note;

    /**
     * <p>The name of the field used for sorting. Valid values:</p>
     * <ul>
     * <li><strong>allCnt</strong>: total access volume in the last 30 days.</li>
     * <li><strong>botCnt</strong>: bot access volume in the last 30 days.</li>
     * <li><strong>crossBorderCnt</strong>: cross-border access volume in the last 30 days.</li>
     * <li><strong>abnormalNum</strong>: number of risks associated with the API.</li>
     * <li><strong>eventNum</strong>: number of events associated with the API.</li>
     * <li><strong>farthestTs</strong>: first discovery time.</li>
     * <li><strong>lastestTs</strong>: most recent access time.</li>
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
     * <li><strong>desc</strong>: descending order (default).</li>
     * <li><strong>asc</strong>: ascending order.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>desc</p>
     */
    @NameInMap("OrderWay")
    public String orderWay;

    /**
     * <p>The page number to return in a paging query. Default value: <strong>1</strong>, which indicates that the first page is returned.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Long pageNumber;

    /**
     * <p>The number of entries to return on each page in a paging query. Default value: <strong>10</strong>, which indicates that each page contains 10 entries.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

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
     * <p>The type of sensitive information in the request.</p>
     * <blockquote>
     * <p>You can call <a href="https://help.aliyun.com/document_detail/2859155.html">DescribeApisecRules</a> to obtain the supported sensitive information types.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1004,1005</p>
     */
    @NameInMap("RequestSensitiveType")
    public String requestSensitiveType;

    /**
     * <p>The Alibaba Cloud resource group ID.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfm***q</p>
     */
    @NameInMap("ResourceManagerResourceGroupId")
    public String resourceManagerResourceGroupId;

    /**
     * <p>The sensitivity level of the API. Valid values:</p>
     * <ul>
     * <li><strong>L1</strong>: high sensitivity.</li>
     * <li><strong>L2</strong>: medium sensitivity.</li>
     * <li><strong>L3</strong>: low sensitivity.</li>
     * <li><strong>N</strong>: not sensitive.</li>
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
     * <p>You can call <a href="https://help.aliyun.com/document_detail/2859155.html">DescribeApisecRules</a> to obtain the supported sensitive data types.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1004</p>
     */
    @NameInMap("SensitiveType")
    public String sensitiveType;

    /**
     * <p>The start time of the query, in UNIX timestamp (UTC) format. Unit: seconds.</p>
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
