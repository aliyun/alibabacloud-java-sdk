// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class AddImageVulWhiteListRequest extends TeaModel {
    /**
     * <p>The language of the content within the request and response. Default value: zh. Valid values:</p>
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
     * <p>already config in another way</p>
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
     * <p>The object on which you want to perform the operation. The value of this parameter is in the JSON format and contains the following fields:</p>
     * <ul>
     * <li><strong>type</strong>: the object type. The value is fixed to repo.</li>
     * <li><strong>target</strong>: the object content. The value is in the Namespace/Image repository format.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>{\&quot;type\&quot;:\&quot;repo\&quot;,\&quot;target\&quot;:[\&quot;sas_test/script_0209\&quot;,\&quot;sas_test/script\&quot;]}</p>
     */
    @NameInMap("Target")
    public String target;

    /**
     * <p>The type of the vulnerability. Valid values:</p>
     * <ul>
     * <li><strong>cve</strong>: system vulnerability</li>
     * <li><strong>sca</strong>: application vulnerability</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>cve</p>
     */
    @NameInMap("Type")
    public String type;

    /**
     * <p>The whitelist. The value of this parameter is in the JSON format and contains the following fields:</p>
     * <ul>
     * <li><strong>Type</strong>: the vulnerability type. Valid values: cve and sca.</li>
     * <li><strong>Name</strong>: the name of the vulnerability that is specified in Common Vulnerabilities and Exposures (CVE).</li>
     * <li><strong>AliasName</strong>: the alias of the vulnerability that is specified in CVE.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>[{\&quot;Type\&quot;:\&quot;sca\&quot;,\&quot;Name\&quot;:\&quot;imgsca:java:spring-core:AVD-2022-1124599\&quot;,\&quot;AliasName\&quot;:\&quot;Spring Framework JDK &gt;= 9 (CVE-2022-22965)\&quot;}]</p>
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
