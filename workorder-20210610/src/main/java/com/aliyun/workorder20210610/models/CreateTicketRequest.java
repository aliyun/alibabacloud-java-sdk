// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.workorder20210610.models;

import com.aliyun.tea.*;

public class CreateTicketRequest extends TeaModel {
    @NameInMap("CategoryId")
    public String categoryId;

    @NameInMap("CreatorId")
    public String creatorId;

    @NameInMap("Description")
    public String description;

    @NameInMap("Email")
    public String email;

    @NameInMap("FileNameList")
    public java.util.List<String> fileNameList;

    @NameInMap("SecretInfo")
    public CreateTicketRequestSecretInfo secretInfo;

    @NameInMap("Severity")
    public Integer severity;

    @NameInMap("Title")
    public String title;

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

    public CreateTicketRequest setCreatorId(String creatorId) {
        this.creatorId = creatorId;
        return this;
    }
    public String getCreatorId() {
        return this.creatorId;
    }

    public CreateTicketRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateTicketRequest setEmail(String email) {
        this.email = email;
        return this;
    }
    public String getEmail() {
        return this.email;
    }

    public CreateTicketRequest setFileNameList(java.util.List<String> fileNameList) {
        this.fileNameList = fileNameList;
        return this;
    }
    public java.util.List<String> getFileNameList() {
        return this.fileNameList;
    }

    public CreateTicketRequest setSecretInfo(CreateTicketRequestSecretInfo secretInfo) {
        this.secretInfo = secretInfo;
        return this;
    }
    public CreateTicketRequestSecretInfo getSecretInfo() {
        return this.secretInfo;
    }

    public CreateTicketRequest setSeverity(Integer severity) {
        this.severity = severity;
        return this;
    }
    public Integer getSeverity() {
        return this.severity;
    }

    public CreateTicketRequest setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

    public static class CreateTicketRequestSecretInfo extends TeaModel {
        @NameInMap("Content")
        public String content;

        @NameInMap("FileNameList")
        public java.util.List<String> fileNameList;

        public static CreateTicketRequestSecretInfo build(java.util.Map<String, ?> map) throws Exception {
            CreateTicketRequestSecretInfo self = new CreateTicketRequestSecretInfo();
            return TeaModel.build(map, self);
        }

        public CreateTicketRequestSecretInfo setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public CreateTicketRequestSecretInfo setFileNameList(java.util.List<String> fileNameList) {
            this.fileNameList = fileNameList;
            return this;
        }
        public java.util.List<String> getFileNameList() {
            return this.fileNameList;
        }

    }

}
