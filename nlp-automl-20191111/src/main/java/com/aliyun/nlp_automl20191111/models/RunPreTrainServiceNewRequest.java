// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nlp_automl20191111.models;

import com.aliyun.tea.*;

public class RunPreTrainServiceNewRequest extends TeaModel {
    @NameInMap("PredictContent")
    public String predictContent;

    @NameInMap("ServiceName")
    public String serviceName;

    @NameInMap("ServiceVersion")
    public String serviceVersion;

    public static RunPreTrainServiceNewRequest build(java.util.Map<String, ?> map) throws Exception {
        RunPreTrainServiceNewRequest self = new RunPreTrainServiceNewRequest();
        return TeaModel.build(map, self);
    }

    public RunPreTrainServiceNewRequest setPredictContent(String predictContent) {
        this.predictContent = predictContent;
        return this;
    }
    public String getPredictContent() {
        return this.predictContent;
    }

    public RunPreTrainServiceNewRequest setServiceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }
    public String getServiceName() {
        return this.serviceName;
    }

    public RunPreTrainServiceNewRequest setServiceVersion(String serviceVersion) {
        this.serviceVersion = serviceVersion;
        return this;
    }
    public String getServiceVersion() {
        return this.serviceVersion;
    }

}
