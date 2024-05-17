// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.schedulerx220190430.models;

import com.aliyun.tea.*;

public class DeleteAppGroupRequest extends TeaModel {
    @NameInMap("DeleteJobs")
    public Boolean deleteJobs;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("GroupId")
    public String groupId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Namespace")
    public String namespace;

    /**
     * <p>This parameter is required.</p>
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
