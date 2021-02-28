// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.scdn20171115.models;

import com.aliyun.tea.*;

public class DescribeScdnUserProtectInfoResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ServiceDDoS")
    public Integer serviceDDoS;

    public static DescribeScdnUserProtectInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeScdnUserProtectInfoResponseBody self = new DescribeScdnUserProtectInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeScdnUserProtectInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeScdnUserProtectInfoResponseBody setServiceDDoS(Integer serviceDDoS) {
        this.serviceDDoS = serviceDDoS;
        return this;
    }
    public Integer getServiceDDoS() {
        return this.serviceDDoS;
    }

}
