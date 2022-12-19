// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeSuspEventDetailRequest extends TeaModel {
    // The data source of the exception. Set the value to sas.
    @NameInMap("From")
    public String from;

    // The language of the content within the request and response. Default value: **zh**. Valid values:
    // 
    // *   **zh**: Chinese
    // *   **en**: English
    @NameInMap("Lang")
    public String lang;

    // The source IP address of the request.
    @NameInMap("SourceIp")
    public String sourceIp;

    // The ID of the exception.
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
