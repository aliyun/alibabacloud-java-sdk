// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class GetHostShareKeyResponseBody extends TeaModel {
    @NameInMap("HostShareKey")
    public GetHostShareKeyResponseBodyHostShareKey hostShareKey;

    // Id of the request
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
        @NameInMap("HostShareKeyId")
        public String hostShareKeyId;

        @NameInMap("HostShareKeyName")
        public String hostShareKeyName;

        @NameInMap("LastModifyKeyAt")
        public Long lastModifyKeyAt;

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
