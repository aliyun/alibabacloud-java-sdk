// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.workorder20210610.models;

import com.aliyun.tea.*;

public class CreateTicketShrinkRequest extends TeaModel {
    @NameInMap("CategoryId")
    public String categoryId;

    @NameInMap("CreatorId")
    public String creatorId;

    @NameInMap("Description")
    public String description;

    @NameInMap("Email")
    public String email;

    @NameInMap("FileNameList")
    public String fileNameListShrink;

    @NameInMap("SecretInfo")
    public String secretInfoShrink;

    @NameInMap("Severity")
    public Integer severity;

    @NameInMap("Title")
    public String title;

    public static CreateTicketShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateTicketShrinkRequest self = new CreateTicketShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateTicketShrinkRequest setCategoryId(String categoryId) {
        this.categoryId = categoryId;
        return this;
    }
    public String getCategoryId() {
        return this.categoryId;
    }

    public CreateTicketShrinkRequest setCreatorId(String creatorId) {
        this.creatorId = creatorId;
        return this;
    }
    public String getCreatorId() {
        return this.creatorId;
    }

    public CreateTicketShrinkRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateTicketShrinkRequest setEmail(String email) {
        this.email = email;
        return this;
    }
    public String getEmail() {
        return this.email;
    }

    public CreateTicketShrinkRequest setFileNameListShrink(String fileNameListShrink) {
        this.fileNameListShrink = fileNameListShrink;
        return this;
    }
    public String getFileNameListShrink() {
        return this.fileNameListShrink;
    }

    public CreateTicketShrinkRequest setSecretInfoShrink(String secretInfoShrink) {
        this.secretInfoShrink = secretInfoShrink;
        return this;
    }
    public String getSecretInfoShrink() {
        return this.secretInfoShrink;
    }

    public CreateTicketShrinkRequest setSeverity(Integer severity) {
        this.severity = severity;
        return this;
    }
    public Integer getSeverity() {
        return this.severity;
    }

    public CreateTicketShrinkRequest setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

}
