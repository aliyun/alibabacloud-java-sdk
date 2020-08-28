// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.videoenhan20200320.models;

import com.aliyun.tea.*;

public class GetAsyncJobResultResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Data")
    @Validation(required = true)
    public GetAsyncJobResultResponseData data;

    public static GetAsyncJobResultResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAsyncJobResultResponse self = new GetAsyncJobResultResponse();
        return TeaModel.build(map, self);
    }

    public static class GetAsyncJobResultResponseData extends TeaModel {
        @NameInMap("JobId")
        @Validation(required = true)
        public String jobId;

        @NameInMap("Status")
        @Validation(required = true)
        public String status;

        @NameInMap("Result")
        @Validation(required = true)
        public String result;

        @NameInMap("ErrorCode")
        @Validation(required = true)
        public String errorCode;

        @NameInMap("ErrorMessage")
        @Validation(required = true)
        public String errorMessage;

        public static GetAsyncJobResultResponseData build(java.util.Map<String, ?> map) throws Exception {
            GetAsyncJobResultResponseData self = new GetAsyncJobResultResponseData();
            return TeaModel.build(map, self);
        }

    }

}
