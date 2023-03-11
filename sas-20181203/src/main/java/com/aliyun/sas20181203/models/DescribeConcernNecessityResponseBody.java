// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeConcernNecessityResponseBody extends TeaModel {
    /**
     * <p>The priorities to fix the vulnerabilities. Valid values:</p>
     * <br>
     * <p>*   asap: high</p>
     * <p>*   later: medium</p>
     * <p>*   nntf: low</p>
     */
    @NameInMap("ConcernNecessity")
    public java.util.List<String> concernNecessity;

    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     */
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
