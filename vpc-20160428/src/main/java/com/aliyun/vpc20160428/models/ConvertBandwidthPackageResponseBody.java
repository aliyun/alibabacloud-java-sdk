// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ConvertBandwidthPackageResponseBody extends TeaModel {
    /**
     * <p>The ID of the Internet Shared Bandwidth instance.</p>
     * 
     * <strong>example:</strong>
     * <p>bwp-s6lmotmkkf567b****</p>
     */
    @NameInMap("ConvertInstanceId")
    public String convertInstanceId;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>455AC20C-7061-446A-BDBD-B3BEE0856304</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ConvertBandwidthPackageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ConvertBandwidthPackageResponseBody self = new ConvertBandwidthPackageResponseBody();
        return TeaModel.build(map, self);
    }

    public ConvertBandwidthPackageResponseBody setConvertInstanceId(String convertInstanceId) {
        this.convertInstanceId = convertInstanceId;
        return this;
    }
    public String getConvertInstanceId() {
        return this.convertInstanceId;
    }

    public ConvertBandwidthPackageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
