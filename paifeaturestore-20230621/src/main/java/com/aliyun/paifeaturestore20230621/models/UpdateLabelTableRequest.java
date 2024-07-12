// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paifeaturestore20230621.models;

import com.aliyun.tea.*;

public class UpdateLabelTableRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("DatasourceId")
    public String datasourceId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Fields")
    public java.util.List<UpdateLabelTableRequestFields> fields;

    /**
     * <strong>example:</strong>
     * <p>rec_test</p>
     */
    @NameInMap("Name")
    public String name;

    public static UpdateLabelTableRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateLabelTableRequest self = new UpdateLabelTableRequest();
        return TeaModel.build(map, self);
    }

    public UpdateLabelTableRequest setDatasourceId(String datasourceId) {
        this.datasourceId = datasourceId;
        return this;
    }
    public String getDatasourceId() {
        return this.datasourceId;
    }

    public UpdateLabelTableRequest setFields(java.util.List<UpdateLabelTableRequestFields> fields) {
        this.fields = fields;
        return this;
    }
    public java.util.List<UpdateLabelTableRequestFields> getFields() {
        return this.fields;
    }

    public UpdateLabelTableRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public static class UpdateLabelTableRequestFields extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("Attributes")
        public java.util.List<String> attributes;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>lat</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>DOUBLE</p>
         */
        @NameInMap("Type")
        public String type;

        public static UpdateLabelTableRequestFields build(java.util.Map<String, ?> map) throws Exception {
            UpdateLabelTableRequestFields self = new UpdateLabelTableRequestFields();
            return TeaModel.build(map, self);
        }

        public UpdateLabelTableRequestFields setAttributes(java.util.List<String> attributes) {
            this.attributes = attributes;
            return this;
        }
        public java.util.List<String> getAttributes() {
            return this.attributes;
        }

        public UpdateLabelTableRequestFields setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public UpdateLabelTableRequestFields setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
