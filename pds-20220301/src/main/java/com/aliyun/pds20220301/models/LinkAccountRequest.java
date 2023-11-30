// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class LinkAccountRequest extends TeaModel {
    /**
     * <p>The additional information about the unique identifier of the account. For example, if type is set to mobile, set the value of extra to a country code. For example, a value of 86 specifies a mobile number in the Chinese mainland. If you do not specify this parameter, 86 is used by default.</p>
     */
    @NameInMap("extra")
    public String extra;

    /**
     * <p>The unique identifier of the account, such as a mobile number.</p>
     */
    @NameInMap("identity")
    public String identity;

    /**
     * <p>The account type. Valid values:</p>
     * <br>
     * <p>*   mobile: a mobile number.</p>
     * <p>*   email: an email address.</p>
     * <p>*   ding: a DingTalk account.</p>
     * <p>*   ram: an Alibaba Cloud Resource Access Management (RAM) user.</p>
     * <p>*   wechat: a WeCom account.</p>
     * <p>*   ldap: a Lightweight Directory Access Protocol (LDAP) account.</p>
     * <p>*   custom: a custom account.</p>
     */
    @NameInMap("type")
    public String type;

    /**
     * <p>The ID of the user with which you want to associate an account.</p>
     */
    @NameInMap("user_id")
    public String userId;

    public static LinkAccountRequest build(java.util.Map<String, ?> map) throws Exception {
        LinkAccountRequest self = new LinkAccountRequest();
        return TeaModel.build(map, self);
    }

    public LinkAccountRequest setExtra(String extra) {
        this.extra = extra;
        return this;
    }
    public String getExtra() {
        return this.extra;
    }

    public LinkAccountRequest setIdentity(String identity) {
        this.identity = identity;
        return this;
    }
    public String getIdentity() {
        return this.identity;
    }

    public LinkAccountRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public LinkAccountRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
