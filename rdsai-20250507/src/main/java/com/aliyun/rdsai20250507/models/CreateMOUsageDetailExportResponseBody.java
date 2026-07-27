// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rdsai20250507.models;

import com.aliyun.tea.*;

public class CreateMOUsageDetailExportResponseBody extends TeaModel {
    @NameInMap("Data")
    public CreateMOUsageDetailExportResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>FE9C65D7-930F-57A5-A207-8C396329241C</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static CreateMOUsageDetailExportResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateMOUsageDetailExportResponseBody self = new CreateMOUsageDetailExportResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateMOUsageDetailExportResponseBody setData(CreateMOUsageDetailExportResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateMOUsageDetailExportResponseBodyData getData() {
        return this.data;
    }

    public CreateMOUsageDetailExportResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateMOUsageDetailExportResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateMOUsageDetailExportResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class CreateMOUsageDetailExportResponseBodyDataFilters extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>sk-***</p>
         */
        @NameInMap("ApiKey")
        public String apiKey;

        /**
         * <strong>example:</strong>
         * <p>2025-03-10T02:02:20Z</p>
         */
        @NameInMap("EndTime")
        public String endTime;

        /**
         * <strong>example:</strong>
         * <p>rds_copilot**_public_cn-******</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <strong>example:</strong>
         * <p>qwen-flash</p>
         */
        @NameInMap("Model")
        public String model;

        /**
         * <strong>example:</strong>
         * <p>2026-03-05T16:00:00Z</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        public static CreateMOUsageDetailExportResponseBodyDataFilters build(java.util.Map<String, ?> map) throws Exception {
            CreateMOUsageDetailExportResponseBodyDataFilters self = new CreateMOUsageDetailExportResponseBodyDataFilters();
            return TeaModel.build(map, self);
        }

        public CreateMOUsageDetailExportResponseBodyDataFilters setApiKey(String apiKey) {
            this.apiKey = apiKey;
            return this;
        }
        public String getApiKey() {
            return this.apiKey;
        }

        public CreateMOUsageDetailExportResponseBodyDataFilters setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public CreateMOUsageDetailExportResponseBodyDataFilters setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public CreateMOUsageDetailExportResponseBodyDataFilters setModel(String model) {
            this.model = model;
            return this;
        }
        public String getModel() {
            return this.model;
        }

        public CreateMOUsageDetailExportResponseBodyDataFilters setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

    }

    public static class CreateMOUsageDetailExportResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>2026-03-15T21:18:45Z</p>
         */
        @NameInMap("CompletedAt")
        public String completedAt;

        /**
         * <strong>example:</strong>
         * <p>2026-03-15T21:14:45Z</p>
         */
        @NameInMap("CreatedAt")
        public String createdAt;

        /**
         * <strong>example:</strong>
         * <p>http://***</p>
         */
        @NameInMap("DownloadUrl")
        public String downloadUrl;

        /**
         * <strong>example:</strong>
         * <p>picture owner error</p>
         */
        @NameInMap("ErrorMessage")
        public String errorMessage;

        /**
         * <p>下载 URL 失效时间（UTC ISO8601）</p>
         * 
         * <strong>example:</strong>
         * <p>2026-02-07T21:14:45Z</p>
         */
        @NameInMap("ExpiresAt")
        public String expiresAt;

        /**
         * <strong>example:</strong>
         * <p>403</p>
         */
        @NameInMap("FileSize")
        public Long fileSize;

        @NameInMap("Filters")
        public CreateMOUsageDetailExportResponseBodyDataFilters filters;

        /**
         * <strong>example:</strong>
         * <p>csv</p>
         */
        @NameInMap("Format")
        public String format;

        /**
         * <strong>example:</strong>
         * <p>ddd6*****2a76</p>
         */
        @NameInMap("OssKey")
        public String ossKey;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("RowCount")
        public Long rowCount;

        /**
         * <p>pending / processing / completed / failed / expired</p>
         * 
         * <strong>example:</strong>
         * <p>pending / processing / completed / failed / expired</p>
         */
        @NameInMap("Status")
        public String status;

        public static CreateMOUsageDetailExportResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateMOUsageDetailExportResponseBodyData self = new CreateMOUsageDetailExportResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateMOUsageDetailExportResponseBodyData setCompletedAt(String completedAt) {
            this.completedAt = completedAt;
            return this;
        }
        public String getCompletedAt() {
            return this.completedAt;
        }

        public CreateMOUsageDetailExportResponseBodyData setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public CreateMOUsageDetailExportResponseBodyData setDownloadUrl(String downloadUrl) {
            this.downloadUrl = downloadUrl;
            return this;
        }
        public String getDownloadUrl() {
            return this.downloadUrl;
        }

        public CreateMOUsageDetailExportResponseBodyData setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public CreateMOUsageDetailExportResponseBodyData setExpiresAt(String expiresAt) {
            this.expiresAt = expiresAt;
            return this;
        }
        public String getExpiresAt() {
            return this.expiresAt;
        }

        public CreateMOUsageDetailExportResponseBodyData setFileSize(Long fileSize) {
            this.fileSize = fileSize;
            return this;
        }
        public Long getFileSize() {
            return this.fileSize;
        }

        public CreateMOUsageDetailExportResponseBodyData setFilters(CreateMOUsageDetailExportResponseBodyDataFilters filters) {
            this.filters = filters;
            return this;
        }
        public CreateMOUsageDetailExportResponseBodyDataFilters getFilters() {
            return this.filters;
        }

        public CreateMOUsageDetailExportResponseBodyData setFormat(String format) {
            this.format = format;
            return this;
        }
        public String getFormat() {
            return this.format;
        }

        public CreateMOUsageDetailExportResponseBodyData setOssKey(String ossKey) {
            this.ossKey = ossKey;
            return this;
        }
        public String getOssKey() {
            return this.ossKey;
        }

        public CreateMOUsageDetailExportResponseBodyData setRowCount(Long rowCount) {
            this.rowCount = rowCount;
            return this;
        }
        public Long getRowCount() {
            return this.rowCount;
        }

        public CreateMOUsageDetailExportResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
