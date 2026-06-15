// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paifeaturestore20230621.models;

import com.aliyun.tea.*;

public class GetLabelTableResponseBody extends TeaModel {
    /**
     * <p>The data source ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("DatasourceId")
    public String datasourceId;

    /**
     * <p>The data source name.</p>
     * 
     * <strong>example:</strong>
     * <p>datasource1</p>
     */
    @NameInMap("DatasourceName")
    public String datasourceName;

    /**
     * <p>The fields in the label table.</p>
     */
    @NameInMap("Fields")
    public java.util.List<GetLabelTableResponseBodyFields> fields;

    /**
     * <p>The time when the label table was created.</p>
     * 
     * <strong>example:</strong>
     * <p>2021-12-15T23:24:33.132+08:00</p>
     */
    @NameInMap("GmtCreateTime")
    public String gmtCreateTime;

    /**
     * <p>The time when the label table was last modified.</p>
     * 
     * <strong>example:</strong>
     * <p>2021-12-15T23:24:33.132+08:00</p>
     */
    @NameInMap("GmtModifiedTime")
    public String gmtModifiedTime;

    /**
     * <p>The label table name.</p>
     * 
     * <strong>example:</strong>
     * <p>label_table1</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The Alibaba Cloud account ID of the creator.</p>
     * 
     * <strong>example:</strong>
     * <p>12321312*****</p>
     */
    @NameInMap("Owner")
    public String owner;

    /**
     * <p>The project ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("ProjectId")
    public String projectId;

    /**
     * <p>The project name.</p>
     * 
     * <strong>example:</strong>
     * <p>project1</p>
     */
    @NameInMap("ProjectName")
    public String projectName;

    /**
     * <p>A list of related model feature names.</p>
     */
    @NameInMap("RelatedModelFeatures")
    public java.util.List<String> relatedModelFeatures;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>728C5E01-ABF6-5AA8-B9FC-B3BA05DECC77</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetLabelTableResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetLabelTableResponseBody self = new GetLabelTableResponseBody();
        return TeaModel.build(map, self);
    }

    public GetLabelTableResponseBody setDatasourceId(String datasourceId) {
        this.datasourceId = datasourceId;
        return this;
    }
    public String getDatasourceId() {
        return this.datasourceId;
    }

    public GetLabelTableResponseBody setDatasourceName(String datasourceName) {
        this.datasourceName = datasourceName;
        return this;
    }
    public String getDatasourceName() {
        return this.datasourceName;
    }

    public GetLabelTableResponseBody setFields(java.util.List<GetLabelTableResponseBodyFields> fields) {
        this.fields = fields;
        return this;
    }
    public java.util.List<GetLabelTableResponseBodyFields> getFields() {
        return this.fields;
    }

    public GetLabelTableResponseBody setGmtCreateTime(String gmtCreateTime) {
        this.gmtCreateTime = gmtCreateTime;
        return this;
    }
    public String getGmtCreateTime() {
        return this.gmtCreateTime;
    }

    public GetLabelTableResponseBody setGmtModifiedTime(String gmtModifiedTime) {
        this.gmtModifiedTime = gmtModifiedTime;
        return this;
    }
    public String getGmtModifiedTime() {
        return this.gmtModifiedTime;
    }

    public GetLabelTableResponseBody setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public GetLabelTableResponseBody setOwner(String owner) {
        this.owner = owner;
        return this;
    }
    public String getOwner() {
        return this.owner;
    }

    public GetLabelTableResponseBody setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public GetLabelTableResponseBody setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

    public GetLabelTableResponseBody setRelatedModelFeatures(java.util.List<String> relatedModelFeatures) {
        this.relatedModelFeatures = relatedModelFeatures;
        return this;
    }
    public java.util.List<String> getRelatedModelFeatures() {
        return this.relatedModelFeatures;
    }

    public GetLabelTableResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetLabelTableResponseBodyFields extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>item</p>
         */
        @NameInMap("AlignedEntityName")
        public String alignedEntityName;

        /**
         * <p>A list of field attributes.</p>
         */
        @NameInMap("Attributes")
        public java.util.List<String> attributes;

        /**
         * <p>The field name.</p>
         * 
         * <strong>example:</strong>
         * <p>field1</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The field type.</p>
         * 
         * <strong>example:</strong>
         * <p>INT32</p>
         */
        @NameInMap("Type")
        public String type;

        public static GetLabelTableResponseBodyFields build(java.util.Map<String, ?> map) throws Exception {
            GetLabelTableResponseBodyFields self = new GetLabelTableResponseBodyFields();
            return TeaModel.build(map, self);
        }

        public GetLabelTableResponseBodyFields setAlignedEntityName(String alignedEntityName) {
            this.alignedEntityName = alignedEntityName;
            return this;
        }
        public String getAlignedEntityName() {
            return this.alignedEntityName;
        }

        public GetLabelTableResponseBodyFields setAttributes(java.util.List<String> attributes) {
            this.attributes = attributes;
            return this;
        }
        public java.util.List<String> getAttributes() {
            return this.attributes;
        }

        public GetLabelTableResponseBodyFields setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetLabelTableResponseBodyFields setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
