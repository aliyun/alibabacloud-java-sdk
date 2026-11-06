// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeKVCacheInstancesRequest extends TeaModel {
    /**
     * <p>The description of the KVCache instance.</p>
     * 
     * <strong>example:</strong>
     * <p>Test cache instance</p>
     */
    @NameInMap("KVCacheInstanceDescription")
    public String KVCacheInstanceDescription;

    /**
     * <p>The KVCache instance IDs. Separate multiple instance IDs with commas (,).</p>
     * 
     * <strong>example:</strong>
     * <p>pkv-123456,pkv-789012</p>
     */
    @NameInMap("KVCacheInstanceIds")
    public String KVCacheInstanceIds;

    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The page size.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The region ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The instance ID of the associated PolarDB instance.</p>
     * 
     * <strong>example:</strong>
     * <p>pc-123456</p>
     */
    @NameInMap("RelativeDBClusterId")
    public String relativeDBClusterId;

    public static DescribeKVCacheInstancesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeKVCacheInstancesRequest self = new DescribeKVCacheInstancesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeKVCacheInstancesRequest setKVCacheInstanceDescription(String KVCacheInstanceDescription) {
        this.KVCacheInstanceDescription = KVCacheInstanceDescription;
        return this;
    }
    public String getKVCacheInstanceDescription() {
        return this.KVCacheInstanceDescription;
    }

    public DescribeKVCacheInstancesRequest setKVCacheInstanceIds(String KVCacheInstanceIds) {
        this.KVCacheInstanceIds = KVCacheInstanceIds;
        return this;
    }
    public String getKVCacheInstanceIds() {
        return this.KVCacheInstanceIds;
    }

    public DescribeKVCacheInstancesRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeKVCacheInstancesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeKVCacheInstancesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeKVCacheInstancesRequest setRelativeDBClusterId(String relativeDBClusterId) {
        this.relativeDBClusterId = relativeDBClusterId;
        return this;
    }
    public String getRelativeDBClusterId() {
        return this.relativeDBClusterId;
    }

}
