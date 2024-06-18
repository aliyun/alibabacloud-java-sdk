// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeDBInstanceEncryptionKeyResponseBody extends TeaModel {
    /**
     * <p>The user who created the key.</p>
     * 
     * <strong>example:</strong>
     * <p>1443*****9604</p>
     */
    @NameInMap("Creator")
    public String creator;

    /**
     * <p>The scheduled time at which the key is deleted. The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</p>
     * 
     * <strong>example:</strong>
     * <p>2022-05-08T08:14:16Z</p>
     */
    @NameInMap("DeleteDate")
    public String deleteDate;

    /**
     * <p>The description of the key.</p>
     * 
     * <strong>example:</strong>
     * <p>Description of the key</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The ID of the key.</p>
     * 
     * <strong>example:</strong>
     * <p>5306d1b6-7fd3-42d9-9511-xxxxxxx</p>
     */
    @NameInMap("EncryptionKey")
    public String encryptionKey;

    /**
     * <p>The details about the key.</p>
     */
    @NameInMap("EncryptionKeyList")
    public java.util.List<DescribeDBInstanceEncryptionKeyResponseBodyEncryptionKeyList> encryptionKeyList;

    /**
     * <p>The status of the key. Valid values:</p>
     * <ul>
     * <li><strong>Enabled</strong></li>
     * <li><strong>Disabled</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Enabled</p>
     */
    @NameInMap("EncryptionKeyStatus")
    public String encryptionKeyStatus;

    /**
     * <p>The purpose of the key.</p>
     * 
     * <strong>example:</strong>
     * <p>ENCRYPT/DECRYPT</p>
     */
    @NameInMap("KeyUsage")
    public String keyUsage;

    /**
     * <p>The time at which the key expires. The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</p>
     * 
     * <strong>example:</strong>
     * <p>2021-10-18T08:14:16Z</p>
     */
    @NameInMap("MaterialExpireTime")
    public String materialExpireTime;

    /**
     * <p>The source of the key.</p>
     * 
     * <strong>example:</strong>
     * <p>Aliyun_KMS</p>
     */
    @NameInMap("Origin")
    public String origin;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>3BC2768E-DEDA-40FC-BBE9-6B884F3626AF</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeDBInstanceEncryptionKeyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBInstanceEncryptionKeyResponseBody self = new DescribeDBInstanceEncryptionKeyResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDBInstanceEncryptionKeyResponseBody setCreator(String creator) {
        this.creator = creator;
        return this;
    }
    public String getCreator() {
        return this.creator;
    }

    public DescribeDBInstanceEncryptionKeyResponseBody setDeleteDate(String deleteDate) {
        this.deleteDate = deleteDate;
        return this;
    }
    public String getDeleteDate() {
        return this.deleteDate;
    }

    public DescribeDBInstanceEncryptionKeyResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public DescribeDBInstanceEncryptionKeyResponseBody setEncryptionKey(String encryptionKey) {
        this.encryptionKey = encryptionKey;
        return this;
    }
    public String getEncryptionKey() {
        return this.encryptionKey;
    }

    public DescribeDBInstanceEncryptionKeyResponseBody setEncryptionKeyList(java.util.List<DescribeDBInstanceEncryptionKeyResponseBodyEncryptionKeyList> encryptionKeyList) {
        this.encryptionKeyList = encryptionKeyList;
        return this;
    }
    public java.util.List<DescribeDBInstanceEncryptionKeyResponseBodyEncryptionKeyList> getEncryptionKeyList() {
        return this.encryptionKeyList;
    }

    public DescribeDBInstanceEncryptionKeyResponseBody setEncryptionKeyStatus(String encryptionKeyStatus) {
        this.encryptionKeyStatus = encryptionKeyStatus;
        return this;
    }
    public String getEncryptionKeyStatus() {
        return this.encryptionKeyStatus;
    }

    public DescribeDBInstanceEncryptionKeyResponseBody setKeyUsage(String keyUsage) {
        this.keyUsage = keyUsage;
        return this;
    }
    public String getKeyUsage() {
        return this.keyUsage;
    }

    public DescribeDBInstanceEncryptionKeyResponseBody setMaterialExpireTime(String materialExpireTime) {
        this.materialExpireTime = materialExpireTime;
        return this;
    }
    public String getMaterialExpireTime() {
        return this.materialExpireTime;
    }

    public DescribeDBInstanceEncryptionKeyResponseBody setOrigin(String origin) {
        this.origin = origin;
        return this;
    }
    public String getOrigin() {
        return this.origin;
    }

    public DescribeDBInstanceEncryptionKeyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeDBInstanceEncryptionKeyResponseBodyEncryptionKeyList extends TeaModel {
        /**
         * <p>The alias of the key.</p>
         * 
         * <strong>example:</strong>
         * <p>alias/xxx</p>
         */
        @NameInMap("AliasName")
        public String aliasName;

        /**
         * <p>The user who created the key.</p>
         * 
         * <strong>example:</strong>
         * <p>1443*****9604</p>
         */
        @NameInMap("Creator")
        public String creator;

        /**
         * <p>The scheduled time at which the key is deleted. The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-05-08T08:14:16Z</p>
         */
        @NameInMap("DeleteDate")
        public String deleteDate;

        /**
         * <p>The description of the key.</p>
         * 
         * <strong>example:</strong>
         * <p>Description of the key</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The ID of the key.</p>
         * 
         * <strong>example:</strong>
         * <p>5306d1b6-7fd3-42d9-9511-xxxxxxx</p>
         */
        @NameInMap("EncryptionKey")
        public String encryptionKey;

        /**
         * <p>The status of the key. Valid values:</p>
         * <ul>
         * <li><strong>Enabled</strong></li>
         * <li><strong>Disabled</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Enabled</p>
         */
        @NameInMap("EncryptionKeyStatus")
        public String encryptionKeyStatus;

        /**
         * <p>The type of the key. Valid values:</p>
         * <ul>
         * <li><strong>CMK</strong></li>
         * <li><strong>ServiceKey</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ServiceKey</p>
         */
        @NameInMap("KeyType")
        public String keyType;

        /**
         * <p>The purpose of the key.</p>
         * 
         * <strong>example:</strong>
         * <p>ENCRYPT/DECRYPT</p>
         */
        @NameInMap("KeyUsage")
        public String keyUsage;

        /**
         * <p>The time at which the key expires. The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-10-18T08:14:16Z</p>
         */
        @NameInMap("MaterialExpireTime")
        public String materialExpireTime;

        /**
         * <p>The source of the key.</p>
         * 
         * <strong>example:</strong>
         * <p>Aliyun_KMS</p>
         */
        @NameInMap("Origin")
        public String origin;

        /**
         * <p>The role of the instance. Valid values:</p>
         * <ul>
         * <li><strong>Master</strong>: primary instance</li>
         * <li><strong>slave</strong>: read-only instance</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Master</p>
         */
        @NameInMap("UsedBy")
        public String usedBy;

        public static DescribeDBInstanceEncryptionKeyResponseBodyEncryptionKeyList build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBInstanceEncryptionKeyResponseBodyEncryptionKeyList self = new DescribeDBInstanceEncryptionKeyResponseBodyEncryptionKeyList();
            return TeaModel.build(map, self);
        }

        public DescribeDBInstanceEncryptionKeyResponseBodyEncryptionKeyList setAliasName(String aliasName) {
            this.aliasName = aliasName;
            return this;
        }
        public String getAliasName() {
            return this.aliasName;
        }

        public DescribeDBInstanceEncryptionKeyResponseBodyEncryptionKeyList setCreator(String creator) {
            this.creator = creator;
            return this;
        }
        public String getCreator() {
            return this.creator;
        }

        public DescribeDBInstanceEncryptionKeyResponseBodyEncryptionKeyList setDeleteDate(String deleteDate) {
            this.deleteDate = deleteDate;
            return this;
        }
        public String getDeleteDate() {
            return this.deleteDate;
        }

        public DescribeDBInstanceEncryptionKeyResponseBodyEncryptionKeyList setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeDBInstanceEncryptionKeyResponseBodyEncryptionKeyList setEncryptionKey(String encryptionKey) {
            this.encryptionKey = encryptionKey;
            return this;
        }
        public String getEncryptionKey() {
            return this.encryptionKey;
        }

        public DescribeDBInstanceEncryptionKeyResponseBodyEncryptionKeyList setEncryptionKeyStatus(String encryptionKeyStatus) {
            this.encryptionKeyStatus = encryptionKeyStatus;
            return this;
        }
        public String getEncryptionKeyStatus() {
            return this.encryptionKeyStatus;
        }

        public DescribeDBInstanceEncryptionKeyResponseBodyEncryptionKeyList setKeyType(String keyType) {
            this.keyType = keyType;
            return this;
        }
        public String getKeyType() {
            return this.keyType;
        }

        public DescribeDBInstanceEncryptionKeyResponseBodyEncryptionKeyList setKeyUsage(String keyUsage) {
            this.keyUsage = keyUsage;
            return this;
        }
        public String getKeyUsage() {
            return this.keyUsage;
        }

        public DescribeDBInstanceEncryptionKeyResponseBodyEncryptionKeyList setMaterialExpireTime(String materialExpireTime) {
            this.materialExpireTime = materialExpireTime;
            return this;
        }
        public String getMaterialExpireTime() {
            return this.materialExpireTime;
        }

        public DescribeDBInstanceEncryptionKeyResponseBodyEncryptionKeyList setOrigin(String origin) {
            this.origin = origin;
            return this;
        }
        public String getOrigin() {
            return this.origin;
        }

        public DescribeDBInstanceEncryptionKeyResponseBodyEncryptionKeyList setUsedBy(String usedBy) {
            this.usedBy = usedBy;
            return this;
        }
        public String getUsedBy() {
            return this.usedBy;
        }

    }

}
