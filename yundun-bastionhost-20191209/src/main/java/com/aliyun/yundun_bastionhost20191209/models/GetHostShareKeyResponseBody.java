// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class GetHostShareKeyResponseBody extends TeaModel {
    /**
     * <p>The details of the shared key.</p>
     */
    @NameInMap("HostShareKey")
    public GetHostShareKeyResponseBodyHostShareKey hostShareKey;

    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetHostShareKeyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetHostShareKeyResponseBody self = new GetHostShareKeyResponseBody();
        return TeaModel.build(map, self);
    }

    public GetHostShareKeyResponseBody setHostShareKey(GetHostShareKeyResponseBodyHostShareKey hostShareKey) {
        this.hostShareKey = hostShareKey;
        return this;
    }
    public GetHostShareKeyResponseBodyHostShareKey getHostShareKey() {
        return this.hostShareKey;
    }

    public GetHostShareKeyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetHostShareKeyResponseBodyHostShareKey extends TeaModel {
        /**
         * <p>The ID of the shared key.</p>
         */
        @NameInMap("HostShareKeyId")
        public String hostShareKeyId;

        /**
         * <p>The name of the shared key.</p>
         */
        @NameInMap("HostShareKeyName")
        public String hostShareKeyName;

        /**
         * <p>The time when the information about the shared key was last modified.</p>
         */
        @NameInMap("LastModifyKeyAt")
        public Long lastModifyKeyAt;

        /**
         * <p>The fingerprint of the private key.</p>
         */
        @NameInMap("PrivateKeyFingerPrint")
        public String privateKeyFingerPrint;

        public static GetHostShareKeyResponseBodyHostShareKey build(java.util.Map<String, ?> map) throws Exception {
            GetHostShareKeyResponseBodyHostShareKey self = new GetHostShareKeyResponseBodyHostShareKey();
            return TeaModel.build(map, self);
        }

        public GetHostShareKeyResponseBodyHostShareKey setHostShareKeyId(String hostShareKeyId) {
            this.hostShareKeyId = hostShareKeyId;
            return this;
        }
        public String getHostShareKeyId() {
            return this.hostShareKeyId;
        }

        public GetHostShareKeyResponseBodyHostShareKey setHostShareKeyName(String hostShareKeyName) {
            this.hostShareKeyName = hostShareKeyName;
            return this;
        }
        public String getHostShareKeyName() {
            return this.hostShareKeyName;
        }

        public GetHostShareKeyResponseBodyHostShareKey setLastModifyKeyAt(Long lastModifyKeyAt) {
            this.lastModifyKeyAt = lastModifyKeyAt;
            return this;
        }
        public Long getLastModifyKeyAt() {
            return this.lastModifyKeyAt;
        }

        public GetHostShareKeyResponseBodyHostShareKey setPrivateKeyFingerPrint(String privateKeyFingerPrint) {
            this.privateKeyFingerPrint = privateKeyFingerPrint;
            return this;
        }
        public String getPrivateKeyFingerPrint() {
            return this.privateKeyFingerPrint;
        }

    }

}
