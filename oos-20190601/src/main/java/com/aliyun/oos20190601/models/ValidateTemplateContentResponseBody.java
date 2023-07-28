// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class ValidateTemplateContentResponseBody extends TeaModel {
    /**
     * <p>The outputs of the template.</p>
     */
    @NameInMap("Outputs")
    public String outputs;

    /**
     * <p>The parameters of the template.</p>
     */
    @NameInMap("Parameters")
    public String parameters;

    /**
     * <p>The RAM role.</p>
     */
    @NameInMap("RamRole")
    public String ramRole;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The task defined in the template.</p>
     */
    @NameInMap("Tasks")
    public java.util.List<ValidateTemplateContentResponseBodyTasks> tasks;

    public static ValidateTemplateContentResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ValidateTemplateContentResponseBody self = new ValidateTemplateContentResponseBody();
        return TeaModel.build(map, self);
    }

    public ValidateTemplateContentResponseBody setOutputs(String outputs) {
        this.outputs = outputs;
        return this;
    }
    public String getOutputs() {
        return this.outputs;
    }

    public ValidateTemplateContentResponseBody setParameters(String parameters) {
        this.parameters = parameters;
        return this;
    }
    public String getParameters() {
        return this.parameters;
    }

    public ValidateTemplateContentResponseBody setRamRole(String ramRole) {
        this.ramRole = ramRole;
        return this;
    }
    public String getRamRole() {
        return this.ramRole;
    }

    public ValidateTemplateContentResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ValidateTemplateContentResponseBody setTasks(java.util.List<ValidateTemplateContentResponseBodyTasks> tasks) {
        this.tasks = tasks;
        return this;
    }
    public java.util.List<ValidateTemplateContentResponseBodyTasks> getTasks() {
        return this.tasks;
    }

    public static class ValidateTemplateContentResponseBodyTasks extends TeaModel {
        /**
         * <p>The description of the task.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The name of the task.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The outputs of the task.</p>
         */
        @NameInMap("Outputs")
        public String outputs;

        /**
         * <p>The properties of the task.</p>
         */
        @NameInMap("Properties")
        public String properties;

        /**
         * <p>The type of the task.</p>
         */
        @NameInMap("Type")
        public String type;

        public static ValidateTemplateContentResponseBodyTasks build(java.util.Map<String, ?> map) throws Exception {
            ValidateTemplateContentResponseBodyTasks self = new ValidateTemplateContentResponseBodyTasks();
            return TeaModel.build(map, self);
        }

        public ValidateTemplateContentResponseBodyTasks setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ValidateTemplateContentResponseBodyTasks setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ValidateTemplateContentResponseBodyTasks setOutputs(String outputs) {
            this.outputs = outputs;
            return this;
        }
        public String getOutputs() {
            return this.outputs;
        }

        public ValidateTemplateContentResponseBodyTasks setProperties(String properties) {
            this.properties = properties;
            return this;
        }
        public String getProperties() {
            return this.properties;
        }

        public ValidateTemplateContentResponseBodyTasks setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
