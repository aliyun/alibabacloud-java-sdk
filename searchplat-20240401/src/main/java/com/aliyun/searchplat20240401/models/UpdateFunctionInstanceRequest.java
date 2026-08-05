// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchplat20240401.models;

import com.aliyun.tea.*;

public class UpdateFunctionInstanceRequest extends TeaModel {
    /**
     * <p>The creation parameters.</p>
     */
    @NameInMap("createParameters")
    public java.util.List<UpdateFunctionInstanceRequestCreateParameters> createParameters;

    /**
     * <p>The description.</p>
     * 
     * <strong>example:</strong>
     * <p>描述</p>
     */
    @NameInMap("description")
    public String description;

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

    public UpdateFunctionInstanceRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public static class UpdateFunctionInstanceRequestCreateParameters extends TeaModel {
        /**
         * <p>The parameter name.</p>
         * 
         * <strong>example:</strong>
         * <p>name</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The parameter value.</p>
         * 
         * <strong>example:</strong>
         * <p>value</p>
         */
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

}
