// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class GetMainVersionDetailParam extends TeaModel {
    // mainVersion
    @NameInMap("mainVersion")
    public String mainVersion;

    // resourceOwnerUid
    @NameInMap("resourceOwnerUid")
    public String resourceOwnerUid;

    public static GetMainVersionDetailParam build(java.util.Map<String, ?> map) throws Exception {
        GetMainVersionDetailParam self = new GetMainVersionDetailParam();
        return TeaModel.build(map, self);
    }

    public GetMainVersionDetailParam setMainVersion(String mainVersion) {
        this.mainVersion = mainVersion;
        return this;
    }
    public String getMainVersion() {
        return this.mainVersion;
    }

    public GetMainVersionDetailParam setResourceOwnerUid(String resourceOwnerUid) {
        this.resourceOwnerUid = resourceOwnerUid;
        return this;
    }
    public String getResourceOwnerUid() {
        return this.resourceOwnerUid;
    }

}
