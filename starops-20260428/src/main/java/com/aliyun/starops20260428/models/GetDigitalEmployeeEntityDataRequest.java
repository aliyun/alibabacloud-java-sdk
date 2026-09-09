// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.starops20260428.models;

import com.aliyun.tea.*;

public class GetDigitalEmployeeEntityDataRequest extends TeaModel {
    /**
     * <p>The UNIX timestamp. Unit: seconds.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1770000000</p>
     */
    @NameInMap("from")
    public Long from;

    /**
     * <p>Only the .entity or .topo semantic sources of the current digital employee can be queried. Explicit access to internal storage or external data sources is prohibited.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>.entity with(type=\&quot;deployment\&quot;, domain=\&quot;k8s\&quot;) | limit 100</p>
     */
    @NameInMap("query")
    public String query;

    /**
     * <p>The UNIX timestamp. Unit: seconds. The value must be greater than the value of from.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1770003600</p>
     */
    @NameInMap("to")
    public Long to;

    public static GetDigitalEmployeeEntityDataRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDigitalEmployeeEntityDataRequest self = new GetDigitalEmployeeEntityDataRequest();
        return TeaModel.build(map, self);
    }

    public GetDigitalEmployeeEntityDataRequest setFrom(Long from) {
        this.from = from;
        return this;
    }
    public Long getFrom() {
        return this.from;
    }

    public GetDigitalEmployeeEntityDataRequest setQuery(String query) {
        this.query = query;
        return this;
    }
    public String getQuery() {
        return this.query;
    }

    public GetDigitalEmployeeEntityDataRequest setTo(Long to) {
        this.to = to;
        return this;
    }
    public Long getTo() {
        return this.to;
    }

}
