// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paifeaturestore20230621.models;

import com.aliyun.tea.*;

public class CreateLabelTableRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("DatasourceId")
    public String datasourceId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Fields")
    public java.util.List<CreateLabelTableRequestFields> fields;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ProjectId")
    public String projectId;

    public static CreateLabelTableRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateLabelTableRequest self = new CreateLabelTableRequest();
        return TeaModel.build(map, self);
    }

    public CreateLabelTableRequest setDatasourceId(String datasourceId) {
        this.datasourceId = datasourceId;
        return this;
    }
    public String getDatasourceId() {
        return this.datasourceId;
    }

    public CreateLabelTableRequest setFields(java.util.List<CreateLabelTableRequestFields> fields) {
        this.fields = fields;
        return this;
    }
    public java.util.List<CreateLabelTableRequestFields> getFields() {
        return this.fields;
    }

    public CreateLabelTableRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateLabelTableRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public static class CreateLabelTableRequestFields extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("Attributes")
        public java.util.List<String> attributes;

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

        public static CreateLabelTableRequestFields build(java.util.Map<String, ?> map) throws Exception {
            CreateLabelTableRequestFields self = new CreateLabelTableRequestFields();
            return TeaModel.build(map, self);
        }

        public CreateLabelTableRequestFields setAttributes(java.util.List<String> attributes) {
            this.attributes = attributes;
            return this;
        }
        public java.util.List<String> getAttributes() {
            return this.attributes;
        }

        public CreateLabelTableRequestFields setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateLabelTableRequestFields setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
