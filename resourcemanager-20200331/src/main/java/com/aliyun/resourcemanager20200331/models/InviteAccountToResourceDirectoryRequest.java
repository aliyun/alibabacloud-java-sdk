// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20200331.models;

import com.aliyun.tea.*;

public class InviteAccountToResourceDirectoryRequest extends TeaModel {
    /**
     * <p>The comment on the invitation.</p>
     * <br>
     * <p>The comment can be up to 1,024 characters in length.</p>
     */
    @NameInMap("Note")
    public String note;

    /**
     * <p>The tag key and value.</p>
     */
    @NameInMap("Tag")
    public java.util.List<InviteAccountToResourceDirectoryRequestTag> tag;

    /**
     * <p>The ID or logon email address of the account that you want to invite.</p>
     */
    @NameInMap("TargetEntity")
    public String targetEntity;

    /**
     * <p>The type of the account. Valid values:</p>
     * <br>
     * <p>*   Account: indicates the ID of the account.</p>
     * <p>*   Email: indicates the logon email address of the account.</p>
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
         * <p>A tag key.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>A tag value.</p>
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
