// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class CreateContainerScanTaskRequest extends TeaModel {
    @NameInMap("ClusterId")
    public String clusterId;

    @NameInMap("ContainerIds")
    public String containerIds;

    @NameInMap("Lang")
    public String lang;

    public static CreateContainerScanTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateContainerScanTaskRequest self = new CreateContainerScanTaskRequest();
        return TeaModel.build(map, self);
    }

    public CreateContainerScanTaskRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public CreateContainerScanTaskRequest setContainerIds(String containerIds) {
        this.containerIds = containerIds;
        return this;
    }
    public String getContainerIds() {
        return this.containerIds;
    }

    public CreateContainerScanTaskRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

}
