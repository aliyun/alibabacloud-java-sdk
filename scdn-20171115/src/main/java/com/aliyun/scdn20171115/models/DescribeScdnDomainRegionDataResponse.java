// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.scdn20171115.models;

import com.aliyun.tea.*;

public class DescribeScdnDomainRegionDataResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeScdnDomainRegionDataResponseBody body;

    public static DescribeScdnDomainRegionDataResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeScdnDomainRegionDataResponse self = new DescribeScdnDomainRegionDataResponse();
        return TeaModel.build(map, self);
    }

    public DescribeScdnDomainRegionDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeScdnDomainRegionDataResponse setBody(DescribeScdnDomainRegionDataResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeScdnDomainRegionDataResponseBody getBody() {
        return this.body;
    }

}
