// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class UploadForeignSampleFileResponseBody extends TeaModel {
    /**
     * <p>status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public String httpStatusCode;

    /**
     * <p>Return message.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>request ID.</p>
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
    public UploadForeignSampleFileResponseBodyResultObject resultObject;

    public static UploadForeignSampleFileResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UploadForeignSampleFileResponseBody self = new UploadForeignSampleFileResponseBody();
        return TeaModel.build(map, self);
    }

    public UploadForeignSampleFileResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public UploadForeignSampleFileResponseBody setHttpStatusCode(String httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public String getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public UploadForeignSampleFileResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public UploadForeignSampleFileResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UploadForeignSampleFileResponseBody setResultObject(UploadForeignSampleFileResponseBodyResultObject resultObject) {
        this.resultObject = resultObject;
        return this;
    }
    public UploadForeignSampleFileResponseBodyResultObject getResultObject() {
        return this.resultObject;
    }

    public static class UploadForeignSampleFileResponseBodyResultObjectColumnStats extends TeaModel {
        /**
         * <p>De-duplication Count.</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("DistinctNumber")
        public Integer distinctNumber;

        /**
         * <p>De-duplication rate.</p>
         * 
         * <strong>example:</strong>
         * <p>23.87%</p>
         */
        @NameInMap("DistinctRate")
        public String distinctRate;

        /**
         * <p>Field Name.</p>
         * 
         * <strong>example:</strong>
         * <p>repoName</p>
         */
        @NameInMap("FieldName")
        public String fieldName;

        /**
         * <p>Missing count.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("MissNumber")
        public Integer missNumber;

        /**
         * <p>Missing rate.</p>
         * 
         * <strong>example:</strong>
         * <p>25.32%</p>
         */
        @NameInMap("MissRate")
        public String missRate;

        /**
         * <p>Row number of the record.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("RowNumber")
        public Integer rowNumber;

        public static UploadForeignSampleFileResponseBodyResultObjectColumnStats build(java.util.Map<String, ?> map) throws Exception {
            UploadForeignSampleFileResponseBodyResultObjectColumnStats self = new UploadForeignSampleFileResponseBodyResultObjectColumnStats();
            return TeaModel.build(map, self);
        }

        public UploadForeignSampleFileResponseBodyResultObjectColumnStats setDistinctNumber(Integer distinctNumber) {
            this.distinctNumber = distinctNumber;
            return this;
        }
        public Integer getDistinctNumber() {
            return this.distinctNumber;
        }

        public UploadForeignSampleFileResponseBodyResultObjectColumnStats setDistinctRate(String distinctRate) {
            this.distinctRate = distinctRate;
            return this;
        }
        public String getDistinctRate() {
            return this.distinctRate;
        }

        public UploadForeignSampleFileResponseBodyResultObjectColumnStats setFieldName(String fieldName) {
            this.fieldName = fieldName;
            return this;
        }
        public String getFieldName() {
            return this.fieldName;
        }

        public UploadForeignSampleFileResponseBodyResultObjectColumnStats setMissNumber(Integer missNumber) {
            this.missNumber = missNumber;
            return this;
        }
        public Integer getMissNumber() {
            return this.missNumber;
        }

        public UploadForeignSampleFileResponseBodyResultObjectColumnStats setMissRate(String missRate) {
            this.missRate = missRate;
            return this;
        }
        public String getMissRate() {
            return this.missRate;
        }

        public UploadForeignSampleFileResponseBodyResultObjectColumnStats setRowNumber(Integer rowNumber) {
            this.rowNumber = rowNumber;
            return this;
        }
        public Integer getRowNumber() {
            return this.rowNumber;
        }

    }

    public static class UploadForeignSampleFileResponseBodyResultObjectPreviewData extends TeaModel {
        /**
         * <p>Header information returned.</p>
         */
        @NameInMap("Headers")
        public java.util.List<String> headers;

        /**
         * <p>Row data.</p>
         */
        @NameInMap("Rows")
        public java.util.List<java.util.List<String>> rows;

        public static UploadForeignSampleFileResponseBodyResultObjectPreviewData build(java.util.Map<String, ?> map) throws Exception {
            UploadForeignSampleFileResponseBodyResultObjectPreviewData self = new UploadForeignSampleFileResponseBodyResultObjectPreviewData();
            return TeaModel.build(map, self);
        }

        public UploadForeignSampleFileResponseBodyResultObjectPreviewData setHeaders(java.util.List<String> headers) {
            this.headers = headers;
            return this;
        }
        public java.util.List<String> getHeaders() {
            return this.headers;
        }

        public UploadForeignSampleFileResponseBodyResultObjectPreviewData setRows(java.util.List<java.util.List<String>> rows) {
            this.rows = rows;
            return this;
        }
        public java.util.List<java.util.List<String>> getRows() {
            return this.rows;
        }

    }

    public static class UploadForeignSampleFileResponseBodyResultObject extends TeaModel {
        /**
         * <p>Number of jobs.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("BeyondBacktrackingPeriodNum")
        public Integer beyondBacktrackingPeriodNum;

        /**
         * <p>Column.</p>
         */
        @NameInMap("ColumnStats")
        public java.util.List<UploadForeignSampleFileResponseBodyResultObjectColumnStats> columnStats;

        /**
         * <p>Time type.</p>
         * 
         * <strong>example:</strong>
         * <p>yyyyMMdd</p>
         */
        @NameInMap("DateType")
        public String dateType;

        /**
         * <p>File name.</p>
         * 
         * <strong>example:</strong>
         * <p>Acct71b_Sample140934_md5_batch20250916.csv</p>
         */
        @NameInMap("FileName")
        public String fileName;

        /**
         * <p>File Size.</p>
         * 
         * <strong>example:</strong>
         * <p>78</p>
         */
        @NameInMap("FileSize")
        public Integer fileSize;

        /**
         * <p>File URL.</p>
         * 
         * <strong>example:</strong>
         * <p>saf/cpoc/34cd7959590ef568086035b956210495/1760580976089_XN_test_1016_100000.csv</p>
         */
        @NameInMap("FileUrl")
        public String fileUrl;

        /**
         * <p>Non-existent scenarios.</p>
         */
        @NameInMap("NotExistScenes")
        public java.util.List<String> notExistScenes;

        /**
         * <p>PhoneInvalidList.</p>
         */
        @NameInMap("PhoneInvalidList")
        public java.util.List<String> phoneInvalidList;

        /**
         * <p>Table data.</p>
         */
        @NameInMap("PreviewData")
        public UploadForeignSampleFileResponseBodyResultObjectPreviewData previewData;

        /**
         * <p>Number of rows.</p>
         * 
         * <strong>example:</strong>
         * <p>284</p>
         */
        @NameInMap("RowCount")
        public Integer rowCount;

        public static UploadForeignSampleFileResponseBodyResultObject build(java.util.Map<String, ?> map) throws Exception {
            UploadForeignSampleFileResponseBodyResultObject self = new UploadForeignSampleFileResponseBodyResultObject();
            return TeaModel.build(map, self);
        }

        public UploadForeignSampleFileResponseBodyResultObject setBeyondBacktrackingPeriodNum(Integer beyondBacktrackingPeriodNum) {
            this.beyondBacktrackingPeriodNum = beyondBacktrackingPeriodNum;
            return this;
        }
        public Integer getBeyondBacktrackingPeriodNum() {
            return this.beyondBacktrackingPeriodNum;
        }

        public UploadForeignSampleFileResponseBodyResultObject setColumnStats(java.util.List<UploadForeignSampleFileResponseBodyResultObjectColumnStats> columnStats) {
            this.columnStats = columnStats;
            return this;
        }
        public java.util.List<UploadForeignSampleFileResponseBodyResultObjectColumnStats> getColumnStats() {
            return this.columnStats;
        }

        public UploadForeignSampleFileResponseBodyResultObject setDateType(String dateType) {
            this.dateType = dateType;
            return this;
        }
        public String getDateType() {
            return this.dateType;
        }

        public UploadForeignSampleFileResponseBodyResultObject setFileName(String fileName) {
            this.fileName = fileName;
            return this;
        }
        public String getFileName() {
            return this.fileName;
        }

        public UploadForeignSampleFileResponseBodyResultObject setFileSize(Integer fileSize) {
            this.fileSize = fileSize;
            return this;
        }
        public Integer getFileSize() {
            return this.fileSize;
        }

        public UploadForeignSampleFileResponseBodyResultObject setFileUrl(String fileUrl) {
            this.fileUrl = fileUrl;
            return this;
        }
        public String getFileUrl() {
            return this.fileUrl;
        }

        public UploadForeignSampleFileResponseBodyResultObject setNotExistScenes(java.util.List<String> notExistScenes) {
            this.notExistScenes = notExistScenes;
            return this;
        }
        public java.util.List<String> getNotExistScenes() {
            return this.notExistScenes;
        }

        public UploadForeignSampleFileResponseBodyResultObject setPhoneInvalidList(java.util.List<String> phoneInvalidList) {
            this.phoneInvalidList = phoneInvalidList;
            return this;
        }
        public java.util.List<String> getPhoneInvalidList() {
            return this.phoneInvalidList;
        }

        public UploadForeignSampleFileResponseBodyResultObject setPreviewData(UploadForeignSampleFileResponseBodyResultObjectPreviewData previewData) {
            this.previewData = previewData;
            return this;
        }
        public UploadForeignSampleFileResponseBodyResultObjectPreviewData getPreviewData() {
            return this.previewData;
        }

        public UploadForeignSampleFileResponseBodyResultObject setRowCount(Integer rowCount) {
            this.rowCount = rowCount;
            return this;
        }
        public Integer getRowCount() {
            return this.rowCount;
        }

    }

}
