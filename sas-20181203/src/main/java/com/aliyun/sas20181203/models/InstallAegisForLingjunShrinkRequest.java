// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class InstallAegisForLingjunShrinkRequest extends TeaModel {
    /**
     * <p>List of unique UUIDs for Lingjun bare metal.</p>
     */
    @NameInMap("Uuids")
    public String uuidsShrink;

    public static InstallAegisForLingjunShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        InstallAegisForLingjunShrinkRequest self = new InstallAegisForLingjunShrinkRequest();
        return TeaModel.build(map, self);
    }

    public InstallAegisForLingjunShrinkRequest setUuidsShrink(String uuidsShrink) {
        this.uuidsShrink = uuidsShrink;
        return this;
    }
    public String getUuidsShrink() {
        return this.uuidsShrink;
    }

}
