// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ImportTSJobsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Data")
    public ImportTSJobsResponseBodyData data;

    public static ImportTSJobsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ImportTSJobsResponseBody self = new ImportTSJobsResponseBody();
        return TeaModel.build(map, self);
    }

    public ImportTSJobsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ImportTSJobsResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ImportTSJobsResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public ImportTSJobsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ImportTSJobsResponseBody setData(ImportTSJobsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ImportTSJobsResponseBodyData getData() {
        return this.data;
    }

    public static class ImportTSJobsResponseBodyData extends TeaModel {
        @NameInMap("FailedMap")
        public String failedMap;

        @NameInMap("SucceedCount")
        public Long succeedCount;

        public static ImportTSJobsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ImportTSJobsResponseBodyData self = new ImportTSJobsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ImportTSJobsResponseBodyData setFailedMap(String failedMap) {
            this.failedMap = failedMap;
            return this;
        }
        public String getFailedMap() {
            return this.failedMap;
        }

        public ImportTSJobsResponseBodyData setSucceedCount(Long succeedCount) {
            this.succeedCount = succeedCount;
            return this;
        }
        public Long getSucceedCount() {
            return this.succeedCount;
        }

    }

}
