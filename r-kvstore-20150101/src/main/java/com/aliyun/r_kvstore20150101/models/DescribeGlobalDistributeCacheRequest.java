// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class DescribeGlobalDistributeCacheRequest extends TeaModel {
    /**
     * <p>The ID of the distributed instance.</p>
     * 
     * <strong>example:</strong>
     * <p>gr-bp14rkqrhac****</p>
     */
    @NameInMap("GlobalInstanceId")
    public String globalInstanceId;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The number of the page to return. The value must be an integer that is greater than <strong>0</strong>. Default value: <strong>1</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public String pageNumber;

    /**
     * <p>The number of entries to return each page.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public String pageSize;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("SecurityToken")
    public String securityToken;

    /**
     * <p>The ID of the child instance that is attached to the distributed instance.</p>
     * 
     * <strong>example:</strong>
     * <p>gr-bp1zcjlobkyrq****</p>
     */
    @NameInMap("SubInstanceId")
    public String subInstanceId;

    public static DescribeGlobalDistributeCacheRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeGlobalDistributeCacheRequest self = new DescribeGlobalDistributeCacheRequest();
        return TeaModel.build(map, self);
    }

    public DescribeGlobalDistributeCacheRequest setGlobalInstanceId(String globalInstanceId) {
        this.globalInstanceId = globalInstanceId;
        return this;
    }
    public String getGlobalInstanceId() {
        return this.globalInstanceId;
    }

    public DescribeGlobalDistributeCacheRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public DescribeGlobalDistributeCacheRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeGlobalDistributeCacheRequest setPageNumber(String pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public String getPageNumber() {
        return this.pageNumber;
    }

    public DescribeGlobalDistributeCacheRequest setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public DescribeGlobalDistributeCacheRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DescribeGlobalDistributeCacheRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public DescribeGlobalDistributeCacheRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public DescribeGlobalDistributeCacheRequest setSubInstanceId(String subInstanceId) {
        this.subInstanceId = subInstanceId;
        return this;
    }
    public String getSubInstanceId() {
        return this.subInstanceId;
    }

}
