// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeInstallCaptchaResponseBody extends TeaModel {
    /**
     * <p>The installation verification code for manually installing the Security Center Agent.</p>
     * 
     * <strong>example:</strong>
     * <p>M1HH**</p>
     */
    @NameInMap("CaptchaCode")
    public String captchaCode;

    /**
     * <p>The expiration date of the installation verification code.</p>
     * <blockquote>
     * <p>The installation verification code can be used only within its validity period. An expired installation verification code cannot be used.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>2020-10-10 16:06:38</p>
     */
    @NameInMap("Deadline")
    public String deadline;

    /**
     * <p>The unique identifier that Alibaba Cloud generated for the request.</p>
     * 
     * <strong>example:</strong>
     * <p>4E5BFDCF-B9DD-430D-9DA4-151BCB581C9D</p>
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
