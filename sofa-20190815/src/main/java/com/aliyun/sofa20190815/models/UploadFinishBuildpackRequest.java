// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UploadFinishBuildpackRequest extends TeaModel {
    @NameInMap("BuildpackId")
    public String buildpackId;

    @NameInMap("BuildpackRegionRelationJsonStr")
    public String buildpackRegionRelationJsonStr;

    public static UploadFinishBuildpackRequest build(java.util.Map<String, ?> map) throws Exception {
        UploadFinishBuildpackRequest self = new UploadFinishBuildpackRequest();
        return TeaModel.build(map, self);
    }

    public UploadFinishBuildpackRequest setBuildpackId(String buildpackId) {
        this.buildpackId = buildpackId;
        return this;
    }
    public String getBuildpackId() {
        return this.buildpackId;
    }

    public UploadFinishBuildpackRequest setBuildpackRegionRelationJsonStr(String buildpackRegionRelationJsonStr) {
        this.buildpackRegionRelationJsonStr = buildpackRegionRelationJsonStr;
        return this;
    }
    public String getBuildpackRegionRelationJsonStr() {
        return this.buildpackRegionRelationJsonStr;
    }

}
