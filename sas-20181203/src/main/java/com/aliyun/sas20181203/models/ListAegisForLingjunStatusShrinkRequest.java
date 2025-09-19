// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListAegisForLingjunStatusShrinkRequest extends TeaModel {
    /**
     * <p>List of unique UUIDs for Lingjun bare metal.</p>
     */
    @NameInMap("Uuids")
    public String uuidsShrink;

    public static ListAegisForLingjunStatusShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAegisForLingjunStatusShrinkRequest self = new ListAegisForLingjunStatusShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListAegisForLingjunStatusShrinkRequest setUuidsShrink(String uuidsShrink) {
        this.uuidsShrink = uuidsShrink;
        return this;
    }
    public String getUuidsShrink() {
        return this.uuidsShrink;
    }

}
