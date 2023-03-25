// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeInstallCaptchaRequest extends TeaModel {
    /**
     * <p>The validity period of the installation verification code. If this parameter is not specified, the validity period is 1 hour.</p>
     * <br>
     * <p>>  The installation verification code is valid only within the validity period. An expired installation verification code cannot be used to install the agent.</p>
     */
    @NameInMap("Deadline")
    public String deadline;

    /**
     * <p>The language of the content within the request and response. Valid values:</p>
     * <br>
     * <p>*   **zh**: Chinese</p>
     * <p>*   **en**: English</p>
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
