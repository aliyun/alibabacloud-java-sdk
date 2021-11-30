// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.tea.*;

public class ObjectIdentifier extends TeaModel {
    // key
    @NameInMap("Key")
    public String key;

    // version id
    @NameInMap("VersionId")
    public String versionId;

    public static ObjectIdentifier build(java.util.Map<String, ?> map) throws Exception {
        ObjectIdentifier self = new ObjectIdentifier();
        return TeaModel.build(map, self);
    }

    public ObjectIdentifier setKey(String key) {
        this.key = key;
        return this;
    }
    public String getKey() {
        return this.key;
    }

    public ObjectIdentifier setVersionId(String versionId) {
        this.versionId = versionId;
        return this;
    }
    public String getVersionId() {
        return this.versionId;
    }

}
