// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sddp20190103.models;

import com.aliyun.tea.*;

public class DescribeEventTypesRequest extends TeaModel {
    /**
     * <p>This parameter is deprecated.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("FeatureType")
    public Integer featureType;

    /**
     * <p>The language of the request and response. Valid values:</p>
     * <ul>
     * <li><p><strong>zh</strong>: Chinese.</p>
     * </li>
     * <li><p><strong>en</strong>: English.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The ID of the parent anomalous activity type to which the child anomalous activity type belongs. Valid values:</p>
     * <ul>
     * <li><p><strong>01</strong>: anomalous permission access.</p>
     * </li>
     * <li><p><strong>02</strong>: anomalous data flow.</p>
     * </li>
     * <li><p><strong>03</strong>: anomalous data operation.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>01</p>
     */
    @NameInMap("ParentTypeId")
    public Long parentTypeId;

    /**
     * <p>The resource type of the product. Valid values:</p>
     * <ul>
     * <li><p><strong>1</strong>: MaxCompute.</p>
     * </li>
     * <li><p><strong>2</strong>: Object Storage Service (OSS).</p>
     * </li>
     * <li><p><strong>3</strong>: AnalyticDB for MySQL.</p>
     * </li>
     * <li><p><strong>4</strong>: Tablestore.</p>
     * </li>
     * <li><p><strong>5</strong>. ApsaraDB RDS.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("ResourceId")
    public Integer resourceId;

    /**
     * <p>The status. Valid values:</p>
     * <ul>
     * <li><p><strong>1</strong>: active.</p>
     * </li>
     * <li><p><strong>2</strong>: inactive.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Status")
    public Integer status;

    public static DescribeEventTypesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeEventTypesRequest self = new DescribeEventTypesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeEventTypesRequest setFeatureType(Integer featureType) {
        this.featureType = featureType;
        return this;
    }
    public Integer getFeatureType() {
        return this.featureType;
    }

    public DescribeEventTypesRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeEventTypesRequest setParentTypeId(Long parentTypeId) {
        this.parentTypeId = parentTypeId;
        return this;
    }
    public Long getParentTypeId() {
        return this.parentTypeId;
    }

    public DescribeEventTypesRequest setResourceId(Integer resourceId) {
        this.resourceId = resourceId;
        return this;
    }
    public Integer getResourceId() {
        return this.resourceId;
    }

    public DescribeEventTypesRequest setStatus(Integer status) {
        this.status = status;
        return this;
    }
    public Integer getStatus() {
        return this.status;
    }

}
