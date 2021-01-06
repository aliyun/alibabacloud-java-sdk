// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20200331.models;

import com.aliyun.tea.*;

public class InviteAccountToResourceDirectoryRequest extends TeaModel {
    @NameInMap("TargetEntity")
    @Validation(required = true)
    public String targetEntity;

    @NameInMap("TargetType")
    @Validation(required = true)
    public String targetType;

    @NameInMap("Note")
    public String note;

    public static InviteAccountToResourceDirectoryRequest build(java.util.Map<String, ?> map) throws Exception {
        InviteAccountToResourceDirectoryRequest self = new InviteAccountToResourceDirectoryRequest();
        return TeaModel.build(map, self);
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

    public InviteAccountToResourceDirectoryRequest setNote(String note) {
        this.note = note;
        return this;
    }
    public String getNote() {
        return this.note;
    }

}
