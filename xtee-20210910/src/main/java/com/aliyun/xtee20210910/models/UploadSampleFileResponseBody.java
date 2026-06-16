// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class UploadSampleFileResponseBody extends TeaModel {
    /**
     * <p>Status code.</p>
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
    public UploadSampleFileResponseBodyResultObject resultObject;

    public static UploadSampleFileResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UploadSampleFileResponseBody self = new UploadSampleFileResponseBody();
        return TeaModel.build(map, self);
    }

    public UploadSampleFileResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public UploadSampleFileResponseBody setHttpStatusCode(String httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public String getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public UploadSampleFileResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public UploadSampleFileResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UploadSampleFileResponseBody setResultObject(UploadSampleFileResponseBodyResultObject resultObject) {
        this.resultObject = resultObject;
        return this;
    }
    public UploadSampleFileResponseBodyResultObject getResultObject() {
        return this.resultObject;
    }

    public static class UploadSampleFileResponseBodyResultObjectColumnStats extends TeaModel {
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
         * <p>28.23%</p>
         */
        @NameInMap("DistinctRate")
        public String distinctRate;

        /**
         * <p>Field Name.</p>
         * 
         * <strong>example:</strong>
         * <p>fb_org_id</p>
         */
        @NameInMap("FieldName")
        public String fieldName;

        /**
         * <p>Number of missing values.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("MissNumber")
        public Integer missNumber;

        /**
         * <p>Missing rate.</p>
         * 
         * <strong>example:</strong>
         * <p>28.23%</p>
         */
        @NameInMap("MissRate")
        public String missRate;

        /**
         * <p>Row number of the record.</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("RowNumber")
        public Integer rowNumber;

        public static UploadSampleFileResponseBodyResultObjectColumnStats build(java.util.Map<String, ?> map) throws Exception {
            UploadSampleFileResponseBodyResultObjectColumnStats self = new UploadSampleFileResponseBodyResultObjectColumnStats();
            return TeaModel.build(map, self);
        }

        public UploadSampleFileResponseBodyResultObjectColumnStats setDistinctNumber(Integer distinctNumber) {
            this.distinctNumber = distinctNumber;
            return this;
        }
        public Integer getDistinctNumber() {
            return this.distinctNumber;
        }

        public UploadSampleFileResponseBodyResultObjectColumnStats setDistinctRate(String distinctRate) {
            this.distinctRate = distinctRate;
            return this;
        }
        public String getDistinctRate() {
            return this.distinctRate;
        }

        public UploadSampleFileResponseBodyResultObjectColumnStats setFieldName(String fieldName) {
            this.fieldName = fieldName;
            return this;
        }
        public String getFieldName() {
            return this.fieldName;
        }

        public UploadSampleFileResponseBodyResultObjectColumnStats setMissNumber(Integer missNumber) {
            this.missNumber = missNumber;
            return this;
        }
        public Integer getMissNumber() {
            return this.missNumber;
        }

        public UploadSampleFileResponseBodyResultObjectColumnStats setMissRate(String missRate) {
            this.missRate = missRate;
            return this;
        }
        public String getMissRate() {
            return this.missRate;
        }

        public UploadSampleFileResponseBodyResultObjectColumnStats setRowNumber(Integer rowNumber) {
            this.rowNumber = rowNumber;
            return this;
        }
        public Integer getRowNumber() {
            return this.rowNumber;
        }

    }

    public static class UploadSampleFileResponseBodyResultObjectPreviewData extends TeaModel {
        /**
         * <p>Table header.</p>
         */
        @NameInMap("Headers")
        public java.util.List<String> headers;

        /**
         * <p>Row data.</p>
         */
        @NameInMap("Rows")
        public java.util.List<java.util.List<String>> rows;

        public static UploadSampleFileResponseBodyResultObjectPreviewData build(java.util.Map<String, ?> map) throws Exception {
            UploadSampleFileResponseBodyResultObjectPreviewData self = new UploadSampleFileResponseBodyResultObjectPreviewData();
            return TeaModel.build(map, self);
        }

        public UploadSampleFileResponseBodyResultObjectPreviewData setHeaders(java.util.List<String> headers) {
            this.headers = headers;
            return this;
        }
        public java.util.List<String> getHeaders() {
            return this.headers;
        }

        public UploadSampleFileResponseBodyResultObjectPreviewData setRows(java.util.List<java.util.List<String>> rows) {
            this.rows = rows;
            return this;
        }
        public java.util.List<java.util.List<String>> getRows() {
            return this.rows;
        }

    }

    public static class UploadSampleFileResponseBodyResultObject extends TeaModel {
        /**
         * <p>Number of jobs.</p>
         * 
         * <strong>example:</strong>
         * <p>gd</p>
         */
        @NameInMap("BeyondBacktrackingPeriodNum")
        public Integer beyondBacktrackingPeriodNum;

        /**
         * <p>Columns.</p>
         */
        @NameInMap("ColumnStats")
        public java.util.List<UploadSampleFileResponseBodyResultObjectColumnStats> columnStats;

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
         * <p>1472</p>
         */
        @NameInMap("FileSize")
        public Integer fileSize;

        /**
         * <p>File URL.</p>
         * 
         * <strong>example:</strong>
         * <p>saf/cpoc/30e2aff8f355af429bbab18f776496ef/1764037297543_icekredit_model_A_2025b_1764034785_147787.csv</p>
         */
        @NameInMap("FileUrl")
        public String fileUrl;

        /**
         * <p>Non-existent scenarios.</p>
         */
        @NameInMap("NotExistScenes")
        public java.util.List<String> notExistScenes;

        /**
         * <p>Number.</p>
         */
        @NameInMap("PhoneInvalidList")
        public java.util.List<String> phoneInvalidList;

        /**
         * <p>Table data.</p>
         */
        @NameInMap("PreviewData")
        public UploadSampleFileResponseBodyResultObjectPreviewData previewData;

        /**
         * <p>Number of rows.</p>
         * 
         * <strong>example:</strong>
         * <p>4974</p>
         */
        @NameInMap("RowCount")
        public Integer rowCount;

        public static UploadSampleFileResponseBodyResultObject build(java.util.Map<String, ?> map) throws Exception {
            UploadSampleFileResponseBodyResultObject self = new UploadSampleFileResponseBodyResultObject();
            return TeaModel.build(map, self);
        }

        public UploadSampleFileResponseBodyResultObject setBeyondBacktrackingPeriodNum(Integer beyondBacktrackingPeriodNum) {
            this.beyondBacktrackingPeriodNum = beyondBacktrackingPeriodNum;
            return this;
        }
        public Integer getBeyondBacktrackingPeriodNum() {
            return this.beyondBacktrackingPeriodNum;
        }

        public UploadSampleFileResponseBodyResultObject setColumnStats(java.util.List<UploadSampleFileResponseBodyResultObjectColumnStats> columnStats) {
            this.columnStats = columnStats;
            return this;
        }
        public java.util.List<UploadSampleFileResponseBodyResultObjectColumnStats> getColumnStats() {
            return this.columnStats;
        }

        public UploadSampleFileResponseBodyResultObject setDateType(String dateType) {
            this.dateType = dateType;
            return this;
        }
        public String getDateType() {
            return this.dateType;
        }

        public UploadSampleFileResponseBodyResultObject setFileName(String fileName) {
            this.fileName = fileName;
            return this;
        }
        public String getFileName() {
            return this.fileName;
        }

        public UploadSampleFileResponseBodyResultObject setFileSize(Integer fileSize) {
            this.fileSize = fileSize;
            return this;
        }
        public Integer getFileSize() {
            return this.fileSize;
        }

        public UploadSampleFileResponseBodyResultObject setFileUrl(String fileUrl) {
            this.fileUrl = fileUrl;
            return this;
        }
        public String getFileUrl() {
            return this.fileUrl;
        }

        public UploadSampleFileResponseBodyResultObject setNotExistScenes(java.util.List<String> notExistScenes) {
            this.notExistScenes = notExistScenes;
            return this;
        }
        public java.util.List<String> getNotExistScenes() {
            return this.notExistScenes;
        }

        public UploadSampleFileResponseBodyResultObject setPhoneInvalidList(java.util.List<String> phoneInvalidList) {
            this.phoneInvalidList = phoneInvalidList;
            return this;
        }
        public java.util.List<String> getPhoneInvalidList() {
            return this.phoneInvalidList;
        }

        public UploadSampleFileResponseBodyResultObject setPreviewData(UploadSampleFileResponseBodyResultObjectPreviewData previewData) {
            this.previewData = previewData;
            return this;
        }
        public UploadSampleFileResponseBodyResultObjectPreviewData getPreviewData() {
            return this.previewData;
        }

        public UploadSampleFileResponseBodyResultObject setRowCount(Integer rowCount) {
            this.rowCount = rowCount;
            return this;
        }
        public Integer getRowCount() {
            return this.rowCount;
        }

    }

}
