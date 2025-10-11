// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeCrossCloudRegionRequest extends TeaModel {
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

    /**
     * <strong>example:</strong>
     * <p>MySQL</p>
     */
    @NameInMap("DBType")
    public String DBType;

    public static DescribeCrossCloudRegionRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeCrossCloudRegionRequest self = new DescribeCrossCloudRegionRequest();
        return TeaModel.build(map, self);
    }

    public DescribeCrossCloudRegionRequest setCloudProvider(String cloudProvider) {
        this.cloudProvider = cloudProvider;
        return this;
    }
    public String getCloudProvider() {
        return this.cloudProvider;
    }

    public DescribeCrossCloudRegionRequest setCrossCloudRegionId(String crossCloudRegionId) {
        this.crossCloudRegionId = crossCloudRegionId;
        return this;
    }
    public String getCrossCloudRegionId() {
        return this.crossCloudRegionId;
    }

    public DescribeCrossCloudRegionRequest setDBType(String DBType) {
        this.DBType = DBType;
        return this;
    }
    public String getDBType() {
        return this.DBType;
    }

}
