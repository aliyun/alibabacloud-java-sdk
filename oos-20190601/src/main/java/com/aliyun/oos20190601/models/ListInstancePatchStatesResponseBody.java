// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class ListInstancePatchStatesResponseBody extends TeaModel {
    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("MaxResults")
    public Integer maxResults;

    @NameInMap("InstancePatchStates")
    public java.util.List<ListInstancePatchStatesResponseBodyInstancePatchStates> instancePatchStates;

    public static ListInstancePatchStatesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListInstancePatchStatesResponseBody self = new ListInstancePatchStatesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListInstancePatchStatesResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListInstancePatchStatesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListInstancePatchStatesResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListInstancePatchStatesResponseBody setInstancePatchStates(java.util.List<ListInstancePatchStatesResponseBodyInstancePatchStates> instancePatchStates) {
        this.instancePatchStates = instancePatchStates;
        return this;
    }
    public java.util.List<ListInstancePatchStatesResponseBodyInstancePatchStates> getInstancePatchStates() {
        return this.instancePatchStates;
    }

    public static class ListInstancePatchStatesResponseBodyInstancePatchStates extends TeaModel {
        @NameInMap("MissingCount")
        public String missingCount;

        @NameInMap("OperationEndTime")
        public String operationEndTime;

        @NameInMap("OwnerInformation")
        public String ownerInformation;

        @NameInMap("InstalledOtherCount")
        public String installedOtherCount;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("OperationType")
        public String operationType;

        @NameInMap("OperationStartTime")
        public String operationStartTime;

        @NameInMap("FailedCount")
        public String failedCount;

        @NameInMap("BaselineId")
        public String baselineId;

        @NameInMap("InstalledPendingRebootCount")
        public String installedPendingRebootCount;

        @NameInMap("InstalledRejectedCount")
        public String installedRejectedCount;

        @NameInMap("PatchGroup")
        public String patchGroup;

        @NameInMap("InstalledCount")
        public String installedCount;

        public static ListInstancePatchStatesResponseBodyInstancePatchStates build(java.util.Map<String, ?> map) throws Exception {
            ListInstancePatchStatesResponseBodyInstancePatchStates self = new ListInstancePatchStatesResponseBodyInstancePatchStates();
            return TeaModel.build(map, self);
        }

        public ListInstancePatchStatesResponseBodyInstancePatchStates setMissingCount(String missingCount) {
            this.missingCount = missingCount;
            return this;
        }
        public String getMissingCount() {
            return this.missingCount;
        }

        public ListInstancePatchStatesResponseBodyInstancePatchStates setOperationEndTime(String operationEndTime) {
            this.operationEndTime = operationEndTime;
            return this;
        }
        public String getOperationEndTime() {
            return this.operationEndTime;
        }

        public ListInstancePatchStatesResponseBodyInstancePatchStates setOwnerInformation(String ownerInformation) {
            this.ownerInformation = ownerInformation;
            return this;
        }
        public String getOwnerInformation() {
            return this.ownerInformation;
        }

        public ListInstancePatchStatesResponseBodyInstancePatchStates setInstalledOtherCount(String installedOtherCount) {
            this.installedOtherCount = installedOtherCount;
            return this;
        }
        public String getInstalledOtherCount() {
            return this.installedOtherCount;
        }

        public ListInstancePatchStatesResponseBodyInstancePatchStates setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListInstancePatchStatesResponseBodyInstancePatchStates setOperationType(String operationType) {
            this.operationType = operationType;
            return this;
        }
        public String getOperationType() {
            return this.operationType;
        }

        public ListInstancePatchStatesResponseBodyInstancePatchStates setOperationStartTime(String operationStartTime) {
            this.operationStartTime = operationStartTime;
            return this;
        }
        public String getOperationStartTime() {
            return this.operationStartTime;
        }

        public ListInstancePatchStatesResponseBodyInstancePatchStates setFailedCount(String failedCount) {
            this.failedCount = failedCount;
            return this;
        }
        public String getFailedCount() {
            return this.failedCount;
        }

        public ListInstancePatchStatesResponseBodyInstancePatchStates setBaselineId(String baselineId) {
            this.baselineId = baselineId;
            return this;
        }
        public String getBaselineId() {
            return this.baselineId;
        }

        public ListInstancePatchStatesResponseBodyInstancePatchStates setInstalledPendingRebootCount(String installedPendingRebootCount) {
            this.installedPendingRebootCount = installedPendingRebootCount;
            return this;
        }
        public String getInstalledPendingRebootCount() {
            return this.installedPendingRebootCount;
        }

        public ListInstancePatchStatesResponseBodyInstancePatchStates setInstalledRejectedCount(String installedRejectedCount) {
            this.installedRejectedCount = installedRejectedCount;
            return this;
        }
        public String getInstalledRejectedCount() {
            return this.installedRejectedCount;
        }

        public ListInstancePatchStatesResponseBodyInstancePatchStates setPatchGroup(String patchGroup) {
            this.patchGroup = patchGroup;
            return this;
        }
        public String getPatchGroup() {
            return this.patchGroup;
        }

        public ListInstancePatchStatesResponseBodyInstancePatchStates setInstalledCount(String installedCount) {
            this.installedCount = installedCount;
            return this;
        }
        public String getInstalledCount() {
            return this.installedCount;
        }

    }

}
