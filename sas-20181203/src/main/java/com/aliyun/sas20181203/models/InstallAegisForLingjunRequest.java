// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class InstallAegisForLingjunRequest extends TeaModel {
    /**
     * <p>List of unique UUIDs for Lingjun bare metal.</p>
     */
    @NameInMap("Uuids")
    public java.util.List<String> uuids;

    public static InstallAegisForLingjunRequest build(java.util.Map<String, ?> map) throws Exception {
        InstallAegisForLingjunRequest self = new InstallAegisForLingjunRequest();
        return TeaModel.build(map, self);
    }

    public InstallAegisForLingjunRequest setUuids(java.util.List<String> uuids) {
        this.uuids = uuids;
        return this;
    }
    public java.util.List<String> getUuids() {
        return this.uuids;
    }

}
