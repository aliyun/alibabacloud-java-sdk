// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribePolarAgentUserSessionsRequest extends TeaModel {
    /**
     * <p>The source of the product. The value is \<code>polardb-console\\</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>polardb-console</p>
     */
    @NameInMap("Source")
    public String source;

    public static DescribePolarAgentUserSessionsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribePolarAgentUserSessionsRequest self = new DescribePolarAgentUserSessionsRequest();
        return TeaModel.build(map, self);
    }

    public DescribePolarAgentUserSessionsRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

}
