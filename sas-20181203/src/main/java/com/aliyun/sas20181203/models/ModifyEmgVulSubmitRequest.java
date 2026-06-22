// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ModifyEmgVulSubmitRequest extends TeaModel {
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
     * <p>The name of the vulnerability to query.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>scan:ASCV-2019-032401</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The ID of the member accounts in the resource folder (Alibaba Cloud account).</p>
     * <blockquote>
     * <p>Invoke the <a href="~~DescribeMonitorAccounts~~">DescribeMonitorAccounts</a> operation to obtain this parameter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>16670360956*****</p>
     */
    @NameInMap("ResourceDirectoryAccountId")
    public Long resourceDirectoryAccountId;

    /**
     * <p>Specifies whether to perform vulnerability detection. Valid values:</p>
     * <ul>
     * <li><strong>yes</strong>: Perform vulnerability detection.</li>
     * <li><strong>no</strong>: Do not perform vulnerability detection.</li>
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
