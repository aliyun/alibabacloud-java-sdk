// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeInstallCaptchaRequest extends TeaModel {
    @NameInMap("SourceIp")
    public String sourceIp;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("Deadline")
    public String deadline;

    public static DescribeInstallCaptchaRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstallCaptchaRequest self = new DescribeInstallCaptchaRequest();
        return TeaModel.build(map, self);
    }

    public DescribeInstallCaptchaRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public DescribeInstallCaptchaRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeInstallCaptchaRequest setDeadline(String deadline) {
        this.deadline = deadline;
        return this;
    }
    public String getDeadline() {
        return this.deadline;
    }

}
