// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class ListRecallManagementTableVersionsResponseBody extends TeaModel {
    @NameInMap("RecallManagementTableVersions")
    public java.util.List<ListRecallManagementTableVersionsResponseBodyRecallManagementTableVersions> recallManagementTableVersions;

    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("DataVersion")
        public String dataVersion;

        @NameInMap("EffectiveTime")
        public String effectiveTime;

        @NameInMap("PublishEndTime")
        public String publishEndTime;

        @NameInMap("PublishStartTime")
        public String publishStartTime;

        @NameInMap("RecallManagementTableVersionId")
        public String recallManagementTableVersionId;

        @NameInMap("SourceTableDataSize")
        public Long sourceTableDataSize;

        @NameInMap("SourceTableRowCount")
        public Long sourceTableRowCount;

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
