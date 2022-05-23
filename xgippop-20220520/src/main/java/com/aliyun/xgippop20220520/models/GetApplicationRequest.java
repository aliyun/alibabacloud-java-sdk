// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xgippop20220520.models;

import com.aliyun.tea.*;

public class GetApplicationRequest extends TeaModel {
    // 阿里UID
    @NameInMap("AliUid")
    public Long aliUid;

    // 应用ID
    @NameInMap("AppCode")
    public String appCode;

    public static GetApplicationRequest build(java.util.Map<String, ?> map) throws Exception {
        GetApplicationRequest self = new GetApplicationRequest();
        return TeaModel.build(map, self);
    }

    public GetApplicationRequest setAliUid(Long aliUid) {
        this.aliUid = aliUid;
        return this;
    }
    public Long getAliUid() {
        return this.aliUid;
    }

    public GetApplicationRequest setAppCode(String appCode) {
        this.appCode = appCode;
        return this;
    }
    public String getAppCode() {
        return this.appCode;
    }

}
