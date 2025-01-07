// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeDomainSecureScoreResponseBody extends TeaModel {
    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>11C96623-E106-59C9-866D-A6C82911****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The security score of the website.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("SecurityScore")
    public Integer securityScore;

    public static DescribeDomainSecureScoreResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDomainSecureScoreResponseBody self = new DescribeDomainSecureScoreResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDomainSecureScoreResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDomainSecureScoreResponseBody setSecurityScore(Integer securityScore) {
        this.securityScore = securityScore;
        return this;
    }
    public Integer getSecurityScore() {
        return this.securityScore;
    }

}
