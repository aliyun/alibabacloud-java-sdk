// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class AllocateColdDataVolumeResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>D6A4256F-7B83-5BD7-9AC0-72E1FAC05330</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static AllocateColdDataVolumeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AllocateColdDataVolumeResponseBody self = new AllocateColdDataVolumeResponseBody();
        return TeaModel.build(map, self);
    }

    public AllocateColdDataVolumeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
