// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class DescribeEncryptionKeyResponseBody extends TeaModel {
    /**
     * <p>The ID of the Alibaba Cloud account that is used to create the custom key.</p>
     * 
     * <strong>example:</strong>
     * <p>17649847********</p>
     */
    @NameInMap("Creator")
    public String creator;

    /**
     * <p>The time when the custom key is expected to be deleted. The time follows the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time is displayed in UTC.</p>
     * <blockquote>
     * <p>If the return value is an empty string, the custom key cannot be automatically deleted.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>2021-09-24T18:22:03Z</p>
     */
    @NameInMap("DeleteDate")
    public String deleteDate;

    /**
     * <p>The description of the custom key. By default, an empty string is returned.</p>
     * 
     * <strong>example:</strong>
     * <p>testkey</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The ID of the custom key.</p>
     * 
     * <strong>example:</strong>
     * <p>ad463061-992d-4195-8a94-ed63********</p>
     */
    @NameInMap("EncryptionKey")
    public String encryptionKey;

    /**
     * <p>The state of the custom key. Valid values:</p>
     * <ul>
     * <li><strong>Enabled</strong>: The custom key is available.</li>
     * <li><strong>Disabled</strong>: The custom key is unavailable.</li>
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
     * <p>The purpose of the custom key. A value of <code>ENCRYPT/DECRYPT</code> indicates encryption and decryption.</p>
     * 
     * <strong>example:</strong>
     * <p>ENCRYPT/DECRYPT</p>
     */
    @NameInMap("KeyUsage")
    public String keyUsage;

    /**
     * <p>The time when the custom key expires. The time follows the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time is displayed in UTC.</p>
     * <blockquote>
     * <p>If the return value is an empty string, the custom key does not expire.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>2021-09-24T18:22:03Z</p>
     */
    @NameInMap("MaterialExpireTime")
    public String materialExpireTime;

    /**
     * <p>The source of the custom key. A value of <strong>Aliyun_KMS</strong> indicates <a href="https://help.aliyun.com/document_detail/28935.html">Key Management Service (KMS)</a> of Alibaba Cloud.</p>
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
     * <p>9A931CE5-C926-5E09-B0EC-6299C4A6****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The Alibaba Cloud Resource Name (ARN) of the Resource Access Management (RAM) role to which you want to grant permissions.</p>
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
