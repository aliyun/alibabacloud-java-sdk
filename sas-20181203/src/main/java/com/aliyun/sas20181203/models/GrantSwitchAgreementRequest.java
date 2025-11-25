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
     * <p>Has the user confirmed the migration of Hong Kong region data to Singapore data center</p>
     * <ul>
     * <li><p><strong>true:</strong> The user has confirmed that Hong Kong region data has been migrated to the Singapore data center. No notification popup needs to be displayed subsequently.</p>
     * </li>
     * <li><p><strong>false</strong>:The user has not confirmed that Hong Kong region data has been migrated to the Singapore data center. Notification popup still needs to be displayed subsequently.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("IsConfirmed")
    public Boolean isConfirmed;

    /**
     * <p>Whether to schedule the migration of data from the Hong Kong region to the Singapore data center within 24 hours. Values:</p>
     * <ul>
     * <li><strong>true</strong>: Schedule the switch within 24 hours.</li>
     * <li><strong>false</strong>: Do not schedule. Users with cloud products in the Hong Kong region will be automatically migrated on March 5, 2026; users without cloud products in the Hong Kong region will be automatically migrated on November 17, 2025.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("IsImmediate")
    public Boolean isImmediate;

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

    public GrantSwitchAgreementRequest setIsConfirmed(Boolean isConfirmed) {
        this.isConfirmed = isConfirmed;
        return this;
    }
    public Boolean getIsConfirmed() {
        return this.isConfirmed;
    }

    public GrantSwitchAgreementRequest setIsImmediate(Boolean isImmediate) {
        this.isImmediate = isImmediate;
        return this;
    }
    public Boolean getIsImmediate() {
        return this.isImmediate;
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
