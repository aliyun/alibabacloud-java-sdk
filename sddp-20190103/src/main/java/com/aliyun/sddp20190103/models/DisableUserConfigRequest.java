// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sddp20190103.models;

import com.aliyun.tea.*;

public class DisableUserConfigRequest extends TeaModel {
    /**
     * <p>The code of the configuration item. You can call the [DescribeConfigs](~~DescribeConfigs~~) operation to obtain the code of the configuration item.</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("FeatureType")
    public Integer featureType;

    /**
     * <p>The language of the content within the request and response. Valid values:</p>
     * <br>
     * <p>*   **zh_cn**: Chinese (default)</p>
     * <p>*   **en_us**: English</p>
     */
    @NameInMap("Lang")
    public String lang;

    public static DisableUserConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        DisableUserConfigRequest self = new DisableUserConfigRequest();
        return TeaModel.build(map, self);
    }

    public DisableUserConfigRequest setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DisableUserConfigRequest setFeatureType(Integer featureType) {
        this.featureType = featureType;
        return this;
    }
    public Integer getFeatureType() {
        return this.featureType;
    }

    public DisableUserConfigRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

}
