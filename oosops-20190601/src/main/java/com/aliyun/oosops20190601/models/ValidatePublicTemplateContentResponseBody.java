// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oosops20190601.models;

import com.aliyun.tea.*;

public class ValidatePublicTemplateContentResponseBody extends TeaModel {
    @NameInMap("Description")
    public String description;

    @NameInMap("Outputs")
    public String outputs;

    @NameInMap("Parameters")
    public String parameters;

    @NameInMap("RamRole")
    public String ramRole;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Tasks")
    public java.util.List<ValidatePublicTemplateContentResponseBodyTasks> tasks;

    public static ValidatePublicTemplateContentResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ValidatePublicTemplateContentResponseBody self = new ValidatePublicTemplateContentResponseBody();
        return TeaModel.build(map, self);
    }

    public ValidatePublicTemplateContentResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public ValidatePublicTemplateContentResponseBody setOutputs(String outputs) {
        this.outputs = outputs;
        return this;
    }
    public String getOutputs() {
        return this.outputs;
    }

    public ValidatePublicTemplateContentResponseBody setParameters(String parameters) {
        this.parameters = parameters;
        return this;
    }
    public String getParameters() {
        return this.parameters;
    }

    public ValidatePublicTemplateContentResponseBody setRamRole(String ramRole) {
        this.ramRole = ramRole;
        return this;
    }
    public String getRamRole() {
        return this.ramRole;
    }

    public ValidatePublicTemplateContentResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ValidatePublicTemplateContentResponseBody setTasks(java.util.List<ValidatePublicTemplateContentResponseBodyTasks> tasks) {
        this.tasks = tasks;
        return this;
    }
    public java.util.List<ValidatePublicTemplateContentResponseBodyTasks> getTasks() {
        return this.tasks;
    }

    public static class ValidatePublicTemplateContentResponseBodyTasks extends TeaModel {
        @NameInMap("Description")
        public String description;

        @NameInMap("Name")
        public String name;

        @NameInMap("Outputs")
        public String outputs;

        @NameInMap("Properties")
        public String properties;

        @NameInMap("Type")
        public String type;

        public static ValidatePublicTemplateContentResponseBodyTasks build(java.util.Map<String, ?> map) throws Exception {
            ValidatePublicTemplateContentResponseBodyTasks self = new ValidatePublicTemplateContentResponseBodyTasks();
            return TeaModel.build(map, self);
        }

        public ValidatePublicTemplateContentResponseBodyTasks setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ValidatePublicTemplateContentResponseBodyTasks setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ValidatePublicTemplateContentResponseBodyTasks setOutputs(String outputs) {
            this.outputs = outputs;
            return this;
        }
        public String getOutputs() {
            return this.outputs;
        }

        public ValidatePublicTemplateContentResponseBodyTasks setProperties(String properties) {
            this.properties = properties;
            return this;
        }
        public String getProperties() {
            return this.properties;
        }

        public ValidatePublicTemplateContentResponseBodyTasks setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
