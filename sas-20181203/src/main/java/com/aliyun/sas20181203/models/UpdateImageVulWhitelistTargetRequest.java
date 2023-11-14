// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class UpdateImageVulWhitelistTargetRequest extends TeaModel {
    /**
     * <p>The whitelist ID.</p>
     */
    @NameInMap("Id")
    public Long id;

    /**
     * <p>The language of the content within the request and response. Default value: **zh**. Valid values:</p>
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
     * <br>
     * <p>*   **image**</p>
     * <p>*   **agentless**</p>
     */
    @NameInMap("Source")
    public String source;

    /**
     * <p>The vulnerability that you want to add to the whitelist. The value of this parameter is in the JSON format and contains the following fields:</p>
     * <br>
     * <p>*   **type**: The type of the vulnerability. The value is fixed to repo.</p>
     * <p>*   **target**: The content of the vulnerability. The value is in the format of Namespace/Image repository.</p>
     */
    @NameInMap("Target")
    public String target;

    public static UpdateImageVulWhitelistTargetRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateImageVulWhitelistTargetRequest self = new UpdateImageVulWhitelistTargetRequest();
        return TeaModel.build(map, self);
    }

    public UpdateImageVulWhitelistTargetRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public UpdateImageVulWhitelistTargetRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public UpdateImageVulWhitelistTargetRequest setReason(String reason) {
        this.reason = reason;
        return this;
    }
    public String getReason() {
        return this.reason;
    }

    public UpdateImageVulWhitelistTargetRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

    public UpdateImageVulWhitelistTargetRequest setTarget(String target) {
        this.target = target;
        return this;
    }
    public String getTarget() {
        return this.target;
    }

}
