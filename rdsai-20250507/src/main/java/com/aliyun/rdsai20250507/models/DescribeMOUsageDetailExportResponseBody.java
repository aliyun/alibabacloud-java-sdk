// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rdsai20250507.models;

import com.aliyun.tea.*;

public class DescribeMOUsageDetailExportResponseBody extends TeaModel {
    @NameInMap("Data")
    public DescribeMOUsageDetailExportResponseBodyData data;

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

    public static DescribeMOUsageDetailExportResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeMOUsageDetailExportResponseBody self = new DescribeMOUsageDetailExportResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeMOUsageDetailExportResponseBody setData(DescribeMOUsageDetailExportResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeMOUsageDetailExportResponseBodyData getData() {
        return this.data;
    }

    public DescribeMOUsageDetailExportResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeMOUsageDetailExportResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeMOUsageDetailExportResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeMOUsageDetailExportResponseBodyDataFilters extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>sk-rds-**</p>
         */
        @NameInMap("ApiKey")
        public String apiKey;

        /**
         * <strong>example:</strong>
         * <p>2026-01-30T01:45:03Z</p>
         */
        @NameInMap("EndTime")
        public String endTime;

        /**
         * <strong>example:</strong>
         * <p>rds_copilot**</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <strong>example:</strong>
         * <p>glm-5</p>
         */
        @NameInMap("Model")
        public String model;

        /**
         * <strong>example:</strong>
         * <p>2026-01-28T01:45:03Z</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        public static DescribeMOUsageDetailExportResponseBodyDataFilters build(java.util.Map<String, ?> map) throws Exception {
            DescribeMOUsageDetailExportResponseBodyDataFilters self = new DescribeMOUsageDetailExportResponseBodyDataFilters();
            return TeaModel.build(map, self);
        }

        public DescribeMOUsageDetailExportResponseBodyDataFilters setApiKey(String apiKey) {
            this.apiKey = apiKey;
            return this;
        }
        public String getApiKey() {
            return this.apiKey;
        }

        public DescribeMOUsageDetailExportResponseBodyDataFilters setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public DescribeMOUsageDetailExportResponseBodyDataFilters setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeMOUsageDetailExportResponseBodyDataFilters setModel(String model) {
            this.model = model;
            return this;
        }
        public String getModel() {
            return this.model;
        }

        public DescribeMOUsageDetailExportResponseBodyDataFilters setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

    }

    public static class DescribeMOUsageDetailExportResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>2026-02-01T01:50:03Z</p>
         */
        @NameInMap("CompletedAt")
        public String completedAt;

        /**
         * <strong>example:</strong>
         * <p>2026-02-01T01:45:03Z</p>
         */
        @NameInMap("CreatedAt")
        public String createdAt;

        /**
         * <p>OSS 预签名下载 URL；status=expired 时为 null</p>
         * 
         * <strong>example:</strong>
         * <p>http://***</p>
         */
        @NameInMap("DownloadUrl")
        public String downloadUrl;

        /**
         * <strong>example:</strong>
         * <p>tenant auth error</p>
         */
        @NameInMap("ErrorMessage")
        public String errorMessage;

        /**
         * <p>下载 URL 失效时间（UTC ISO8601）</p>
         * 
         * <strong>example:</strong>
         * <p>2026-02-04T01:45:03Z</p>
         */
        @NameInMap("ExpiresAt")
        public String expiresAt;

        /**
         * <strong>example:</strong>
         * <p>252</p>
         */
        @NameInMap("FileSize")
        public Long fileSize;

        @NameInMap("Filters")
        public DescribeMOUsageDetailExportResponseBodyDataFilters filters;

        /**
         * <strong>example:</strong>
         * <p>csv</p>
         */
        @NameInMap("Format")
        public String format;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("RowCount")
        public Long rowCount;

        /**
         * <p>none / pending / processing / completed / failed / expired</p>
         * 
         * <strong>example:</strong>
         * <p>pending / processing / completed / failed / expired</p>
         */
        @NameInMap("Status")
        public String status;

        public static DescribeMOUsageDetailExportResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeMOUsageDetailExportResponseBodyData self = new DescribeMOUsageDetailExportResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeMOUsageDetailExportResponseBodyData setCompletedAt(String completedAt) {
            this.completedAt = completedAt;
            return this;
        }
        public String getCompletedAt() {
            return this.completedAt;
        }

        public DescribeMOUsageDetailExportResponseBodyData setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public DescribeMOUsageDetailExportResponseBodyData setDownloadUrl(String downloadUrl) {
            this.downloadUrl = downloadUrl;
            return this;
        }
        public String getDownloadUrl() {
            return this.downloadUrl;
        }

        public DescribeMOUsageDetailExportResponseBodyData setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public DescribeMOUsageDetailExportResponseBodyData setExpiresAt(String expiresAt) {
            this.expiresAt = expiresAt;
            return this;
        }
        public String getExpiresAt() {
            return this.expiresAt;
        }

        public DescribeMOUsageDetailExportResponseBodyData setFileSize(Long fileSize) {
            this.fileSize = fileSize;
            return this;
        }
        public Long getFileSize() {
            return this.fileSize;
        }

        public DescribeMOUsageDetailExportResponseBodyData setFilters(DescribeMOUsageDetailExportResponseBodyDataFilters filters) {
            this.filters = filters;
            return this;
        }
        public DescribeMOUsageDetailExportResponseBodyDataFilters getFilters() {
            return this.filters;
        }

        public DescribeMOUsageDetailExportResponseBodyData setFormat(String format) {
            this.format = format;
            return this;
        }
        public String getFormat() {
            return this.format;
        }

        public DescribeMOUsageDetailExportResponseBodyData setRowCount(Long rowCount) {
            this.rowCount = rowCount;
            return this;
        }
        public Long getRowCount() {
            return this.rowCount;
        }

        public DescribeMOUsageDetailExportResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
