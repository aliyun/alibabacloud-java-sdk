// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcedirectorymaster20220419.models;

import com.aliyun.tea.*;

public class CreateResourceAccountRequest extends TeaModel {
    @NameInMap("AccountNamePrefix")
    public String accountNamePrefix;

    @NameInMap("DisplayName")
    public String displayName;

    @NameInMap("ParentFolderId")
    public String parentFolderId;

    @NameInMap("PayerAccountId")
    public String payerAccountId;

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
        @NameInMap("Key")
        public String key;

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
