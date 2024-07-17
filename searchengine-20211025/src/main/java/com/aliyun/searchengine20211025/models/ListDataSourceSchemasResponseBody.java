// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchengine20211025.models;

import com.aliyun.tea.*;

public class ListDataSourceSchemasResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>022F36C7-9FB4-5D67-BEBC-3D14B0984463</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The results returned.</p>
     */
    @NameInMap("result")
    public java.util.List<ListDataSourceSchemasResponseBodyResult> result;

    public static ListDataSourceSchemasResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDataSourceSchemasResponseBody self = new ListDataSourceSchemasResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDataSourceSchemasResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListDataSourceSchemasResponseBody setResult(java.util.List<ListDataSourceSchemasResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<ListDataSourceSchemasResponseBodyResult> getResult() {
        return this.result;
    }

    public static class ListDataSourceSchemasResponseBodyResultPrimaryKey extends TeaModel {
        /**
         * <p>Indicates whether the field has the primary key attribute. Valid values: <strong>true</strong> and <strong>false</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("hasPrimaryKeyAttribute")
        public Boolean hasPrimaryKeyAttribute;

        /**
         * <p>Indicates whether the field is the primary key. Valid values: <strong>true</strong> and <strong>false</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("isPrimaryKey")
        public Boolean isPrimaryKey;

        /**
         * <p>Indicates whether the field can be sorted. Valid values: <strong>true</strong> and <strong>false</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("isPrimaryKeySorted")
        public Boolean isPrimaryKeySorted;

        public static ListDataSourceSchemasResponseBodyResultPrimaryKey build(java.util.Map<String, ?> map) throws Exception {
            ListDataSourceSchemasResponseBodyResultPrimaryKey self = new ListDataSourceSchemasResponseBodyResultPrimaryKey();
            return TeaModel.build(map, self);
        }

        public ListDataSourceSchemasResponseBodyResultPrimaryKey setHasPrimaryKeyAttribute(Boolean hasPrimaryKeyAttribute) {
            this.hasPrimaryKeyAttribute = hasPrimaryKeyAttribute;
            return this;
        }
        public Boolean getHasPrimaryKeyAttribute() {
            return this.hasPrimaryKeyAttribute;
        }

        public ListDataSourceSchemasResponseBodyResultPrimaryKey setIsPrimaryKey(Boolean isPrimaryKey) {
            this.isPrimaryKey = isPrimaryKey;
            return this;
        }
        public Boolean getIsPrimaryKey() {
            return this.isPrimaryKey;
        }

        public ListDataSourceSchemasResponseBodyResultPrimaryKey setIsPrimaryKeySorted(Boolean isPrimaryKeySorted) {
            this.isPrimaryKeySorted = isPrimaryKeySorted;
            return this;
        }
        public Boolean getIsPrimaryKeySorted() {
            return this.isPrimaryKeySorted;
        }

    }

    public static class ListDataSourceSchemasResponseBodyResult extends TeaModel {
        /**
         * <p>Indicates whether the field has the index attribute. Valid values: <strong>true</strong> and <strong>false</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("addIndex")
        public Boolean addIndex;

        /**
         * <p>Indicates whether the field is an attribute field. Valid values: <strong>true</strong> and <strong>false</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("attribute")
        public Boolean attribute;

        /**
         * <p>Indicates whether the field is a custom field. Valid values: <strong>true</strong> and <strong>false</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("custom")
        public Boolean custom;

        /**
         * <p>The field name.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The primary key field.</p>
         */
        @NameInMap("primaryKey")
        public ListDataSourceSchemasResponseBodyResultPrimaryKey primaryKey;

        /**
         * <p>Indicates whether the field can be displayed. Valid values: <strong>true</strong> and <strong>false</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("summary")
        public Boolean summary;

        /**
         * <p>The field type.</p>
         * 
         * <strong>example:</strong>
         * <p>STRING</p>
         */
        @NameInMap("type")
        public String type;

        public static ListDataSourceSchemasResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            ListDataSourceSchemasResponseBodyResult self = new ListDataSourceSchemasResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public ListDataSourceSchemasResponseBodyResult setAddIndex(Boolean addIndex) {
            this.addIndex = addIndex;
            return this;
        }
        public Boolean getAddIndex() {
            return this.addIndex;
        }

        public ListDataSourceSchemasResponseBodyResult setAttribute(Boolean attribute) {
            this.attribute = attribute;
            return this;
        }
        public Boolean getAttribute() {
            return this.attribute;
        }

        public ListDataSourceSchemasResponseBodyResult setCustom(Boolean custom) {
            this.custom = custom;
            return this;
        }
        public Boolean getCustom() {
            return this.custom;
        }

        public ListDataSourceSchemasResponseBodyResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListDataSourceSchemasResponseBodyResult setPrimaryKey(ListDataSourceSchemasResponseBodyResultPrimaryKey primaryKey) {
            this.primaryKey = primaryKey;
            return this;
        }
        public ListDataSourceSchemasResponseBodyResultPrimaryKey getPrimaryKey() {
            return this.primaryKey;
        }

        public ListDataSourceSchemasResponseBodyResult setSummary(Boolean summary) {
            this.summary = summary;
            return this;
        }
        public Boolean getSummary() {
            return this.summary;
        }

        public ListDataSourceSchemasResponseBodyResult setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
