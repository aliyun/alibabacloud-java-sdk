// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class GetHostAccountResponseBody extends TeaModel {
    /**
     * <p>The details of the host account that was queried.</p>
     */
    @NameInMap("HostAccount")
    public GetHostAccountResponseBodyHostAccount hostAccount;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>EC9BF0F4-8983-491A-BC8C-1B4DD94976DE</p>
     */
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
        /**
         * <p>Indicates whether a password is configured for the host account. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: yes</li>
         * <li><strong>false</strong>: no</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("HasPassword")
        public Boolean hasPassword;

        /**
         * <p>The ID of the host account.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("HostAccountId")
        public String hostAccountId;

        /**
         * <p>The name of the host account.</p>
         * 
         * <strong>example:</strong>
         * <p>abc</p>
         */
        @NameInMap("HostAccountName")
        public String hostAccountName;

        /**
         * <p>The ID of the host to which the host account belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("HostId")
        public String hostId;

        /**
         * <p>The ID of the shared key.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("HostShareKeyId")
        public String hostShareKeyId;

        /**
         * <p>The name of the shared key.</p>
         * 
         * <strong>example:</strong>
         * <p>name</p>
         */
        @NameInMap("HostShareKeyName")
        public String hostShareKeyName;

        /**
         * <p>The fingerprint of the private key.</p>
         * 
         * <strong>example:</strong>
         * <p>fe:ca:37:42:30:00:9d:95:e6:73:e5:b0:32:0a:<strong>:</strong></p>
         */
        @NameInMap("PrivateKeyFingerprint")
        public String privateKeyFingerprint;

        /**
         * <p>The protocol that is used by the host. Valid values:</p>
         * <ul>
         * <li><strong>SSH</strong></li>
         * <li><strong>RDP</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>SSH</p>
         */
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
