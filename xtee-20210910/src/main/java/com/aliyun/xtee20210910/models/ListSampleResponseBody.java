// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class ListSampleResponseBody extends TeaModel {
    /**
     * <p>Status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>Current page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public String httpStatusCode;

    /**
     * <p>Error message.</p>
     * 
     * <strong>example:</strong>
     * <p>successful</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Page size.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

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
    public java.util.List<ListSampleResponseBodyResultObject> resultObject;

    /**
     * <p>Total Number of Returned Items.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("TotalItem")
    public Integer totalItem;

    /**
     * <p>Total number of pages.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalPage")
    public Integer totalPage;

    public static ListSampleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListSampleResponseBody self = new ListSampleResponseBody();
        return TeaModel.build(map, self);
    }

    public ListSampleResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListSampleResponseBody setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public ListSampleResponseBody setHttpStatusCode(String httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public String getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListSampleResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListSampleResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListSampleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListSampleResponseBody setResultObject(java.util.List<ListSampleResponseBodyResultObject> resultObject) {
        this.resultObject = resultObject;
        return this;
    }
    public java.util.List<ListSampleResponseBodyResultObject> getResultObject() {
        return this.resultObject;
    }

    public ListSampleResponseBody setTotalItem(Integer totalItem) {
        this.totalItem = totalItem;
        return this;
    }
    public Integer getTotalItem() {
        return this.totalItem;
    }

    public ListSampleResponseBody setTotalPage(Integer totalPage) {
        this.totalPage = totalPage;
        return this;
    }
    public Integer getTotalPage() {
        return this.totalPage;
    }

    public static class ListSampleResponseBodyResultObject extends TeaModel {
        /**
         * <p>File Name.</p>
         * 
         * <strong>example:</strong>
         * <p>202604016426_2_MOB_10W.csv</p>
         */
        @NameInMap("FileName")
        public String fileName;

        /**
         * <p>File Size. Unit: bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>78</p>
         */
        @NameInMap("FileSize")
        public Integer fileSize;

        /**
         * <p>Remarks.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-gw8hs2m7qiiy4onxnjf7x</p>
         */
        @NameInMap("Remark")
        public String remark;

        /**
         * <p>Table Row Count.</p>
         * 
         * <strong>example:</strong>
         * <p>284</p>
         */
        @NameInMap("RowCount")
        public Integer rowCount;

        /**
         * <p>Sample ID.</p>
         * 
         * <strong>example:</strong>
         * <p>7</p>
         */
        @NameInMap("SampleId")
        public Integer sampleId;

        /**
         * <p>Sample Name.</p>
         * 
         * <strong>example:</strong>
         * <p>TEst</p>
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
         * <p>2023-04-09 12:45:23</p>
         */
        @NameInMap("UploadTime")
        public String uploadTime;

        /**
         * <p>Uploader.</p>
         * 
         * <strong>example:</strong>
         * <p>mest</p>
         */
        @NameInMap("UploadUserName")
        public String uploadUserName;

        public static ListSampleResponseBodyResultObject build(java.util.Map<String, ?> map) throws Exception {
            ListSampleResponseBodyResultObject self = new ListSampleResponseBodyResultObject();
            return TeaModel.build(map, self);
        }

        public ListSampleResponseBodyResultObject setFileName(String fileName) {
            this.fileName = fileName;
            return this;
        }
        public String getFileName() {
            return this.fileName;
        }

        public ListSampleResponseBodyResultObject setFileSize(Integer fileSize) {
            this.fileSize = fileSize;
            return this;
        }
        public Integer getFileSize() {
            return this.fileSize;
        }

        public ListSampleResponseBodyResultObject setRemark(String remark) {
            this.remark = remark;
            return this;
        }
        public String getRemark() {
            return this.remark;
        }

        public ListSampleResponseBodyResultObject setRowCount(Integer rowCount) {
            this.rowCount = rowCount;
            return this;
        }
        public Integer getRowCount() {
            return this.rowCount;
        }

        public ListSampleResponseBodyResultObject setSampleId(Integer sampleId) {
            this.sampleId = sampleId;
            return this;
        }
        public Integer getSampleId() {
            return this.sampleId;
        }

        public ListSampleResponseBodyResultObject setSampleName(String sampleName) {
            this.sampleName = sampleName;
            return this;
        }
        public String getSampleName() {
            return this.sampleName;
        }

        public ListSampleResponseBodyResultObject setTab(String tab) {
            this.tab = tab;
            return this;
        }
        public String getTab() {
            return this.tab;
        }

        public ListSampleResponseBodyResultObject setUploadTime(String uploadTime) {
            this.uploadTime = uploadTime;
            return this;
        }
        public String getUploadTime() {
            return this.uploadTime;
        }

        public ListSampleResponseBodyResultObject setUploadUserName(String uploadUserName) {
            this.uploadUserName = uploadUserName;
            return this;
        }
        public String getUploadUserName() {
            return this.uploadUserName;
        }

    }

}
