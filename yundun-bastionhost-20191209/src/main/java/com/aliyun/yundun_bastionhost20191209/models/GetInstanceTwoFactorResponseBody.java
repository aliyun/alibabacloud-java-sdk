// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class GetInstanceTwoFactorResponseBody extends TeaModel {
    /**
     * <p>The settings of two-factor authentication.</p>
     */
    @NameInMap("Config")
    public GetInstanceTwoFactorResponseBodyConfig config;

    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>EC9BF0F4-8983-491A-BC8C-1B4DD94976DE</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetInstanceTwoFactorResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetInstanceTwoFactorResponseBody self = new GetInstanceTwoFactorResponseBody();
        return TeaModel.build(map, self);
    }

    public GetInstanceTwoFactorResponseBody setConfig(GetInstanceTwoFactorResponseBodyConfig config) {
        this.config = config;
        return this;
    }
    public GetInstanceTwoFactorResponseBodyConfig getConfig() {
        return this.config;
    }

    public GetInstanceTwoFactorResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetInstanceTwoFactorResponseBodyConfig extends TeaModel {
        /**
         * <p>Indicates whether two-factor authentication is enabled. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("EnableTwoFactor")
        public Boolean enableTwoFactor;

        /**
         * <p>The duration within which two-factor authentication is not required after a local user passes two-factor authentication. Valid values: <code>0 to 168</code>. Unit: hours.</p>
         * <blockquote>
         * <p>If 0 is returned, a local user must pass two-factor authentication every time the local user logs on to the bastion host.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("SkipTwoFactorTime")
        public Long skipTwoFactorTime;

        /**
         * <p>The two-factor authentication methods.</p>
         */
        @NameInMap("TwoFactorMethods")
        public java.util.List<String> twoFactorMethods;

        public static GetInstanceTwoFactorResponseBodyConfig build(java.util.Map<String, ?> map) throws Exception {
            GetInstanceTwoFactorResponseBodyConfig self = new GetInstanceTwoFactorResponseBodyConfig();
            return TeaModel.build(map, self);
        }

        public GetInstanceTwoFactorResponseBodyConfig setEnableTwoFactor(Boolean enableTwoFactor) {
            this.enableTwoFactor = enableTwoFactor;
            return this;
        }
        public Boolean getEnableTwoFactor() {
            return this.enableTwoFactor;
        }

        public GetInstanceTwoFactorResponseBodyConfig setSkipTwoFactorTime(Long skipTwoFactorTime) {
            this.skipTwoFactorTime = skipTwoFactorTime;
            return this;
        }
        public Long getSkipTwoFactorTime() {
            return this.skipTwoFactorTime;
        }

        public GetInstanceTwoFactorResponseBodyConfig setTwoFactorMethods(java.util.List<String> twoFactorMethods) {
            this.twoFactorMethods = twoFactorMethods;
            return this;
        }
        public java.util.List<String> getTwoFactorMethods() {
            return this.twoFactorMethods;
        }

    }

}
