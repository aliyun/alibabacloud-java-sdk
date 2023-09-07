// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeInstallCaptchaRequest extends TeaModel {
    /**
     * <p>The validity period of verification codes. If this parameter is not specified, only the valid verification codes are returned.</p>
     * <br>
     * <p>>  An installation verification code can be used only within the validity period. An expired installation verification code cannot be used to install the Security Center agent.</p>
     */
    @NameInMap("Deadline")
    public String deadline;

    /**
     * <p>The language of the content within the request and response. Default value: **zh**. Valid values:</p>
     * <br>
     * <p>*   **zh**: Chinese.</p>
     * <p>*   **en**: English.</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The source IP address of the request.</p>
     */
    @NameInMap("SourceIp")
    public String sourceIp;

    public static DescribeInstallCaptchaRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstallCaptchaRequest self = new DescribeInstallCaptchaRequest();
        return TeaModel.build(map, self);
    }

    public DescribeInstallCaptchaRequest setDeadline(String deadline) {
        this.deadline = deadline;
        return this;
    }
    public String getDeadline() {
        return this.deadline;
    }

    public DescribeInstallCaptchaRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeInstallCaptchaRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

}
