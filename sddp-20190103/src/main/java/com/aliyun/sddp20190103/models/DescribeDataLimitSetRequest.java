// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sddp20190103.models;

import com.aliyun.tea.*;

public class DescribeDataLimitSetRequest extends TeaModel {
    /**
     * <p>This parameter is deprecated.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("FeatureType")
    public Integer featureType;

    /**
     * <p>The language of the request and response. Valid values:</p>
     * <ul>
     * <li><p><strong>zh_cn</strong>: Chinese (Simplified). This is the default value.</p>
     * </li>
     * <li><p><strong>en_us</strong>: English (US).</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh_cn</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The ID of the parent asset.</p>
     * <p>The <a href="~~DescribeDataLimitDetail~~">DescribeDataLimitDetail</a> or <a href="~~DescribeDataLimits~~">DescribeDataLimits</a> operation returns this ID in the <strong>ParentId</strong> parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>db</p>
     */
    @NameInMap("ParentId")
    public String parentId;

    /**
     * <p>The region type.</p>
     * <ul>
     * <li><strong>native_audit</strong>: A region that supports traffic collection.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>native_audit</p>
     */
    @NameInMap("RegionType")
    public String regionType;

    /**
     * <p>The type of data asset. Valid values:</p>
     * <ul>
     * <li><p><strong>1</strong>: MaxCompute.</p>
     * </li>
     * <li><p><strong>2</strong>: OSS.</p>
     * </li>
     * <li><p><strong>3</strong>: ADS.</p>
     * </li>
     * <li><p><strong>4</strong>: OTS.</p>
     * </li>
     * <li><p><strong>5</strong>: RDS.</p>
     * </li>
     * <li><p><strong>6</strong>: SELF_DB.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>If you set this parameter to a value other than 2, the returned OssBucketList object is empty.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>2</p>
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

    public DescribeDataLimitSetRequest setRegionType(String regionType) {
        this.regionType = regionType;
        return this;
    }
    public String getRegionType() {
        return this.regionType;
    }

    public DescribeDataLimitSetRequest setResourceType(Integer resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public Integer getResourceType() {
        return this.resourceType;
    }

}
