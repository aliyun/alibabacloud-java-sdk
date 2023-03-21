// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeCheckWarningDetailRequest extends TeaModel {
    @NameInMap("CheckWarningId")
    public Long checkWarningId;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("SourceIp")
    public String sourceIp;

    public static DescribeCheckWarningDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeCheckWarningDetailRequest self = new DescribeCheckWarningDetailRequest();
        return TeaModel.build(map, self);
    }

    public DescribeCheckWarningDetailRequest setCheckWarningId(Long checkWarningId) {
        this.checkWarningId = checkWarningId;
        return this;
    }
    public Long getCheckWarningId() {
        return this.checkWarningId;
    }

    public DescribeCheckWarningDetailRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeCheckWarningDetailRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

}
