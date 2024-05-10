// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class InstallRaspAttachRequest extends TeaModel {
    /**
     * <p>The application group ID.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ApplicationId")
    public String applicationId;

    /**
     * <p>The UUIDs of ECS instances on which the RASP agent is to be installed.</p>
     */
    @NameInMap("EcsUUIDList")
    public java.util.List<String> ecsUUIDList;

    public static InstallRaspAttachRequest build(java.util.Map<String, ?> map) throws Exception {
        InstallRaspAttachRequest self = new InstallRaspAttachRequest();
        return TeaModel.build(map, self);
    }

    public InstallRaspAttachRequest setApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }
    public String getApplicationId() {
        return this.applicationId;
    }

    public InstallRaspAttachRequest setEcsUUIDList(java.util.List<String> ecsUUIDList) {
        this.ecsUUIDList = ecsUUIDList;
        return this;
    }
    public java.util.List<String> getEcsUUIDList() {
        return this.ecsUUIDList;
    }

}
