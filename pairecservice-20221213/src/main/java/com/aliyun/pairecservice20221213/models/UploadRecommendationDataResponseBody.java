// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class UploadRecommendationDataResponseBody extends TeaModel {
    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static UploadRecommendationDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UploadRecommendationDataResponseBody self = new UploadRecommendationDataResponseBody();
        return TeaModel.build(map, self);
    }

    public UploadRecommendationDataResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public UploadRecommendationDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
