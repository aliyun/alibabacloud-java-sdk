// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20210202.models;

import com.aliyun.tea.*;

public class CreateServiceRequest extends TeaModel {
    @NameInMap("ServiceType")
    public String serviceType;

    @NameInMap("Config")
    public CreateServiceRequestConfig config;

    public static CreateServiceRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateServiceRequest self = new CreateServiceRequest();
        return TeaModel.build(map, self);
    }

    public CreateServiceRequest setServiceType(String serviceType) {
        this.serviceType = serviceType;
        return this;
    }
    public String getServiceType() {
        return this.serviceType;
    }

    public CreateServiceRequest setConfig(CreateServiceRequestConfig config) {
        this.config = config;
        return this;
    }
    public CreateServiceRequestConfig getConfig() {
        return this.config;
    }

    public static class CreateServiceRequestConfig extends TeaModel {
        @NameInMap("LogDirectory")
        public String logDirectory;

        public static CreateServiceRequestConfig build(java.util.Map<String, ?> map) throws Exception {
            CreateServiceRequestConfig self = new CreateServiceRequestConfig();
            return TeaModel.build(map, self);
        }

        public CreateServiceRequestConfig setLogDirectory(String logDirectory) {
            this.logDirectory = logDirectory;
            return this;
        }
        public String getLogDirectory() {
            return this.logDirectory;
        }

    }

}
