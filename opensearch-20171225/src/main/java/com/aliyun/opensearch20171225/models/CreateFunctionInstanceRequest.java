// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class CreateFunctionInstanceRequest extends TeaModel {
    /**
     * <p>The parameters that are used to create the instance.</p>
     */
    @NameInMap("createParameters")
    public java.util.List<CreateFunctionInstanceRequestCreateParameters> createParameters;

    /**
     * <p>The cron expression used to schedule periodic training, in the format of (Minutes Hours DayofMonth Month DayofWeek). The default value is empty, which indicates that no periodic training is performed. DayofWeek 0 indicates Sunday.</p>
     */
    @NameInMap("cron")
    public String cron;

    /**
     * <p>The description.</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>The type of the feature. Valid values:</p>
     * <br>
     * <p>*   PAAS: This is the default value. Training is required before you can use the feature.</p>
     */
    @NameInMap("functionType")
    public String functionType;

    /**
     * <p>The name of the instance. The name must be 1 to 30 characters in length and can contain letters, digits, and underscores (\_). The name is case-sensitive and must start with a letter.</p>
     */
    @NameInMap("instanceName")
    public String instanceName;

    /**
     * <p>The type of the model. The following features correspond to different model types:</p>
     * <br>
     * <p>*   click-through rate (CTR) model: tf_checkpoint</p>
     * <p>*   Popularity model: pop</p>
     * <p>*   Category model: offline_inference</p>
     * <p>*   Hotword model: offline_inference</p>
     * <p>*   Shading model: offline_inference</p>
     * <p>*   Drop-down suggestion model: offline_inference</p>
     * <p>*   Word segmentation model: text</p>
     * <p>*   Term weight model: tf_checkpoint</p>
     */
    @NameInMap("modelType")
    public String modelType;

    /**
     * <p>The parameters that are used to use the instance.</p>
     */
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
        /**
         * <p>The name of the parameter.</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The value of the parameter.</p>
         */
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
        /**
         * <p>The name of the parameter.</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The value of the parameter.</p>
         */
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
