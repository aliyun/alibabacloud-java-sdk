// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nbf20211110_21312586.models;

import com.aliyun.tea.*;

public class BuildSdkRequest extends TeaModel {
    @NameInMap("buildCmd")
    public java.io.InputStream buildCmd;

    public static BuildSdkRequest build(java.util.Map<String, ?> map) throws Exception {
        BuildSdkRequest self = new BuildSdkRequest();
        return TeaModel.build(map, self);
    }

    public BuildSdkRequest setBuildCmd(java.io.InputStream buildCmd) {
        this.buildCmd = buildCmd;
        return this;
    }
    public java.io.InputStream getBuildCmd() {
        return this.buildCmd;
    }

}
