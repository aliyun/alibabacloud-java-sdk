// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class ListHostShareKeysResponseBody extends TeaModel {
    @NameInMap("HostShareKeys")
    public java.util.List<ListHostShareKeysResponseBodyHostShareKeys> hostShareKeys;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Long totalCount;

    public static ListHostShareKeysResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListHostShareKeysResponseBody self = new ListHostShareKeysResponseBody();
        return TeaModel.build(map, self);
    }

    public ListHostShareKeysResponseBody setHostShareKeys(java.util.List<ListHostShareKeysResponseBodyHostShareKeys> hostShareKeys) {
        this.hostShareKeys = hostShareKeys;
        return this;
    }
    public java.util.List<ListHostShareKeysResponseBodyHostShareKeys> getHostShareKeys() {
        return this.hostShareKeys;
    }

    public ListHostShareKeysResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListHostShareKeysResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListHostShareKeysResponseBodyHostShareKeys extends TeaModel {
        @NameInMap("HostAccountCount")
        public Long hostAccountCount;

        @NameInMap("HostShareKeyId")
        public String hostShareKeyId;

        @NameInMap("HostShareKeyName")
        public String hostShareKeyName;

        @NameInMap("LastModifyKeyAt")
        public Long lastModifyKeyAt;

        @NameInMap("PrivateKeyFingerPrint")
        public String privateKeyFingerPrint;

        public static ListHostShareKeysResponseBodyHostShareKeys build(java.util.Map<String, ?> map) throws Exception {
            ListHostShareKeysResponseBodyHostShareKeys self = new ListHostShareKeysResponseBodyHostShareKeys();
            return TeaModel.build(map, self);
        }

        public ListHostShareKeysResponseBodyHostShareKeys setHostAccountCount(Long hostAccountCount) {
            this.hostAccountCount = hostAccountCount;
            return this;
        }
        public Long getHostAccountCount() {
            return this.hostAccountCount;
        }

        public ListHostShareKeysResponseBodyHostShareKeys setHostShareKeyId(String hostShareKeyId) {
            this.hostShareKeyId = hostShareKeyId;
            return this;
        }
        public String getHostShareKeyId() {
            return this.hostShareKeyId;
        }

        public ListHostShareKeysResponseBodyHostShareKeys setHostShareKeyName(String hostShareKeyName) {
            this.hostShareKeyName = hostShareKeyName;
            return this;
        }
        public String getHostShareKeyName() {
            return this.hostShareKeyName;
        }

        public ListHostShareKeysResponseBodyHostShareKeys setLastModifyKeyAt(Long lastModifyKeyAt) {
            this.lastModifyKeyAt = lastModifyKeyAt;
            return this;
        }
        public Long getLastModifyKeyAt() {
            return this.lastModifyKeyAt;
        }

        public ListHostShareKeysResponseBodyHostShareKeys setPrivateKeyFingerPrint(String privateKeyFingerPrint) {
            this.privateKeyFingerPrint = privateKeyFingerPrint;
            return this;
        }
        public String getPrivateKeyFingerPrint() {
            return this.privateKeyFingerPrint;
        }

    }

}
