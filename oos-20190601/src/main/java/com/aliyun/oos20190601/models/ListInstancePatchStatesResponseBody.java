// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class ListInstancePatchStatesResponseBody extends TeaModel {
    /**
     * <p>The number of patches that are not installed.</p>
     */
    @NameInMap("InstancePatchStates")
    public java.util.List<ListInstancePatchStatesResponseBodyInstancePatchStates> instancePatchStates;

    /**
     * <p>The details of patches of the instance.</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The number of entries returned on each page.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListInstancePatchStatesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListInstancePatchStatesResponseBody self = new ListInstancePatchStatesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListInstancePatchStatesResponseBody setInstancePatchStates(java.util.List<ListInstancePatchStatesResponseBodyInstancePatchStates> instancePatchStates) {
        this.instancePatchStates = instancePatchStates;
        return this;
    }
    public java.util.List<ListInstancePatchStatesResponseBodyInstancePatchStates> getInstancePatchStates() {
        return this.instancePatchStates;
    }

    public ListInstancePatchStatesResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
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

    public static class ListInstancePatchStatesResponseBodyInstancePatchStates extends TeaModel {
        /**
         * <p>The number of patches that have been installed but require a restart to take effect.</p>
         */
        @NameInMap("BaselineId")
        public String baselineId;

        /**
         * <p>The ID of the patch baseline.</p>
         */
        @NameInMap("FailedCount")
        public String failedCount;

        /**
         * <p>Queries patches of an instance.</p>
         */
        @NameInMap("InstalledCount")
        public String installedCount;

        /**
         * <p>The ID of the ECS instance.</p>
         */
        @NameInMap("InstalledOtherCount")
        public String installedOtherCount;

        /**
         * <p>The number of patches that are rejected by the user.</p>
         */
        @NameInMap("InstalledPendingRebootCount")
        public String installedPendingRebootCount;

        /**
         * <p>The patch group.</p>
         */
        @NameInMap("InstalledRejectedCount")
        public String installedRejectedCount;

        /**
         * <p>The operation type.</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The time when the operation ended.</p>
         */
        @NameInMap("MissingCount")
        public String missingCount;

        /**
         * <p>The information about the user.</p>
         */
        @NameInMap("OperationEndTime")
        public String operationEndTime;

        /**
         * <p>The number of patches that failed to be installed.</p>
         */
        @NameInMap("OperationStartTime")
        public String operationStartTime;

        /**
         * <p>The time when the operation was initiated.</p>
         */
        @NameInMap("OperationType")
        public String operationType;

        /**
         * <p>The number of patches that do not meet the baseline.</p>
         */
        @NameInMap("OwnerInformation")
        public String ownerInformation;

        /**
         * <p>The number of installed patches.</p>
         */
        @NameInMap("PatchGroup")
        public String patchGroup;

        public static ListInstancePatchStatesResponseBodyInstancePatchStates build(java.util.Map<String, ?> map) throws Exception {
            ListInstancePatchStatesResponseBodyInstancePatchStates self = new ListInstancePatchStatesResponseBodyInstancePatchStates();
            return TeaModel.build(map, self);
        }

        public ListInstancePatchStatesResponseBodyInstancePatchStates setBaselineId(String baselineId) {
            this.baselineId = baselineId;
            return this;
        }
        public String getBaselineId() {
            return this.baselineId;
        }

        public ListInstancePatchStatesResponseBodyInstancePatchStates setFailedCount(String failedCount) {
            this.failedCount = failedCount;
            return this;
        }
        public String getFailedCount() {
            return this.failedCount;
        }

        public ListInstancePatchStatesResponseBodyInstancePatchStates setInstalledCount(String installedCount) {
            this.installedCount = installedCount;
            return this;
        }
        public String getInstalledCount() {
            return this.installedCount;
        }

        public ListInstancePatchStatesResponseBodyInstancePatchStates setInstalledOtherCount(String installedOtherCount) {
            this.installedOtherCount = installedOtherCount;
            return this;
        }
        public String getInstalledOtherCount() {
            return this.installedOtherCount;
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

        public ListInstancePatchStatesResponseBodyInstancePatchStates setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
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

        public ListInstancePatchStatesResponseBodyInstancePatchStates setOperationStartTime(String operationStartTime) {
            this.operationStartTime = operationStartTime;
            return this;
        }
        public String getOperationStartTime() {
            return this.operationStartTime;
        }

        public ListInstancePatchStatesResponseBodyInstancePatchStates setOperationType(String operationType) {
            this.operationType = operationType;
            return this;
        }
        public String getOperationType() {
            return this.operationType;
        }

        public ListInstancePatchStatesResponseBodyInstancePatchStates setOwnerInformation(String ownerInformation) {
            this.ownerInformation = ownerInformation;
            return this;
        }
        public String getOwnerInformation() {
            return this.ownerInformation;
        }

        public ListInstancePatchStatesResponseBodyInstancePatchStates setPatchGroup(String patchGroup) {
            this.patchGroup = patchGroup;
            return this;
        }
        public String getPatchGroup() {
            return this.patchGroup;
        }

    }

}
