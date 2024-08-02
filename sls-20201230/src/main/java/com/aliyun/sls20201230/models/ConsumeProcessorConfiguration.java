// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class ConsumeProcessorConfiguration extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <ul>
     * <li>| project content</li>
     * </ul>
     */
    @NameInMap("spl")
    public String spl;

    public static ConsumeProcessorConfiguration build(java.util.Map<String, ?> map) throws Exception {
        ConsumeProcessorConfiguration self = new ConsumeProcessorConfiguration();
        return TeaModel.build(map, self);
    }

    public ConsumeProcessorConfiguration setSpl(String spl) {
        this.spl = spl;
        return this;
    }
    public String getSpl() {
        return this.spl;
    }

}
