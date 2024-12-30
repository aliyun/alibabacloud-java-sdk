// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class UnLinkAccountRequest extends TeaModel {
    /**
     * <p>Additional information for the unique account identifier. For example, when the account is a phone number, this field should be filled with the area code of the phone, such as 86 for Mainland China. If not provided, it defaults to 86.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("extra")
    public String extra;

    /**
     * <p>Unique identifier of the account, such as a phone number</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>139****</p>
     */
    @NameInMap("identity")
    public String identity;

    /**
     * <p>Account type</p>
     * <p>mobile: Phone number</p>
     * <p>email: Email address</p>
     * <p>ding: DingTalk</p>
     * <p>ram: Alibaba Cloud RAM User</p>
     * <p>wechat: WeCom</p>
     * <p>ldap: LDAP account</p>
     * <p>custom: Custom account</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>mobile</p>
     */
    @NameInMap("type")
    public String type;

    /**
     * <p>User identifier</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>uid1</p>
     */
    @NameInMap("user_id")
    public String userId;

    public static UnLinkAccountRequest build(java.util.Map<String, ?> map) throws Exception {
        UnLinkAccountRequest self = new UnLinkAccountRequest();
        return TeaModel.build(map, self);
    }

    public UnLinkAccountRequest setExtra(String extra) {
        this.extra = extra;
        return this;
    }
    public String getExtra() {
        return this.extra;
    }

    public UnLinkAccountRequest setIdentity(String identity) {
        this.identity = identity;
        return this;
    }
    public String getIdentity() {
        return this.identity;
    }

    public UnLinkAccountRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public UnLinkAccountRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
