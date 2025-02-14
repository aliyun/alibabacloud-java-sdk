// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeDomainSecureSuggestsRequest extends TeaModel {
    /**
     * <p>Sets the language type for requests and received messages, default is <strong>zh</strong>. Values:</p>
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
     * <p>The IP address of the access source.</p>
     * 
     * <strong>example:</strong>
     * <p>218.249.<em>.</em></p>
     */
    @NameInMap("SourceIp")
    public String sourceIp;

    public static DescribeDomainSecureSuggestsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDomainSecureSuggestsRequest self = new DescribeDomainSecureSuggestsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDomainSecureSuggestsRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeDomainSecureSuggestsRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

}
