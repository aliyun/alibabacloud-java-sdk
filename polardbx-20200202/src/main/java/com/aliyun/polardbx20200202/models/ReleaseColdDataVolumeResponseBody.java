// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class ReleaseColdDataVolumeResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>EA330983-C895-57C0-AE82-5A63106EBB10</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ReleaseColdDataVolumeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ReleaseColdDataVolumeResponseBody self = new ReleaseColdDataVolumeResponseBody();
        return TeaModel.build(map, self);
    }

    public ReleaseColdDataVolumeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
