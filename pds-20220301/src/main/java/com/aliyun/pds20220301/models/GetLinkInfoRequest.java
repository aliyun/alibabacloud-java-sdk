// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class GetLinkInfoRequest extends TeaModel {
    /**
     * <p>Additional information for the unique identifier. For example, if the account type is <code>mobile</code>, this is the country calling code.</p>
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
     * <p>130***</p>
     */
    @NameInMap("identity")
    public String identity;

    /**
     * <p>The account type. Valid values:</p>
     * <ul>
     * <li><p><code>mobile</code>: A mobile number.</p>
     * </li>
     * <li><p><code>email</code>: An email address.</p>
     * </li>
     * <li><p><code>ding</code>: A DingTalk account.</p>
     * </li>
     * <li><p><code>ram</code>: An Alibaba Cloud RAM user.</p>
     * </li>
     * <li><p><code>wechat</code>: A WeCom account.</p>
     * </li>
     * <li><p><code>ldap</code>: An LDAP account.</p>
     * </li>
     * <li><p><code>custom</code>: A custom account.</p>
     * </li>
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
