// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ImportTSJobsOssResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("Data")
    public ImportTSJobsOssResponseBodyData data;

    public static ImportTSJobsOssResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ImportTSJobsOssResponseBody self = new ImportTSJobsOssResponseBody();
        return TeaModel.build(map, self);
    }

    public ImportTSJobsOssResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ImportTSJobsOssResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ImportTSJobsOssResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public ImportTSJobsOssResponseBody setData(ImportTSJobsOssResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ImportTSJobsOssResponseBodyData getData() {
        return this.data;
    }

    public static class ImportTSJobsOssResponseBodyData extends TeaModel {
        @NameInMap("FailedMap")
        public String failedMap;

        @NameInMap("SucceedCount")
        public Long succeedCount;

        public static ImportTSJobsOssResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ImportTSJobsOssResponseBodyData self = new ImportTSJobsOssResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ImportTSJobsOssResponseBodyData setFailedMap(String failedMap) {
            this.failedMap = failedMap;
            return this;
        }
        public String getFailedMap() {
            return this.failedMap;
        }

        public ImportTSJobsOssResponseBodyData setSucceedCount(Long succeedCount) {
            this.succeedCount = succeedCount;
            return this;
        }
        public Long getSucceedCount() {
            return this.succeedCount;
        }

    }

}
