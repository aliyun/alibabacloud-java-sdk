// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.tea.*;

public class GetBucketTransferAccelerationResponseBody extends TeaModel {
    @NameInMap("Enabled")
    public Boolean enabled;

    public static GetBucketTransferAccelerationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetBucketTransferAccelerationResponseBody self = new GetBucketTransferAccelerationResponseBody();
        return TeaModel.build(map, self);
    }

    public GetBucketTransferAccelerationResponseBody setEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }
    public Boolean getEnabled() {
        return this.enabled;
    }

}
