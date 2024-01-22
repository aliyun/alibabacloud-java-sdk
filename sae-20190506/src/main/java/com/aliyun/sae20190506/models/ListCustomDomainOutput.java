// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class ListCustomDomainOutput extends TeaModel {
    @NameInMap("customDomains")
    public java.util.List<CustomDomain> customDomains;

    @NameInMap("nextToken")
    public String nextToken;

    @NameInMap("requestId")
    public String requestId;

    public static ListCustomDomainOutput build(java.util.Map<String, ?> map) throws Exception {
        ListCustomDomainOutput self = new ListCustomDomainOutput();
        return TeaModel.build(map, self);
    }

    public ListCustomDomainOutput setCustomDomains(java.util.List<CustomDomain> customDomains) {
        this.customDomains = customDomains;
        return this;
    }
    public java.util.List<CustomDomain> getCustomDomains() {
        return this.customDomains;
    }

    public ListCustomDomainOutput setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListCustomDomainOutput setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
