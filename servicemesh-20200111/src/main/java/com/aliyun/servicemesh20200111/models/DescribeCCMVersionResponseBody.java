// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class DescribeCCMVersionResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("CCMVersions")
    public java.util.Map<String, CCMVersionsValue> CCMVersions;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeCCMVersionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeCCMVersionResponseBody self = new DescribeCCMVersionResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeCCMVersionResponseBody setCCMVersions(java.util.Map<String, CCMVersionsValue> CCMVersions) {
        this.CCMVersions = CCMVersions;
        return this;
    }
    public java.util.Map<String, CCMVersionsValue> getCCMVersions() {
        return this.CCMVersions;
    }

    public DescribeCCMVersionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
