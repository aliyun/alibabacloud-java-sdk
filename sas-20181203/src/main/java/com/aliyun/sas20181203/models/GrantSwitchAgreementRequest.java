// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GrantSwitchAgreementRequest extends TeaModel {
    /**
     * <p>Indicates whether to agree to migrate the client connections from overseas servers to the Singapore center.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("IsAgree")
    public Boolean isAgree;

    /**
     * <p>The language type for requests and responses. The default value is <strong>zh</strong>. Possible values:</p>
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
     * <p>Switching type. Possible values:</p>
     * <ul>
     * <li><strong>sg_switch</strong>: Migrate client connections from overseas servers to Singapore</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>sg_switch</p>
     */
    @NameInMap("Type")
    public String type;

    public static GrantSwitchAgreementRequest build(java.util.Map<String, ?> map) throws Exception {
        GrantSwitchAgreementRequest self = new GrantSwitchAgreementRequest();
        return TeaModel.build(map, self);
    }

    public GrantSwitchAgreementRequest setIsAgree(Boolean isAgree) {
        this.isAgree = isAgree;
        return this;
    }
    public Boolean getIsAgree() {
        return this.isAgree;
    }

    public GrantSwitchAgreementRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public GrantSwitchAgreementRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
