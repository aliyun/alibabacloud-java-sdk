// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.workorder20210610.models;

import com.aliyun.tea.*;

public class CreateTicketRequest extends TeaModel {
    /**
     * <p>The ID of the issue category. Obtain this ID from the ListCategories operation.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>53812</p>
     */
    @NameInMap("CategoryId")
    public String categoryId;

    /**
     * <p>The Alibaba Cloud UID of the account that submits the ticket. This parameter is required for Marketplace reseller scenarios.</p>
     * 
     * <strong>example:</strong>
     * <p>1289427240739141</p>
     */
    @NameInMap("CreatorId")
    public String creatorId;

    /**
     * <p>The description of the issue in the ticket. Only plain text is supported.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ECS backup failed</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The contact email address for the ticket.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="mailto:sdahkjdshga@qq.com">sdahkjdshga@qq.com</a></p>
     */
    @NameInMap("Email")
    public String email;

    /**
     * <p>A list of attachment names. Use the ObjectKey value returned by the GetAttachmentUploadUrl operation.</p>
     */
    @NameInMap("FileNameList")
    public java.util.List<String> fileNameList;

    /**
     * <p>Sensitive information.</p>
     */
    @NameInMap("SecretInfo")
    public CreateTicketRequestSecretInfo secretInfo;

    /**
     * <p>An enumeration value. A value of 1 indicates a normal issue. A value of 2 indicates an urgent issue.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Severity")
    public Integer severity;

    /**
     * <p>The title of the ticket.</p>
     * 
     * <strong>example:</strong>
     * <p>ECS backup failed</p>
     */
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
        /**
         * <p>The text of the sensitive information.</p>
         * 
         * <strong>example:</strong>
         * <p>ID card: 3310xxxx</p>
         */
        @NameInMap("Content")
        public String content;

        /**
         * <p>A list of attachment names for the sensitive information.</p>
         */
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
