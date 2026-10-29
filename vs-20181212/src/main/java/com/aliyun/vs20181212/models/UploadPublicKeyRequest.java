// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class UploadPublicKeyRequest extends TeaModel {
    /**
     * <p>The encoded content of the public key. The default encoding format is Base64.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>verify_dffeb6610035dcb77b413a59c3*****</p>
     */
    @NameInMap("Content")
    public String content;

    /**
     * <p>The description of the public key.</p>
     * 
     * <strong>example:</strong>
     * <p>For testing purposes</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The group of the public key. Used for public key management.
     * Naming conventions:</p>
     * <ol>
     * <li>The length must be 0 to 255 characters.</li>
     * <li>The name can contain lowercase letters, digits, underscores (_), hyphens (-), and periods (.).</li>
     * <li>The first character must be a letter or a digit.</li>
     * </ol>
     * 
     * <strong>example:</strong>
     * <p>g-test</p>
     */
    @NameInMap("KeyGroup")
    public String keyGroup;

    /**
     * <p>The name of the public key. The name must be unique.
     * Naming conventions:</p>
     * <ol>
     * <li>The length must be 8 to 255 characters.</li>
     * <li>The name can contain lowercase letters, digits, underscores (_), hyphens (-), and periods (.).</li>
     * <li>The first character must be a letter or a digit.</li>
     * <li>The prefix cannot be &quot;group-&quot;.</li>
     * </ol>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>mykey-v1.0</p>
     */
    @NameInMap("KeyName")
    public String keyName;

    /**
     * <p>The type of the public key. Valid values:</p>
     * <ul>
     * <li><strong>adb</strong>: ADB key.</li>
     * <li><strong>ssh</strong>: SSH key.</li>
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
