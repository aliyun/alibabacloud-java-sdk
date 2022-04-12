// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailbot20210224.models;

import com.aliyun.tea.*;

public class QueryOutboundJobShrinkRequest extends TeaModel {
    @NameInMap("Id")
    public Long id;

    @NameInMap("SaasId")
    public String saasId;

    @NameInMap("UserProfile")
    public String userProfileShrink;

    public static QueryOutboundJobShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryOutboundJobShrinkRequest self = new QueryOutboundJobShrinkRequest();
        return TeaModel.build(map, self);
    }

    public QueryOutboundJobShrinkRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public QueryOutboundJobShrinkRequest setSaasId(String saasId) {
        this.saasId = saasId;
        return this;
    }
    public String getSaasId() {
        return this.saasId;
    }

    public QueryOutboundJobShrinkRequest setUserProfileShrink(String userProfileShrink) {
        this.userProfileShrink = userProfileShrink;
        return this;
    }
    public String getUserProfileShrink() {
        return this.userProfileShrink;
    }

}
