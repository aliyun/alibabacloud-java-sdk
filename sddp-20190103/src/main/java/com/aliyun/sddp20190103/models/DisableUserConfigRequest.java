// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sddp20190103.models;

import com.aliyun.tea.*;

public class DisableUserConfigRequest extends TeaModel {
    /**
     * <p>The code of the configuration item. You can call the <a href="~~DescribeConfigs~~">DescribeConfigs</a> operation to obtain the code of the configuration item.</p>
     * 
     * <strong>example:</strong>
     * <p>access_failed_cnt</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>This parameter is deprecated.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("FeatureType")
    public Integer featureType;

    /**
     * <p>The language of the content within the request and response. Valid values:</p>
     * <ul>
     * <li><strong>zh_cn</strong>: Chinese (default)</li>
     * <li><strong>en_us</strong>: English</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh_cn</p>
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
