// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class DescribeCacheAnalysisReportRequest extends TeaModel {
    /**
     * <p>The type of analytics. Set the value to <strong>BigKey</strong>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>BigKey</p>
     */
    @NameInMap("AnalysisType")
    public String analysisType;

    /**
     * <p>The date to query. You can query the report for one day each time. Specify the date in the <em>yyyy-MM-dd</em>Z format. The time must be in UTC.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2019-08-05Z</p>
     */
    @NameInMap("Date")
    public String date;

    /**
     * <p>The ID of the instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>-bp1zxszhcgatnx****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The ID of the child node in the cluster instance.</p>
     * <blockquote>
     * <p>If this parameter is not specified, the analytics results of all child nodes in the instance are returned.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>-bp1zxszhcgatnx****-db-0</p>
     */
    @NameInMap("NodeId")
    public String nodeId;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The number of the page to return.</p>
     * <blockquote>
     * <p>If the parameter value exceeds the maximum number of the returned pages, an empty large key list is returned.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumbers")
    public Integer pageNumbers;

    /**
     * <p>The number of entries to return on each page. Valid values: <strong>30</strong>, <strong>50</strong>, and <strong>100</strong>.</p>
     * <blockquote>
     * <p>The default value is <strong>30</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>30</p>
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
