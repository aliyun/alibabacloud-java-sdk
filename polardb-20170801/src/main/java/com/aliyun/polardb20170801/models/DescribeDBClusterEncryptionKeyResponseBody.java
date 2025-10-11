// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeDBClusterEncryptionKeyResponseBody extends TeaModel {
    @NameInMap("EncryptionKeyList")
    public java.util.List<DescribeDBClusterEncryptionKeyResponseBodyEncryptionKeyList> encryptionKeyList;

    /**
     * <strong>example:</strong>
     * <p>137ECCC0-920E-5B3B-9F8E-B81632108BBE</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeDBClusterEncryptionKeyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBClusterEncryptionKeyResponseBody self = new DescribeDBClusterEncryptionKeyResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDBClusterEncryptionKeyResponseBody setEncryptionKeyList(java.util.List<DescribeDBClusterEncryptionKeyResponseBodyEncryptionKeyList> encryptionKeyList) {
        this.encryptionKeyList = encryptionKeyList;
        return this;
    }
    public java.util.List<DescribeDBClusterEncryptionKeyResponseBodyEncryptionKeyList> getEncryptionKeyList() {
        return this.encryptionKeyList;
    }

    public DescribeDBClusterEncryptionKeyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeDBClusterEncryptionKeyResponseBodyEncryptionKeyList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>alias/your_default_key</p>
         */
        @NameInMap("AliasName")
        public String aliasName;

        /**
         * <strong>example:</strong>
         * <p>1****1</p>
         */
        @NameInMap("Creator")
        public String creator;

        /**
         * <strong>example:</strong>
         * <p>2026-05-08T08:14:16Z</p>
         */
        @NameInMap("DeleteDate")
        public String deleteDate;

        /**
         * <strong>example:</strong>
         * <p>Description of the key</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>51858179-afb3-4369-8329-*********</p>
         */
        @NameInMap("EncryptionKey")
        public String encryptionKey;

        /**
         * <strong>example:</strong>
         * <p>Enabled</p>
         */
        @NameInMap("EncryptionKeyStatus")
        public String encryptionKeyStatus;

        /**
         * <strong>example:</strong>
         * <p>ServiceKey</p>
         */
        @NameInMap("KeyType")
        public String keyType;

        /**
         * <strong>example:</strong>
         * <p>ENCRYPT/DECRYPT</p>
         */
        @NameInMap("KeyUsage")
        public String keyUsage;

        /**
         * <strong>example:</strong>
         * <p>2025-10-18T08:14:16Z</p>
         */
        @NameInMap("MaterialExpireTime")
        public String materialExpireTime;

        /**
         * <strong>example:</strong>
         * <p>Aliyun_KMS</p>
         */
        @NameInMap("Origin")
        public String origin;

        /**
         * <strong>example:</strong>
         * <p>DiskEncryption</p>
         */
        @NameInMap("UsedBy")
        public String usedBy;

        public static DescribeDBClusterEncryptionKeyResponseBodyEncryptionKeyList build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBClusterEncryptionKeyResponseBodyEncryptionKeyList self = new DescribeDBClusterEncryptionKeyResponseBodyEncryptionKeyList();
            return TeaModel.build(map, self);
        }

        public DescribeDBClusterEncryptionKeyResponseBodyEncryptionKeyList setAliasName(String aliasName) {
            this.aliasName = aliasName;
            return this;
        }
        public String getAliasName() {
            return this.aliasName;
        }

        public DescribeDBClusterEncryptionKeyResponseBodyEncryptionKeyList setCreator(String creator) {
            this.creator = creator;
            return this;
        }
        public String getCreator() {
            return this.creator;
        }

        public DescribeDBClusterEncryptionKeyResponseBodyEncryptionKeyList setDeleteDate(String deleteDate) {
            this.deleteDate = deleteDate;
            return this;
        }
        public String getDeleteDate() {
            return this.deleteDate;
        }

        public DescribeDBClusterEncryptionKeyResponseBodyEncryptionKeyList setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeDBClusterEncryptionKeyResponseBodyEncryptionKeyList setEncryptionKey(String encryptionKey) {
            this.encryptionKey = encryptionKey;
            return this;
        }
        public String getEncryptionKey() {
            return this.encryptionKey;
        }

        public DescribeDBClusterEncryptionKeyResponseBodyEncryptionKeyList setEncryptionKeyStatus(String encryptionKeyStatus) {
            this.encryptionKeyStatus = encryptionKeyStatus;
            return this;
        }
        public String getEncryptionKeyStatus() {
            return this.encryptionKeyStatus;
        }

        public DescribeDBClusterEncryptionKeyResponseBodyEncryptionKeyList setKeyType(String keyType) {
            this.keyType = keyType;
            return this;
        }
        public String getKeyType() {
            return this.keyType;
        }

        public DescribeDBClusterEncryptionKeyResponseBodyEncryptionKeyList setKeyUsage(String keyUsage) {
            this.keyUsage = keyUsage;
            return this;
        }
        public String getKeyUsage() {
            return this.keyUsage;
        }

        public DescribeDBClusterEncryptionKeyResponseBodyEncryptionKeyList setMaterialExpireTime(String materialExpireTime) {
            this.materialExpireTime = materialExpireTime;
            return this;
        }
        public String getMaterialExpireTime() {
            return this.materialExpireTime;
        }

        public DescribeDBClusterEncryptionKeyResponseBodyEncryptionKeyList setOrigin(String origin) {
            this.origin = origin;
            return this;
        }
        public String getOrigin() {
            return this.origin;
        }

        public DescribeDBClusterEncryptionKeyResponseBodyEncryptionKeyList setUsedBy(String usedBy) {
            this.usedBy = usedBy;
            return this;
        }
        public String getUsedBy() {
            return this.usedBy;
        }

    }

}
