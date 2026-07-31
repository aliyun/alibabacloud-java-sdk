// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeApisecEventsRequest extends TeaModel {
    /**
     * <p>The account information.</p>
     * 
     * <strong>example:</strong>
     * <p>1818743389962696</p>
     */
    @NameInMap("Account")
    public String account;

    /**
     * <p>The API operation.</p>
     * 
     * <strong>example:</strong>
     * <p>/apisec/v1/***.php</p>
     */
    @NameInMap("ApiFormat")
    public String apiFormat;

    /**
     * <p>The ID of the API.</p>
     * 
     * <strong>example:</strong>
     * <p>820b860***6205da93b935b28</p>
     */
    @NameInMap("ApiId")
    public String apiId;

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
     * <p>The attack IP address.</p>
     * 
     * <strong>example:</strong>
     * <p>42.224.<em>.</em></p>
     */
    @NameInMap("AttackIp")
    public String attackIp;

    /**
     * <p>The hybrid cloud cluster ID.</p>
     * <blockquote>
     * <p>This parameter applies only to hybrid cloud scenarios. You can call <a href="https://help.aliyun.com/document_detail/2849376.html">DescribeHybridCloudClusters</a> to obtain hybrid cloud cluster information.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>428</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The end time of the query, in UNIX timestamp (UTC) format. Unit: seconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1683703260</p>
     */
    @NameInMap("EndTs")
    public Long endTs;

    /**
     * <p>The ID of the API security event.</p>
     * 
     * <strong>example:</strong>
     * <p>18ba94fea9***e66ba0557b7b91</p>
     */
    @NameInMap("EventId")
    public String eventId;

    /**
     * <p>The event level. Valid values:</p>
     * <ul>
     * <li><strong>high</strong>: High-risk.</li>
     * <li><strong>medium</strong>: Medium-risk.</li>
     * <li><strong>low</strong>: Low-risk.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>low</p>
     */
    @NameInMap("EventLevel")
    public String eventLevel;

    /**
     * <p>The dimension of the security event.</p>
     * 
     * <strong>example:</strong>
     * <p>ip</p>
     */
    @NameInMap("EventScope")
    public String eventScope;

    /**
     * <p>The event type.</p>
     * <blockquote>
     * <p>You can call <a href="https://help.aliyun.com/document_detail/2859155.html">DescribeApisecRules</a> to obtain the supported event types.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>ObtainSensitiveUnauthorized</p>
     */
    @NameInMap("EventTag")
    public String eventTag;

    /**
     * <p>The ID of the WAF instance.</p>
     * <blockquote>
     * <p>You can call <a href="https://help.aliyun.com/document_detail/433756.html">DescribeInstance</a> to obtain the ID of the current WAF instance.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>waf_v2_public_cn-5y***d31</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The domain name or IP address to which the API operation belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>a.***.com</p>
     */
    @NameInMap("MatchedHost")
    public String matchedHost;

    /**
     * <p>The name of the field used for sorting. Valid values:</p>
     * <ul>
     * <li><strong>allCnt</strong>: attack count.</li>
     * <li><strong>startTs</strong>: event start time.</li>
     * <li><strong>endTs</strong>: event end time.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>startTs</p>
     */
    @NameInMap("OrderKey")
    public String orderKey;

    /**
     * <p>The sort order. Valid values:</p>
     * <ul>
     * <li><strong>desc</strong>: Descending order (default).</li>
     * <li><strong>asc</strong>: Ascending order.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>desc</p>
     */
    @NameInMap("OrderWay")
    public String orderWay;

    /**
     * <p>The source of the event type. Valid values:</p>
     * <ul>
     * <li><strong>custom</strong>: Custom.</li>
     * <li><strong>default</strong>: Built-in.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>default</p>
     */
    @NameInMap("Origin")
    public String origin;

    /**
     * <p>The page number to return in a paged query. Default value: <strong>1</strong>, which indicates the first page.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Long pageNumber;

    /**
     * <p>The number of entries per page in a paged query. Default value: <strong>10</strong>, which indicates 10 entries per page.</p>
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
     * <p>The Alibaba Cloud resource group ID.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfm***q</p>
     */
    @NameInMap("ResourceManagerResourceGroupId")
    public String resourceManagerResourceGroupId;

    /**
     * <p>The start time of the query, in UNIX timestamp (UTC) format. Unit: seconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1683648000</p>
     */
    @NameInMap("StartTs")
    public Long startTs;

    /**
     * <p>The event status. Valid values:</p>
     * <ul>
     * <li><strong>toBeConfirmed</strong>: To be confirmed.</li>
     * <li><strong>confirmed</strong>: Confirmed.</li>
     * <li><strong>actioned</strong>: Handled.</li>
     * <li><strong>ignored</strong>: Ignored.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ignored</p>
     */
    @NameInMap("UserStatus")
    public String userStatus;

    public static DescribeApisecEventsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeApisecEventsRequest self = new DescribeApisecEventsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeApisecEventsRequest setAccount(String account) {
        this.account = account;
        return this;
    }
    public String getAccount() {
        return this.account;
    }

    public DescribeApisecEventsRequest setApiFormat(String apiFormat) {
        this.apiFormat = apiFormat;
        return this;
    }
    public String getApiFormat() {
        return this.apiFormat;
    }

    public DescribeApisecEventsRequest setApiId(String apiId) {
        this.apiId = apiId;
        return this;
    }
    public String getApiId() {
        return this.apiId;
    }

    public DescribeApisecEventsRequest setApiTag(String apiTag) {
        this.apiTag = apiTag;
        return this;
    }
    public String getApiTag() {
        return this.apiTag;
    }

    public DescribeApisecEventsRequest setAttackIp(String attackIp) {
        this.attackIp = attackIp;
        return this;
    }
    public String getAttackIp() {
        return this.attackIp;
    }

    public DescribeApisecEventsRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public DescribeApisecEventsRequest setEndTs(Long endTs) {
        this.endTs = endTs;
        return this;
    }
    public Long getEndTs() {
        return this.endTs;
    }

    public DescribeApisecEventsRequest setEventId(String eventId) {
        this.eventId = eventId;
        return this;
    }
    public String getEventId() {
        return this.eventId;
    }

    public DescribeApisecEventsRequest setEventLevel(String eventLevel) {
        this.eventLevel = eventLevel;
        return this;
    }
    public String getEventLevel() {
        return this.eventLevel;
    }

    public DescribeApisecEventsRequest setEventScope(String eventScope) {
        this.eventScope = eventScope;
        return this;
    }
    public String getEventScope() {
        return this.eventScope;
    }

    public DescribeApisecEventsRequest setEventTag(String eventTag) {
        this.eventTag = eventTag;
        return this;
    }
    public String getEventTag() {
        return this.eventTag;
    }

    public DescribeApisecEventsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeApisecEventsRequest setMatchedHost(String matchedHost) {
        this.matchedHost = matchedHost;
        return this;
    }
    public String getMatchedHost() {
        return this.matchedHost;
    }

    public DescribeApisecEventsRequest setOrderKey(String orderKey) {
        this.orderKey = orderKey;
        return this;
    }
    public String getOrderKey() {
        return this.orderKey;
    }

    public DescribeApisecEventsRequest setOrderWay(String orderWay) {
        this.orderWay = orderWay;
        return this;
    }
    public String getOrderWay() {
        return this.orderWay;
    }

    public DescribeApisecEventsRequest setOrigin(String origin) {
        this.origin = origin;
        return this;
    }
    public String getOrigin() {
        return this.origin;
    }

    public DescribeApisecEventsRequest setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public DescribeApisecEventsRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public DescribeApisecEventsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeApisecEventsRequest setResourceManagerResourceGroupId(String resourceManagerResourceGroupId) {
        this.resourceManagerResourceGroupId = resourceManagerResourceGroupId;
        return this;
    }
    public String getResourceManagerResourceGroupId() {
        return this.resourceManagerResourceGroupId;
    }

    public DescribeApisecEventsRequest setStartTs(Long startTs) {
        this.startTs = startTs;
        return this;
    }
    public Long getStartTs() {
        return this.startTs;
    }

    public DescribeApisecEventsRequest setUserStatus(String userStatus) {
        this.userStatus = userStatus;
        return this;
    }
    public String getUserStatus() {
        return this.userStatus;
    }

}
