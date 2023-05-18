// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20200331.models;

import com.aliyun.tea.*;

public class CreateResourceAccountRequest extends TeaModel {
    /**
     * <p>The prefix for the Alibaba Cloud account name of the member. If you leave this parameter empty, the system randomly generates a prefix.</p>
     * <br>
     * <p>The prefix must be 2 to 37 characters in length.</p>
     * <br>
     * <p>The prefix can contain letters, digits, and special characters but cannot contain consecutive special characters. The prefix must start with a letter or digit and end with a letter or digit. Valid special characters include underscores (`_`), periods (.), and hyphens (`-`).</p>
     * <br>
     * <p>The complete Alibaba Cloud account name of a member in a resource directory is in the \<AccountNamePrefix>@\<ResourceDirectoryId>.aliyunid.com format, such as `alice@rd-3G****.aliyunid.com`.</p>
     * <br>
     * <p>Each name must be unique in the resource directory.</p>
     */
    @NameInMap("AccountNamePrefix")
    public String accountNamePrefix;

    /**
     * <p>The display name of the member.</p>
     * <br>
     * <p>The name must be 2 to 50 characters in length.</p>
     * <br>
     * <p>The name can contain letters, digits, underscores (\_), periods (.), hyphens (-), and spaces.</p>
     * <br>
     * <p>The name must be unique in the resource directory.</p>
     */
    @NameInMap("DisplayName")
    public String displayName;

    /**
     * <p>The ID of the parent folder.</p>
     */
    @NameInMap("ParentFolderId")
    public String parentFolderId;

    /**
     * <p>The ID of the billing account. If you leave this parameter empty, the member is used as its own billing account.</p>
     */
    @NameInMap("PayerAccountId")
    public String payerAccountId;

    /**
     * <p>The identity type of the member. Valid values:</p>
     * <br>
     * <p>*   resell: The member is an account for a reseller. This is the default value. A relationship is automatically established between the member and the reseller. The management account of the resource directory must be used as the billing account of the member.</p>
     * <p>*   non_resell: The member is not an account for a reseller. The member is an account that is not associated with a reseller. You can directly use the account to purchase Alibaba Cloud resources. The member is used as its own billing account.</p>
     * <br>
     * <p>>  This parameter is available only for resellers at the international site (alibabacloud.com).</p>
     */
    @NameInMap("ResellAccountType")
    public String resellAccountType;

    @NameInMap("Tag")
    public java.util.List<CreateResourceAccountRequestTag> tag;

    public static CreateResourceAccountRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateResourceAccountRequest self = new CreateResourceAccountRequest();
        return TeaModel.build(map, self);
    }

    public CreateResourceAccountRequest setAccountNamePrefix(String accountNamePrefix) {
        this.accountNamePrefix = accountNamePrefix;
        return this;
    }
    public String getAccountNamePrefix() {
        return this.accountNamePrefix;
    }

    public CreateResourceAccountRequest setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }
    public String getDisplayName() {
        return this.displayName;
    }

    public CreateResourceAccountRequest setParentFolderId(String parentFolderId) {
        this.parentFolderId = parentFolderId;
        return this;
    }
    public String getParentFolderId() {
        return this.parentFolderId;
    }

    public CreateResourceAccountRequest setPayerAccountId(String payerAccountId) {
        this.payerAccountId = payerAccountId;
        return this;
    }
    public String getPayerAccountId() {
        return this.payerAccountId;
    }

    public CreateResourceAccountRequest setResellAccountType(String resellAccountType) {
        this.resellAccountType = resellAccountType;
        return this;
    }
    public String getResellAccountType() {
        return this.resellAccountType;
    }

    public CreateResourceAccountRequest setTag(java.util.List<CreateResourceAccountRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<CreateResourceAccountRequestTag> getTag() {
        return this.tag;
    }

    public static class CreateResourceAccountRequestTag extends TeaModel {
        /**
         * <p>A tag key</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>A tag value.</p>
         */
        @NameInMap("Value")
        public String value;

        public static CreateResourceAccountRequestTag build(java.util.Map<String, ?> map) throws Exception {
            CreateResourceAccountRequestTag self = new CreateResourceAccountRequestTag();
            return TeaModel.build(map, self);
        }

        public CreateResourceAccountRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateResourceAccountRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
