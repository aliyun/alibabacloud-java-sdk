// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20200331.models;

import com.aliyun.tea.*;

public class CreateCloudAccountRequest extends TeaModel {
    /**
     * <p>The display name of the member account.</p>
     * <br>
     * <p>The name must be 2 to 50 characters in length and can contain letters, digits, underscores (\_), periods (.), and hyphens (-).</p>
     * <br>
     * <p>The name must be unique in the current resource directory.</p>
     */
    @NameInMap("DisplayName")
    public String displayName;

    /**
     * <p>The email address used to log on to the cloud account.</p>
     */
    @NameInMap("Email")
    public String email;

    /**
     * <p>The ID of the parent folder.</p>
     */
    @NameInMap("ParentFolderId")
    public String parentFolderId;

    /**
     * <p>The ID of the settlement account. If you do not specify this parameter, the current account is used for settlement.</p>
     */
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

    public CreateCloudAccountRequest setEmail(String email) {
        this.email = email;
        return this;
    }
    public String getEmail() {
        return this.email;
    }

    public CreateCloudAccountRequest setParentFolderId(String parentFolderId) {
        this.parentFolderId = parentFolderId;
        return this;
    }
    public String getParentFolderId() {
        return this.parentFolderId;
    }

    public CreateCloudAccountRequest setPayerAccountId(String payerAccountId) {
        this.payerAccountId = payerAccountId;
        return this;
    }
    public String getPayerAccountId() {
        return this.payerAccountId;
    }

}
