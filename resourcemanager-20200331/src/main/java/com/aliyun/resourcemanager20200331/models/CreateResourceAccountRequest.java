// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20200331.models;

import com.aliyun.tea.*;

public class CreateResourceAccountRequest extends TeaModel {
    /**
     * <p>The prefix of the account name. If you leave this parameter empty, the system randomly generates a prefix.</p>
     * <p>&lt;props=&quot;china&quot;&gt;Length: 2 to 50 characters.</p>
     * <p>&lt;props=&quot;intl&quot;&gt;Length: 2 to 37 characters.</p>
     * <p>Format: Can contain letters, digits, and special characters <code>_.-</code>. Must start and end with a letter or digit. Consecutive special characters <code>_.-</code> are not allowed.</p>
     * <p>The full account name is in the format of <AccountNamePrefix>@<ResourceDirectoryId>.aliyunid.com. Example: <code>alice@rd-3G****.aliyunid.com</code>.</p>
     * <p>The account name must be unique within the resource directory.</p>
     * 
     * <strong>example:</strong>
     * <p>alice</p>
     */
    @NameInMap("AccountNamePrefix")
    public String accountNamePrefix;

    /**
     * <p>The display name of the member.</p>
     * <p>Length: 2 to 50 characters.</p>
     * <p>Format: Can contain letters, digits, underscores (_), periods (.), hyphens (-), and spaces.</p>
     * <p>The display name must be unique within the resource directory.</p>
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
     * <p>The ID of the billing account. If you leave this parameter empty, the newly created member pays for its own resource consumption.</p>
     * 
     * <strong>example:</strong>
     * <p>12323344****</p>
     */
    @NameInMap("PayerAccountId")
    public String payerAccountId;

    /**
     * <p>The identity type of the member. Valid values:</p>
     * <ul>
     * <li>resell (default): reseller account. The created member automatically establishes a reseller relationship with your distributor. You must use the management account to pay for the new member.</li>
     * <li>non_resell: non-reseller account. The created member is a regular Alibaba Cloud account that has no relationship with your current distributor. This account purchases resources directly from Alibaba Cloud and pays for its own resource consumption.</li>
     * </ul>
     * <blockquote>
     * <p>This parameter is supported only for China site (Chinese mainland) distributor customers.</p>
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
