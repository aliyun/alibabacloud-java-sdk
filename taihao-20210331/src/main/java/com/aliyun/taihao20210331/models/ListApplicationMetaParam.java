// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class ListApplicationMetaParam extends TeaModel {
    // applicationNames
    @NameInMap("applicationNames")
    public java.util.List<String> applicationNames;

    // deployMode
    @NameInMap("deployMode")
    public String deployMode;

    // mainVersion
    @NameInMap("mainVersion")
    public String mainVersion;

    public static ListApplicationMetaParam build(java.util.Map<String, ?> map) throws Exception {
        ListApplicationMetaParam self = new ListApplicationMetaParam();
        return TeaModel.build(map, self);
    }

    public ListApplicationMetaParam setApplicationNames(java.util.List<String> applicationNames) {
        this.applicationNames = applicationNames;
        return this;
    }
    public java.util.List<String> getApplicationNames() {
        return this.applicationNames;
    }

    public ListApplicationMetaParam setDeployMode(String deployMode) {
        this.deployMode = deployMode;
        return this;
    }
    public String getDeployMode() {
        return this.deployMode;
    }

    public ListApplicationMetaParam setMainVersion(String mainVersion) {
        this.mainVersion = mainVersion;
        return this;
    }
    public String getMainVersion() {
        return this.mainVersion;
    }

}
