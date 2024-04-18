// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sddp20190103.models;

import com.aliyun.tea.*;

public class ModifyEventTypeStatusRequest extends TeaModel {
    /**
     * <p>This parameter is deprecated.</p>
     */
    @NameInMap("FeatureType")
    public Integer featureType;

    /**
     * <p>The language of the content within the request and response. Valid values: **zh** and **en**. The value zh indicates Chinese, and the value en indicates English.</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The ID of the anomalous event subtype. Separate multiple IDs with commas (,).</p>
     * <br>
     * <p>> You can call the **DescribeEventTypes** operation to query the ID of anomalous event subtype.</p>
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
