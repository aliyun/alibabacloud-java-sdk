// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sgw20180511.models;

import com.aliyun.tea.*;

public class DescribeStorageBundlesRequest extends TeaModel {
    @NameInMap("BackendBucketRegionId")
    public String backendBucketRegionId;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("SecurityToken")
    public String securityToken;

    public static DescribeStorageBundlesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeStorageBundlesRequest self = new DescribeStorageBundlesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeStorageBundlesRequest setBackendBucketRegionId(String backendBucketRegionId) {
        this.backendBucketRegionId = backendBucketRegionId;
        return this;
    }
    public String getBackendBucketRegionId() {
        return this.backendBucketRegionId;
    }

    public DescribeStorageBundlesRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeStorageBundlesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeStorageBundlesRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

}
