// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.tea.*;

public class Delete extends TeaModel {
    // description
    @NameInMap("Object")
    public java.util.List<ObjectIdentifier> objects;

    // description
    @NameInMap("Quiet")
    public Boolean quiet;

    public static Delete build(java.util.Map<String, ?> map) throws Exception {
        Delete self = new Delete();
        return TeaModel.build(map, self);
    }

    public Delete setObjects(java.util.List<ObjectIdentifier> objects) {
        this.objects = objects;
        return this;
    }
    public java.util.List<ObjectIdentifier> getObjects() {
        return this.objects;
    }

    public Delete setQuiet(Boolean quiet) {
        this.quiet = quiet;
        return this;
    }
    public Boolean getQuiet() {
        return this.quiet;
    }

}
