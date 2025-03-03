// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20200331.models;

import com.aliyun.tea.*;

public class CreateCloudAccountRequest extends TeaModel {
    /**
     * <p>The display name of the member account.</p>
     * <p>The name must be 2 to 50 characters in length and can contain letters, digits, underscores (_), periods (.), and hyphens (-).</p>
     * <p>The name must be unique in the current resource directory.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>admin-****</p>
     */
    @NameInMap("DisplayName")
    public String displayName;

    /**
     * <p>The email address used to log on to the cloud account.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="mailto:someone@example.com">someone@example.com</a></p>
     */
    @NameInMap("Email")
    public String email;

    /**
     * <p>The ID of the parent folder.</p>
     * 
     * <strong>example:</strong>
     * <p>fd-bVaRIG****</p>
     */
    @NameInMap("ParentFolderId")
    public String parentFolderId;

    /**
     * <p>The ID of the settlement account. If you do not specify this parameter, the current account is used for settlement.</p>
     * 
     * <strong>example:</strong>
     * <p>12323344****</p>
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
