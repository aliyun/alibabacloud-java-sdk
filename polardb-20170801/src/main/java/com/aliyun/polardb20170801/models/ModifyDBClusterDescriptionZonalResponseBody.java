// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class ModifyDBClusterDescriptionZonalResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>65D7ACE6-4A61-4B6E-B357-8CB24A******</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyDBClusterDescriptionZonalResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyDBClusterDescriptionZonalResponseBody self = new ModifyDBClusterDescriptionZonalResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyDBClusterDescriptionZonalResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
