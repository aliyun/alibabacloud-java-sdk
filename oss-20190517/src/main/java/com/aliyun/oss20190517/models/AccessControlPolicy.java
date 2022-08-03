// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.tea.*;

public class AccessControlPolicy extends TeaModel {
    @NameInMap("AccessControlList")
    public AccessControlList accessControlList;

    @NameInMap("Owner")
    public Owner owner;

    public static AccessControlPolicy build(java.util.Map<String, ?> map) throws Exception {
        AccessControlPolicy self = new AccessControlPolicy();
        return TeaModel.build(map, self);
    }

    public AccessControlPolicy setAccessControlList(AccessControlList accessControlList) {
        this.accessControlList = accessControlList;
        return this;
    }
    public AccessControlList getAccessControlList() {
        return this.accessControlList;
    }

    public AccessControlPolicy setOwner(Owner owner) {
        this.owner = owner;
        return this;
    }
    public Owner getOwner() {
        return this.owner;
    }

}
