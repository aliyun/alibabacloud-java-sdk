// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeDomainSecureRiskListRequest extends TeaModel {
    /**
     * <p>The identifier of the request source. Set the value to sas.</p>
     * 
     * <strong>example:</strong>
     * <p>sas</p>
     */
    @NameInMap("From")
    public String from;

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
     * <p>The source IP address.</p>
     * 
     * <strong>example:</strong>
     * <p>124.78.<em>.</em></p>
     */
    @NameInMap("SourceIp")
    public String sourceIp;

    public static DescribeDomainSecureRiskListRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDomainSecureRiskListRequest self = new DescribeDomainSecureRiskListRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDomainSecureRiskListRequest setFrom(String from) {
        this.from = from;
        return this;
    }
    public String getFrom() {
        return this.from;
    }

    public DescribeDomainSecureRiskListRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeDomainSecureRiskListRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

}
