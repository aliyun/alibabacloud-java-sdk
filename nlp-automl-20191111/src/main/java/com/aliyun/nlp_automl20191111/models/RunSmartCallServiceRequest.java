// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nlp_automl20191111.models;

import com.aliyun.tea.*;

public class RunSmartCallServiceRequest extends TeaModel {
    @NameInMap("ServiceName")
    public String serviceName;

    @NameInMap("ParamContent")
    public String paramContent;

    @NameInMap("RobotId")
    public Long robotId;

    @NameInMap("SessionId")
    public String sessionId;

    @NameInMap("Product")
    public String product;

    public static RunSmartCallServiceRequest build(java.util.Map<String, ?> map) throws Exception {
        RunSmartCallServiceRequest self = new RunSmartCallServiceRequest();
        return TeaModel.build(map, self);
    }

    public RunSmartCallServiceRequest setServiceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }
    public String getServiceName() {
        return this.serviceName;
    }

    public RunSmartCallServiceRequest setParamContent(String paramContent) {
        this.paramContent = paramContent;
        return this;
    }
    public String getParamContent() {
        return this.paramContent;
    }

    public RunSmartCallServiceRequest setRobotId(Long robotId) {
        this.robotId = robotId;
        return this;
    }
    public Long getRobotId() {
        return this.robotId;
    }

    public RunSmartCallServiceRequest setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

    public RunSmartCallServiceRequest setProduct(String product) {
        this.product = product;
        return this;
    }
    public String getProduct() {
        return this.product;
    }

}
