// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paiabtest20240119.models;

import com.aliyun.tea.*;

public class UpdateTableMetaRequest extends TeaModel {
    @NameInMap("Description")
    public String description;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Fields")
    public java.util.List<UpdateTableMetaRequestFields> fields;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Name")
    public String name;

    public static UpdateTableMetaRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateTableMetaRequest self = new UpdateTableMetaRequest();
        return TeaModel.build(map, self);
    }

    public UpdateTableMetaRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateTableMetaRequest setFields(java.util.List<UpdateTableMetaRequestFields> fields) {
        this.fields = fields;
        return this;
    }
    public java.util.List<UpdateTableMetaRequestFields> getFields() {
        return this.fields;
    }

    public UpdateTableMetaRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public static class UpdateTableMetaRequestFields extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("Meaning")
        public String meaning;

        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("Type")
        public String type;

        public static UpdateTableMetaRequestFields build(java.util.Map<String, ?> map) throws Exception {
            UpdateTableMetaRequestFields self = new UpdateTableMetaRequestFields();
            return TeaModel.build(map, self);
        }

        public UpdateTableMetaRequestFields setMeaning(String meaning) {
            this.meaning = meaning;
            return this;
        }
        public String getMeaning() {
            return this.meaning;
        }

        public UpdateTableMetaRequestFields setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public UpdateTableMetaRequestFields setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
