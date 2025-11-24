// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class DescribeCCMVersionResponseBody extends TeaModel {
    /**
     * <p>The versions of the CCM component in all clusters on the data plane.</p>
     */
    @NameInMap("CCMVersions")
    public java.util.Map<String, CCMVersionsValue> CCMVersions;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>BD65C0AD-D3C6-48D3-8D93-38D2015C****</p>
     */
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
