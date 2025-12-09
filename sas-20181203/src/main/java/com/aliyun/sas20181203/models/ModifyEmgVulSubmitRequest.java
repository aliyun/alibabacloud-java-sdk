// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ModifyEmgVulSubmitRequest extends TeaModel {
    /**
     * <p>The language of the content within the request and response. Default value: <strong>zh</strong>. Valid values:</p>
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
     * <p>The name of the vulnerability.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>scan:ASCV-2019-032401</p>
     */
    @NameInMap("Name")
    public String name;

    @NameInMap("ResourceDirectoryAccountId")
    public Long resourceDirectoryAccountId;

    /**
     * <p>Specifies whether to scan for urgent vulnerabilities. Valid values:</p>
     * <ul>
     * <li><strong>yes</strong></li>
     * <li><strong>no</strong></li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>yes</p>
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

    public ModifyEmgVulSubmitRequest setResourceDirectoryAccountId(Long resourceDirectoryAccountId) {
        this.resourceDirectoryAccountId = resourceDirectoryAccountId;
        return this;
    }
    public Long getResourceDirectoryAccountId() {
        return this.resourceDirectoryAccountId;
    }

    public ModifyEmgVulSubmitRequest setUserAgreement(String userAgreement) {
        this.userAgreement = userAgreement;
        return this;
    }
    public String getUserAgreement() {
        return this.userAgreement;
    }

}
