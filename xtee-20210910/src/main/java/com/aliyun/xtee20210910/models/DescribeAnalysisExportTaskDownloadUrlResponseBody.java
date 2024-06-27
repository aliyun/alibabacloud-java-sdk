// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeAnalysisExportTaskDownloadUrlResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("resultObject")
    public DescribeAnalysisExportTaskDownloadUrlResponseBodyResultObject resultObject;

    public static DescribeAnalysisExportTaskDownloadUrlResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAnalysisExportTaskDownloadUrlResponseBody self = new DescribeAnalysisExportTaskDownloadUrlResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAnalysisExportTaskDownloadUrlResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAnalysisExportTaskDownloadUrlResponseBody setResultObject(DescribeAnalysisExportTaskDownloadUrlResponseBodyResultObject resultObject) {
        this.resultObject = resultObject;
        return this;
    }
    public DescribeAnalysisExportTaskDownloadUrlResponseBodyResultObject getResultObject() {
        return this.resultObject;
    }

    public static class DescribeAnalysisExportTaskDownloadUrlResponseBodyResultObject extends TeaModel {
        @NameInMap("downloadFileUrl")
        public String downloadFileUrl;

        @NameInMap("executeTime")
        public Long executeTime;

        @NameInMap("status")
        public String status;

        public static DescribeAnalysisExportTaskDownloadUrlResponseBodyResultObject build(java.util.Map<String, ?> map) throws Exception {
            DescribeAnalysisExportTaskDownloadUrlResponseBodyResultObject self = new DescribeAnalysisExportTaskDownloadUrlResponseBodyResultObject();
            return TeaModel.build(map, self);
        }

        public DescribeAnalysisExportTaskDownloadUrlResponseBodyResultObject setDownloadFileUrl(String downloadFileUrl) {
            this.downloadFileUrl = downloadFileUrl;
            return this;
        }
        public String getDownloadFileUrl() {
            return this.downloadFileUrl;
        }

        public DescribeAnalysisExportTaskDownloadUrlResponseBodyResultObject setExecuteTime(Long executeTime) {
            this.executeTime = executeTime;
            return this;
        }
        public Long getExecuteTime() {
            return this.executeTime;
        }

        public DescribeAnalysisExportTaskDownloadUrlResponseBodyResultObject setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
