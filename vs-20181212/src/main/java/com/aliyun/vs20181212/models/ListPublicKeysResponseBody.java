// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class ListPublicKeysResponseBody extends TeaModel {
    /**
     * <p>The page number of the returned list.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Long pageNumber;

    /**
     * <p>The number of entries returned on each page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <p>A list of public keys.</p>
     */
    @NameInMap("PublicKeys")
    public java.util.List<ListPublicKeysResponseBodyPublicKeys> publicKeys;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>BEA5625F-8FCF-48F4-851B-CA63946DA664</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of records.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    public static ListPublicKeysResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListPublicKeysResponseBody self = new ListPublicKeysResponseBody();
        return TeaModel.build(map, self);
    }

    public ListPublicKeysResponseBody setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public ListPublicKeysResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListPublicKeysResponseBody setPublicKeys(java.util.List<ListPublicKeysResponseBodyPublicKeys> publicKeys) {
        this.publicKeys = publicKeys;
        return this;
    }
    public java.util.List<ListPublicKeysResponseBodyPublicKeys> getPublicKeys() {
        return this.publicKeys;
    }

    public ListPublicKeysResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListPublicKeysResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListPublicKeysResponseBodyPublicKeys extends TeaModel {
        /**
         * <p>The content of the public key. The content is encoded in Base64 format by default.</p>
         * 
         * <strong>example:</strong>
         * <p>verify_30d89ccb0905c8c7882c1d14a991954b</p>
         */
        @NameInMap("Content")
        public String content;

        /**
         * <p>The description of the public key.</p>
         * 
         * <strong>example:</strong>
         * <p>测试使用</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The public key group.</p>
         * 
         * <strong>example:</strong>
         * <p>mygroup</p>
         */
        @NameInMap("KeyGroup")
        public String keyGroup;

        /**
         * <p>The name of the public key.</p>
         * 
         * <strong>example:</strong>
         * <p>mykey</p>
         */
        @NameInMap("KeyName")
        public String keyName;

        /**
         * <p>The type of the public key. Valid values:</p>
         * <ul>
         * <li><p><strong>adb</strong>: ADB key</p>
         * </li>
         * <li><p><strong>ssh</strong>: SSH key</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ssh</p>
         */
        @NameInMap("KeyType")
        public String keyType;

        /**
         * <p>The time when the public key was uploaded.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-06-11T14:26:48+08:00</p>
         */
        @NameInMap("UploadTime")
        public String uploadTime;

        public static ListPublicKeysResponseBodyPublicKeys build(java.util.Map<String, ?> map) throws Exception {
            ListPublicKeysResponseBodyPublicKeys self = new ListPublicKeysResponseBodyPublicKeys();
            return TeaModel.build(map, self);
        }

        public ListPublicKeysResponseBodyPublicKeys setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public ListPublicKeysResponseBodyPublicKeys setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListPublicKeysResponseBodyPublicKeys setKeyGroup(String keyGroup) {
            this.keyGroup = keyGroup;
            return this;
        }
        public String getKeyGroup() {
            return this.keyGroup;
        }

        public ListPublicKeysResponseBodyPublicKeys setKeyName(String keyName) {
            this.keyName = keyName;
            return this;
        }
        public String getKeyName() {
            return this.keyName;
        }

        public ListPublicKeysResponseBodyPublicKeys setKeyType(String keyType) {
            this.keyType = keyType;
            return this;
        }
        public String getKeyType() {
            return this.keyType;
        }

        public ListPublicKeysResponseBodyPublicKeys setUploadTime(String uploadTime) {
            this.uploadTime = uploadTime;
            return this;
        }
        public String getUploadTime() {
            return this.uploadTime;
        }

    }

}
