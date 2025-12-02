// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sddp20190103.models;

import com.aliyun.tea.*;

public class MaskOssImageResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>136082B3-B21F-5E9D-B68E-991FFD205D24</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static MaskOssImageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        MaskOssImageResponseBody self = new MaskOssImageResponseBody();
        return TeaModel.build(map, self);
    }

    public MaskOssImageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
