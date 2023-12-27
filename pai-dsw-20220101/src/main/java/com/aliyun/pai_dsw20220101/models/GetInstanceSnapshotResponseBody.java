// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dsw20220101.models;

import com.aliyun.tea.*;

public class GetInstanceSnapshotResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("ExcludePaths")
    public java.util.List<String> excludePaths;

    @NameInMap("GmtCreateTime")
    public String gmtCreateTime;

    @NameInMap("GmtModifiedTime")
    public String gmtModifiedTime;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("ImageId")
    public String imageId;

    @NameInMap("ImageUrl")
    public String imageUrl;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("Labels")
    public java.util.List<GetInstanceSnapshotResponseBodyLabels> labels;

    @NameInMap("Message")
    public String message;

    @NameInMap("ReasonCode")
    public String reasonCode;

    @NameInMap("ReasonMessage")
    public String reasonMessage;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SnapshotId")
    public String snapshotId;

    @NameInMap("SnapshotName")
    public String snapshotName;

    @NameInMap("Status")
    public String status;

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
        @NameInMap("Key")
        public String key;

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
