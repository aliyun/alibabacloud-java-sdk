// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sddp20190103.models;

import com.aliyun.tea.*;

public class CreateSlrRoleRequest extends TeaModel {
    /**
     * <p>This parameter is deprecated.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("FeatureType")
    public Integer featureType;

    /**
     * <p>The language of the content within the request and response. Default value: <strong>zh_cn</strong>. Valid values:</p>
     * <ul>
     * <li><strong>zh_cn</strong>: Simplified Chinese</li>
     * <li><strong>en_us</strong>: English</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh_cn</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>This parameter is deprecated.</p>
     * 
     * <strong>example:</strong>
     * <p>39.170.XX.XX</p>
     */
    @NameInMap("SourceIp")
    public String sourceIp;

    public static CreateSlrRoleRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateSlrRoleRequest self = new CreateSlrRoleRequest();
        return TeaModel.build(map, self);
    }

    public CreateSlrRoleRequest setFeatureType(Integer featureType) {
        this.featureType = featureType;
        return this;
    }
    public Integer getFeatureType() {
        return this.featureType;
    }

    public CreateSlrRoleRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public CreateSlrRoleRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

}
