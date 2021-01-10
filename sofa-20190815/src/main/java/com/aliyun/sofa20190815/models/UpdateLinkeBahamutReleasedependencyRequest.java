// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateLinkeBahamutReleasedependencyRequest extends TeaModel {
    @NameInMap("AppName")
    public String appName;

    @NameInMap("DependencyRepeatList")
    public java.util.List<String> dependencyRepeatList;

    @NameInMap("ReleaseExternalId")
    public String releaseExternalId;

    public static UpdateLinkeBahamutReleasedependencyRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateLinkeBahamutReleasedependencyRequest self = new UpdateLinkeBahamutReleasedependencyRequest();
        return TeaModel.build(map, self);
    }

    public UpdateLinkeBahamutReleasedependencyRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public UpdateLinkeBahamutReleasedependencyRequest setDependencyRepeatList(java.util.List<String> dependencyRepeatList) {
        this.dependencyRepeatList = dependencyRepeatList;
        return this;
    }
    public java.util.List<String> getDependencyRepeatList() {
        return this.dependencyRepeatList;
    }

    public UpdateLinkeBahamutReleasedependencyRequest setReleaseExternalId(String releaseExternalId) {
        this.releaseExternalId = releaseExternalId;
        return this;
    }
    public String getReleaseExternalId() {
        return this.releaseExternalId;
    }

}
