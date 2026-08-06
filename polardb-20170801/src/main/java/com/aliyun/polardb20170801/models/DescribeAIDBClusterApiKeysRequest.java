// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeAIDBClusterApiKeysRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>pms-xxx</p>
     */
    @NameInMap("ModelSpaceName")
    public String modelSpaceName;

    /**
     * <p>The region ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static DescribeAIDBClusterApiKeysRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeAIDBClusterApiKeysRequest self = new DescribeAIDBClusterApiKeysRequest();
        return TeaModel.build(map, self);
    }

    public DescribeAIDBClusterApiKeysRequest setModelSpaceName(String modelSpaceName) {
        this.modelSpaceName = modelSpaceName;
        return this;
    }
    public String getModelSpaceName() {
        return this.modelSpaceName;
    }

    public DescribeAIDBClusterApiKeysRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
