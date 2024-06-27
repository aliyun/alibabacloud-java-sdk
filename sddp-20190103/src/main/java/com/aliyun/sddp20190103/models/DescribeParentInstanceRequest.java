// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sddp20190103.models;

import com.aliyun.tea.*;

public class DescribeParentInstanceRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("AuthStatus")
    public Integer authStatus;

    /**
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("CheckStatus")
    public Integer checkStatus;

    /**
     * <strong>example:</strong>
     * <p>Running</p>
     */
    @NameInMap("ClusterStatus")
    public String clusterStatus;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <strong>example:</strong>
     * <p>db_test</p>
     */
    @NameInMap("DbName")
    public String dbName;

    /**
     * <strong>example:</strong>
     * <p>MySQL</p>
     */
    @NameInMap("EngineType")
    public String engineType;

    /**
     * <strong>example:</strong>
     * <p>rm-azfxx</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <strong>example:</strong>
     * <p>zh_cn</p>
     */
    @NameInMap("Lang")
    public String lang;

    @NameInMap("MemberAccount")
    public Long memberAccount;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("ResourceType")
    public Long resourceType;

    /**
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("ServiceRegionId")
    public String serviceRegionId;

    public static DescribeParentInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeParentInstanceRequest self = new DescribeParentInstanceRequest();
        return TeaModel.build(map, self);
    }

    public DescribeParentInstanceRequest setAuthStatus(Integer authStatus) {
        this.authStatus = authStatus;
        return this;
    }
    public Integer getAuthStatus() {
        return this.authStatus;
    }

    public DescribeParentInstanceRequest setCheckStatus(Integer checkStatus) {
        this.checkStatus = checkStatus;
        return this;
    }
    public Integer getCheckStatus() {
        return this.checkStatus;
    }

    public DescribeParentInstanceRequest setClusterStatus(String clusterStatus) {
        this.clusterStatus = clusterStatus;
        return this;
    }
    public String getClusterStatus() {
        return this.clusterStatus;
    }

    public DescribeParentInstanceRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public DescribeParentInstanceRequest setDbName(String dbName) {
        this.dbName = dbName;
        return this;
    }
    public String getDbName() {
        return this.dbName;
    }

    public DescribeParentInstanceRequest setEngineType(String engineType) {
        this.engineType = engineType;
        return this;
    }
    public String getEngineType() {
        return this.engineType;
    }

    public DescribeParentInstanceRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeParentInstanceRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeParentInstanceRequest setMemberAccount(Long memberAccount) {
        this.memberAccount = memberAccount;
        return this;
    }
    public Long getMemberAccount() {
        return this.memberAccount;
    }

    public DescribeParentInstanceRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeParentInstanceRequest setResourceType(Long resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public Long getResourceType() {
        return this.resourceType;
    }

    public DescribeParentInstanceRequest setServiceRegionId(String serviceRegionId) {
        this.serviceRegionId = serviceRegionId;
        return this;
    }
    public String getServiceRegionId() {
        return this.serviceRegionId;
    }

}
