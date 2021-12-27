// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20191023.models;

import com.aliyun.tea.*;

public class InitProjectAlertResourceRequest extends TeaModel {
    @NameInMap("ProjectName")
    public String projectName;

    @NameInMap("Region")
    public String region;

    public static InitProjectAlertResourceRequest build(java.util.Map<String, ?> map) throws Exception {
        InitProjectAlertResourceRequest self = new InitProjectAlertResourceRequest();
        return TeaModel.build(map, self);
    }

    public InitProjectAlertResourceRequest setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

    public InitProjectAlertResourceRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

}
