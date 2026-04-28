// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class AccountLinkInfo extends TeaModel {
    /**
     * <p>The type of the account. Valid values:</p>
     * <ul>
     * <li>mobile: mobile number</li>
     * <li>email: email address</li>
     * <li>ding: DingTalk account</li>
     * <li>ram: Alibaba Cloud Resource Access Management (RAM) user</li>
     * <li>wechat: WeCom account</li>
     * <li>ldap: Lightweight Directory Access Protocol (LDAP) account</li>
     * <li>custom: custom account</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>mobile</p>
     */
    @NameInMap("authentication_type")
    public String authenticationType;

    /**
     * <p>The time when the account was created. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
     * 
     * <strong>example:</strong>
     * <p>1639762579768</p>
     */
    @NameInMap("created_at")
    public Long createdAt;

    /**
     * <p>The display name of the account. For example, the unique identifier of an LDAP account is its UID, but the account display name can be the job number or other information.</p>
     * 
     * <strong>example:</strong>
     * <p>001</p>
     */
    @NameInMap("display_name")
    public String displayName;

    /**
     * <p>The domain ID.</p>
     * 
     * <strong>example:</strong>
     * <p>bj1</p>
     */
    @NameInMap("domain_id")
    public String domainId;

    /**
     * <p>The additional information about the account. If the account type is a mobile number, the value of this parameter indicates the country code. For example, the country code in the Chinese mainland is 86 and a value of 86 is returned only if authentication_type is set to mobile.</p>
     * 
     * <strong>example:</strong>
     * <p>86</p>
     */
    @NameInMap("extra")
    public String extra;

    /**
     * <p>The unique identifier of the account.</p>
     * 
     * <strong>example:</strong>
     * <p>136***000</p>
     */
    @NameInMap("identity")
    public String identity;

    @NameInMap("last_login_time")
    public Long lastLoginTime;

    @NameInMap("status")
    public String status;

    /**
     * <p>The user ID of the account.</p>
     * 
     * <strong>example:</strong>
     * <p>00016a587b62b50003deea299a4f5b50</p>
     */
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
