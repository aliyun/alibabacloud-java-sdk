// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.workorder20210610.models;

import com.aliyun.tea.*;

public class CreateTicketShrinkRequest extends TeaModel {
    /**
     * <p>The ID of the problem category. You can obtain the returned value from the ListCategories operation by using the CategoryId parameter.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>7161</p>
     */
    @NameInMap("CategoryId")
    public String categoryId;

    /**
     * <p>Submit the Alibaba Cloud UID of the account, which is required for the MPK virtual market scene.</p>
     * 
     * <strong>example:</strong>
     * <p>1289427240739141</p>
     */
    @NameInMap("CreatorId")
    public String creatorId;

    /**
     * <p>The description of the ticket. Only pure text format is supported.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Why ECS backup failed?</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p><a href="mailto:sdahkjdshga@qq.com">sdahkjdshga@qq.com</a></p>
     * 
     * <strong>example:</strong>
     * <p><a href="mailto:163@163.com">163@163.com</a></p>
     */
    @NameInMap("Email")
    public String email;

    /**
     * <p>The list of attachment names, GetAttachmentUploadUrl the ObjectKey field returned by the interface.</p>
     */
    @NameInMap("FileNameList")
    public String fileNameListShrink;

    /**
     * <p>Sensitive information</p>
     */
    @NameInMap("SecretInfo")
    public String secretInfoShrink;

    /**
     * <p>Enumeration value, 1 for general problem, 2 for urgent problem</p>
     * <p>Enumeration values:</p>
     * <ul>
     * <li>1: regular.</li>
     * <li>2: emergency.</li>
     * </ul>
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
     * <p>Why ECS backup failed?</p>
     */
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
