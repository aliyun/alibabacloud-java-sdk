// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class CreateFunctionInstanceRequest extends TeaModel {
    @NameInMap("createParameters")
    public java.util.List<CreateFunctionInstanceRequestCreateParameters> createParameters;

    @NameInMap("cron")
    public String cron;

    @NameInMap("description")
    public String description;

    @NameInMap("functionType")
    public String functionType;

    @NameInMap("instanceName")
    public String instanceName;

    @NameInMap("modelType")
    public String modelType;

    @NameInMap("usageParameters")
    public java.util.List<CreateFunctionInstanceRequestUsageParameters> usageParameters;

    public static CreateFunctionInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateFunctionInstanceRequest self = new CreateFunctionInstanceRequest();
        return TeaModel.build(map, self);
    }

    public CreateFunctionInstanceRequest setCreateParameters(java.util.List<CreateFunctionInstanceRequestCreateParameters> createParameters) {
        this.createParameters = createParameters;
        return this;
    }
    public java.util.List<CreateFunctionInstanceRequestCreateParameters> getCreateParameters() {
        return this.createParameters;
    }

    public CreateFunctionInstanceRequest setCron(String cron) {
        this.cron = cron;
        return this;
    }
    public String getCron() {
        return this.cron;
    }

    public CreateFunctionInstanceRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateFunctionInstanceRequest setFunctionType(String functionType) {
        this.functionType = functionType;
        return this;
    }
    public String getFunctionType() {
        return this.functionType;
    }

    public CreateFunctionInstanceRequest setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }
    public String getInstanceName() {
        return this.instanceName;
    }

    public CreateFunctionInstanceRequest setModelType(String modelType) {
        this.modelType = modelType;
        return this;
    }
    public String getModelType() {
        return this.modelType;
    }

    public CreateFunctionInstanceRequest setUsageParameters(java.util.List<CreateFunctionInstanceRequestUsageParameters> usageParameters) {
        this.usageParameters = usageParameters;
        return this;
    }
    public java.util.List<CreateFunctionInstanceRequestUsageParameters> getUsageParameters() {
        return this.usageParameters;
    }

    public static class CreateFunctionInstanceRequestCreateParameters extends TeaModel {
        @NameInMap("name")
        public String name;

        @NameInMap("value")
        public String value;

        public static CreateFunctionInstanceRequestCreateParameters build(java.util.Map<String, ?> map) throws Exception {
            CreateFunctionInstanceRequestCreateParameters self = new CreateFunctionInstanceRequestCreateParameters();
            return TeaModel.build(map, self);
        }

        public CreateFunctionInstanceRequestCreateParameters setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateFunctionInstanceRequestCreateParameters setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class CreateFunctionInstanceRequestUsageParameters extends TeaModel {
        @NameInMap("name")
        public String name;

        @NameInMap("value")
        public String value;

        public static CreateFunctionInstanceRequestUsageParameters build(java.util.Map<String, ?> map) throws Exception {
            CreateFunctionInstanceRequestUsageParameters self = new CreateFunctionInstanceRequestUsageParameters();
            return TeaModel.build(map, self);
        }

        public CreateFunctionInstanceRequestUsageParameters setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateFunctionInstanceRequestUsageParameters setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
