// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeVolDingdingMessageRequest extends TeaModel {
    @NameInMap("Lang")
    public String lang;

    @NameInMap("SourceIp")
    public String sourceIp;

    public static DescribeVolDingdingMessageRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeVolDingdingMessageRequest self = new DescribeVolDingdingMessageRequest();
        return TeaModel.build(map, self);
    }

    public DescribeVolDingdingMessageRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeVolDingdingMessageRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

}
