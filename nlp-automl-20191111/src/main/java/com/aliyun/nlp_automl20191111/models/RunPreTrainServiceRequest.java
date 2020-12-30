// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nlp_automl20191111.models;

import com.aliyun.tea.*;

public class RunPreTrainServiceRequest extends TeaModel {
    @NameInMap("ServiceName")
    public String serviceName;

    @NameInMap("ServiceVersion")
    public String serviceVersion;

    @NameInMap("PredictContent")
    public String predictContent;

    @NameInMap("Product")
    public String product;

    public static RunPreTrainServiceRequest build(java.util.Map<String, ?> map) throws Exception {
        RunPreTrainServiceRequest self = new RunPreTrainServiceRequest();
        return TeaModel.build(map, self);
    }

    public RunPreTrainServiceRequest setServiceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }
    public String getServiceName() {
        return this.serviceName;
    }

    public RunPreTrainServiceRequest setServiceVersion(String serviceVersion) {
        this.serviceVersion = serviceVersion;
        return this;
    }
    public String getServiceVersion() {
        return this.serviceVersion;
    }

    public RunPreTrainServiceRequest setPredictContent(String predictContent) {
        this.predictContent = predictContent;
        return this;
    }
    public String getPredictContent() {
        return this.predictContent;
    }

    public RunPreTrainServiceRequest setProduct(String product) {
        this.product = product;
        return this;
    }
    public String getProduct() {
        return this.product;
    }

}
