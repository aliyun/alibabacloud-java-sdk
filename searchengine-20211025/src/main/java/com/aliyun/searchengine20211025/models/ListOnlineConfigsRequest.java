// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchengine20211025.models;

import com.aliyun.tea.*;

public class ListOnlineConfigsRequest extends TeaModel {
    /**
     * <p>The name of the domain</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>sz_vpc_domain_1</p>
     */
    @NameInMap("domain")
    public String domain;

    public static ListOnlineConfigsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListOnlineConfigsRequest self = new ListOnlineConfigsRequest();
        return TeaModel.build(map, self);
    }

    public ListOnlineConfigsRequest setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

}
