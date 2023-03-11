// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeInstallCaptchaResponseBody extends TeaModel {
    /**
     * <p>The installation verification code for you to manually install the Security Center agent.</p>
     */
    @NameInMap("CaptchaCode")
    public String captchaCode;

    /**
     * <p>The validity period of the installation verification code.</p>
     * <br>
     * <p>>  The installation verification code is valid only within the validity period. An expired installation verification code cannot be used to install the agent.</p>
     */
    @NameInMap("Deadline")
    public String deadline;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeInstallCaptchaResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstallCaptchaResponseBody self = new DescribeInstallCaptchaResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeInstallCaptchaResponseBody setCaptchaCode(String captchaCode) {
        this.captchaCode = captchaCode;
        return this;
    }
    public String getCaptchaCode() {
        return this.captchaCode;
    }

    public DescribeInstallCaptchaResponseBody setDeadline(String deadline) {
        this.deadline = deadline;
        return this;
    }
    public String getDeadline() {
        return this.deadline;
    }

    public DescribeInstallCaptchaResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
