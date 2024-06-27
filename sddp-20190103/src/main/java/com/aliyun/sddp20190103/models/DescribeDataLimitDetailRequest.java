// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sddp20190103.models;

import com.aliyun.tea.*;

public class DescribeDataLimitDetailRequest extends TeaModel {
    /**
     * <p>This parameter is deprecated.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("FeatureType")
    public Integer featureType;

    /**
     * <p>The unique ID of the data asset that you want to query.</p>
     * <blockquote>
     * <p>You can call the <a href="~~DescribeDataLimits~~">DescribeDataLimits</a> operation to query the ID of the data asset.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>12300</p>
     */
    @NameInMap("Id")
    public Long id;

    /**
     * <p>The language of the content within the request and response. Valid values:</p>
     * <ul>
     * <li><strong>zh</strong>: Simplified Chinese.</li>
     * <li><strong>en</strong>: English</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The network type of the data asset that you want to query. Valid values:</p>
     * <ul>
     * <li><strong>1</strong>: virtual private cloud (VPC)</li>
     * <li><strong>2</strong>: classic network</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
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
