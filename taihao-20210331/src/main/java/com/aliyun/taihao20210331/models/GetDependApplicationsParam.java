// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class GetDependApplicationsParam extends TeaModel {
    @NameInMap("applicationList")
    public java.util.List<ApplicationParam> applicationList;

    // 部署类型。
    @NameInMap("deployMode")
    public String deployMode;

    // 主版本。
    @NameInMap("mainVersion")
    public String mainVersion;

    public static GetDependApplicationsParam build(java.util.Map<String, ?> map) throws Exception {
        GetDependApplicationsParam self = new GetDependApplicationsParam();
        return TeaModel.build(map, self);
    }

    public GetDependApplicationsParam setApplicationList(java.util.List<ApplicationParam> applicationList) {
        this.applicationList = applicationList;
        return this;
    }
    public java.util.List<ApplicationParam> getApplicationList() {
        return this.applicationList;
    }

    public GetDependApplicationsParam setDeployMode(String deployMode) {
        this.deployMode = deployMode;
        return this;
    }
    public String getDeployMode() {
        return this.deployMode;
    }

    public GetDependApplicationsParam setMainVersion(String mainVersion) {
        this.mainVersion = mainVersion;
        return this;
    }
    public String getMainVersion() {
        return this.mainVersion;
    }

}
