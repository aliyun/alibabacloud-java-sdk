// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class AccountLinkInfo extends TeaModel {
    @NameInMap("authentication_type")
    public String authenticationType;

    @NameInMap("created_at")
    public Long createdAt;

    @NameInMap("display_name")
    public String displayName;

    @NameInMap("domain_id")
    public String domainId;

    @NameInMap("extra")
    public String extra;

    @NameInMap("identity")
    public String identity;

    @NameInMap("last_login_time")
    public Long lastLoginTime;

    @NameInMap("status")
    public String status;

    @NameInMap("user_id")
    public String userId;

    public static AccountLinkInfo build(java.util.Map<String, ?> map) throws Exception {
        AccountLinkInfo self = new AccountLinkInfo();
        return TeaModel.build(map, self);
    }

    public AccountLinkInfo setAuthenticationType(String authenticationType) {
        this.authenticationType = authenticationType;
        return this;
    }
    public String getAuthenticationType() {
        return this.authenticationType;
    }

    public AccountLinkInfo setCreatedAt(Long createdAt) {
        this.createdAt = createdAt;
        return this;
    }
    public Long getCreatedAt() {
        return this.createdAt;
    }

    public AccountLinkInfo setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }
    public String getDisplayName() {
        return this.displayName;
    }

    public AccountLinkInfo setDomainId(String domainId) {
        this.domainId = domainId;
        return this;
    }
    public String getDomainId() {
        return this.domainId;
    }

    public AccountLinkInfo setExtra(String extra) {
        this.extra = extra;
        return this;
    }
    public String getExtra() {
        return this.extra;
    }

    public AccountLinkInfo setIdentity(String identity) {
        this.identity = identity;
        return this;
    }
    public String getIdentity() {
        return this.identity;
    }

    public AccountLinkInfo setLastLoginTime(Long lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
        return this;
    }
    public Long getLastLoginTime() {
        return this.lastLoginTime;
    }

    public AccountLinkInfo setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public AccountLinkInfo setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
