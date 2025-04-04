// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class ListHostShareKeysResponseBody extends TeaModel {
    /**
     * <p>An array that consists of the shared keys.</p>
     */
    @NameInMap("HostShareKeys")
    public java.util.List<ListHostShareKeysResponseBodyHostShareKeys> hostShareKeys;

    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>EC9BF0F4-8983-491A-BC8C-1B4DD94976DE</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of the shared keys.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
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
        /**
         * <p>The number of the associated host accounts.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("HostAccountCount")
        public Long hostAccountCount;

        /**
         * <p>The shared key ID.</p>
         * 
         * <strong>example:</strong>
         * <p>10247</p>
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
         * <p>The time when the shared key was last modified. The value is a UNIX timestamp. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1644806406</p>
         */
        @NameInMap("LastModifyKeyAt")
        public Long lastModifyKeyAt;

        /**
         * <p>The fingerprint of the private key.</p>
         * 
         * <strong>example:</strong>
         * <hr>
         */
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
