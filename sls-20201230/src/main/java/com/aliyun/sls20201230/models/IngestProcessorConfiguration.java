// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class IngestProcessorConfiguration extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>keep</p>
     */
    @NameInMap("parseFail")
    public String parseFail;

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

    public static IngestProcessorConfiguration build(java.util.Map<String, ?> map) throws Exception {
        IngestProcessorConfiguration self = new IngestProcessorConfiguration();
        return TeaModel.build(map, self);
    }

    public IngestProcessorConfiguration setParseFail(String parseFail) {
        this.parseFail = parseFail;
        return this;
    }
    public String getParseFail() {
        return this.parseFail;
    }

    public IngestProcessorConfiguration setSpl(String spl) {
        this.spl = spl;
        return this;
    }
    public String getSpl() {
        return this.spl;
    }

}
