// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class CreateFileDetectResponseBody extends TeaModel {
    /**
     * <p>The identifier of the file.</p>
     */
    @NameInMap("HashKey")
    public String hashKey;

    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateFileDetectResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateFileDetectResponseBody self = new CreateFileDetectResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateFileDetectResponseBody setHashKey(String hashKey) {
        this.hashKey = hashKey;
        return this;
    }
    public String getHashKey() {
        return this.hashKey;
    }

    public CreateFileDetectResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
