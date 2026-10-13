// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class LinkAccountRequest extends TeaModel {
    /**
     * <p>Additional information for the unique identifier. For example, if the account uses a mobile phone number, this field contains the region code. The default value is 86 for the Chinese mainland.</p>
     * 
     * <strong>example:</strong>
     * <p>86</p>
     */
    @NameInMap("extra")
    public String extra;

    /**
     * <p>Unique identifier for the account, such as a mobile phone number.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>eyy***</p>
     */
    @NameInMap("identity")
    public String identity;

    /**
     * <p>Account type.</p>
     * <ul>
     * <li><p>mobile: mobile phone number</p>
     * </li>
     * <li><p>email: email address</p>
     * </li>
     * <li><p>ding: DingTalk</p>
     * </li>
     * <li><p>ram: Alibaba Cloud RAM sub-account</p>
     * </li>
     * <li><p>wechat: WeCom</p>
     * </li>
     * <li><p>ldap: LDAP account</p>
     * </li>
     * <li><p>custom: custom account</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ding</p>
     */
    @NameInMap("type")
    public String type;

    /**
     * <p>User ID to attach.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>xxx</p>
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
