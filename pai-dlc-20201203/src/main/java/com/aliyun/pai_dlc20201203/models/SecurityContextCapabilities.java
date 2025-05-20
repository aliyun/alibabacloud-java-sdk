// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class SecurityContextCapabilities extends TeaModel {
    @NameInMap("Add")
    public java.util.List<String> add;

    @NameInMap("Drop")
    public java.util.List<String> drop;

    public static SecurityContextCapabilities build(java.util.Map<String, ?> map) throws Exception {
        SecurityContextCapabilities self = new SecurityContextCapabilities();
        return TeaModel.build(map, self);
    }

    public SecurityContextCapabilities setAdd(java.util.List<String> add) {
        this.add = add;
        return this;
    }
    public java.util.List<String> getAdd() {
        return this.add;
    }

    public SecurityContextCapabilities setDrop(java.util.List<String> drop) {
        this.drop = drop;
        return this;
    }
    public java.util.List<String> getDrop() {
        return this.drop;
    }

}
