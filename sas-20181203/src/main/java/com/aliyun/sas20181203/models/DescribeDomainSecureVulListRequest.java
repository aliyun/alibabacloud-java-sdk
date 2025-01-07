// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeDomainSecureVulListRequest extends TeaModel {
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
     * <p>111.196.<em>.</em></p>
     */
    @NameInMap("SourceIp")
    public String sourceIp;

    /**
     * <p>The vulnerability type. Valid values:</p>
     * <ul>
     * <li><strong>app</strong>: application vulnerability.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>app</p>
     */
    @NameInMap("Type")
    public String type;

    public static DescribeDomainSecureVulListRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDomainSecureVulListRequest self = new DescribeDomainSecureVulListRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDomainSecureVulListRequest setFrom(String from) {
        this.from = from;
        return this;
    }
    public String getFrom() {
        return this.from;
    }

    public DescribeDomainSecureVulListRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeDomainSecureVulListRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public DescribeDomainSecureVulListRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
