// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sddp20190103.models;

import com.aliyun.tea.*;

public class ModifyEventTypeStatusRequest extends TeaModel {
    /**
     * <p>This parameter is deprecated.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("FeatureType")
    public Integer featureType;

    /**
     * <p>The language of the request and response. Valid values are <strong>zh</strong> for Chinese and <strong>en</strong> for English.</p>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The unique IDs of the anomalous activity subtypes. Separate multiple IDs with commas.</p>
     * <blockquote>
     * <p>To enable SDDP to detect anomalous activities for subtypes, provide the unique IDs of the anomalous activity subtypes. Call the <strong>DescribeEventTypes</strong> operation to obtain the IDs.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>020008</p>
     */
    @NameInMap("SubTypeIds")
    public String subTypeIds;

    public static ModifyEventTypeStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyEventTypeStatusRequest self = new ModifyEventTypeStatusRequest();
        return TeaModel.build(map, self);
    }

    public ModifyEventTypeStatusRequest setFeatureType(Integer featureType) {
        this.featureType = featureType;
        return this;
    }
    public Integer getFeatureType() {
        return this.featureType;
    }

    public ModifyEventTypeStatusRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public ModifyEventTypeStatusRequest setSubTypeIds(String subTypeIds) {
        this.subTypeIds = subTypeIds;
        return this;
    }
    public String getSubTypeIds() {
        return this.subTypeIds;
    }

}
