// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sddp20190103.models;

import com.aliyun.tea.*;

public class DescribeDataLimitDetailRequest extends TeaModel {
    /**
     * <p>This parameter is deprecated.</p>
     */
    @NameInMap("FeatureType")
    public Integer featureType;

    /**
     * <p>The unique ID of the data asset that you want to query.</p>
     * <br>
     * <p>> You can call the [DescribeDataLimits](~~DescribeDataLimits~~) operation to query the ID of the data asset.</p>
     */
    @NameInMap("Id")
    public Long id;

    /**
     * <p>The language of the content within the request and response. Valid values:</p>
     * <br>
     * <p>*   **zh**: Simplified Chinese.</p>
     * <p>*   **en**: English</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The network type of the data asset that you want to query. Valid values:</p>
     * <br>
     * <p>*   **1**: virtual private cloud (VPC)</p>
     * <p>*   **2**: classic network</p>
     */
    @NameInMap("NetworkType")
    public Integer networkType;

    public static DescribeDataLimitDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDataLimitDetailRequest self = new DescribeDataLimitDetailRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDataLimitDetailRequest setFeatureType(Integer featureType) {
        this.featureType = featureType;
        return this;
    }
    public Integer getFeatureType() {
        return this.featureType;
    }

    public DescribeDataLimitDetailRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public DescribeDataLimitDetailRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeDataLimitDetailRequest setNetworkType(Integer networkType) {
        this.networkType = networkType;
        return this;
    }
    public Integer getNetworkType() {
        return this.networkType;
    }

}
