// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeCrossCloudRegionRequest extends TeaModel {
    /**
     * <p>The cloud service provider. Valid values:</p>
     * <ul>
     * <li><p>HuaweiCloud</p>
     * </li>
     * <li><p>Azure</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>HuaweiCloud</p>
     */
    @NameInMap("CloudProvider")
    public String cloudProvider;

    /**
     * <p>The ID of the third-party cloud region.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-east-3</p>
     */
    @NameInMap("CrossCloudRegionId")
    public String crossCloudRegionId;

    /**
     * <p>The database engine type. Valid values:</p>
     * <ul>
     * <li><p>MySQL</p>
     * </li>
     * <li><p>PostgreSQL</p>
     * </li>
     * <li><p>Oracle</p>
     * </li>
     * </ul>
     * 
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
