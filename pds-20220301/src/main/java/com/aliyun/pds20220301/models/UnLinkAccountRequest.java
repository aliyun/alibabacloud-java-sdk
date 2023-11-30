// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class UnLinkAccountRequest extends TeaModel {
    @NameInMap("extra")
    public String extra;

    @NameInMap("identity")
    public String identity;

    @NameInMap("type")
    public String type;

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
