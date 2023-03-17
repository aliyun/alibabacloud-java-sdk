// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class DescribeCacheAnalysisReportRequest extends TeaModel {
    /**
     * <p>The type of analysis. Set the value to **BigKey**.</p>
     */
    @NameInMap("AnalysisType")
    public String analysisType;

    /**
     * <p>The date to query. You can query the report for one day each time. Specify the date in the *yyyy-MM-dd*Z format. The time must be in UTC.</p>
     */
    @NameInMap("Date")
    public String date;

    /**
     * <p>The ID of the instance.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The ID of the child node in the ApsaraDB for Redis cluster instance.</p>
     * <br>
     * <p>>  If you do not specify this parameter, the analytic reports of all child nodes in the instance are returned.</p>
     */
    @NameInMap("NodeId")
    public String nodeId;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The number of the page to return.</p>
     * <br>
     * <p>>  If the parameter value exceeds the maximum number of the returned pages, an empty large key list is returned.</p>
     */
    @NameInMap("PageNumbers")
    public Integer pageNumbers;

    /**
     * <p>The number of entries to return on each page. Valid values: **30**, **50**, and **100**.</p>
     * <br>
     * <p>>  Default value: **30**.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("SecurityToken")
    public String securityToken;

    public static DescribeCacheAnalysisReportRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeCacheAnalysisReportRequest self = new DescribeCacheAnalysisReportRequest();
        return TeaModel.build(map, self);
    }

    public DescribeCacheAnalysisReportRequest setAnalysisType(String analysisType) {
        this.analysisType = analysisType;
        return this;
    }
    public String getAnalysisType() {
        return this.analysisType;
    }

    public DescribeCacheAnalysisReportRequest setDate(String date) {
        this.date = date;
        return this;
    }
    public String getDate() {
        return this.date;
    }

    public DescribeCacheAnalysisReportRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeCacheAnalysisReportRequest setNodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }
    public String getNodeId() {
        return this.nodeId;
    }

    public DescribeCacheAnalysisReportRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public DescribeCacheAnalysisReportRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeCacheAnalysisReportRequest setPageNumbers(Integer pageNumbers) {
        this.pageNumbers = pageNumbers;
        return this;
    }
    public Integer getPageNumbers() {
        return this.pageNumbers;
    }

    public DescribeCacheAnalysisReportRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeCacheAnalysisReportRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DescribeCacheAnalysisReportRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public DescribeCacheAnalysisReportRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

}
