// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dsw20220101.models;

import com.aliyun.tea.*;

public class GetInstanceSnapshotResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>null</p>
     */
    @NameInMap("Code")
    public String code;

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
     * <p>null</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

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
     * <p>{&quot;foo&quot;: &quot;bar&quot;}</p>
     */
    @NameInMap("Labels")
    public java.util.List<GetInstanceSnapshotResponseBodyLabels> labels;

    /**
     * <strong>example:</strong>
     * <p>&quot;XXX&quot;</p>
     */
    @NameInMap("Message")
    public String message;

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
     * <p>E7D55162-4489-1619-AAF5-3F97D5FCA948</p>
     */
    @NameInMap("RequestId")
    public String requestId;

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

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetInstanceSnapshotResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetInstanceSnapshotResponseBody self = new GetInstanceSnapshotResponseBody();
        return TeaModel.build(map, self);
    }

    public GetInstanceSnapshotResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetInstanceSnapshotResponseBody setExcludePaths(java.util.List<String> excludePaths) {
        this.excludePaths = excludePaths;
        return this;
    }
    public java.util.List<String> getExcludePaths() {
        return this.excludePaths;
    }

    public GetInstanceSnapshotResponseBody setGmtCreateTime(String gmtCreateTime) {
        this.gmtCreateTime = gmtCreateTime;
        return this;
    }
    public String getGmtCreateTime() {
        return this.gmtCreateTime;
    }

    public GetInstanceSnapshotResponseBody setGmtModifiedTime(String gmtModifiedTime) {
        this.gmtModifiedTime = gmtModifiedTime;
        return this;
    }
    public String getGmtModifiedTime() {
        return this.gmtModifiedTime;
    }

    public GetInstanceSnapshotResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetInstanceSnapshotResponseBody setImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }
    public String getImageId() {
        return this.imageId;
    }

    public GetInstanceSnapshotResponseBody setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
        return this;
    }
    public String getImageUrl() {
        return this.imageUrl;
    }

    public GetInstanceSnapshotResponseBody setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GetInstanceSnapshotResponseBody setLabels(java.util.List<GetInstanceSnapshotResponseBodyLabels> labels) {
        this.labels = labels;
        return this;
    }
    public java.util.List<GetInstanceSnapshotResponseBodyLabels> getLabels() {
        return this.labels;
    }

    public GetInstanceSnapshotResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetInstanceSnapshotResponseBody setReasonCode(String reasonCode) {
        this.reasonCode = reasonCode;
        return this;
    }
    public String getReasonCode() {
        return this.reasonCode;
    }

    public GetInstanceSnapshotResponseBody setReasonMessage(String reasonMessage) {
        this.reasonMessage = reasonMessage;
        return this;
    }
    public String getReasonMessage() {
        return this.reasonMessage;
    }

    public GetInstanceSnapshotResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetInstanceSnapshotResponseBody setSnapshotId(String snapshotId) {
        this.snapshotId = snapshotId;
        return this;
    }
    public String getSnapshotId() {
        return this.snapshotId;
    }

    public GetInstanceSnapshotResponseBody setSnapshotName(String snapshotName) {
        this.snapshotName = snapshotName;
        return this;
    }
    public String getSnapshotName() {
        return this.snapshotName;
    }

    public GetInstanceSnapshotResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public GetInstanceSnapshotResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetInstanceSnapshotResponseBodyLabels extends TeaModel {
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

        public static GetInstanceSnapshotResponseBodyLabels build(java.util.Map<String, ?> map) throws Exception {
            GetInstanceSnapshotResponseBodyLabels self = new GetInstanceSnapshotResponseBodyLabels();
            return TeaModel.build(map, self);
        }

        public GetInstanceSnapshotResponseBodyLabels setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public GetInstanceSnapshotResponseBodyLabels setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
