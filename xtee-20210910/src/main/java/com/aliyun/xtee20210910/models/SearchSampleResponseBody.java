// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class SearchSampleResponseBody extends TeaModel {
    /**
     * <p>The status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public String httpStatusCode;

    /**
     * <p>The returned message.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>A32FE941-35F2-5378-B37C-4B8FDB16F094</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Return Result.</p>
     */
    @NameInMap("ResultObject")
    public java.util.List<SearchSampleResponseBodyResultObject> resultObject;

    public static SearchSampleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SearchSampleResponseBody self = new SearchSampleResponseBody();
        return TeaModel.build(map, self);
    }

    public SearchSampleResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public SearchSampleResponseBody setHttpStatusCode(String httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public String getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public SearchSampleResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SearchSampleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SearchSampleResponseBody setResultObject(java.util.List<SearchSampleResponseBodyResultObject> resultObject) {
        this.resultObject = resultObject;
        return this;
    }
    public java.util.List<SearchSampleResponseBodyResultObject> getResultObject() {
        return this.resultObject;
    }

    public static class SearchSampleResponseBodyResultObject extends TeaModel {
        /**
         * <p>File Name.</p>
         * 
         * <strong>example:</strong>
         * <p>icekredit_model_A_2025c_1755826424_870000.csv</p>
         */
        @NameInMap("FileName")
        public String fileName;

        /**
         * <p>File Size.</p>
         * 
         * <strong>example:</strong>
         * <p>572</p>
         */
        @NameInMap("FileSize")
        public Integer fileSize;

        /**
         * <p>Remarks.</p>
         * 
         * <strong>example:</strong>
         * <p>ios_velo</p>
         */
        @NameInMap("Remark")
        public String remark;

        /**
         * <p>Number of Records.</p>
         * 
         * <strong>example:</strong>
         * <p>325</p>
         */
        @NameInMap("RowCount")
        public Integer rowCount;

        /**
         * <p>Sample ID.</p>
         * 
         * <strong>example:</strong>
         * <p>9b020e69bbae49d88c07a377c3ab7a71</p>
         */
        @NameInMap("SampleId")
        public Integer sampleId;

        /**
         * <p>Sample Name.</p>
         * 
         * <strong>example:</strong>
         * <p>Test</p>
         */
        @NameInMap("SampleName")
        public String sampleName;

        /**
         * <p>Scenario.</p>
         * 
         * <strong>example:</strong>
         * <p>FINANCE</p>
         */
        @NameInMap("Tab")
        public String tab;

        /**
         * <p>File Upload Time.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-12-01 12:23:34</p>
         */
        @NameInMap("UploadTime")
        public String uploadTime;

        /**
         * <p>Uploader.</p>
         * 
         * <strong>example:</strong>
         * <p>ds</p>
         */
        @NameInMap("UploadUserName")
        public String uploadUserName;

        public static SearchSampleResponseBodyResultObject build(java.util.Map<String, ?> map) throws Exception {
            SearchSampleResponseBodyResultObject self = new SearchSampleResponseBodyResultObject();
            return TeaModel.build(map, self);
        }

        public SearchSampleResponseBodyResultObject setFileName(String fileName) {
            this.fileName = fileName;
            return this;
        }
        public String getFileName() {
            return this.fileName;
        }

        public SearchSampleResponseBodyResultObject setFileSize(Integer fileSize) {
            this.fileSize = fileSize;
            return this;
        }
        public Integer getFileSize() {
            return this.fileSize;
        }

        public SearchSampleResponseBodyResultObject setRemark(String remark) {
            this.remark = remark;
            return this;
        }
        public String getRemark() {
            return this.remark;
        }

        public SearchSampleResponseBodyResultObject setRowCount(Integer rowCount) {
            this.rowCount = rowCount;
            return this;
        }
        public Integer getRowCount() {
            return this.rowCount;
        }

        public SearchSampleResponseBodyResultObject setSampleId(Integer sampleId) {
            this.sampleId = sampleId;
            return this;
        }
        public Integer getSampleId() {
            return this.sampleId;
        }

        public SearchSampleResponseBodyResultObject setSampleName(String sampleName) {
            this.sampleName = sampleName;
            return this;
        }
        public String getSampleName() {
            return this.sampleName;
        }

        public SearchSampleResponseBodyResultObject setTab(String tab) {
            this.tab = tab;
            return this;
        }
        public String getTab() {
            return this.tab;
        }

        public SearchSampleResponseBodyResultObject setUploadTime(String uploadTime) {
            this.uploadTime = uploadTime;
            return this;
        }
        public String getUploadTime() {
            return this.uploadTime;
        }

        public SearchSampleResponseBodyResultObject setUploadUserName(String uploadUserName) {
            this.uploadUserName = uploadUserName;
            return this;
        }
        public String getUploadUserName() {
            return this.uploadUserName;
        }

    }

}
