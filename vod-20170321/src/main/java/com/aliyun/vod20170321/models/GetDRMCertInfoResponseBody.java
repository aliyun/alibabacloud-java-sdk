// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class GetDRMCertInfoResponseBody extends TeaModel {
    @NameInMap("DRMCertInfo")
    public String DRMCertInfo;

    @NameInMap("RequestId")
    public String requestId;

    public static GetDRMCertInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDRMCertInfoResponseBody self = new GetDRMCertInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDRMCertInfoResponseBody setDRMCertInfo(String DRMCertInfo) {
        this.DRMCertInfo = DRMCertInfo;
        return this;
    }
    public String getDRMCertInfo() {
        return this.DRMCertInfo;
    }

    public GetDRMCertInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
