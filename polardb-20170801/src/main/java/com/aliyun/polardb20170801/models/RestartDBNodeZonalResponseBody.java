// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class RestartDBNodeZonalResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>925B84D9-CA72-432C-95CF-738C22******</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static RestartDBNodeZonalResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RestartDBNodeZonalResponseBody self = new RestartDBNodeZonalResponseBody();
        return TeaModel.build(map, self);
    }

    public RestartDBNodeZonalResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
