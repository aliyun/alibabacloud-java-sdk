// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class UpdateImageVulWhitelistTargetRequest extends TeaModel {
    /**
     * <p>The whitelist ID.</p>
     * 
     * <strong>example:</strong>
     * <p>2000083</p>
     */
    @NameInMap("Id")
    public Long id;

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
     * <p>The reason why you add the vulnerability to the whitelist.</p>
     * 
     * <strong>example:</strong>
     * <p>ignore</p>
     */
    @NameInMap("Reason")
    public String reason;

    /**
     * <p>The source of the whitelist. Valid values:</p>
     * <ul>
     * <li><strong>image</strong></li>
     * <li><strong>agentless</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>image</p>
     */
    @NameInMap("Source")
    public String source;

    /**
     * <p>The vulnerability that you want to add to the whitelist. The value of this parameter is in the JSON format and contains the following fields:</p>
     * <ul>
     * <li><strong>type</strong>: The type of the vulnerability. The value is fixed to repo.</li>
     * <li><strong>target</strong>: The content of the vulnerability. The value is in the format of Namespace/Image repository.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>{\&quot;type\&quot;:\&quot;repo\&quot;,\&quot;target\&quot;:[\&quot;sas_test/script_0209\&quot;,\&quot;sas_test/script\&quot;]}</p>
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
