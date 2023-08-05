// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class UninstallRaspAttachRequest extends TeaModel {
    @NameInMap("ApplicationId")
    public String applicationId;

    @NameInMap("EcsUUIDList")
    public java.util.List<String> ecsUUIDList;

    public static UninstallRaspAttachRequest build(java.util.Map<String, ?> map) throws Exception {
        UninstallRaspAttachRequest self = new UninstallRaspAttachRequest();
        return TeaModel.build(map, self);
    }

    public UninstallRaspAttachRequest setApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }
    public String getApplicationId() {
        return this.applicationId;
    }

    public UninstallRaspAttachRequest setEcsUUIDList(java.util.List<String> ecsUUIDList) {
        this.ecsUUIDList = ecsUUIDList;
        return this;
    }
    public java.util.List<String> getEcsUUIDList() {
        return this.ecsUUIDList;
    }

}
