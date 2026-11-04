// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class CreateInspectionTaskRequest extends TeaModel {
    /**
     * <p>The cron expression for the inspection task, which specifies the periodic execution schedule.</p>
     * 
     * <strong>example:</strong>
     * <p>0 0 * * *</p>
     */
    @NameInMap("CronExpression")
    public String cronExpression;

    /**
     * <p>The list of clusters associated with the inspection task.</p>
     */
    @NameInMap("DBClusterList")
    public java.util.List<CreateInspectionTaskRequestDBClusterList> DBClusterList;

    /**
     * <p>The ID of the region where the task resides.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the resource group.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-123</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The ID of the inspection workspace.</p>
     * 
     * <strong>example:</strong>
     * <p>space-123</p>
     */
    @NameInMap("SpaceId")
    public String spaceId;

    /**
     * <p>The description of the inspection task.</p>
     * 
     * <strong>example:</strong>
     * <p>Periodic inspection task</p>
     */
    @NameInMap("TaskDescription")
    public String taskDescription;

    public static CreateInspectionTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateInspectionTaskRequest self = new CreateInspectionTaskRequest();
        return TeaModel.build(map, self);
    }

    public CreateInspectionTaskRequest setCronExpression(String cronExpression) {
        this.cronExpression = cronExpression;
        return this;
    }
    public String getCronExpression() {
        return this.cronExpression;
    }

    public CreateInspectionTaskRequest setDBClusterList(java.util.List<CreateInspectionTaskRequestDBClusterList> DBClusterList) {
        this.DBClusterList = DBClusterList;
        return this;
    }
    public java.util.List<CreateInspectionTaskRequestDBClusterList> getDBClusterList() {
        return this.DBClusterList;
    }

    public CreateInspectionTaskRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateInspectionTaskRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public CreateInspectionTaskRequest setSpaceId(String spaceId) {
        this.spaceId = spaceId;
        return this;
    }
    public String getSpaceId() {
        return this.spaceId;
    }

    public CreateInspectionTaskRequest setTaskDescription(String taskDescription) {
        this.taskDescription = taskDescription;
        return this;
    }
    public String getTaskDescription() {
        return this.taskDescription;
    }

    public static class CreateInspectionTaskRequestDBClusterList extends TeaModel {
        /**
         * <p>The ID of the PolarDB cluster to be inspected.</p>
         * 
         * <strong>example:</strong>
         * <p>pc-test123456</p>
         */
        @NameInMap("DBClusterId")
        public String DBClusterId;

        /**
         * <p>The ID of the region where the cluster to be inspected resides.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        public static CreateInspectionTaskRequestDBClusterList build(java.util.Map<String, ?> map) throws Exception {
            CreateInspectionTaskRequestDBClusterList self = new CreateInspectionTaskRequestDBClusterList();
            return TeaModel.build(map, self);
        }

        public CreateInspectionTaskRequestDBClusterList setDBClusterId(String DBClusterId) {
            this.DBClusterId = DBClusterId;
            return this;
        }
        public String getDBClusterId() {
            return this.DBClusterId;
        }

        public CreateInspectionTaskRequestDBClusterList setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

    }

}
