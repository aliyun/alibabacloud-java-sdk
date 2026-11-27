// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20200331.models;

import com.aliyun.tea.*;

public class CreateResourceAccountRequest extends TeaModel {
    /**
     * <p>The prefix of the account name. If you leave this parameter empty, the system randomly generates a prefix.</p>
     * <p>&lt;props=&quot;china&quot;&gt;The length ranges from 2 to 50 characters.</p>
     * <p>&lt;props=&quot;intl&quot;&gt;The length ranges from 2 to 37 characters.</p>
     * <p>Format: The prefix can contain letters, digits, and special characters such as underscores (_), periods (.), and hyphens (-). It must start and end with a letter or a digit, and cannot contain consecutive special characters.</p>
     * <p>The format of the complete account name is <AccountNamePrefix>@<ResourceDirectoryId>.aliyunid.com. Example: alice@rd-3G****.aliyunid.com.</p>
     * <p>The account name must be unique in the resource directory.</p>
     * 
     * <strong>example:</strong>
     * <p>alice</p>
     */
    @NameInMap("AccountNamePrefix")
    public String accountNamePrefix;

    /**
     * <p>The display name of the member.</p>
     * <p>The name must be 2 to 50 characters in length.</p>
     * <p>Format: The name can contain Chinese characters, letters, digits, underscores (_), periods (.), hyphens (-), and spaces.</p>
     * <p>The display name must be unique in the resource directory.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Dev</p>
     */
    @NameInMap("DisplayName")
    public String displayName;

    /**
     * <p>The ID of the parent folder.</p>
     * 
     * <strong>example:</strong>
     * <p>fd-r23M55****</p>
     */
    @NameInMap("ParentFolderId")
    public String parentFolderId;

    /**
     * <p>The ID of the settlement account. If you leave this parameter empty, the newly created member pays its own bills.</p>
     * 
     * <strong>example:</strong>
     * <p>12323344****</p>
     */
    @NameInMap("PayerAccountId")
    public String payerAccountId;

    /**
     * <p>The identity type of the member. Valid values:</p>
     * <ul>
     * <li>resell: reseller account. This is the default value. The created member automatically establishes a reseller relationship with your reseller. You must use the management account to pay for the new member.</li>
     * <li>non_resell: non-reseller account. The created member is a regular Alibaba Cloud account and has no relationship with your current reseller. The account purchases resources directly from Alibaba Cloud and pays its own bills.</li>
     * </ul>
     * <blockquote>
     * <p>This parameter is supported only for reseller customers on the international site.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>resell</p>
     */
    @NameInMap("ResellAccountType")
    public String resellAccountType;

    /**
     * <p>The tags of the member.</p>
     */
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
         * <p>The tag key.</p>
         * 
         * <strong>example:</strong>
         * <p>k1</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value.</p>
         * 
         * <strong>example:</strong>
         * <p>v1</p>
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
