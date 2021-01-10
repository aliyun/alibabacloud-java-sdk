// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CreateAKSContainerservicesRequest extends TeaModel {
    @NameInMap("ConfigJsonStr")
    public String configJsonStr;

    @NameInMap("ContainerServiceName")
    public String containerServiceName;

    @NameInMap("DraftedTime")
    public String draftedTime;

    @NameInMap("OperatorName")
    public String operatorName;

    @NameInMap("Region")
    public String region;

    @NameInMap("Workspace")
    public String workspace;

    public static CreateAKSContainerservicesRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAKSContainerservicesRequest self = new CreateAKSContainerservicesRequest();
        return TeaModel.build(map, self);
    }

    public CreateAKSContainerservicesRequest setConfigJsonStr(String configJsonStr) {
        this.configJsonStr = configJsonStr;
        return this;
    }
    public String getConfigJsonStr() {
        return this.configJsonStr;
    }

    public CreateAKSContainerservicesRequest setContainerServiceName(String containerServiceName) {
        this.containerServiceName = containerServiceName;
        return this;
    }
    public String getContainerServiceName() {
        return this.containerServiceName;
    }

    public CreateAKSContainerservicesRequest setDraftedTime(String draftedTime) {
        this.draftedTime = draftedTime;
        return this;
    }
    public String getDraftedTime() {
        return this.draftedTime;
    }

    public CreateAKSContainerservicesRequest setOperatorName(String operatorName) {
        this.operatorName = operatorName;
        return this;
    }
    public String getOperatorName() {
        return this.operatorName;
    }

    public CreateAKSContainerservicesRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public CreateAKSContainerservicesRequest setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

}
