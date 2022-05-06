// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class CreateNotifyRequest extends TeaModel {
    // A short description of struct
    @NameInMap("IdempotentId")
    public String idempotentId;

    // A short description of struct
    @NameInMap("Level")
    public String level;

    // A short description of struct
    @NameInMap("NotifyElement")
    public String notifyElement;

    // A short description of struct
    @NameInMap("TemplateName")
    public String templateName;

    // A short description of struct
    @NameInMap("Type")
    public String type;

    public static CreateNotifyRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateNotifyRequest self = new CreateNotifyRequest();
        return TeaModel.build(map, self);
    }

    public CreateNotifyRequest setIdempotentId(String idempotentId) {
        this.idempotentId = idempotentId;
        return this;
    }
    public String getIdempotentId() {
        return this.idempotentId;
    }

    public CreateNotifyRequest setLevel(String level) {
        this.level = level;
        return this;
    }
    public String getLevel() {
        return this.level;
    }

    public CreateNotifyRequest setNotifyElement(String notifyElement) {
        this.notifyElement = notifyElement;
        return this;
    }
    public String getNotifyElement() {
        return this.notifyElement;
    }

    public CreateNotifyRequest setTemplateName(String templateName) {
        this.templateName = templateName;
        return this;
    }
    public String getTemplateName() {
        return this.templateName;
    }

    public CreateNotifyRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
