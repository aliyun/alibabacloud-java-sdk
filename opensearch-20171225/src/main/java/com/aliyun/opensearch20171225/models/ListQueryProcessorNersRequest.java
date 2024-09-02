// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class ListQueryProcessorNersRequest extends TeaModel {
    /**
     * <p>The type of the industry.</p>
     * <ul>
     * <li>ECOMMERCE</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ECOMMERCE</p>
     */
    @NameInMap("domain")
    public String domain;

    public static ListQueryProcessorNersRequest build(java.util.Map<String, ?> map) throws Exception {
        ListQueryProcessorNersRequest self = new ListQueryProcessorNersRequest();
        return TeaModel.build(map, self);
    }

    public ListQueryProcessorNersRequest setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

}
