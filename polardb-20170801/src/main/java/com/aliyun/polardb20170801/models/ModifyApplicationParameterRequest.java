// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class ModifyApplicationParameterRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pa-**************</p>
     */
    @NameInMap("ApplicationId")
    public String applicationId;

    /**
     * <strong>example:</strong>
     * <p>name</p>
     */
    @NameInMap("ParameterName")
    public String parameterName;

    /**
     * <strong>example:</strong>
     * <p>value</p>
     */
    @NameInMap("ParameterValue")
    public String parameterValue;

    @NameInMap("Parameters")
    public java.util.List<ModifyApplicationParameterRequestParameters> parameters;

    public static ModifyApplicationParameterRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyApplicationParameterRequest self = new ModifyApplicationParameterRequest();
        return TeaModel.build(map, self);
    }

    public ModifyApplicationParameterRequest setApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }
    public String getApplicationId() {
        return this.applicationId;
    }

    public ModifyApplicationParameterRequest setParameterName(String parameterName) {
        this.parameterName = parameterName;
        return this;
    }
    public String getParameterName() {
        return this.parameterName;
    }

    public ModifyApplicationParameterRequest setParameterValue(String parameterValue) {
        this.parameterValue = parameterValue;
        return this;
    }
    public String getParameterValue() {
        return this.parameterValue;
    }

    public ModifyApplicationParameterRequest setParameters(java.util.List<ModifyApplicationParameterRequestParameters> parameters) {
        this.parameters = parameters;
        return this;
    }
    public java.util.List<ModifyApplicationParameterRequestParameters> getParameters() {
        return this.parameters;
    }

    public static class ModifyApplicationParameterRequestParameters extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>name</p>
         */
        @NameInMap("ParameterName")
        public String parameterName;

        /**
         * <strong>example:</strong>
         * <p>value</p>
         */
        @NameInMap("ParameterValue")
        public String parameterValue;

        public static ModifyApplicationParameterRequestParameters build(java.util.Map<String, ?> map) throws Exception {
            ModifyApplicationParameterRequestParameters self = new ModifyApplicationParameterRequestParameters();
            return TeaModel.build(map, self);
        }

        public ModifyApplicationParameterRequestParameters setParameterName(String parameterName) {
            this.parameterName = parameterName;
            return this;
        }
        public String getParameterName() {
            return this.parameterName;
        }

        public ModifyApplicationParameterRequestParameters setParameterValue(String parameterValue) {
            this.parameterValue = parameterValue;
            return this;
        }
        public String getParameterValue() {
            return this.parameterValue;
        }

    }

}
