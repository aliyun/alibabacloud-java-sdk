// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class AclConfig extends TeaModel {
    @NameInMap("aclEntries")
    public java.util.List<AclEntryConfig> aclEntries;

    public static AclConfig build(java.util.Map<String, ?> map) throws Exception {
        AclConfig self = new AclConfig();
        return TeaModel.build(map, self);
    }

    public AclConfig setAclEntries(java.util.List<AclEntryConfig> aclEntries) {
        this.aclEntries = aclEntries;
        return this;
    }
    public java.util.List<AclEntryConfig> getAclEntries() {
        return this.aclEntries;
    }

}
