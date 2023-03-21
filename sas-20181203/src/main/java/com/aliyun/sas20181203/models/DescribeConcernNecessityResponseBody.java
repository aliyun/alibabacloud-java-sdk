// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeConcernNecessityResponseBody extends TeaModel {
    @NameInMap("ConcernNecessity")
    public java.util.List<String> concernNecessity;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeConcernNecessityResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeConcernNecessityResponseBody self = new DescribeConcernNecessityResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeConcernNecessityResponseBody setConcernNecessity(java.util.List<String> concernNecessity) {
        this.concernNecessity = concernNecessity;
        return this;
    }
    public java.util.List<String> getConcernNecessity() {
        return this.concernNecessity;
    }

    public DescribeConcernNecessityResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
