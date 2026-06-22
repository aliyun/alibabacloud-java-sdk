// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GrantSwitchAgreementRequest extends TeaModel {
    /**
     * <p>Specifies whether you agree to the data migration from the Hong Kong (China) region to the Singapore data center. Valid values:</p>
     * <ul>
     * <li><p><strong>true</strong>: Agree.</p>
     * </li>
     * <li><p><strong>false</strong>: Disagree.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("IsAgree")
    public Boolean isAgree;

    /**
     * <p>Specifies whether the user confirms that the data migration from the Hong Kong (China) region to the Singapore data center has been completed.</p>
     * <ul>
     * <li><strong>true</strong>: Confirmed. The user has confirmed that the data migration from the Hong Kong (China) region to the Singapore data center has been completed, and the notification pop-up window no longer needs to be displayed.</li>
     * <li><strong>false</strong>: Not confirmed. The user has not confirmed that the data migration from the Hong Kong (China) region to the Singapore data center has been completed, and the notification pop-up window still needs to be displayed.</li>
     * </ul>
     */
    @NameInMap("IsConfirmed")
    public Boolean isConfirmed;

    /**
     * <p>Specifies whether to schedule data migration of data from the Hong Kong (China) region to the Singapore data center within 24 hours. Valid values:</p>
     * <ul>
     * <li><p><strong>true</strong>: Schedule the switch within 24 hours.</p>
     * </li>
     * <li><p><strong>false</strong>: Do not schedule. For users who have cloud services in the Hong Kong (China) region, data migration will be automatically completed on March 5, 2026. For users who do not have cloud services in the Hong Kong (China) region, data migration will be automatically completed on November 17, 2025.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("IsImmediate")
    public Boolean isImmediate;

    /**
     * <p>The language type for the request and response messages. Default value: <strong>zh</strong>. Valid values:</p>
     * <ul>
     * <li><strong>zh</strong>: Chinese</li>
     * <li><strong>en</strong>: English.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The switch type. Valid values:</p>
     * <ul>
     * <li><strong>sg_switch</strong>: data migration from the Hong Kong (China) region to the Singapore data center.</li>
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
