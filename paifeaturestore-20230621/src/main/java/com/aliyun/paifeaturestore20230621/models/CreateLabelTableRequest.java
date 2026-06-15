// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paifeaturestore20230621.models;

import com.aliyun.tea.*;

public class CreateLabelTableRequest extends TeaModel {
    /**
     * <p>The ID of the data source that contains the label table. Call the ListDatasources operation to obtain this ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("DatasourceId")
    public String datasourceId;

    /**
     * <p>The field list.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Fields")
    public java.util.List<CreateLabelTableRequestFields> fields;

    /**
     * <p>The name of the label table.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>rec_test</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The project ID. Call the ListProjects operation to obtain this ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
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
         * <strong>example:</strong>
         * <p>item</p>
         */
        @NameInMap("AlignedEntityName")
        public String alignedEntityName;

        /**
         * <p>The field attributes. Valid values include:</p>
         * <p>● <code>Partition</code>: A partition field.</p>
         * <p>● <code>FeatureField</code>: A feature field.</p>
         * <p>● <code>FeatureGenerationReserveField</code>: A reserved field for Feature Generation (FG).</p>
         * <p>● <code>EventTime</code>: The event time.</p>
         * <p>● <code>LabelField</code>: A label field.</p>
         * <p>This parameter is required.</p>
         */
        @NameInMap("Attributes")
        public java.util.List<String> attributes;

        /**
         * <p>The name of the field.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>lat</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The data type of the field.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>INT32</p>
         */
        @NameInMap("Type")
        public String type;

        public static CreateLabelTableRequestFields build(java.util.Map<String, ?> map) throws Exception {
            CreateLabelTableRequestFields self = new CreateLabelTableRequestFields();
            return TeaModel.build(map, self);
        }

        public CreateLabelTableRequestFields setAlignedEntityName(String alignedEntityName) {
            this.alignedEntityName = alignedEntityName;
            return this;
        }
        public String getAlignedEntityName() {
            return this.alignedEntityName;
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
