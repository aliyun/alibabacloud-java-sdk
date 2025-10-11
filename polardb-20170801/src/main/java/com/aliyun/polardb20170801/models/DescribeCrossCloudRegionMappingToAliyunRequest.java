// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeCrossCloudRegionMappingToAliyunRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>cn-beijing</p>
     */
    @NameInMap("AliyunRegionId")
    public String aliyunRegionId;

    /**
     * <strong>example:</strong>
     * <p>HuaweiCloud</p>
     */
    @NameInMap("CloudProvider")
    public String cloudProvider;

    /**
     * <strong>example:</strong>
     * <p>cn-east-3</p>
     */
    @NameInMap("CrossCloudRegionId")
    public String crossCloudRegionId;

    public static DescribeCrossCloudRegionMappingToAliyunRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeCrossCloudRegionMappingToAliyunRequest self = new DescribeCrossCloudRegionMappingToAliyunRequest();
        return TeaModel.build(map, self);
    }

    public DescribeCrossCloudRegionMappingToAliyunRequest setAliyunRegionId(String aliyunRegionId) {
        this.aliyunRegionId = aliyunRegionId;
        return this;
    }
    public String getAliyunRegionId() {
        return this.aliyunRegionId;
    }

    public DescribeCrossCloudRegionMappingToAliyunRequest setCloudProvider(String cloudProvider) {
        this.cloudProvider = cloudProvider;
        return this;
    }
    public String getCloudProvider() {
        return this.cloudProvider;
    }

    public DescribeCrossCloudRegionMappingToAliyunRequest setCrossCloudRegionId(String crossCloudRegionId) {
        this.crossCloudRegionId = crossCloudRegionId;
        return this;
    }
    public String getCrossCloudRegionId() {
        return this.crossCloudRegionId;
    }

}
