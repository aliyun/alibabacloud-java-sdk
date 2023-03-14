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
         * <br>
         * <p>*   **true**: enabled</p>
         * <p>*   **false**: disabled</p>
         */
        @NameInMap("EnableTwoFactor")
        public Boolean enableTwoFactor;

        /**
         * <p>The duration within which two-factor authentication is not required after a local user passes two-factor authentication. Valid values: `0 to 168`. Unit: hours.</p>
         * <br>
         * <p>>  If 0 is returned, a local user must pass two-factor authentication every time the local user logs on to the bastion host.</p>
         */
        @NameInMap("SkipTwoFactorTime")
        public Long skipTwoFactorTime;

        /**
         * <p>Indicates one or more methods that are used to send verification codes if two-factor authentication is enabled.</p>
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
