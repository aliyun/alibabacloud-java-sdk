// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcedirectorymaster20220419.models;

import com.aliyun.tea.*;

public class InviteAccountToResourceDirectoryRequest extends TeaModel {
    @NameInMap("Note")
    public String note;

    @NameInMap("ParentFolderId")
    public String parentFolderId;

    @NameInMap("Tag")
    public java.util.List<InviteAccountToResourceDirectoryRequestTag> tag;

    @NameInMap("TargetEntity")
    public String targetEntity;

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

    public InviteAccountToResourceDirectoryRequest setParentFolderId(String parentFolderId) {
        this.parentFolderId = parentFolderId;
        return this;
    }
    public String getParentFolderId() {
        return this.parentFolderId;
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
        @NameInMap("Key")
        public String key;

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
