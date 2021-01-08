// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rdc20180821.models;

import com.aliyun.tea.*;

public class SyncUserToRdcRequest extends TeaModel {
    @NameInMap("LoginTicket")
    public String loginTicket;

    public static SyncUserToRdcRequest build(java.util.Map<String, ?> map) throws Exception {
        SyncUserToRdcRequest self = new SyncUserToRdcRequest();
        return TeaModel.build(map, self);
    }

    public SyncUserToRdcRequest setLoginTicket(String loginTicket) {
        this.loginTicket = loginTicket;
        return this;
    }
    public String getLoginTicket() {
        return this.loginTicket;
    }

}
