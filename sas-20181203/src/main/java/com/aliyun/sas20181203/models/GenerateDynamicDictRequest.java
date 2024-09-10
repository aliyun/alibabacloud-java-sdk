// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GenerateDynamicDictRequest extends TeaModel {
    /**
     * <p>The keyword of the dictionary.</p>
     * 
     * <strong>example:</strong>
     * <p>keyword</p>
     */
    @NameInMap("ArgKeywords")
    public String argKeywords;

    /**
     * <p>The domain name for custom weak passwords.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://www.aliyun.com">https://www.aliyun.com</a></p>
     */
    @NameInMap("Domains")
    public String domains;

    /**
     * <p>The company name for custom weak passwords.</p>
     * 
     * <strong>example:</strong>
     * <p>Alibaba</p>
     */
    @NameInMap("Names")
    public String names;

    /**
     * <p>The source IP address of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>58.248.XX.XX</p>
     */
    @NameInMap("SourceIp")
    public String sourceIp;

    public static GenerateDynamicDictRequest build(java.util.Map<String, ?> map) throws Exception {
        GenerateDynamicDictRequest self = new GenerateDynamicDictRequest();
        return TeaModel.build(map, self);
    }

    public GenerateDynamicDictRequest setArgKeywords(String argKeywords) {
        this.argKeywords = argKeywords;
        return this;
    }
    public String getArgKeywords() {
        return this.argKeywords;
    }

    public GenerateDynamicDictRequest setDomains(String domains) {
        this.domains = domains;
        return this;
    }
    public String getDomains() {
        return this.domains;
    }

    public GenerateDynamicDictRequest setNames(String names) {
        this.names = names;
        return this;
    }
    public String getNames() {
        return this.names;
    }

    public GenerateDynamicDictRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

}
