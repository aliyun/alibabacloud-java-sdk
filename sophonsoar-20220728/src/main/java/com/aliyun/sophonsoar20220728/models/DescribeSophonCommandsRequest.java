// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sophonsoar20220728.models;

import com.aliyun.tea.*;

public class DescribeSophonCommandsRequest extends TeaModel {
    /**
     * <p>The name of the command. Fuzzy match is supported.</p>
     * 
     * <strong>example:</strong>
     * <p>waf_process</p>
     */
    @NameInMap("Name")
    public String name;

    public static DescribeSophonCommandsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeSophonCommandsRequest self = new DescribeSophonCommandsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeSophonCommandsRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
