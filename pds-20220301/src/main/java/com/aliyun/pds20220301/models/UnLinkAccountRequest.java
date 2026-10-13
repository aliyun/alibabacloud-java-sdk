// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class UnLinkAccountRequest extends TeaModel {
    /**
     * <p>Additional information about the identity. For <code>mobile</code> accounts, this parameter specifies the country code. The default value is <code>86</code> (mainland China).</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("extra")
    public String extra;

    /**
     * <p>The account\&quot;s unique identifier, such as a mobile number.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>139****</p>
     */
    @NameInMap("identity")
    public String identity;

    /**
     * <p>The account type. Valid values:</p>
     * <p><code>mobile</code>: Mobile number</p>
     * <p><code>email</code>: Email address</p>
     * <p><code>ding</code>: DingTalk account</p>
     * <p><code>ram</code>: Alibaba Cloud RAM sub-account</p>
     * <p><code>wechat</code>: WeCom account</p>
     * <p><code>ldap</code>: LDAP account</p>
     * <p><code>custom</code>: Custom account</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>mobile</p>
     */
    @NameInMap("type")
    public String type;

    /**
     * <p>The user ID.</p>
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
