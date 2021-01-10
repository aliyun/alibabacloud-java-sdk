// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class AddMsRcSyncBucketResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public AddMsRcSyncBucketResponseBodyData data;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("ResultCode")
    public String resultCode;

    public static AddMsRcSyncBucketResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddMsRcSyncBucketResponseBody self = new AddMsRcSyncBucketResponseBody();
        return TeaModel.build(map, self);
    }

    public AddMsRcSyncBucketResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AddMsRcSyncBucketResponseBody setData(AddMsRcSyncBucketResponseBodyData data) {
        this.data = data;
        return this;
    }
    public AddMsRcSyncBucketResponseBodyData getData() {
        return this.data;
    }

    public AddMsRcSyncBucketResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public AddMsRcSyncBucketResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public static class AddMsRcSyncBucketResponseBodyData extends TeaModel {
        @NameInMap("SourceClusterId")
        public String sourceClusterId;

        @NameInMap("ClusterTaskStatus")
        public String clusterTaskStatus;

        @NameInMap("TargetClusterId")
        public String targetClusterId;

        @NameInMap("ClusterTaskId")
        public String clusterTaskId;

        public static AddMsRcSyncBucketResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            AddMsRcSyncBucketResponseBodyData self = new AddMsRcSyncBucketResponseBodyData();
            return TeaModel.build(map, self);
        }

        public AddMsRcSyncBucketResponseBodyData setSourceClusterId(String sourceClusterId) {
            this.sourceClusterId = sourceClusterId;
            return this;
        }
        public String getSourceClusterId() {
            return this.sourceClusterId;
        }

        public AddMsRcSyncBucketResponseBodyData setClusterTaskStatus(String clusterTaskStatus) {
            this.clusterTaskStatus = clusterTaskStatus;
            return this;
        }
        public String getClusterTaskStatus() {
            return this.clusterTaskStatus;
        }

        public AddMsRcSyncBucketResponseBodyData setTargetClusterId(String targetClusterId) {
            this.targetClusterId = targetClusterId;
            return this;
        }
        public String getTargetClusterId() {
            return this.targetClusterId;
        }

        public AddMsRcSyncBucketResponseBodyData setClusterTaskId(String clusterTaskId) {
            this.clusterTaskId = clusterTaskId;
            return this;
        }
        public String getClusterTaskId() {
            return this.clusterTaskId;
        }

    }

}
