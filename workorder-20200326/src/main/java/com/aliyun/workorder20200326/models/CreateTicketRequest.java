// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.workorder20200326.models;

import com.aliyun.tea.*;

public class CreateTicketRequest extends TeaModel {
    @NameInMap("Language")
    public String language;

    @NameInMap("Title")
    public String title;

    @NameInMap("Content")
    public String content;

    @NameInMap("SecretContent")
    public String secretContent;

    @NameInMap("ProductCode")
    public String productCode;

    @NameInMap("Category")
    public String category;

    @NameInMap("Phone")
    public String phone;

    @NameInMap("Email")
    public String email;

    @NameInMap("NotifyTimeRange")
    public String notifyTimeRange;

    public static CreateTicketRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateTicketRequest self = new CreateTicketRequest();
        return TeaModel.build(map, self);
    }

    public CreateTicketRequest setLanguage(String language) {
        this.language = language;
        return this;
    }
    public String getLanguage() {
        return this.language;
    }

    public CreateTicketRequest setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

    public CreateTicketRequest setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public CreateTicketRequest setSecretContent(String secretContent) {
        this.secretContent = secretContent;
        return this;
    }
    public String getSecretContent() {
        return this.secretContent;
    }

    public CreateTicketRequest setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

    public CreateTicketRequest setCategory(String category) {
        this.category = category;
        return this;
    }
    public String getCategory() {
        return this.category;
    }

    public CreateTicketRequest setPhone(String phone) {
        this.phone = phone;
        return this;
    }
    public String getPhone() {
        return this.phone;
    }

    public CreateTicketRequest setEmail(String email) {
        this.email = email;
        return this;
    }
    public String getEmail() {
        return this.email;
    }

    public CreateTicketRequest setNotifyTimeRange(String notifyTimeRange) {
        this.notifyTimeRange = notifyTimeRange;
        return this;
    }
    public String getNotifyTimeRange() {
        return this.notifyTimeRange;
    }

}
