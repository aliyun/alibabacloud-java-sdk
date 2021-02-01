// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class DeleteTrainAlgorithmResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    public static DeleteTrainAlgorithmResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteTrainAlgorithmResponseBody self = new DeleteTrainAlgorithmResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteTrainAlgorithmResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteTrainAlgorithmResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DeleteTrainAlgorithmResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

}
