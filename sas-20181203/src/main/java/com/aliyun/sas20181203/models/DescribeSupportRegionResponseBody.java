// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeSupportRegionResponseBody extends TeaModel {
    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>2C0699D3-4107-5A46-A4C4-E129A5967788</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>List of supported regions</p>
     */
    @NameInMap("SupportRegion")
    public java.util.List<String> supportRegion;

    public static DescribeSupportRegionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSupportRegionResponseBody self = new DescribeSupportRegionResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSupportRegionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSupportRegionResponseBody setSupportRegion(java.util.List<String> supportRegion) {
        this.supportRegion = supportRegion;
        return this;
    }
    public java.util.List<String> getSupportRegion() {
        return this.supportRegion;
    }

}
