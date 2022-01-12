// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class DescribeEncryptionKeyResponseBody extends TeaModel {
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

    @NameInMap("KeyUsage")
    public String keyUsage;

    @NameInMap("MaterialExpireTime")
    public String materialExpireTime;

    @NameInMap("Origin")
    public String origin;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeEncryptionKeyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeEncryptionKeyResponseBody self = new DescribeEncryptionKeyResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeEncryptionKeyResponseBody setCreator(String creator) {
        this.creator = creator;
        return this;
    }
    public String getCreator() {
        return this.creator;
    }

    public DescribeEncryptionKeyResponseBody setDeleteDate(String deleteDate) {
        this.deleteDate = deleteDate;
        return this;
    }
    public String getDeleteDate() {
        return this.deleteDate;
    }

    public DescribeEncryptionKeyResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public DescribeEncryptionKeyResponseBody setEncryptionKey(String encryptionKey) {
        this.encryptionKey = encryptionKey;
        return this;
    }
    public String getEncryptionKey() {
        return this.encryptionKey;
    }

    public DescribeEncryptionKeyResponseBody setEncryptionKeyStatus(String encryptionKeyStatus) {
        this.encryptionKeyStatus = encryptionKeyStatus;
        return this;
    }
    public String getEncryptionKeyStatus() {
        return this.encryptionKeyStatus;
    }

    public DescribeEncryptionKeyResponseBody setKeyUsage(String keyUsage) {
        this.keyUsage = keyUsage;
        return this;
    }
    public String getKeyUsage() {
        return this.keyUsage;
    }

    public DescribeEncryptionKeyResponseBody setMaterialExpireTime(String materialExpireTime) {
        this.materialExpireTime = materialExpireTime;
        return this;
    }
    public String getMaterialExpireTime() {
        return this.materialExpireTime;
    }

    public DescribeEncryptionKeyResponseBody setOrigin(String origin) {
        this.origin = origin;
        return this;
    }
    public String getOrigin() {
        return this.origin;
    }

    public DescribeEncryptionKeyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
