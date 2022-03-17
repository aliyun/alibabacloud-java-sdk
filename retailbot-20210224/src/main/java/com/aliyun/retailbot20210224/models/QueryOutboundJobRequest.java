// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailbot20210224.models;

import com.aliyun.tea.*;

public class QueryOutboundJobRequest extends TeaModel {
    @NameInMap("Id")
    public Long id;

    @NameInMap("SaasId")
    public String saasId;

    public static QueryOutboundJobRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryOutboundJobRequest self = new QueryOutboundJobRequest();
        return TeaModel.build(map, self);
    }

    public QueryOutboundJobRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public QueryOutboundJobRequest setSaasId(String saasId) {
        this.saasId = saasId;
        return this;
    }
    public String getSaasId() {
        return this.saasId;
    }

}
