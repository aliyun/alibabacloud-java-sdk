// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeAnalysisExportTaskDownloadUrlResponseBody extends TeaModel {
    /**
     * <p>Request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>A32FE941-35F2-5378-B37C-4B8FDB16F094</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Returned object</p>
     */
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
        /**
         * <p>Download URL.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://xxxxx-oss-xxxxx.xxxxxx.aliyuncs.com/xx/xx/xxx/xxxxxx.csv?Expires=1753433384&OSSAccessKeyId=xxxxxxxxx&Signature=%2F%xxxxxxxxxxxx%3D">https://xxxxx-oss-xxxxx.xxxxxx.aliyuncs.com/xx/xx/xxx/xxxxxx.csv?Expires=1753433384&amp;OSSAccessKeyId=xxxxxxxxx&amp;Signature=%2F%xxxxxxxxxxxx%3D</a></p>
         */
        @NameInMap("downloadFileUrl")
        public String downloadFileUrl;

        /**
         * <p>Download execution time</p>
         * 
         * <strong>example:</strong>
         * <p>1753891199000</p>
         */
        @NameInMap("executeTime")
        public Long executeTime;

        /**
         * <p>Task status.</p>
         * 
         * <strong>example:</strong>
         * <p>SUCCESS</p>
         */
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
