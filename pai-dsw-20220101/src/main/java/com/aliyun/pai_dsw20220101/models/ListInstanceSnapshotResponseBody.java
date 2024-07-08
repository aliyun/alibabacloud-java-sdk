// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dsw20220101.models;

import com.aliyun.tea.*;

public class ListInstanceSnapshotResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>null</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <strong>example:</strong>
     * <p>null</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <strong>example:</strong>
     * <p>&quot;XXX&quot;</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>E7D55162-4489-1619-AAF5-3F97D5FCA948</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Snapshots")
    public java.util.List<ListInstanceSnapshotResponseBodySnapshots> snapshots;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <strong>example:</strong>
     * <p>35</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    public static ListInstanceSnapshotResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListInstanceSnapshotResponseBody self = new ListInstanceSnapshotResponseBody();
        return TeaModel.build(map, self);
    }

    public ListInstanceSnapshotResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListInstanceSnapshotResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListInstanceSnapshotResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListInstanceSnapshotResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListInstanceSnapshotResponseBody setSnapshots(java.util.List<ListInstanceSnapshotResponseBodySnapshots> snapshots) {
        this.snapshots = snapshots;
        return this;
    }
    public java.util.List<ListInstanceSnapshotResponseBodySnapshots> getSnapshots() {
        return this.snapshots;
    }

    public ListInstanceSnapshotResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListInstanceSnapshotResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListInstanceSnapshotResponseBodySnapshotsLabels extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>stsTokenOwner</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <strong>example:</strong>
         * <p>123xxxxxxxx</p>
         */
        @NameInMap("Value")
        public String value;

        public static ListInstanceSnapshotResponseBodySnapshotsLabels build(java.util.Map<String, ?> map) throws Exception {
            ListInstanceSnapshotResponseBodySnapshotsLabels self = new ListInstanceSnapshotResponseBodySnapshotsLabels();
            return TeaModel.build(map, self);
        }

        public ListInstanceSnapshotResponseBodySnapshotsLabels setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListInstanceSnapshotResponseBodySnapshotsLabels setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListInstanceSnapshotResponseBodySnapshots extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>[&quot;/path1&quot;,&quot;/path2&quot;]</p>
         */
        @NameInMap("ExcludePaths")
        public java.util.List<String> excludePaths;

        /**
         * <strong>example:</strong>
         * <p>2021-01-12T14:36:01Z</p>
         */
        @NameInMap("GmtCreateTime")
        public String gmtCreateTime;

        /**
         * <strong>example:</strong>
         * <p>2021-01-12T14:36:01Z</p>
         */
        @NameInMap("GmtModifiedTime")
        public String gmtModifiedTime;

        /**
         * <strong>example:</strong>
         * <p>image-05cefd0be2exxxx</p>
         */
        @NameInMap("ImageId")
        public String imageId;

        /**
         * <strong>example:</strong>
         * <p>registry.cn-shanghai.aliyuncs.com/pai_product/tensorflow:py36_cpu_tf1.12_ubuntu</p>
         */
        @NameInMap("ImageUrl")
        public String imageUrl;

        /**
         * <strong>example:</strong>
         * <p>dsw-730xxxxxxxxxx</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <strong>example:</strong>
         * <p>{\&quot;foo\&quot;: \&quot;bar\&quot;}</p>
         */
        @NameInMap("Labels")
        public java.util.List<ListInstanceSnapshotResponseBodySnapshotsLabels> labels;

        /**
         * <strong>example:</strong>
         * <p>Internal Error</p>
         */
        @NameInMap("ReasonCode")
        public String reasonCode;

        /**
         * <strong>example:</strong>
         * <p>ImagePullBackOff</p>
         */
        @NameInMap("ReasonMessage")
        public String reasonMessage;

        /**
         * <strong>example:</strong>
         * <p>snp-05cexxxxxxxxx</p>
         */
        @NameInMap("SnapshotId")
        public String snapshotId;

        /**
         * <strong>example:</strong>
         * <p>training_data_env</p>
         */
        @NameInMap("SnapshotName")
        public String snapshotName;

        /**
         * <strong>example:</strong>
         * <p>Pushing</p>
         */
        @NameInMap("Status")
        public String status;

        public static ListInstanceSnapshotResponseBodySnapshots build(java.util.Map<String, ?> map) throws Exception {
            ListInstanceSnapshotResponseBodySnapshots self = new ListInstanceSnapshotResponseBodySnapshots();
            return TeaModel.build(map, self);
        }

        public ListInstanceSnapshotResponseBodySnapshots setExcludePaths(java.util.List<String> excludePaths) {
            this.excludePaths = excludePaths;
            return this;
        }
        public java.util.List<String> getExcludePaths() {
            return this.excludePaths;
        }

        public ListInstanceSnapshotResponseBodySnapshots setGmtCreateTime(String gmtCreateTime) {
            this.gmtCreateTime = gmtCreateTime;
            return this;
        }
        public String getGmtCreateTime() {
            return this.gmtCreateTime;
        }

        public ListInstanceSnapshotResponseBodySnapshots setGmtModifiedTime(String gmtModifiedTime) {
            this.gmtModifiedTime = gmtModifiedTime;
            return this;
        }
        public String getGmtModifiedTime() {
            return this.gmtModifiedTime;
        }

        public ListInstanceSnapshotResponseBodySnapshots setImageId(String imageId) {
            this.imageId = imageId;
            return this;
        }
        public String getImageId() {
            return this.imageId;
        }

        public ListInstanceSnapshotResponseBodySnapshots setImageUrl(String imageUrl) {
            this.imageUrl = imageUrl;
            return this;
        }
        public String getImageUrl() {
            return this.imageUrl;
        }

        public ListInstanceSnapshotResponseBodySnapshots setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListInstanceSnapshotResponseBodySnapshots setLabels(java.util.List<ListInstanceSnapshotResponseBodySnapshotsLabels> labels) {
            this.labels = labels;
            return this;
        }
        public java.util.List<ListInstanceSnapshotResponseBodySnapshotsLabels> getLabels() {
            return this.labels;
        }

        public ListInstanceSnapshotResponseBodySnapshots setReasonCode(String reasonCode) {
            this.reasonCode = reasonCode;
            return this;
        }
        public String getReasonCode() {
            return this.reasonCode;
        }

        public ListInstanceSnapshotResponseBodySnapshots setReasonMessage(String reasonMessage) {
            this.reasonMessage = reasonMessage;
            return this;
        }
        public String getReasonMessage() {
            return this.reasonMessage;
        }

        public ListInstanceSnapshotResponseBodySnapshots setSnapshotId(String snapshotId) {
            this.snapshotId = snapshotId;
            return this;
        }
        public String getSnapshotId() {
            return this.snapshotId;
        }

        public ListInstanceSnapshotResponseBodySnapshots setSnapshotName(String snapshotName) {
            this.snapshotName = snapshotName;
            return this;
        }
        public String getSnapshotName() {
            return this.snapshotName;
        }

        public ListInstanceSnapshotResponseBodySnapshots setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
