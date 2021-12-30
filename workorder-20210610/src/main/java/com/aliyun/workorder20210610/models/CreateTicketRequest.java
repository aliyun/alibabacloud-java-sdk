// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.workorder20210610.models;

import com.aliyun.tea.*;

public class CreateTicketRequest extends TeaModel {
    @NameInMap("CategoryId")
    public String categoryId;

    @NameInMap("Description")
    public String description;

    @NameInMap("Severity")
    public Integer severity;

    public static CreateTicketRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateTicketRequest self = new CreateTicketRequest();
        return TeaModel.build(map, self);
    }

    public CreateTicketRequest setCategoryId(String categoryId) {
        this.categoryId = categoryId;
        return this;
    }
    public String getCategoryId() {
        return this.categoryId;
    }

    public CreateTicketRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateTicketRequest setSeverity(Integer severity) {
        this.severity = severity;
        return this;
    }
    public Integer getSeverity() {
        return this.severity;
    }

}
