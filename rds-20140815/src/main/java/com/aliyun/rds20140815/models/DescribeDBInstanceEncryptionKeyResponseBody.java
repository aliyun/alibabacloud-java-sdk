// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeDBInstanceEncryptionKeyResponseBody extends TeaModel {
    @NameInMap("Creator")
    public String creator;

    @NameInMap("DeleteDate")
    public String deleteDate;

    @NameInMap("Description")
    public String description;

    @NameInMap("EncryptionKey")
    public String encryptionKey;

    @NameInMap("EncryptionKeyList")
    public java.util.List<DescribeDBInstanceEncryptionKeyResponseBodyEncryptionKeyList> encryptionKeyList;

    @NameInMap("EncryptionKeyStatus")
    public String encryptionKeyStatus;

    @NameInMap("KeyUsage")
    public String keyUsage;

    @NameInMap("MaterialExpireTime")
    public String materialExpireTime;

    @NameInMap("Origin")
    public String origin;

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
        @NameInMap("AliasName")
        public String aliasName;

        @NameInMap("Creator")
        public String creator;

        @NameInMap("DeleteDate")
        public String deleteDate;

        @NameInMap("Description")
        public String description;

        @NameInMap("EncryptionKey")
        public String encryptionKey;

        @NameInMap("EncryptionKeyStatus")
        public String encryptionKeyStatus;

        @NameInMap("KeyType")
        public String keyType;

        @NameInMap("KeyUsage")
        public String keyUsage;

        @NameInMap("MaterialExpireTime")
        public String materialExpireTime;

        @NameInMap("Origin")
        public String origin;

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
