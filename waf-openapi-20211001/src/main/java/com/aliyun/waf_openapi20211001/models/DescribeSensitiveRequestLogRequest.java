// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeSensitiveRequestLogRequest extends TeaModel {
    /**
     * <p>The account information.</p>
     * 
     * <strong>example:</strong>
     * <p>admin</p>
     */
    @NameInMap("Account")
    public String account;

    /**
     * <p>The API operation.</p>
     * 
     * <strong>example:</strong>
     * <p>/api/users/login</p>
     */
    @NameInMap("ApiFormat")
    public String apiFormat;

    /**
     * <p>The IP address.</p>
     * 
     * <strong>example:</strong>
     * <p>103.118.55.**</p>
     */
    @NameInMap("ClientIP")
    public String clientIP;

    /**
     * <p>The hybrid cloud cluster ID.</p>
     * <blockquote>
     * <p>This parameter applies only to hybrid cloud scenarios. You can call the <a href="https://help.aliyun.com/document_detail/2849376.html">DescribeHybridCloudClusters</a> operation to query hybrid cloud cluster information.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>433</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The end time of the query, in UNIX timestamp (UTC) format. Unit: seconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1726057800</p>
     */
    @NameInMap("EndTime")
    public Long endTime;

    /**
     * <p>Instance ID of the WAF instance.</p>
     * <blockquote>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/433756.html">DescribeInstance</a> operation to query instance ID of the current WAF instance.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>waf_cdnsdf3****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The domain name to which the API operation belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>a.***.com</p>
     */
    @NameInMap("MatchedHost")
    public String matchedHost;

    /**
     * <p>The page number of the page to return in a paged query. Default value: <strong>1</strong>, which indicates the first page. Paging starts from page 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Long pageNumber;

    /**
     * <p>The number of entries to return on each page in a paged query. Default value: <strong>10</strong>, which indicates 10 entries per page. Paging starts from page 1.</p>
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
     * <p>The sensitive data type.</p>
     * <blockquote>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/2859155.html">DescribeApisecRules</a> operation to query the supported sensitive data types.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1000,1001</p>
     */
    @NameInMap("SensitiveCode")
    public String sensitiveCode;

    /**
     * <p>The response sensitive data.</p>
     * 
     * <strong>example:</strong>
     * <p>user</p>
     */
    @NameInMap("SensitiveData")
    public String sensitiveData;

    /**
     * <p>The start time of the query, in UNIX timestamp (UTC) format. Unit: seconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1723392000</p>
     */
    @NameInMap("StartTime")
    public Long startTime;

    public static DescribeSensitiveRequestLogRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeSensitiveRequestLogRequest self = new DescribeSensitiveRequestLogRequest();
        return TeaModel.build(map, self);
    }

    public DescribeSensitiveRequestLogRequest setAccount(String account) {
        this.account = account;
        return this;
    }
    public String getAccount() {
        return this.account;
    }

    public DescribeSensitiveRequestLogRequest setApiFormat(String apiFormat) {
        this.apiFormat = apiFormat;
        return this;
    }
    public String getApiFormat() {
        return this.apiFormat;
    }

    public DescribeSensitiveRequestLogRequest setClientIP(String clientIP) {
        this.clientIP = clientIP;
        return this;
    }
    public String getClientIP() {
        return this.clientIP;
    }

    public DescribeSensitiveRequestLogRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public DescribeSensitiveRequestLogRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public DescribeSensitiveRequestLogRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeSensitiveRequestLogRequest setMatchedHost(String matchedHost) {
        this.matchedHost = matchedHost;
        return this;
    }
    public String getMatchedHost() {
        return this.matchedHost;
    }

    public DescribeSensitiveRequestLogRequest setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public DescribeSensitiveRequestLogRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public DescribeSensitiveRequestLogRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeSensitiveRequestLogRequest setResourceManagerResourceGroupId(String resourceManagerResourceGroupId) {
        this.resourceManagerResourceGroupId = resourceManagerResourceGroupId;
        return this;
    }
    public String getResourceManagerResourceGroupId() {
        return this.resourceManagerResourceGroupId;
    }

    public DescribeSensitiveRequestLogRequest setSensitiveCode(String sensitiveCode) {
        this.sensitiveCode = sensitiveCode;
        return this;
    }
    public String getSensitiveCode() {
        return this.sensitiveCode;
    }

    public DescribeSensitiveRequestLogRequest setSensitiveData(String sensitiveData) {
        this.sensitiveData = sensitiveData;
        return this;
    }
    public String getSensitiveData() {
        return this.sensitiveData;
    }

    public DescribeSensitiveRequestLogRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

}
