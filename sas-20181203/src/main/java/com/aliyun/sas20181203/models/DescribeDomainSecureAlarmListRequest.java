// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeDomainSecureAlarmListRequest extends TeaModel {
    /**
     * <p>The identifier of the request source. Set this parameter to sas.</p>
     * 
     * <strong>example:</strong>
     * <p>sas</p>
     */
    @NameInMap("From")
    public String from;

    /**
     * <p>The language type of the request and response messages. Valid values:</p>
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
     * <p>The IP address of the access source.</p>
     * 
     * <strong>example:</strong>
     * <p>139.227.<em>.</em></p>
     */
    @NameInMap("SourceIp")
    public String sourceIp;

    public static DescribeDomainSecureAlarmListRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDomainSecureAlarmListRequest self = new DescribeDomainSecureAlarmListRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDomainSecureAlarmListRequest setFrom(String from) {
        this.from = from;
        return this;
    }
    public String getFrom() {
        return this.from;
    }

    public DescribeDomainSecureAlarmListRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeDomainSecureAlarmListRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

}
