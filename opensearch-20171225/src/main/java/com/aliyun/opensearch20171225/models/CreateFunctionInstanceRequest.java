// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class CreateFunctionInstanceRequest extends TeaModel {
    /**
     * <p>The parameters used to create the instance.</p>
     * 
     * <strong>example:</strong>
     * <p>[   { &quot;name&quot;: &quot;param1&quot;, &quot;value&quot;: &quot;val1&quot;   } ]</p>
     */
    @NameInMap("createParameters")
    public java.util.List<CreateFunctionInstanceRequestCreateParameters> createParameters;

    /**
     * <p>The CRON expression used to schedule periodic training, in the format of Minutes Hours DayofMonth Month DayofWeek. The default value is empty, which specifies that no periodic training is performed. A value of 0 for DayofWeek specifies Sunday.</p>
     * 
     * <strong>example:</strong>
     * <p>0 0 ? * 0,1,2,3,4,5,6</p>
     */
    @NameInMap("cron")
    public String cron;

    /**
     * <p>The description.</p>
     * 
     * <strong>example:</strong>
     * <p>test instance</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>The feature type.</p>
     * <ul>
     * <li>Default value: PAAS. Training is required before you can use the feature.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>PAAS</p>
     */
    @NameInMap("functionType")
    public String functionType;

    /**
     * <p>The instance name. The name must be 1 to 30 characters in length and can contain letters, digits, and underscores (_). The name is case-sensitive and must start with a letter.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ctr_test</p>
     */
    @NameInMap("instanceName")
    public String instanceName;

    /**
     * <p>The model type. The value varies based on the model.</p>
     * <ul>
     * <li>Click-through rate (CTR) model: tf_checkpoint</li>
     * <li>Popularity model: pop</li>
     * <li>Category model: offline_inference</li>
     * <li>Hotword model: offline_inference</li>
     * <li>Hint model: offline_inference</li>
     * <li>Hotword model for real-time top searches: near_realtime</li>
     * <li>Personalized hint model: near_realtime</li>
     * <li>Drop-down suggestion model: offline_inference</li>
     * <li>Tokenization model: text</li>
     * <li>Term weight model: tf_checkpoint</li>
     * <li>Synonym model: offline_inference</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>tf_checkpoint</p>
     */
    @NameInMap("modelType")
    public String modelType;

    /**
     * <p>The parameters used to use the instance.</p>
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
         * <p>The parameter name.</p>
         * 
         * <strong>example:</strong>
         * <p>title_field</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The parameter value.</p>
         * 
         * <strong>example:</strong>
         * <p>title</p>
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
         * <p>The parameter name.</p>
         * 
         * <strong>example:</strong>
         * <p>allow_dict_id</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The parameter value.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
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
