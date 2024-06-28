// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DeleteCommonBandwidthPackageResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>B400EF57-60E3-4D61-B8FB-7FA8F72DF5A6</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteCommonBandwidthPackageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteCommonBandwidthPackageResponseBody self = new DeleteCommonBandwidthPackageResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteCommonBandwidthPackageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
