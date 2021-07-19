// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class ValidateTemplateContentResponseBody extends TeaModel {
    @NameInMap("Outputs")
    public String outputs;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Parameters")
    public String parameters;

    @NameInMap("RamRole")
    public String ramRole;

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

    public ValidateTemplateContentResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
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

    public ValidateTemplateContentResponseBody setTasks(java.util.List<ValidateTemplateContentResponseBodyTasks> tasks) {
        this.tasks = tasks;
        return this;
    }
    public java.util.List<ValidateTemplateContentResponseBodyTasks> getTasks() {
        return this.tasks;
    }

    public static class ValidateTemplateContentResponseBodyTasks extends TeaModel {
        @NameInMap("Outputs")
        public String outputs;

        @NameInMap("Type")
        public String type;

        @NameInMap("Description")
        public String description;

        @NameInMap("Name")
        public String name;

        @NameInMap("Properties")
        public String properties;

        public static ValidateTemplateContentResponseBodyTasks build(java.util.Map<String, ?> map) throws Exception {
            ValidateTemplateContentResponseBodyTasks self = new ValidateTemplateContentResponseBodyTasks();
            return TeaModel.build(map, self);
        }

        public ValidateTemplateContentResponseBodyTasks setOutputs(String outputs) {
            this.outputs = outputs;
            return this;
        }
        public String getOutputs() {
            return this.outputs;
        }

        public ValidateTemplateContentResponseBodyTasks setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
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

        public ValidateTemplateContentResponseBodyTasks setProperties(String properties) {
            this.properties = properties;
            return this;
        }
        public String getProperties() {
            return this.properties;
        }

    }

}
