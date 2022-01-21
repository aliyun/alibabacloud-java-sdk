// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oms20160615.models;

import com.aliyun.tea.*;

public class GetAccessPolicyConfigRequest extends TeaModel {
    @NameInMap("AliUid")
    public String aliUid;

    @NameInMap("CompressEnable")
    public Boolean compressEnable;

    public static GetAccessPolicyConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAccessPolicyConfigRequest self = new GetAccessPolicyConfigRequest();
        return TeaModel.build(map, self);
    }

    public GetAccessPolicyConfigRequest setAliUid(String aliUid) {
        this.aliUid = aliUid;
        return this;
    }
    public String getAliUid() {
        return this.aliUid;
    }

    public GetAccessPolicyConfigRequest setCompressEnable(Boolean compressEnable) {
        this.compressEnable = compressEnable;
        return this;
    }
    public Boolean getCompressEnable() {
        return this.compressEnable;
    }

}
