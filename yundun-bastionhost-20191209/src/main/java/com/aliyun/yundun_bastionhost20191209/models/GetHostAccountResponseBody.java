// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class GetHostAccountResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("HostAccount")
    public GetHostAccountResponseBodyHostAccount hostAccount;

    public static GetHostAccountResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetHostAccountResponseBody self = new GetHostAccountResponseBody();
        return TeaModel.build(map, self);
    }

    public GetHostAccountResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetHostAccountResponseBody setHostAccount(GetHostAccountResponseBodyHostAccount hostAccount) {
        this.hostAccount = hostAccount;
        return this;
    }
    public GetHostAccountResponseBodyHostAccount getHostAccount() {
        return this.hostAccount;
    }

    public static class GetHostAccountResponseBodyHostAccount extends TeaModel {
        @NameInMap("HasPassword")
        public Boolean hasPassword;

        @NameInMap("PrivateKeyFingerprint")
        public String privateKeyFingerprint;

        @NameInMap("ProtocolName")
        public String protocolName;

        @NameInMap("HostAccountName")
        public String hostAccountName;

        @NameInMap("HostAccountId")
        public String hostAccountId;

        @NameInMap("HostId")
        public String hostId;

        public static GetHostAccountResponseBodyHostAccount build(java.util.Map<String, ?> map) throws Exception {
            GetHostAccountResponseBodyHostAccount self = new GetHostAccountResponseBodyHostAccount();
            return TeaModel.build(map, self);
        }

        public GetHostAccountResponseBodyHostAccount setHasPassword(Boolean hasPassword) {
            this.hasPassword = hasPassword;
            return this;
        }
        public Boolean getHasPassword() {
            return this.hasPassword;
        }

        public GetHostAccountResponseBodyHostAccount setPrivateKeyFingerprint(String privateKeyFingerprint) {
            this.privateKeyFingerprint = privateKeyFingerprint;
            return this;
        }
        public String getPrivateKeyFingerprint() {
            return this.privateKeyFingerprint;
        }

        public GetHostAccountResponseBodyHostAccount setProtocolName(String protocolName) {
            this.protocolName = protocolName;
            return this;
        }
        public String getProtocolName() {
            return this.protocolName;
        }

        public GetHostAccountResponseBodyHostAccount setHostAccountName(String hostAccountName) {
            this.hostAccountName = hostAccountName;
            return this;
        }
        public String getHostAccountName() {
            return this.hostAccountName;
        }

        public GetHostAccountResponseBodyHostAccount setHostAccountId(String hostAccountId) {
            this.hostAccountId = hostAccountId;
            return this;
        }
        public String getHostAccountId() {
            return this.hostAccountId;
        }

        public GetHostAccountResponseBodyHostAccount setHostId(String hostId) {
            this.hostId = hostId;
            return this;
        }
        public String getHostId() {
            return this.hostId;
        }

    }

}
