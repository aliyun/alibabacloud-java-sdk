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
     * <p>The language of the content within the request and response. Valid values:</p>
     * <ul>
     * <li><strong>zh_cn</strong>: Simplified Chinese (default)</li>
     * <li><strong>en_us</strong>: English</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh_cn</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The parent asset ID of the data asset.</p>
     * <p>You can call the <a href="~~DescribeDataLimitDetail~~">DescribeDataLimitDetail</a> or <a href="~~DescribeDataLimits~~">DescribeDataLimits</a> operation to obtain the parent asset ID of the data asset from the value of the <strong>ParentId</strong> parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>db</p>
     */
    @NameInMap("ParentId")
    public String parentId;

    /**
     * <p>The type of service to which the data asset belongs. Valid values:</p>
     * <ul>
     * <li><strong>1</strong>: MaxCompute</li>
     * <li><strong>2</strong>: OSS</li>
     * <li><strong>3</strong>: AnalyticDB for MySQL</li>
     * <li><strong>4</strong>: Tablestore</li>
     * <li><strong>5</strong>: ApsaraDB RDS</li>
     * </ul>
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

    public DescribeDataLimitSetRequest setResourceType(Integer resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public Integer getResourceType() {
        return this.resourceType;
    }

}
