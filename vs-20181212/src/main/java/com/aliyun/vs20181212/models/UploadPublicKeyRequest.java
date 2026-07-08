// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class UploadPublicKeyRequest extends TeaModel {
    /**
     * <p>Base64-encoded public key content.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>verify_dffeb6610035dcb77b413a59c3*****</p>
     */
    @NameInMap("Content")
    public String content;

    /**
     * <p>Description of the public key.</p>
     * 
     * <strong>example:</strong>
     * <p>测试使用</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>Group for the public key. Used for public key management.</p>
     * <ol>
     * <li><p>Length: 0 to 255 characters.</p>
     * </li>
     * <li><p>Valid characters: lowercase letters, digits, underscores (_), hyphens (-), and periods (.).</p>
     * </li>
     * <li><p>First character must be a letter or digit.</p>
     * </li>
     * </ol>
     * 
     * <strong>example:</strong>
     * <p>g-test</p>
     */
    @NameInMap("KeyGroup")
    public String keyGroup;

    /**
     * <p>Name of the public key. Must be unique.</p>
     * <ol>
     * <li><p>Length: 8 to 255 characters.</p>
     * </li>
     * <li><p>Valid characters: lowercase letters, digits, underscores (_), hyphens (-), and periods (.).</p>
     * </li>
     * <li><p>First character must be a letter or digit.</p>
     * </li>
     * <li><p>Prefix cannot be group-.</p>
     * </li>
     * </ol>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>mykey-v1.0</p>
     */
    @NameInMap("KeyName")
    public String keyName;

    /**
     * <p>Type of the public key. Valid values:</p>
     * <ul>
     * <li><p><strong>adb</strong>: ADB key.</p>
     * </li>
     * <li><p><strong>ssh</strong>: SSH key.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ssh</p>
     */
    @NameInMap("KeyType")
    public String keyType;

    public static UploadPublicKeyRequest build(java.util.Map<String, ?> map) throws Exception {
        UploadPublicKeyRequest self = new UploadPublicKeyRequest();
        return TeaModel.build(map, self);
    }

    public UploadPublicKeyRequest setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public UploadPublicKeyRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UploadPublicKeyRequest setKeyGroup(String keyGroup) {
        this.keyGroup = keyGroup;
        return this;
    }
    public String getKeyGroup() {
        return this.keyGroup;
    }

    public UploadPublicKeyRequest setKeyName(String keyName) {
        this.keyName = keyName;
        return this;
    }
    public String getKeyName() {
        return this.keyName;
    }

    public UploadPublicKeyRequest setKeyType(String keyType) {
        this.keyType = keyType;
        return this;
    }
    public String getKeyType() {
        return this.keyType;
    }

}
