// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sddp20190103.models;

import com.aliyun.tea.*;

public class DescribeDataLimitSetRequest extends TeaModel {
    @NameInMap("FeatureType")
    public Integer featureType;

    /**
     * <p>The language of the content within the request and response. Valid values:</p>
     * <br>
     * <p>*   **zh_cn**: Simplified Chinese (default)</p>
     * <p>*   **en_us**: English</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The parent asset ID of the data asset.</p>
     * <br>
     * <p>You can call the [DescribeDataLimitDetail](~~DescribeDataLimitDetail~~) or [DescribeDataLimits](~~DescribeDataLimits~~) operation to obtain the parent asset ID of the data asset from the value of the **ParentId** parameter.</p>
     */
    @NameInMap("ParentId")
    public String parentId;

    /**
     * <p>The type of service to which the data asset belongs. Valid values:</p>
     * <br>
     * <p>*   **1**: MaxCompute</p>
     * <p>*   **2**: OSS</p>
     * <p>*   **3**: AnalyticDB for MySQL</p>
     * <p>*   **4**: Tablestore</p>
     * <p>*   **5**: ApsaraDB RDS</p>
     */
    @NameInMap("ResourceType")
    public Integer resourceType;

    public static DescribeDataLimitSetRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDataLimitSetRequest self = new DescribeDataLimitSetRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDataLimitSetRequest setFeatureType(Integer featureType) {
        this.featureType = featureType;
        return this;
    }
    public Integer getFeatureType() {
        return this.featureType;
    }

    public DescribeDataLimitSetRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeDataLimitSetRequest setParentId(String parentId) {
        this.parentId = parentId;
        return this;
    }
    public String getParentId() {
        return this.parentId;
    }

    public DescribeDataLimitSetRequest setResourceType(Integer resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public Integer getResourceType() {
        return this.resourceType;
    }

}
