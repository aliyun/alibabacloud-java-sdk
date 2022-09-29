// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class UpdateFunctionInstanceRequest extends TeaModel {
    @NameInMap("createParameters")
    public java.util.List<UpdateFunctionInstanceRequestCreateParameters> createParameters;

    @NameInMap("cron")
    public String cron;

    @NameInMap("description")
    public String description;

    @NameInMap("usageParameters")
    public java.util.List<UpdateFunctionInstanceRequestUsageParameters> usageParameters;

    public static UpdateFunctionInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateFunctionInstanceRequest self = new UpdateFunctionInstanceRequest();
        return TeaModel.build(map, self);
    }

    public UpdateFunctionInstanceRequest setCreateParameters(java.util.List<UpdateFunctionInstanceRequestCreateParameters> createParameters) {
        this.createParameters = createParameters;
        return this;
    }
    public java.util.List<UpdateFunctionInstanceRequestCreateParameters> getCreateParameters() {
        return this.createParameters;
    }

    public UpdateFunctionInstanceRequest setCron(String cron) {
        this.cron = cron;
        return this;
    }
    public String getCron() {
        return this.cron;
    }

    public UpdateFunctionInstanceRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateFunctionInstanceRequest setUsageParameters(java.util.List<UpdateFunctionInstanceRequestUsageParameters> usageParameters) {
        this.usageParameters = usageParameters;
        return this;
    }
    public java.util.List<UpdateFunctionInstanceRequestUsageParameters> getUsageParameters() {
        return this.usageParameters;
    }

    public static class UpdateFunctionInstanceRequestCreateParameters extends TeaModel {
        @NameInMap("name")
        public String name;

        @NameInMap("value")
        public String value;

        public static UpdateFunctionInstanceRequestCreateParameters build(java.util.Map<String, ?> map) throws Exception {
            UpdateFunctionInstanceRequestCreateParameters self = new UpdateFunctionInstanceRequestCreateParameters();
            return TeaModel.build(map, self);
        }

        public UpdateFunctionInstanceRequestCreateParameters setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public UpdateFunctionInstanceRequestCreateParameters setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class UpdateFunctionInstanceRequestUsageParameters extends TeaModel {
        @NameInMap("name")
        public String name;

        @NameInMap("value")
        public String value;

        public static UpdateFunctionInstanceRequestUsageParameters build(java.util.Map<String, ?> map) throws Exception {
            UpdateFunctionInstanceRequestUsageParameters self = new UpdateFunctionInstanceRequestUsageParameters();
            return TeaModel.build(map, self);
        }

        public UpdateFunctionInstanceRequestUsageParameters setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public UpdateFunctionInstanceRequestUsageParameters setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
