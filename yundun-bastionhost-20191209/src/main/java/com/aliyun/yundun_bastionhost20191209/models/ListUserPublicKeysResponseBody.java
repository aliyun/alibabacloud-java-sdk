// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class ListUserPublicKeysResponseBody extends TeaModel {
    /**
     * <p>An array that consists of the public keys of the user.</p>
     */
    @NameInMap("PublicKeys")
    public java.util.List<ListUserPublicKeysResponseBodyPublicKeys> publicKeys;

    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>EC9BF0F4-8983-491A-BC8C-1B4DD94976DE</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of public keys.</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    public static ListUserPublicKeysResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListUserPublicKeysResponseBody self = new ListUserPublicKeysResponseBody();
        return TeaModel.build(map, self);
    }

    public ListUserPublicKeysResponseBody setPublicKeys(java.util.List<ListUserPublicKeysResponseBodyPublicKeys> publicKeys) {
        this.publicKeys = publicKeys;
        return this;
    }
    public java.util.List<ListUserPublicKeysResponseBodyPublicKeys> getPublicKeys() {
        return this.publicKeys;
    }

    public ListUserPublicKeysResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListUserPublicKeysResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListUserPublicKeysResponseBodyPublicKeys extends TeaModel {
        /**
         * <p>The description of the public key.</p>
         * 
         * <strong>example:</strong>
         * <p>comment</p>
         */
        @NameInMap("Comment")
        public String comment;

        /**
         * <p>The fingerprint of the public key.</p>
         * 
         * <strong>example:</strong>
         * <p>d8:7d:b6:27:70:2d:07:fb:c6:b6:66:0a:86:7b:0f:9a</p>
         */
        @NameInMap("FingerPrint")
        public String fingerPrint;

        /**
         * <p>The ID of the public key.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PublicKeyId")
        public String publicKeyId;

        /**
         * <p>The name of the public key.</p>
         * 
         * <strong>example:</strong>
         * <p>Keyname</p>
         */
        @NameInMap("PublicKeyName")
        public String publicKeyName;

        /**
         * <p>The ID of the user to which the public key belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("UserId")
        public String userId;

        public static ListUserPublicKeysResponseBodyPublicKeys build(java.util.Map<String, ?> map) throws Exception {
            ListUserPublicKeysResponseBodyPublicKeys self = new ListUserPublicKeysResponseBodyPublicKeys();
            return TeaModel.build(map, self);
        }

        public ListUserPublicKeysResponseBodyPublicKeys setComment(String comment) {
            this.comment = comment;
            return this;
        }
        public String getComment() {
            return this.comment;
        }

        public ListUserPublicKeysResponseBodyPublicKeys setFingerPrint(String fingerPrint) {
            this.fingerPrint = fingerPrint;
            return this;
        }
        public String getFingerPrint() {
            return this.fingerPrint;
        }

        public ListUserPublicKeysResponseBodyPublicKeys setPublicKeyId(String publicKeyId) {
            this.publicKeyId = publicKeyId;
            return this;
        }
        public String getPublicKeyId() {
            return this.publicKeyId;
        }

        public ListUserPublicKeysResponseBodyPublicKeys setPublicKeyName(String publicKeyName) {
            this.publicKeyName = publicKeyName;
            return this;
        }
        public String getPublicKeyName() {
            return this.publicKeyName;
        }

        public ListUserPublicKeysResponseBodyPublicKeys setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

}
