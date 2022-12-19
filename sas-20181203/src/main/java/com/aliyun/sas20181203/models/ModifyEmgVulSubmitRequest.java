// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ModifyEmgVulSubmitRequest extends TeaModel {
    // The language of the content within the request and response. Default value: **zh**. Valid values:
    // 
    // *   **zh**: Chinese
    // *   **en**: English
    @NameInMap("Lang")
    public String lang;

    // The name of the vulnerability.
    @NameInMap("Name")
    public String name;

    // Specifies whether to scan for urgent vulnerabilities. Valid values:
    // 
    // *   **yes**
    // *   **no**
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
