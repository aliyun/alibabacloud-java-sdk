// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class AppServiceProfile extends TeaModel {
    @NameInMap("BizId")
    public String bizId;

    @NameInMap("DesignType")
    public String designType;

    @NameInMap("DesignTypeText")
    public String designTypeText;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("OrderId")
    public String orderId;

    @NameInMap("ServiceSpec")
    public String serviceSpec;

    @NameInMap("ServiceSpecText")
    public String serviceSpecText;

    public static AppServiceProfile build(java.util.Map<String, ?> map) throws Exception {
        AppServiceProfile self = new AppServiceProfile();
        return TeaModel.build(map, self);
    }

    public AppServiceProfile setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public AppServiceProfile setDesignType(String designType) {
        this.designType = designType;
        return this;
    }
    public String getDesignType() {
        return this.designType;
    }

    public AppServiceProfile setDesignTypeText(String designTypeText) {
        this.designTypeText = designTypeText;
        return this;
    }
    public String getDesignTypeText() {
        return this.designTypeText;
    }

    public AppServiceProfile setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public AppServiceProfile setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public AppServiceProfile setServiceSpec(String serviceSpec) {
        this.serviceSpec = serviceSpec;
        return this;
    }
    public String getServiceSpec() {
        return this.serviceSpec;
    }

    public AppServiceProfile setServiceSpecText(String serviceSpecText) {
        this.serviceSpecText = serviceSpecText;
        return this;
    }
    public String getServiceSpecText() {
        return this.serviceSpecText;
    }

}
