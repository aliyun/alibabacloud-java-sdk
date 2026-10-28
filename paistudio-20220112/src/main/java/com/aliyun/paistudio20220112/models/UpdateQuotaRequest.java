// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20220112.models;

import com.aliyun.tea.*;

public class UpdateQuotaRequest extends TeaModel {
    /**
     * <p>The configurations of the compute cluster bound to the quota (RNQ Ray cluster). This parameter is only available for RNQ quotas and will be rejected for common quotas. It can only be modified when no operations are in progress on the quota. Unpassed sub-fields retain the current effective configurations.</p>
     */
    @NameInMap("ClusterSpec")
    public UpdateQuotaRequestClusterSpec clusterSpec;

    /**
     * <p>The description of the resource quota.</p>
     * 
     * <strong>example:</strong>
     * <p>this is a test quota</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>Specifies whether to execute the current ClusterSpec change as a rolling upgrade (draining and migrating nodes one by one to the new cluster) instead of the default stop-and-rebuild method.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("EnableGracefulUpgrade")
    public Boolean enableGracefulUpgrade;

    /**
     * <p>The tuning parameters for the migration process. This parameter is only allowed when EnableGracefulUpgrade is set to true.</p>
     */
    @NameInMap("GracefulUpgradeConfig")
    public UpdateQuotaRequestGracefulUpgradeConfig gracefulUpgradeConfig;

    /**
     * <p>The list of user-defined labels.
     * This is a full update.</p>
     */
    @NameInMap("Labels")
    public java.util.List<Label> labels;

    /**
     * <p>Specifies whether to pass the default GPU driver configuration to child quotas.</p>
     */
    @NameInMap("PropagateDefaultGPUDriver")
    public Boolean propagateDefaultGPUDriver;

    /**
     * <p>The queuing strategy for tasks on the quota.</p>
     * 
     * <strong>example:</strong>
     * <p>PaiStrategyIntelligent</p>
     */
    @NameInMap("QueueStrategy")
    public String queueStrategy;

    /**
     * <p>The resource quota configuration.</p>
     * 
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("QuotaConfig")
    public QuotaConfig quotaConfig;

    /**
     * <p>The name of the resource quota.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("QuotaName")
    public String quotaName;

    public static UpdateQuotaRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateQuotaRequest self = new UpdateQuotaRequest();
        return TeaModel.build(map, self);
    }

    public UpdateQuotaRequest setClusterSpec(UpdateQuotaRequestClusterSpec clusterSpec) {
        this.clusterSpec = clusterSpec;
        return this;
    }
    public UpdateQuotaRequestClusterSpec getClusterSpec() {
        return this.clusterSpec;
    }

    public UpdateQuotaRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateQuotaRequest setEnableGracefulUpgrade(Boolean enableGracefulUpgrade) {
        this.enableGracefulUpgrade = enableGracefulUpgrade;
        return this;
    }
    public Boolean getEnableGracefulUpgrade() {
        return this.enableGracefulUpgrade;
    }

    public UpdateQuotaRequest setGracefulUpgradeConfig(UpdateQuotaRequestGracefulUpgradeConfig gracefulUpgradeConfig) {
        this.gracefulUpgradeConfig = gracefulUpgradeConfig;
        return this;
    }
    public UpdateQuotaRequestGracefulUpgradeConfig getGracefulUpgradeConfig() {
        return this.gracefulUpgradeConfig;
    }

    public UpdateQuotaRequest setLabels(java.util.List<Label> labels) {
        this.labels = labels;
        return this;
    }
    public java.util.List<Label> getLabels() {
        return this.labels;
    }

    public UpdateQuotaRequest setPropagateDefaultGPUDriver(Boolean propagateDefaultGPUDriver) {
        this.propagateDefaultGPUDriver = propagateDefaultGPUDriver;
        return this;
    }
    public Boolean getPropagateDefaultGPUDriver() {
        return this.propagateDefaultGPUDriver;
    }

    public UpdateQuotaRequest setQueueStrategy(String queueStrategy) {
        this.queueStrategy = queueStrategy;
        return this;
    }
    public String getQueueStrategy() {
        return this.queueStrategy;
    }

    public UpdateQuotaRequest setQuotaConfig(QuotaConfig quotaConfig) {
        this.quotaConfig = quotaConfig;
        return this;
    }
    public QuotaConfig getQuotaConfig() {
        return this.quotaConfig;
    }

    public UpdateQuotaRequest setQuotaName(String quotaName) {
        this.quotaName = quotaName;
        return this;
    }
    public String getQuotaName() {
        return this.quotaName;
    }

    public static class UpdateQuotaRequestClusterSpec extends TeaModel {
        /**
         * <p>The cluster type. Currently, only RayCluster is supported.</p>
         * 
         * <strong>example:</strong>
         * <p>RayCluster</p>
         */
        @NameInMap("ClusterType")
        public String clusterType;

        /**
         * <p>The list of data sources mounted to the cluster. This parameter uses the overall replacement semantics: if it is not passed, the current state is maintained; if an empty array is passed, the list is cleared. Each element is a JSON object string that contains DataSourceId or Uri (one of them is required and they are mutually exclusive) and an optional MountPath.</p>
         */
        @NameInMap("DataSources")
        public java.util.List<String> dataSources;

        /**
         * <p>The container image used by the Ray cluster. If this parameter is explicitly passed, the system switches to this image. If it is left empty and the data sources remain unchanged, and GetQuota returns UpgradeAvailable=true, this update is considered an upgrade to the platform default image. To keep the current image, explicitly pass the current value.</p>
         * 
         * <strong>example:</strong>
         * <p>dsw-registry-vpc.ap-southeast-1.cr.aliyuncs.com/pai-common/ray-runtime</p>
         */
        @NameInMap("Image")
        public String image;

        public static UpdateQuotaRequestClusterSpec build(java.util.Map<String, ?> map) throws Exception {
            UpdateQuotaRequestClusterSpec self = new UpdateQuotaRequestClusterSpec();
            return TeaModel.build(map, self);
        }

        public UpdateQuotaRequestClusterSpec setClusterType(String clusterType) {
            this.clusterType = clusterType;
            return this;
        }
        public String getClusterType() {
            return this.clusterType;
        }

        public UpdateQuotaRequestClusterSpec setDataSources(java.util.List<String> dataSources) {
            this.dataSources = dataSources;
            return this;
        }
        public java.util.List<String> getDataSources() {
            return this.dataSources;
        }

        public UpdateQuotaRequestClusterSpec setImage(String image) {
            this.image = image;
            return this;
        }
        public String getImage() {
            return this.image;
        }

    }

    public static class UpdateQuotaRequestGracefulUpgradeConfig extends TeaModel {
        /**
         * <p>The timeout limit for Ray draining of a single node. After the timeout, the node is still directly scaled down, which does not cause the upgrade to fail.</p>
         * 
         * <strong>example:</strong>
         * <p>3600</p>
         */
        @NameInMap("DrainTimeoutSeconds")
        public Long drainTimeoutSeconds;

        /**
         * <p>The migration window width, which is the maximum number of workers in the old cluster that are simultaneously in an unavailable state (draining or drained and pending removal), that is, the number of nodes migrated in parallel.</p>
         * 
         * <strong>example:</strong>
         * <p>25%</p>
         */
        @NameInMap("MaxUnavailable")
        public String maxUnavailable;

        /**
         * <p>The number of workers in the old cluster that are kept in a schedulable state while waiting for the remaining Ray tasks in the old cluster to complete.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("TaskDrainReserveWorkers")
        public Long taskDrainReserveWorkers;

        public static UpdateQuotaRequestGracefulUpgradeConfig build(java.util.Map<String, ?> map) throws Exception {
            UpdateQuotaRequestGracefulUpgradeConfig self = new UpdateQuotaRequestGracefulUpgradeConfig();
            return TeaModel.build(map, self);
        }

        public UpdateQuotaRequestGracefulUpgradeConfig setDrainTimeoutSeconds(Long drainTimeoutSeconds) {
            this.drainTimeoutSeconds = drainTimeoutSeconds;
            return this;
        }
        public Long getDrainTimeoutSeconds() {
            return this.drainTimeoutSeconds;
        }

        public UpdateQuotaRequestGracefulUpgradeConfig setMaxUnavailable(String maxUnavailable) {
            this.maxUnavailable = maxUnavailable;
            return this;
        }
        public String getMaxUnavailable() {
            return this.maxUnavailable;
        }

        public UpdateQuotaRequestGracefulUpgradeConfig setTaskDrainReserveWorkers(Long taskDrainReserveWorkers) {
            this.taskDrainReserveWorkers = taskDrainReserveWorkers;
            return this;
        }
        public Long getTaskDrainReserveWorkers() {
            return this.taskDrainReserveWorkers;
        }

    }

}
