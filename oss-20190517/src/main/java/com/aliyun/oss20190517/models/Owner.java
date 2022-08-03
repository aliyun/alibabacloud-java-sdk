// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.tea.*;

public class Owner extends TeaModel {
    @NameInMap("DisplayName")
    public String displayName;

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
