// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeDefaultKeyInfoResponseBody extends TeaModel {
    /**
     * <p>The domain names.</p>
     */
    @NameInMap("DomainList")
    public java.util.List<String> domainList;

    /**
     * <p>The company name.</p>
     * 
     * <strong>example:</strong>
     * <p>Test</p>
     */
    @NameInMap("Names")
    public String names;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>BE120DAB-F4E7-4C53-ADC3-A97578A****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeDefaultKeyInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDefaultKeyInfoResponseBody self = new DescribeDefaultKeyInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDefaultKeyInfoResponseBody setDomainList(java.util.List<String> domainList) {
        this.domainList = domainList;
        return this;
    }
    public java.util.List<String> getDomainList() {
        return this.domainList;
    }

    public DescribeDefaultKeyInfoResponseBody setNames(String names) {
        this.names = names;
        return this;
    }
    public String getNames() {
        return this.names;
    }

    public DescribeDefaultKeyInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
