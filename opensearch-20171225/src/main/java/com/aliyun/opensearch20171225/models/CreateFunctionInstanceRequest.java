// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class CreateFunctionInstanceRequest extends TeaModel {
    // 创建参数
    @NameInMap("createParameters")
    public java.util.List<CreateFunctionInstanceRequestCreateParameters> createParameters;

    // 周期训练
    @NameInMap("cron")
    public String cron;

    // 实例描述
    @NameInMap("description")
    public String description;

    // 功能类型
    @NameInMap("functionType")
    public String functionType;

    // 实例名称
    @NameInMap("instanceName")
    public String instanceName;

    // 模型类型
    @NameInMap("modelType")
    public String modelType;

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

    public static class CreateFunctionInstanceRequestCreateParameters extends TeaModel {
        // 参数名称
        @NameInMap("name")
        public String name;

        // 参数值
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

}
