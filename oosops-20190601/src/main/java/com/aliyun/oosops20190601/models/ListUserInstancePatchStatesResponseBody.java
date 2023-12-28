// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oosops20190601.models;

import com.aliyun.tea.*;

public class ListUserInstancePatchStatesResponseBody extends TeaModel {
    @NameInMap("InstancePatchStates")
    public java.util.List<ListUserInstancePatchStatesResponseBodyInstancePatchStates> instancePatchStates;

    @NameInMap("MaxResults")
    public Integer maxResults;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("RequestId")
    public String requestId;

    public static ListUserInstancePatchStatesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListUserInstancePatchStatesResponseBody self = new ListUserInstancePatchStatesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListUserInstancePatchStatesResponseBody setInstancePatchStates(java.util.List<ListUserInstancePatchStatesResponseBodyInstancePatchStates> instancePatchStates) {
        this.instancePatchStates = instancePatchStates;
        return this;
    }
    public java.util.List<ListUserInstancePatchStatesResponseBodyInstancePatchStates> getInstancePatchStates() {
        return this.instancePatchStates;
    }

    public ListUserInstancePatchStatesResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListUserInstancePatchStatesResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListUserInstancePatchStatesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListUserInstancePatchStatesResponseBodyInstancePatchStates extends TeaModel {
        @NameInMap("BaselineId")
        public String baselineId;

        @NameInMap("FailedCount")
        public String failedCount;

        @NameInMap("InstalledCount")
        public String installedCount;

        @NameInMap("InstalledOtherCount")
        public String installedOtherCount;

        @NameInMap("InstalledPendingRebootCount")
        public String installedPendingRebootCount;

        @NameInMap("InstalledRejectedCount")
        public String installedRejectedCount;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("MissingCount")
        public String missingCount;

        @NameInMap("OperationEndTime")
        public String operationEndTime;

        @NameInMap("OperationStartTime")
        public String operationStartTime;

        @NameInMap("OperationType")
        public String operationType;

        @NameInMap("OwnerInformation")
        public String ownerInformation;

        @NameInMap("PatchGroup")
        public String patchGroup;

        public static ListUserInstancePatchStatesResponseBodyInstancePatchStates build(java.util.Map<String, ?> map) throws Exception {
            ListUserInstancePatchStatesResponseBodyInstancePatchStates self = new ListUserInstancePatchStatesResponseBodyInstancePatchStates();
            return TeaModel.build(map, self);
        }

        public ListUserInstancePatchStatesResponseBodyInstancePatchStates setBaselineId(String baselineId) {
            this.baselineId = baselineId;
            return this;
        }
        public String getBaselineId() {
            return this.baselineId;
        }

        public ListUserInstancePatchStatesResponseBodyInstancePatchStates setFailedCount(String failedCount) {
            this.failedCount = failedCount;
            return this;
        }
        public String getFailedCount() {
            return this.failedCount;
        }

        public ListUserInstancePatchStatesResponseBodyInstancePatchStates setInstalledCount(String installedCount) {
            this.installedCount = installedCount;
            return this;
        }
        public String getInstalledCount() {
            return this.installedCount;
        }

        public ListUserInstancePatchStatesResponseBodyInstancePatchStates setInstalledOtherCount(String installedOtherCount) {
            this.installedOtherCount = installedOtherCount;
            return this;
        }
        public String getInstalledOtherCount() {
            return this.installedOtherCount;
        }

        public ListUserInstancePatchStatesResponseBodyInstancePatchStates setInstalledPendingRebootCount(String installedPendingRebootCount) {
            this.installedPendingRebootCount = installedPendingRebootCount;
            return this;
        }
        public String getInstalledPendingRebootCount() {
            return this.installedPendingRebootCount;
        }

        public ListUserInstancePatchStatesResponseBodyInstancePatchStates setInstalledRejectedCount(String installedRejectedCount) {
            this.installedRejectedCount = installedRejectedCount;
            return this;
        }
        public String getInstalledRejectedCount() {
            return this.installedRejectedCount;
        }

        public ListUserInstancePatchStatesResponseBodyInstancePatchStates setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListUserInstancePatchStatesResponseBodyInstancePatchStates setMissingCount(String missingCount) {
            this.missingCount = missingCount;
            return this;
        }
        public String getMissingCount() {
            return this.missingCount;
        }

        public ListUserInstancePatchStatesResponseBodyInstancePatchStates setOperationEndTime(String operationEndTime) {
            this.operationEndTime = operationEndTime;
            return this;
        }
        public String getOperationEndTime() {
            return this.operationEndTime;
        }

        public ListUserInstancePatchStatesResponseBodyInstancePatchStates setOperationStartTime(String operationStartTime) {
            this.operationStartTime = operationStartTime;
            return this;
        }
        public String getOperationStartTime() {
            return this.operationStartTime;
        }

        public ListUserInstancePatchStatesResponseBodyInstancePatchStates setOperationType(String operationType) {
            this.operationType = operationType;
            return this;
        }
        public String getOperationType() {
            return this.operationType;
        }

        public ListUserInstancePatchStatesResponseBodyInstancePatchStates setOwnerInformation(String ownerInformation) {
            this.ownerInformation = ownerInformation;
            return this;
        }
        public String getOwnerInformation() {
            return this.ownerInformation;
        }

        public ListUserInstancePatchStatesResponseBodyInstancePatchStates setPatchGroup(String patchGroup) {
            this.patchGroup = patchGroup;
            return this;
        }
        public String getPatchGroup() {
            return this.patchGroup;
        }

    }

}
