// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class GetHostAccountResponseBody extends TeaModel {
    @NameInMap("HostAccount")
    public GetHostAccountResponseBodyHostAccount hostAccount;

    @NameInMap("RequestId")
    public String requestId;

    public static GetHostAccountResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetHostAccountResponseBody self = new GetHostAccountResponseBody();
        return TeaModel.build(map, self);
    }

    public GetHostAccountResponseBody setHostAccount(GetHostAccountResponseBodyHostAccount hostAccount) {
        this.hostAccount = hostAccount;
        return this;
    }
    public GetHostAccountResponseBodyHostAccount getHostAccount() {
        return this.hostAccount;
    }

    public GetHostAccountResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetHostAccountResponseBodyHostAccount extends TeaModel {
        @NameInMap("HasPassword")
        public Boolean hasPassword;

        @NameInMap("HostAccountId")
        public String hostAccountId;

        @NameInMap("HostAccountName")
        public String hostAccountName;

        @NameInMap("HostId")
        public String hostId;

        @NameInMap("HostShareKeyId")
        public String hostShareKeyId;

        @NameInMap("HostShareKeyName")
        public String hostShareKeyName;

        @NameInMap("PrivateKeyFingerprint")
        public String privateKeyFingerprint;

        @NameInMap("ProtocolName")
        public String protocolName;

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

        public GetHostAccountResponseBodyHostAccount setHostAccountId(String hostAccountId) {
            this.hostAccountId = hostAccountId;
            return this;
        }
        public String getHostAccountId() {
            return this.hostAccountId;
        }

        public GetHostAccountResponseBodyHostAccount setHostAccountName(String hostAccountName) {
            this.hostAccountName = hostAccountName;
            return this;
        }
        public String getHostAccountName() {
            return this.hostAccountName;
        }

        public GetHostAccountResponseBodyHostAccount setHostId(String hostId) {
            this.hostId = hostId;
            return this;
        }
        public String getHostId() {
            return this.hostId;
        }

        public GetHostAccountResponseBodyHostAccount setHostShareKeyId(String hostShareKeyId) {
            this.hostShareKeyId = hostShareKeyId;
            return this;
        }
        public String getHostShareKeyId() {
            return this.hostShareKeyId;
        }

        public GetHostAccountResponseBodyHostAccount setHostShareKeyName(String hostShareKeyName) {
            this.hostShareKeyName = hostShareKeyName;
            return this;
        }
        public String getHostShareKeyName() {
            return this.hostShareKeyName;
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

    }

}
