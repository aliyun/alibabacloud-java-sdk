// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20200331.models;

import com.aliyun.tea.*;

public class InviteAccountToResourceDirectoryRequest extends TeaModel {
    /**
     * <p>The remarks.</p>
     * <p>Maximum length: 1024 characters.</p>
     * 
     * <strong>example:</strong>
     * <p>Welcome to join</p>
     */
    @NameInMap("Note")
    public String note;

    /**
     * <p>The tags.</p>
     */
    @NameInMap("Tag")
    public java.util.List<InviteAccountToResourceDirectoryRequestTag> tag;

    /**
     * <p>The ID or logon email address of the account that is invited.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="mailto:someone@example.com">someone@example.com</a></p>
     */
    @NameInMap("TargetEntity")
    public String targetEntity;

    /**
     * <p>The type of the account that is invited. Valid values:</p>
     * <ul>
     * <li>Account: account ID.</li>
     * <li>Email: logon email address of the account.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Email</p>
     */
    @NameInMap("TargetType")
    public String targetType;

    public static InviteAccountToResourceDirectoryRequest build(java.util.Map<String, ?> map) throws Exception {
        InviteAccountToResourceDirectoryRequest self = new InviteAccountToResourceDirectoryRequest();
        return TeaModel.build(map, self);
    }

    public InviteAccountToResourceDirectoryRequest setNote(String note) {
        this.note = note;
        return this;
    }
    public String getNote() {
        return this.note;
    }

    public InviteAccountToResourceDirectoryRequest setTag(java.util.List<InviteAccountToResourceDirectoryRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<InviteAccountToResourceDirectoryRequestTag> getTag() {
        return this.tag;
    }

    public InviteAccountToResourceDirectoryRequest setTargetEntity(String targetEntity) {
        this.targetEntity = targetEntity;
        return this;
    }
    public String getTargetEntity() {
        return this.targetEntity;
    }

    public InviteAccountToResourceDirectoryRequest setTargetType(String targetType) {
        this.targetType = targetType;
        return this;
    }
    public String getTargetType() {
        return this.targetType;
    }

    public static class InviteAccountToResourceDirectoryRequestTag extends TeaModel {
        /**
         * <p>The tag key.</p>
         * 
         * <strong>example:</strong>
         * <p>k1</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value.</p>
         * 
         * <strong>example:</strong>
         * <p>v1</p>
         */
        @NameInMap("Value")
        public String value;

        public static InviteAccountToResourceDirectoryRequestTag build(java.util.Map<String, ?> map) throws Exception {
            InviteAccountToResourceDirectoryRequestTag self = new InviteAccountToResourceDirectoryRequestTag();
            return TeaModel.build(map, self);
        }

        public InviteAccountToResourceDirectoryRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public InviteAccountToResourceDirectoryRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
