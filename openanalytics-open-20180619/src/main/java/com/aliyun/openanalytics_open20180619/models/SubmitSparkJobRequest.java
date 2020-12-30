// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.openanalytics_open20180619.models;

import com.aliyun.tea.*;

public class SubmitSparkJobRequest extends TeaModel {
    @NameInMap("VcName")
    public String vcName;

    @NameInMap("ConfigJson")
    public String configJson;

    public static SubmitSparkJobRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitSparkJobRequest self = new SubmitSparkJobRequest();
        return TeaModel.build(map, self);
    }

    public SubmitSparkJobRequest setVcName(String vcName) {
        this.vcName = vcName;
        return this;
    }
    public String getVcName() {
        return this.vcName;
    }

    public SubmitSparkJobRequest setConfigJson(String configJson) {
        this.configJson = configJson;
        return this;
    }
    public String getConfigJson() {
        return this.configJson;
    }

}
