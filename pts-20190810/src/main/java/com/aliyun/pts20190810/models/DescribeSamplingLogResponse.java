// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pts20190810.models;

import com.aliyun.tea.*;

public class DescribeSamplingLogResponse extends TeaModel {
    @NameInMap("Message")
    @Validation(required = true)
    public String message;

    @NameInMap("HttpStatusCode")
    @Validation(required = true)
    public Integer httpStatusCode;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("PageNumber")
    @Validation(required = true)
    public Integer pageNumber;

    @NameInMap("PageSize")
    @Validation(required = true)
    public Integer pageSize;

    @NameInMap("TotalCount")
    @Validation(required = true)
    public Long totalCount;

    @NameInMap("SamplingLogs")
    @Validation(required = true)
    public java.util.List<DescribeSamplingLogResponseSamplingLogs> samplingLogs;

    public static DescribeSamplingLogResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSamplingLogResponse self = new DescribeSamplingLogResponse();
        return TeaModel.build(map, self);
    }

    public static class DescribeSamplingLogResponseSamplingLogs extends TeaModel {
        @NameInMap("ChainId")
        @Validation(required = true)
        public String chainId;

        @NameInMap("Timestamp")
        @Validation(required = true)
        public String timestamp;

        @NameInMap("HttpRequestMethod")
        @Validation(required = true)
        public String httpRequestMethod;

        @NameInMap("HttpRequestBody")
        @Validation(required = true)
        public String httpRequestBody;

        @NameInMap("HttpRequestHeaders")
        @Validation(required = true)
        public String httpRequestHeaders;

        @NameInMap("HttpRequestUrl")
        @Validation(required = true)
        public String httpRequestUrl;

        @NameInMap("HttpStartTime")
        @Validation(required = true)
        public String httpStartTime;

        @NameInMap("HttpResponseBody")
        @Validation(required = true)
        public String httpResponseBody;

        @NameInMap("HttpResponseFailMsg")
        @Validation(required = true)
        public String httpResponseFailMsg;

        @NameInMap("HttpResponseHeaders")
        @Validation(required = true)
        public String httpResponseHeaders;

        @NameInMap("ImportContent")
        @Validation(required = true)
        public String importContent;

        @NameInMap("ExportConfig")
        @Validation(required = true)
        public String exportConfig;

        @NameInMap("ExportContent")
        @Validation(required = true)
        public String exportContent;

        @NameInMap("CheckResult")
        @Validation(required = true)
        public String checkResult;

        @NameInMap("HttpTiming")
        @Validation(required = true)
        public String httpTiming;

        @NameInMap("Rt")
        @Validation(required = true)
        public String rt;

        @NameInMap("HttpResponseStatus")
        @Validation(required = true)
        public String httpResponseStatus;

        @NameInMap("TransId")
        @Validation(required = true)
        public String transId;

        @NameInMap("GroupTag")
        @Validation(required = true)
        public String groupTag;

        public static DescribeSamplingLogResponseSamplingLogs build(java.util.Map<String, ?> map) throws Exception {
            DescribeSamplingLogResponseSamplingLogs self = new DescribeSamplingLogResponseSamplingLogs();
            return TeaModel.build(map, self);
        }

    }

}
