// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.schedulerx220190430.models;

import com.aliyun.tea.*;

public class DeleteAppGroupRequest extends TeaModel {
    /**
     * <p>Specifies whether to delete the jobs in the application group. Valid values:</p>
     * <p>true: deletes the jobs in the application group.
     * false: does not delete the jobs in the application group.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("DeleteJobs")
    public Boolean deleteJobs;

    /**
     * <p>The ID of the application. You can obtain the ID of the application on the Application Management page in the SchedulerX console.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>testSchedulerx.defaultGroup</p>
     */
    @NameInMap("GroupId")
    public String groupId;

    /**
     * <p>The ID of the namespace. You can obtain the ID of the namespace on the Namespace page in the SchedulerX console.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>adcfc35d-e2fe-4fe9-bbaa-20e90ffc****</p>
     */
    @NameInMap("Namespace")
    public String namespace;

    /**
     * <p>The ID of the region.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static DeleteAppGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteAppGroupRequest self = new DeleteAppGroupRequest();
        return TeaModel.build(map, self);
    }

    public DeleteAppGroupRequest setDeleteJobs(Boolean deleteJobs) {
        this.deleteJobs = deleteJobs;
        return this;
    }
    public Boolean getDeleteJobs() {
        return this.deleteJobs;
    }

    public DeleteAppGroupRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public DeleteAppGroupRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public DeleteAppGroupRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
