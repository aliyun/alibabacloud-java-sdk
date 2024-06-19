// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class DescribeActiveOperationTaskCountRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>Category</p>
     */
    @NameInMap("Category")
    public String category;

    /**
     * <strong>example:</strong>
     * <p>polarx</p>
     */
    @NameInMap("Product")
    public String product;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static DescribeActiveOperationTaskCountRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeActiveOperationTaskCountRequest self = new DescribeActiveOperationTaskCountRequest();
        return TeaModel.build(map, self);
    }

    public DescribeActiveOperationTaskCountRequest setCategory(String category) {
        this.category = category;
        return this;
    }
    public String getCategory() {
        return this.category;
    }

    public DescribeActiveOperationTaskCountRequest setProduct(String product) {
        this.product = product;
        return this;
    }
    public String getProduct() {
        return this.product;
    }

    public DescribeActiveOperationTaskCountRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
