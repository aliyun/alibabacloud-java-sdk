// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class DescribeEncryptionKeyResponseBody extends TeaModel {
    /**
     * <p>The Alibaba Cloud account ID of the key creator.</p>
     * 
     * <strong>example:</strong>
     * <p>17649847********</p>
     */
    @NameInMap("Creator")
    public String creator;

    /**
     * <p>The estimated time when the key is to be deleted. The time is in the <i>yyyy-MM-dd</i>T<i>HH:mm:ss</i>Z format (UTC).</p>
     * <blockquote>
     * <p>If this parameter is empty, the key will not be automatically deleted.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>2021-09-24T18:22:03Z</p>
     */
    @NameInMap("DeleteDate")
    public String deleteDate;

    /**
     * <p>The description of the key. By default, this parameter is empty.</p>
     * 
     * <strong>example:</strong>
     * <p>testkey</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The key ID of the instance.</p>
     * 
     * <strong>example:</strong>
     * <p>ad463061-992d-4195-8a94-ed63********</p>
     */
    @NameInMap("EncryptionKey")
    public String encryptionKey;

    /**
     * <p>The status of the key. Valid values:</p>
     * <ul>
     * <li><strong>Enabled</strong>: The key is available.</li>
     * <li><strong>Disabled</strong>: The key is unavailable.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Enabled</p>
     */
    @NameInMap("EncryptionKeyStatus")
    public String encryptionKeyStatus;

    /**
     * <p>The encryption algorithm.</p>
     * 
     * <strong>example:</strong>
     * <p>AES-CTR-256</p>
     */
    @NameInMap("EncryptionName")
    public String encryptionName;

    /**
     * <p>The purpose of the key. The return value <code>ENCRYPT/DECRYPT</code> indicates that the key is used for encryption and decryption.</p>
     * 
     * <strong>example:</strong>
     * <p>ENCRYPT/DECRYPT</p>
     */
    @NameInMap("KeyUsage")
    public String keyUsage;

    /**
     * <p>The expiration time of the key. The time is in the <i>yyyy-MM-dd</i>T<i>HH:mm:ss</i>Z format (UTC).</p>
     * <blockquote>
     * <p>If this parameter is empty, the key does not expire.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>2021-09-24T18:22:03Z</p>
     */
    @NameInMap("MaterialExpireTime")
    public String materialExpireTime;

    /**
     * <p>The source of the key material. The return value is <strong>Aliyun_KMS</strong>, which indicates Alibaba Cloud <a href="https://help.aliyun.com/document_detail/28935.html">Key Management Service (KMS)</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>Aliyun_KMS</p>
     */
    @NameInMap("Origin")
    public String origin;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>9A931CE5-C926-5E09-B0EC-6299C4A6****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The global resource descriptor ARN (Alibaba Cloud Resource Name) of the role to be granted authorization.</p>
     * 
     * <strong>example:</strong>
     * <p>acs:ram::123456789012****:role/AliyunRdsInstanceEncryptionDefaultRole</p>
     */
    @NameInMap("RoleArn")
    public String roleArn;

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

    public DescribeEncryptionKeyResponseBody setEncryptionName(String encryptionName) {
        this.encryptionName = encryptionName;
        return this;
    }
    public String getEncryptionName() {
        return this.encryptionName;
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

    public DescribeEncryptionKeyResponseBody setRoleArn(String roleArn) {
        this.roleArn = roleArn;
        return this;
    }
    public String getRoleArn() {
        return this.roleArn;
    }

}
