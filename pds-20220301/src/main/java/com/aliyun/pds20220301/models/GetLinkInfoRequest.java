// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class GetLinkInfoRequest extends TeaModel {
    /**
     * <p>The additional information about the unique identifier of the account. For example, if type is set to mobile, set the value of extra to a country code.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("extra")
    public String extra;

    /**
     * <p>The unique identifier of the account, such as a mobile number.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>130***</p>
     */
    @NameInMap("identity")
    public String identity;

    /**
     * <p>The account type. Valid values:</p>
     * <ul>
     * <li>mobile: a mobile number.</li>
     * <li>email: an email address.</li>
     * <li>ding: a DingTalk account.</li>
     * <li>ram: an Alibaba Cloud Resource Access Management (RAM) user.</li>
     * <li>wechat: a WeCom account.</li>
     * <li>ldap: a Lightweight Directory Access Protocol (LDAP) account.</li>
     * <li>custom: a custom account.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>mobile</p>
     */
    @NameInMap("type")
    public String type;

    public static GetLinkInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        GetLinkInfoRequest self = new GetLinkInfoRequest();
        return TeaModel.build(map, self);
    }

    public GetLinkInfoRequest setExtra(String extra) {
        this.extra = extra;
        return this;
    }
    public String getExtra() {
        return this.extra;
    }

    public GetLinkInfoRequest setIdentity(String identity) {
        this.identity = identity;
        return this;
    }
    public String getIdentity() {
        return this.identity;
    }

    public GetLinkInfoRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
