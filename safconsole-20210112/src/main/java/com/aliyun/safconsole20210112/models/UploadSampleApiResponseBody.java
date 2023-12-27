// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.safconsole20210112.models;

import com.aliyun.tea.*;

public class UploadSampleApiResponseBody extends TeaModel {
    /**
     * <p>Id of the request</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UploadSampleApiResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UploadSampleApiResponseBody self = new UploadSampleApiResponseBody();
        return TeaModel.build(map, self);
    }

    public UploadSampleApiResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
