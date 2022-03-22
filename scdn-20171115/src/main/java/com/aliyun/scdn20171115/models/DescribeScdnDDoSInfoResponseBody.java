// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.scdn20171115.models;

import com.aliyun.tea.*;

public class DescribeScdnDDoSInfoResponseBody extends TeaModel {
    @NameInMap("ElasticBandwidth")
    public Integer elasticBandwidth;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SecBandwidth")
    public Integer secBandwidth;

    public static DescribeScdnDDoSInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeScdnDDoSInfoResponseBody self = new DescribeScdnDDoSInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeScdnDDoSInfoResponseBody setElasticBandwidth(Integer elasticBandwidth) {
        this.elasticBandwidth = elasticBandwidth;
        return this;
    }
    public Integer getElasticBandwidth() {
        return this.elasticBandwidth;
    }

    public DescribeScdnDDoSInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeScdnDDoSInfoResponseBody setSecBandwidth(Integer secBandwidth) {
        this.secBandwidth = secBandwidth;
        return this;
    }
    public Integer getSecBandwidth() {
        return this.secBandwidth;
    }

}
