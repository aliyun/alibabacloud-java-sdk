// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class BatchSetVsDomainConfigsRequest extends TeaModel {
    @NameInMap("DomainNames")
    public String domainNames;

    @NameInMap("Functions")
    public String functions;

    @NameInMap("OwnerId")
    public Long ownerId;

    public static BatchSetVsDomainConfigsRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchSetVsDomainConfigsRequest self = new BatchSetVsDomainConfigsRequest();
        return TeaModel.build(map, self);
    }

    public BatchSetVsDomainConfigsRequest setDomainNames(String domainNames) {
        this.domainNames = domainNames;
        return this;
    }
    public String getDomainNames() {
        return this.domainNames;
    }

    public BatchSetVsDomainConfigsRequest setFunctions(String functions) {
        this.functions = functions;
        return this;
    }
    public String getFunctions() {
        return this.functions;
    }

    public BatchSetVsDomainConfigsRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

}
