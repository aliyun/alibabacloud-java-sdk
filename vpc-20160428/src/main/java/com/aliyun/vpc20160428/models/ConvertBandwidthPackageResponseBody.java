// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ConvertBandwidthPackageResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ConvertInstanceId")
    public String convertInstanceId;

    public static ConvertBandwidthPackageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ConvertBandwidthPackageResponseBody self = new ConvertBandwidthPackageResponseBody();
        return TeaModel.build(map, self);
    }

    public ConvertBandwidthPackageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ConvertBandwidthPackageResponseBody setConvertInstanceId(String convertInstanceId) {
        this.convertInstanceId = convertInstanceId;
        return this;
    }
    public String getConvertInstanceId() {
        return this.convertInstanceId;
    }

}
