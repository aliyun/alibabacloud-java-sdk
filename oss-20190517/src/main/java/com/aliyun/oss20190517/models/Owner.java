// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.tea.*;

public class Owner extends TeaModel {
    // The display name of the owner
    @NameInMap("DisplayName")
    public String displayName;

    // The ID of the owner
    @NameInMap("ID")
    public String ID;

    public static Owner build(java.util.Map<String, ?> map) throws Exception {
        Owner self = new Owner();
        return TeaModel.build(map, self);
    }

    public Owner setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }
    public String getDisplayName() {
        return this.displayName;
    }

    public Owner setID(String ID) {
        this.ID = ID;
        return this;
    }
    public String getID() {
        return this.ID;
    }

}
