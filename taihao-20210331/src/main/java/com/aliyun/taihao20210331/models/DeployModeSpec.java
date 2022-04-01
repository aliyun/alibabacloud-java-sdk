// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class DeployModeSpec extends TeaModel {
    // applicationDTOList
    @NameInMap("ApplicationDTOList")
    public java.util.List<MainVersionApplicationDTO> applicationDTOList;

    // deployMode
    @NameInMap("DeployMode")
    public String deployMode;

    public static DeployModeSpec build(java.util.Map<String, ?> map) throws Exception {
        DeployModeSpec self = new DeployModeSpec();
        return TeaModel.build(map, self);
    }

    public DeployModeSpec setApplicationDTOList(java.util.List<MainVersionApplicationDTO> applicationDTOList) {
        this.applicationDTOList = applicationDTOList;
        return this;
    }
    public java.util.List<MainVersionApplicationDTO> getApplicationDTOList() {
        return this.applicationDTOList;
    }

    public DeployModeSpec setDeployMode(String deployMode) {
        this.deployMode = deployMode;
        return this;
    }
    public String getDeployMode() {
        return this.deployMode;
    }

}
