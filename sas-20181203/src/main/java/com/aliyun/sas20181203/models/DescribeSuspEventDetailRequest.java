// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeSuspEventDetailRequest extends TeaModel {
    @NameInMap("From")
    public String from;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("SourceIp")
    public String sourceIp;

    @NameInMap("SuspiciousEventId")
    public Integer suspiciousEventId;

    public static DescribeSuspEventDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeSuspEventDetailRequest self = new DescribeSuspEventDetailRequest();
        return TeaModel.build(map, self);
    }

    public DescribeSuspEventDetailRequest setFrom(String from) {
        this.from = from;
        return this;
    }
    public String getFrom() {
        return this.from;
    }

    public DescribeSuspEventDetailRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeSuspEventDetailRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public DescribeSuspEventDetailRequest setSuspiciousEventId(Integer suspiciousEventId) {
        this.suspiciousEventId = suspiciousEventId;
        return this;
    }
    public Integer getSuspiciousEventId() {
        return this.suspiciousEventId;
    }

}
