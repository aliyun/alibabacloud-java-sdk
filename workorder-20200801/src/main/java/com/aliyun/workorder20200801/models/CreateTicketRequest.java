// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.workorder20200801.models;

import com.aliyun.tea.*;

public class CreateTicketRequest extends TeaModel {
    @NameInMap("CommonQuestionId")
    public Long commonQuestionId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Content")
    public String content;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Email")
    public String email;

    @NameInMap("FileNameList")
    public String fileNameList;

    @NameInMap("Language")
    public String language;

    @NameInMap("NotifyTimeRange")
    public String notifyTimeRange;

    @NameInMap("Phone")
    public String phone;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ProductCode")
    public String productCode;

    @NameInMap("SecretContent")
    public String secretContent;

    @NameInMap("Title")
    public String title;

    public static CreateTicketRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateTicketRequest self = new CreateTicketRequest();
        return TeaModel.build(map, self);
    }

    public CreateTicketRequest setCommonQuestionId(Long commonQuestionId) {
        this.commonQuestionId = commonQuestionId;
        return this;
    }
    public Long getCommonQuestionId() {
        return this.commonQuestionId;
    }

    public CreateTicketRequest setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public CreateTicketRequest setEmail(String email) {
        this.email = email;
        return this;
    }
    public String getEmail() {
        return this.email;
    }

    public CreateTicketRequest setFileNameList(String fileNameList) {
        this.fileNameList = fileNameList;
        return this;
    }
    public String getFileNameList() {
        return this.fileNameList;
    }

    public CreateTicketRequest setLanguage(String language) {
        this.language = language;
        return this;
    }
    public String getLanguage() {
        return this.language;
    }

    public CreateTicketRequest setNotifyTimeRange(String notifyTimeRange) {
        this.notifyTimeRange = notifyTimeRange;
        return this;
    }
    public String getNotifyTimeRange() {
        return this.notifyTimeRange;
    }

    public CreateTicketRequest setPhone(String phone) {
        this.phone = phone;
        return this;
    }
    public String getPhone() {
        return this.phone;
    }

    public CreateTicketRequest setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

    public CreateTicketRequest setSecretContent(String secretContent) {
        this.secretContent = secretContent;
        return this;
    }
    public String getSecretContent() {
        return this.secretContent;
    }

    public CreateTicketRequest setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

}
