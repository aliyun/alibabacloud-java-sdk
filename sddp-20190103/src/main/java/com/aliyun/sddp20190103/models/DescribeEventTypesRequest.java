// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sddp20190103.models;

import com.aliyun.tea.*;

public class DescribeEventTypesRequest extends TeaModel {
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
     * <li><strong>zh</strong>: Chinese</li>
     * <li><strong>en</strong>: English</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The type of anomalous event for which you want to query the anomalous events of subtypes. Valid values:</p>
     * <ul>
     * <li><strong>01</strong>: anomalous permission usage</li>
     * <li><strong>02</strong>: anomalous data flow</li>
     * <li><strong>03</strong>: anomalous data operation</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>01</p>
     */
    @NameInMap("ParentTypeId")
    public Long parentTypeId;

    /**
     * <p>The type of the resource. Valid values include <strong>1</strong>, <strong>2</strong>, <strong>3</strong>, <strong>4</strong>, and <strong>5</strong>. The value 1 indicates MaxCompute. The value 2 indicates Object Storage Service (OSS). The value 3 indicates AnalyticDB for MySQL. The value 4 indicates Tablestore. The value 5 indicates ApsaraDB RDS.</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("ResourceId")
    public Integer resourceId;

    /**
     * <p>The status of the anomalous event. Valid values:</p>
     * <ul>
     * <li><strong>1</strong>: enabled</li>
     * <li><strong>2</strong>: disabled</li>
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
