// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class CustomHostAlias extends TeaModel {
    @NameInMap("hostAliases")
    public java.util.List<HostAlias> hostAliases;

    public static CustomHostAlias build(java.util.Map<String, ?> map) throws Exception {
        CustomHostAlias self = new CustomHostAlias();
        return TeaModel.build(map, self);
    }

    public CustomHostAlias setHostAliases(java.util.List<HostAlias> hostAliases) {
        this.hostAliases = hostAliases;
        return this;
    }
    public java.util.List<HostAlias> getHostAliases() {
        return this.hostAliases;
    }

}
