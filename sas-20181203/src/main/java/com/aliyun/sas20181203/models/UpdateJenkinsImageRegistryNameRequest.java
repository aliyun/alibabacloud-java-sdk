// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class UpdateJenkinsImageRegistryNameRequest extends TeaModel {
    @NameInMap("RegistryId")
    public Long registryId;

    @NameInMap("RegistryName")
    public String registryName;

    @NameInMap("SourceIp")
    public String sourceIp;

    public static UpdateJenkinsImageRegistryNameRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateJenkinsImageRegistryNameRequest self = new UpdateJenkinsImageRegistryNameRequest();
        return TeaModel.build(map, self);
    }

    public UpdateJenkinsImageRegistryNameRequest setRegistryId(Long registryId) {
        this.registryId = registryId;
        return this;
    }
    public Long getRegistryId() {
        return this.registryId;
    }

    public UpdateJenkinsImageRegistryNameRequest setRegistryName(String registryName) {
        this.registryName = registryName;
        return this;
    }
    public String getRegistryName() {
        return this.registryName;
    }

    public UpdateJenkinsImageRegistryNameRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

}
