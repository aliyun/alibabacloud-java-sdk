// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class ListTableMetasResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>728C5E01-ABF6-5AA8-B9FC-B3BA05DECC77</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TableMetas")
    public java.util.List<ListTableMetasResponseBodyTableMetas> tableMetas;

    /**
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    public static ListTableMetasResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListTableMetasResponseBody self = new ListTableMetasResponseBody();
        return TeaModel.build(map, self);
    }

    public ListTableMetasResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListTableMetasResponseBody setTableMetas(java.util.List<ListTableMetasResponseBodyTableMetas> tableMetas) {
        this.tableMetas = tableMetas;
        return this;
    }
    public java.util.List<ListTableMetasResponseBodyTableMetas> getTableMetas() {
        return this.tableMetas;
    }

    public ListTableMetasResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListTableMetasResponseBodyTableMetasFields extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("IsDimensionField")
        public Boolean isDimensionField;

        /**
         * <strong>example:</strong>
         * <p>the gender of people</p>
         */
        @NameInMap("Meaning")
        public String meaning;

        /**
         * <strong>example:</strong>
         * <p>gender</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>BIGINT</p>
         */
        @NameInMap("Type")
        public String type;

        public static ListTableMetasResponseBodyTableMetasFields build(java.util.Map<String, ?> map) throws Exception {
            ListTableMetasResponseBodyTableMetasFields self = new ListTableMetasResponseBodyTableMetasFields();
            return TeaModel.build(map, self);
        }

        public ListTableMetasResponseBodyTableMetasFields setIsDimensionField(Boolean isDimensionField) {
            this.isDimensionField = isDimensionField;
            return this;
        }
        public Boolean getIsDimensionField() {
            return this.isDimensionField;
        }

        public ListTableMetasResponseBodyTableMetasFields setMeaning(String meaning) {
            this.meaning = meaning;
            return this;
        }
        public String getMeaning() {
            return this.meaning;
        }

        public ListTableMetasResponseBodyTableMetasFields setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListTableMetasResponseBodyTableMetasFields setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class ListTableMetasResponseBodyTableMetas extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("CanDelete")
        public Boolean canDelete;

        @NameInMap("Config")
        public String config;

        /**
         * <strong>example:</strong>
         * <p>this is a test table</p>
         */
        @NameInMap("Description")
        public String description;

        @NameInMap("Fields")
        public java.util.List<ListTableMetasResponseBodyTableMetasFields> fields;

        /**
         * <strong>example:</strong>
         * <p>2021-12-12 12:24:33</p>
         */
        @NameInMap("GmtCreateTime")
        public String gmtCreateTime;

        /**
         * <strong>example:</strong>
         * <p>imprecation</p>
         */
        @NameInMap("GmtImportedTime")
        public String gmtImportedTime;

        /**
         * <strong>example:</strong>
         * <p>2021-12-12 12:24:33</p>
         */
        @NameInMap("GmtModifiedTime")
        public String gmtModifiedTime;

        /**
         * <strong>example:</strong>
         * <p>ABTest</p>
         */
        @NameInMap("Module")
        public String module;

        /**
         * <strong>example:</strong>
         * <p>test_table</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>reso-2s416t***</p>
         */
        @NameInMap("ResourceId")
        public String resourceId;

        /**
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("TableMetaId")
        public String tableMetaId;

        /**
         * <strong>example:</strong>
         * <p>table_mysql</p>
         */
        @NameInMap("TableName")
        public String tableName;

        /**
         * <strong>example:</strong>
         * <p>MaxCompute</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <strong>example:</strong>
         * <p><a href="https://dmc-xxx.com/dm/table/xxx">https://dmc-xxx.com/dm/table/xxx</a></p>
         */
        @NameInMap("Url")
        public String url;

        public static ListTableMetasResponseBodyTableMetas build(java.util.Map<String, ?> map) throws Exception {
            ListTableMetasResponseBodyTableMetas self = new ListTableMetasResponseBodyTableMetas();
            return TeaModel.build(map, self);
        }

        public ListTableMetasResponseBodyTableMetas setCanDelete(Boolean canDelete) {
            this.canDelete = canDelete;
            return this;
        }
        public Boolean getCanDelete() {
            return this.canDelete;
        }

        public ListTableMetasResponseBodyTableMetas setConfig(String config) {
            this.config = config;
            return this;
        }
        public String getConfig() {
            return this.config;
        }

        public ListTableMetasResponseBodyTableMetas setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListTableMetasResponseBodyTableMetas setFields(java.util.List<ListTableMetasResponseBodyTableMetasFields> fields) {
            this.fields = fields;
            return this;
        }
        public java.util.List<ListTableMetasResponseBodyTableMetasFields> getFields() {
            return this.fields;
        }

        public ListTableMetasResponseBodyTableMetas setGmtCreateTime(String gmtCreateTime) {
            this.gmtCreateTime = gmtCreateTime;
            return this;
        }
        public String getGmtCreateTime() {
            return this.gmtCreateTime;
        }

        public ListTableMetasResponseBodyTableMetas setGmtImportedTime(String gmtImportedTime) {
            this.gmtImportedTime = gmtImportedTime;
            return this;
        }
        public String getGmtImportedTime() {
            return this.gmtImportedTime;
        }

        public ListTableMetasResponseBodyTableMetas setGmtModifiedTime(String gmtModifiedTime) {
            this.gmtModifiedTime = gmtModifiedTime;
            return this;
        }
        public String getGmtModifiedTime() {
            return this.gmtModifiedTime;
        }

        public ListTableMetasResponseBodyTableMetas setModule(String module) {
            this.module = module;
            return this;
        }
        public String getModule() {
            return this.module;
        }

        public ListTableMetasResponseBodyTableMetas setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListTableMetasResponseBodyTableMetas setResourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public String getResourceId() {
            return this.resourceId;
        }

        public ListTableMetasResponseBodyTableMetas setTableMetaId(String tableMetaId) {
            this.tableMetaId = tableMetaId;
            return this;
        }
        public String getTableMetaId() {
            return this.tableMetaId;
        }

        public ListTableMetasResponseBodyTableMetas setTableName(String tableName) {
            this.tableName = tableName;
            return this;
        }
        public String getTableName() {
            return this.tableName;
        }

        public ListTableMetasResponseBodyTableMetas setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListTableMetasResponseBodyTableMetas setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

}
