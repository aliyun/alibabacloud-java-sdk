// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class AddImageVulWhiteListRequest extends TeaModel {
    /**
     * <p>The language of the content within the request and response. Default value: zh. Valid values:</p>
     * <br>
     * <p>*   **zh**: Chinese</p>
     * <p>*   **en**: English</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The reason why you add the vulnerability to the whitelist.</p>
     */
    @NameInMap("Reason")
    public String reason;

    /**
     * <p>The source of the whitelist. Valid values:</p>
     * <p>- **image**</p>
     * <p>- **agentless**</p>
     */
    @NameInMap("Source")
    public String source;

    /**
     * <p>The object on which you want to perform the operation. The value of this parameter is in the JSON format and contains the following fields:</p>
     * <br>
     * <p>*   **type**: the object type. The value is fixed to repo.</p>
     * <p>*   **target**: the object content. The value is in the Namespace/Image repository format.</p>
     */
    @NameInMap("Target")
    public String target;

    /**
     * <p>The type of the vulnerability. Valid values:</p>
     * <br>
     * <p>*   **cve**: system vulnerability</p>
     * <p>*   **sca**: application vulnerability</p>
     */
    @NameInMap("Type")
    public String type;

    /**
     * <p>The whitelist. The value of this parameter is in the JSON format and contains the following fields:</p>
     * <br>
     * <p>*   **Type**: the vulnerability type. Valid values: cve and sca.</p>
     * <p>*   **Name**: the name of the vulnerability that is specified in Common Vulnerabilities and Exposures (CVE).</p>
     * <p>*   **AliasName**: the alias of the vulnerability that is specified in CVE.</p>
     */
    @NameInMap("Whitelist")
    public String whitelist;

    public static AddImageVulWhiteListRequest build(java.util.Map<String, ?> map) throws Exception {
        AddImageVulWhiteListRequest self = new AddImageVulWhiteListRequest();
        return TeaModel.build(map, self);
    }

    public AddImageVulWhiteListRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public AddImageVulWhiteListRequest setReason(String reason) {
        this.reason = reason;
        return this;
    }
    public String getReason() {
        return this.reason;
    }

    public AddImageVulWhiteListRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

    public AddImageVulWhiteListRequest setTarget(String target) {
        this.target = target;
        return this;
    }
    public String getTarget() {
        return this.target;
    }

    public AddImageVulWhiteListRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public AddImageVulWhiteListRequest setWhitelist(String whitelist) {
        this.whitelist = whitelist;
        return this;
    }
    public String getWhitelist() {
        return this.whitelist;
    }

}
