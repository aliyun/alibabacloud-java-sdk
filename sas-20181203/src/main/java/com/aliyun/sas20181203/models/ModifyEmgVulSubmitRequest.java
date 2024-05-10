// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ModifyEmgVulSubmitRequest extends TeaModel {
    /**
     * <p>The language of the content within the request and response. Default value: **zh**. Valid values:</p>
     * <br>
     * <p>*   **zh**: Chinese</p>
     * <p>*   **en**: English</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The name of the vulnerability.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>Specifies whether to scan for urgent vulnerabilities. Valid values:</p>
     * <br>
     * <p>*   **yes**</p>
     * <p>*   **no**</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("UserAgreement")
    public String userAgreement;

    public static ModifyEmgVulSubmitRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyEmgVulSubmitRequest self = new ModifyEmgVulSubmitRequest();
        return TeaModel.build(map, self);
    }

    public ModifyEmgVulSubmitRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public ModifyEmgVulSubmitRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ModifyEmgVulSubmitRequest setUserAgreement(String userAgreement) {
        this.userAgreement = userAgreement;
        return this;
    }
    public String getUserAgreement() {
        return this.userAgreement;
    }

}
