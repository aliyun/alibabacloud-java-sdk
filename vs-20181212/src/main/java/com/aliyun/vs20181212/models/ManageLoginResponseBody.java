// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class ManageLoginResponseBody extends TeaModel {
    @NameInMap("LoginInfo")
    public ManageLoginResponseBodyLoginInfo loginInfo;

    /**
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
         * <strong>example:</strong>
         * <p>12.10.4.10</p>
         */
        @NameInMap("LoginHostname")
        public String loginHostname;

        /**
         * <strong>example:</strong>
         * <p>10004</p>
         */
        @NameInMap("LoginPort")
        public Integer loginPort;

        public static ManageLoginResponseBodyLoginInfo build(java.util.Map<String, ?> map) throws Exception {
            ManageLoginResponseBodyLoginInfo self = new ManageLoginResponseBodyLoginInfo();
            return TeaModel.build(map, self);
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
