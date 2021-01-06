// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20200331.models;

import com.aliyun.tea.*;

public class CreateCloudAccountRequest extends TeaModel {
    @NameInMap("DisplayName")
    @Validation(required = true)
    public String displayName;

    @NameInMap("ParentFolderId")
    public String parentFolderId;

    @NameInMap("Email")
    @Validation(required = true)
    public String email;

    @NameInMap("PayerAccountId")
    public String payerAccountId;

    public static CreateCloudAccountRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateCloudAccountRequest self = new CreateCloudAccountRequest();
        return TeaModel.build(map, self);
    }

    public CreateCloudAccountRequest setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }
    public String getDisplayName() {
        return this.displayName;
    }

    public CreateCloudAccountRequest setParentFolderId(String parentFolderId) {
        this.parentFolderId = parentFolderId;
        return this;
    }
    public String getParentFolderId() {
        return this.parentFolderId;
    }

    public CreateCloudAccountRequest setEmail(String email) {
        this.email = email;
        return this;
    }
    public String getEmail() {
        return this.email;
    }

    public CreateCloudAccountRequest setPayerAccountId(String payerAccountId) {
        this.payerAccountId = payerAccountId;
        return this;
    }
    public String getPayerAccountId() {
        return this.payerAccountId;
    }

}
