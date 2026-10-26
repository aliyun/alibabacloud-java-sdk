// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class ListRecallManagementTableVersionsResponseBody extends TeaModel {
    /**
     * <p>The list of recall management table versions.</p>
     */
    @NameInMap("RecallManagementTableVersions")
    public java.util.List<ListRecallManagementTableVersionsResponseBodyRecallManagementTableVersions> recallManagementTableVersions;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>728C5E01-ABF6-5AA8-B9FC-B3BA05DECC77</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    public static ListRecallManagementTableVersionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListRecallManagementTableVersionsResponseBody self = new ListRecallManagementTableVersionsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListRecallManagementTableVersionsResponseBody setRecallManagementTableVersions(java.util.List<ListRecallManagementTableVersionsResponseBodyRecallManagementTableVersions> recallManagementTableVersions) {
        this.recallManagementTableVersions = recallManagementTableVersions;
        return this;
    }
    public java.util.List<ListRecallManagementTableVersionsResponseBodyRecallManagementTableVersions> getRecallManagementTableVersions() {
        return this.recallManagementTableVersions;
    }

    public ListRecallManagementTableVersionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListRecallManagementTableVersionsResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListRecallManagementTableVersionsResponseBodyRecallManagementTableVersions extends TeaModel {
        /**
         * <p>The data version.</p>
         * 
         * <strong>example:</strong>
         * <p>ds=20250701</p>
         */
        @NameInMap("DataVersion")
        public String dataVersion;

        /**
         * <p>The effective period. Format: YYYY-MM-DDTHH:mm:ss.SSS.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-12-15T23:24:33.132</p>
         */
        @NameInMap("EffectiveTime")
        public String effectiveTime;

        /**
         * <p>The synchronization end time. Format: YYYY-MM-DDTHH:mm:ss.SSS.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-12-15T23:24:33.132</p>
         */
        @NameInMap("PublishEndTime")
        public String publishEndTime;

        /**
         * <p>The synchronization start time. Format: YYYY-MM-DDTHH:mm:ss.SSS.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-12-15T22:24:33.132</p>
         */
        @NameInMap("PublishStartTime")
        public String publishStartTime;

        /**
         * <p>The version ID.</p>
         * 
         * <strong>example:</strong>
         * <p>202507010000</p>
         */
        @NameInMap("RecallManagementTableVersionId")
        public String recallManagementTableVersionId;

        /**
         * <p>The data size of the source data table.</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("SourceTableDataSize")
        public Long sourceTableDataSize;

        /**
         * <p>The number of rows in the source data table.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("SourceTableRowCount")
        public Long sourceTableRowCount;

        /**
         * <p>The status. Valid values:</p>
         * <ul>
         * <li>Online: online</li>
         * <li>Offline: offline</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Online</p>
         */
        @NameInMap("Status")
        public String status;

        public static ListRecallManagementTableVersionsResponseBodyRecallManagementTableVersions build(java.util.Map<String, ?> map) throws Exception {
            ListRecallManagementTableVersionsResponseBodyRecallManagementTableVersions self = new ListRecallManagementTableVersionsResponseBodyRecallManagementTableVersions();
            return TeaModel.build(map, self);
        }

        public ListRecallManagementTableVersionsResponseBodyRecallManagementTableVersions setDataVersion(String dataVersion) {
            this.dataVersion = dataVersion;
            return this;
        }
        public String getDataVersion() {
            return this.dataVersion;
        }

        public ListRecallManagementTableVersionsResponseBodyRecallManagementTableVersions setEffectiveTime(String effectiveTime) {
            this.effectiveTime = effectiveTime;
            return this;
        }
        public String getEffectiveTime() {
            return this.effectiveTime;
        }

        public ListRecallManagementTableVersionsResponseBodyRecallManagementTableVersions setPublishEndTime(String publishEndTime) {
            this.publishEndTime = publishEndTime;
            return this;
        }
        public String getPublishEndTime() {
            return this.publishEndTime;
        }

        public ListRecallManagementTableVersionsResponseBodyRecallManagementTableVersions setPublishStartTime(String publishStartTime) {
            this.publishStartTime = publishStartTime;
            return this;
        }
        public String getPublishStartTime() {
            return this.publishStartTime;
        }

        public ListRecallManagementTableVersionsResponseBodyRecallManagementTableVersions setRecallManagementTableVersionId(String recallManagementTableVersionId) {
            this.recallManagementTableVersionId = recallManagementTableVersionId;
            return this;
        }
        public String getRecallManagementTableVersionId() {
            return this.recallManagementTableVersionId;
        }

        public ListRecallManagementTableVersionsResponseBodyRecallManagementTableVersions setSourceTableDataSize(Long sourceTableDataSize) {
            this.sourceTableDataSize = sourceTableDataSize;
            return this;
        }
        public Long getSourceTableDataSize() {
            return this.sourceTableDataSize;
        }

        public ListRecallManagementTableVersionsResponseBodyRecallManagementTableVersions setSourceTableRowCount(Long sourceTableRowCount) {
            this.sourceTableRowCount = sourceTableRowCount;
            return this;
        }
        public Long getSourceTableRowCount() {
            return this.sourceTableRowCount;
        }

        public ListRecallManagementTableVersionsResponseBodyRecallManagementTableVersions setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
