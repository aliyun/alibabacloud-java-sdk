// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.tea.*;

public class AccessControlList extends TeaModel {
    @NameInMap("Grant")
    public String grant;

    public static AccessControlList build(java.util.Map<String, ?> map) throws Exception {
        AccessControlList self = new AccessControlList();
        return TeaModel.build(map, self);
    }

    public AccessControlList setGrant(String grant) {
        this.grant = grant;
        return this;
    }
    public String getGrant() {
        return this.grant;
    }

}
