// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20190910.models;

import com.aliyun.tea.*;

public class DescribeCertMatchStatusResponseBody extends TeaModel {
    @NameInMap("MatchStatus")
    public Boolean matchStatus;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeCertMatchStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeCertMatchStatusResponseBody self = new DescribeCertMatchStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeCertMatchStatusResponseBody setMatchStatus(Boolean matchStatus) {
        this.matchStatus = matchStatus;
        return this;
    }
    public Boolean getMatchStatus() {
        return this.matchStatus;
    }

    public DescribeCertMatchStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
