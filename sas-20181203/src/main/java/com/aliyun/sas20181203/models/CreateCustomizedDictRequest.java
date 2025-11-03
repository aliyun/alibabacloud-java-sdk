// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class CreateCustomizedDictRequest extends TeaModel {
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
     * <p>Whether to overwrite. Value range: - true: Overwrite. - false: Do not overwrite.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("Override")
    public Boolean override;

    /**
     * <p>The source IP address.</p>
     * 
     * <strong>example:</strong>
     * <p>106.11.43.***</p>
     */
    @NameInMap("SourceIp")
    public String sourceIp;

    public static CreateCustomizedDictRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateCustomizedDictRequest self = new CreateCustomizedDictRequest();
        return TeaModel.build(map, self);
    }

    public CreateCustomizedDictRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public CreateCustomizedDictRequest setOverride(Boolean override) {
        this.override = override;
        return this;
    }
    public Boolean getOverride() {
        return this.override;
    }

    public CreateCustomizedDictRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

}
