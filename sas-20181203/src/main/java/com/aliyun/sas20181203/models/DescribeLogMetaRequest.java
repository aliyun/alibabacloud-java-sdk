// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeLogMetaRequest extends TeaModel {
    // The ID of the request source. Default value: **aegis**. Valid values:
    // 
    // *   **aegis**: Server Guard
    // *   **sas**: Security Center
    // 
    // >  If you use Server Guard, set the value to **aegis**. If you use Security Center, set the value to **sas**.
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

    public static DescribeLogMetaRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeLogMetaRequest self = new DescribeLogMetaRequest();
        return TeaModel.build(map, self);
    }

    public DescribeLogMetaRequest setFrom(String from) {
        this.from = from;
        return this;
    }
    public String getFrom() {
        return this.from;
    }

    public DescribeLogMetaRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeLogMetaRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

}
