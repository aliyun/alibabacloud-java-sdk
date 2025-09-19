// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListAegisForLingjunStatusRequest extends TeaModel {
    /**
     * <p>List of unique UUIDs for Lingjun bare metal.</p>
     */
    @NameInMap("Uuids")
    public java.util.List<String> uuids;

    public static ListAegisForLingjunStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAegisForLingjunStatusRequest self = new ListAegisForLingjunStatusRequest();
        return TeaModel.build(map, self);
    }

    public ListAegisForLingjunStatusRequest setUuids(java.util.List<String> uuids) {
        this.uuids = uuids;
        return this;
    }
    public java.util.List<String> getUuids() {
        return this.uuids;
    }

}
