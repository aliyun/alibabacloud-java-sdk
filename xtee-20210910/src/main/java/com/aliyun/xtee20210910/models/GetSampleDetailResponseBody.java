// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class GetSampleDetailResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public String httpStatusCode;

    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>A32FE941-35F2-5378-B37C-4B8FDB16F094</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultObject")
    public GetSampleDetailResponseBodyResultObject resultObject;

    public static GetSampleDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetSampleDetailResponseBody self = new GetSampleDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public GetSampleDetailResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetSampleDetailResponseBody setHttpStatusCode(String httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public String getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetSampleDetailResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetSampleDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetSampleDetailResponseBody setResultObject(GetSampleDetailResponseBodyResultObject resultObject) {
        this.resultObject = resultObject;
        return this;
    }
    public GetSampleDetailResponseBodyResultObject getResultObject() {
        return this.resultObject;
    }

    public static class GetSampleDetailResponseBodyResultObjectColumnStats extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>23</p>
         */
        @NameInMap("DistinctNumber")
        public Integer distinctNumber;

        /**
         * <strong>example:</strong>
         * <p>23.87%</p>
         */
        @NameInMap("DistinctRate")
        public String distinctRate;

        /**
         * <strong>example:</strong>
         * <p>repoName</p>
         */
        @NameInMap("FieldName")
        public String fieldName;

        /**
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("MissNumber")
        public Integer missNumber;

        /**
         * <strong>example:</strong>
         * <p>25.32%</p>
         */
        @NameInMap("MissRate")
        public String missRate;

        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("RowNumber")
        public Integer rowNumber;

        public static GetSampleDetailResponseBodyResultObjectColumnStats build(java.util.Map<String, ?> map) throws Exception {
            GetSampleDetailResponseBodyResultObjectColumnStats self = new GetSampleDetailResponseBodyResultObjectColumnStats();
            return TeaModel.build(map, self);
        }

        public GetSampleDetailResponseBodyResultObjectColumnStats setDistinctNumber(Integer distinctNumber) {
            this.distinctNumber = distinctNumber;
            return this;
        }
        public Integer getDistinctNumber() {
            return this.distinctNumber;
        }

        public GetSampleDetailResponseBodyResultObjectColumnStats setDistinctRate(String distinctRate) {
            this.distinctRate = distinctRate;
            return this;
        }
        public String getDistinctRate() {
            return this.distinctRate;
        }

        public GetSampleDetailResponseBodyResultObjectColumnStats setFieldName(String fieldName) {
            this.fieldName = fieldName;
            return this;
        }
        public String getFieldName() {
            return this.fieldName;
        }

        public GetSampleDetailResponseBodyResultObjectColumnStats setMissNumber(Integer missNumber) {
            this.missNumber = missNumber;
            return this;
        }
        public Integer getMissNumber() {
            return this.missNumber;
        }

        public GetSampleDetailResponseBodyResultObjectColumnStats setMissRate(String missRate) {
            this.missRate = missRate;
            return this;
        }
        public String getMissRate() {
            return this.missRate;
        }

        public GetSampleDetailResponseBodyResultObjectColumnStats setRowNumber(Integer rowNumber) {
            this.rowNumber = rowNumber;
            return this;
        }
        public Integer getRowNumber() {
            return this.rowNumber;
        }

    }

    public static class GetSampleDetailResponseBodyResultObjectPreviewData extends TeaModel {
        @NameInMap("Headers")
        public java.util.List<String> headers;

        @NameInMap("Rows")
        public java.util.List<java.util.List<String>> rows;

        public static GetSampleDetailResponseBodyResultObjectPreviewData build(java.util.Map<String, ?> map) throws Exception {
            GetSampleDetailResponseBodyResultObjectPreviewData self = new GetSampleDetailResponseBodyResultObjectPreviewData();
            return TeaModel.build(map, self);
        }

        public GetSampleDetailResponseBodyResultObjectPreviewData setHeaders(java.util.List<String> headers) {
            this.headers = headers;
            return this;
        }
        public java.util.List<String> getHeaders() {
            return this.headers;
        }

        public GetSampleDetailResponseBodyResultObjectPreviewData setRows(java.util.List<java.util.List<String>> rows) {
            this.rows = rows;
            return this;
        }
        public java.util.List<java.util.List<String>> getRows() {
            return this.rows;
        }

    }

    public static class GetSampleDetailResponseBodyResultObject extends TeaModel {
        @NameInMap("ColumnStats")
        public java.util.List<GetSampleDetailResponseBodyResultObjectColumnStats> columnStats;

        /**
         * <strong>example:</strong>
         * <p>month</p>
         */
        @NameInMap("DateType")
        public String dateType;

        /**
         * <strong>example:</strong>
         * <p><a href="https://cas-documents-service.oss-cn-shanghai.aliyuncs.com/Batch_Upload_Monitor_Domain.xlsx?Expires=1753755419&OSSAccessKeyId=****&Signature=">https://cas-documents-service.oss-cn-shanghai.aliyuncs.com/Batch_Upload_Monitor_Domain.xlsx?Expires=1753755419&amp;OSSAccessKeyId=****&amp;Signature=</a>****</p>
         */
        @NameInMap("DownloadUrl")
        public String downloadUrl;

        @NameInMap("FileName")
        public String fileName;

        /**
         * <strong>example:</strong>
         * <p>199</p>
         */
        @NameInMap("FileSize")
        public Integer fileSize;

        @NameInMap("PreviewData")
        public GetSampleDetailResponseBodyResultObjectPreviewData previewData;

        /**
         * <strong>example:</strong>
         * <p>ios_fb</p>
         */
        @NameInMap("Remark")
        public String remark;

        /**
         * <strong>example:</strong>
         * <p>325</p>
         */
        @NameInMap("RowCount")
        public Integer rowCount;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("SampleId")
        public Integer sampleId;

        /**
         * <strong>example:</strong>
         * <p>SampleTest</p>
         */
        @NameInMap("SampleName")
        public String sampleName;

        /**
         * <strong>example:</strong>
         * <p>FINANCE</p>
         */
        @NameInMap("Tab")
        public String tab;

        /**
         * <strong>example:</strong>
         * <p>2024-09-27 10:23:40</p>
         */
        @NameInMap("UploadTime")
        public String uploadTime;

        @NameInMap("UploadUserName")
        public String uploadUserName;

        public static GetSampleDetailResponseBodyResultObject build(java.util.Map<String, ?> map) throws Exception {
            GetSampleDetailResponseBodyResultObject self = new GetSampleDetailResponseBodyResultObject();
            return TeaModel.build(map, self);
        }

        public GetSampleDetailResponseBodyResultObject setColumnStats(java.util.List<GetSampleDetailResponseBodyResultObjectColumnStats> columnStats) {
            this.columnStats = columnStats;
            return this;
        }
        public java.util.List<GetSampleDetailResponseBodyResultObjectColumnStats> getColumnStats() {
            return this.columnStats;
        }

        public GetSampleDetailResponseBodyResultObject setDateType(String dateType) {
            this.dateType = dateType;
            return this;
        }
        public String getDateType() {
            return this.dateType;
        }

        public GetSampleDetailResponseBodyResultObject setDownloadUrl(String downloadUrl) {
            this.downloadUrl = downloadUrl;
            return this;
        }
        public String getDownloadUrl() {
            return this.downloadUrl;
        }

        public GetSampleDetailResponseBodyResultObject setFileName(String fileName) {
            this.fileName = fileName;
            return this;
        }
        public String getFileName() {
            return this.fileName;
        }

        public GetSampleDetailResponseBodyResultObject setFileSize(Integer fileSize) {
            this.fileSize = fileSize;
            return this;
        }
        public Integer getFileSize() {
            return this.fileSize;
        }

        public GetSampleDetailResponseBodyResultObject setPreviewData(GetSampleDetailResponseBodyResultObjectPreviewData previewData) {
            this.previewData = previewData;
            return this;
        }
        public GetSampleDetailResponseBodyResultObjectPreviewData getPreviewData() {
            return this.previewData;
        }

        public GetSampleDetailResponseBodyResultObject setRemark(String remark) {
            this.remark = remark;
            return this;
        }
        public String getRemark() {
            return this.remark;
        }

        public GetSampleDetailResponseBodyResultObject setRowCount(Integer rowCount) {
            this.rowCount = rowCount;
            return this;
        }
        public Integer getRowCount() {
            return this.rowCount;
        }

        public GetSampleDetailResponseBodyResultObject setSampleId(Integer sampleId) {
            this.sampleId = sampleId;
            return this;
        }
        public Integer getSampleId() {
            return this.sampleId;
        }

        public GetSampleDetailResponseBodyResultObject setSampleName(String sampleName) {
            this.sampleName = sampleName;
            return this;
        }
        public String getSampleName() {
            return this.sampleName;
        }

        public GetSampleDetailResponseBodyResultObject setTab(String tab) {
            this.tab = tab;
            return this;
        }
        public String getTab() {
            return this.tab;
        }

        public GetSampleDetailResponseBodyResultObject setUploadTime(String uploadTime) {
            this.uploadTime = uploadTime;
            return this;
        }
        public String getUploadTime() {
            return this.uploadTime;
        }

        public GetSampleDetailResponseBodyResultObject setUploadUserName(String uploadUserName) {
            this.uploadUserName = uploadUserName;
            return this;
        }
        public String getUploadUserName() {
            return this.uploadUserName;
        }

    }

}
