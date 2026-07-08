// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class ManageLoginResponseBody extends TeaModel {
    /**
     * <p>Connection information.</p>
     */
    @NameInMap("LoginInfo")
    public ManageLoginResponseBodyLoginInfo loginInfo;

    /**
     * <p>ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>BEA5625F-8FCF-48F4-851B-CA63946DA664</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ManageLoginResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ManageLoginResponseBody self = new ManageLoginResponseBody();
        return TeaModel.build(map, self);
    }

    public ManageLoginResponseBody setLoginInfo(ManageLoginResponseBodyLoginInfo loginInfo) {
        this.loginInfo = loginInfo;
        return this;
    }
    public ManageLoginResponseBodyLoginInfo getLoginInfo() {
        return this.loginInfo;
    }

    public ManageLoginResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ManageLoginResponseBodyLoginInfo extends TeaModel {
        /**
         * <p>Port for ADB connections.</p>
         * 
         * <strong>example:</strong>
         * <p>10005</p>
         */
        @NameInMap("AdbLoginPort")
        public Integer adbLoginPort;

        /**
         * <p>Host for SSH connections.</p>
         * 
         * <strong>example:</strong>
         * <p>12.10.4.10</p>
         */
        @NameInMap("LoginHostname")
        public String loginHostname;

        /**
         * <p>Port for SSH connections.</p>
         * 
         * <strong>example:</strong>
         * <p>10004</p>
         */
        @NameInMap("LoginPort")
        public Integer loginPort;

        public static ManageLoginResponseBodyLoginInfo build(java.util.Map<String, ?> map) throws Exception {
            ManageLoginResponseBodyLoginInfo self = new ManageLoginResponseBodyLoginInfo();
            return TeaModel.build(map, self);
        }

        public ManageLoginResponseBodyLoginInfo setAdbLoginPort(Integer adbLoginPort) {
            this.adbLoginPort = adbLoginPort;
            return this;
        }
        public Integer getAdbLoginPort() {
            return this.adbLoginPort;
        }

        public ManageLoginResponseBodyLoginInfo setLoginHostname(String loginHostname) {
            this.loginHostname = loginHostname;
            return this;
        }
        public String getLoginHostname() {
            return this.loginHostname;
        }

        public ManageLoginResponseBodyLoginInfo setLoginPort(Integer loginPort) {
            this.loginPort = loginPort;
            return this;
        }
        public Integer getLoginPort() {
            return this.loginPort;
        }

    }

}
