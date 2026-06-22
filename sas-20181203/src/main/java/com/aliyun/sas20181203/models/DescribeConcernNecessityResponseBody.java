// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeConcernNecessityResponseBody extends TeaModel {
    /**
     * <p>The list of vulnerability fix necessity levels. Valid values:</p>
     * <ul>
     * <li><p>asap: high.</p>
     * </li>
     * <li><p>later: medium.</p>
     * </li>
     * <li><p>nntf: low.</p>
     * </li>
     * </ul>
     */
    @NameInMap("ConcernNecessity")
    public java.util.List<String> concernNecessity;

    /**
     * <p>The ID of the request. The ID is a unique identifier that Alibaba Cloud generates for the request. You can use the ID to troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>ECC6B3E3-D496-512D-B46D-E6996A6B63EE</p>
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
