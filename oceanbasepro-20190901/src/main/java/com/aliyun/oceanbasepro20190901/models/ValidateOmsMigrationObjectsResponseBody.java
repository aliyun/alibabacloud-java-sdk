// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class ValidateOmsMigrationObjectsResponseBody extends TeaModel {
    @NameInMap("Data")
    public ValidateOmsMigrationObjectsResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    public static ValidateOmsMigrationObjectsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ValidateOmsMigrationObjectsResponseBody self = new ValidateOmsMigrationObjectsResponseBody();
        return TeaModel.build(map, self);
    }

    public ValidateOmsMigrationObjectsResponseBody setData(ValidateOmsMigrationObjectsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ValidateOmsMigrationObjectsResponseBodyData getData() {
        return this.data;
    }

    public ValidateOmsMigrationObjectsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ValidateOmsMigrationObjectsResponseBodyDataMigrationObjectsInfoTables extends TeaModel {
        @NameInMap("Name")
        public String name;

        @NameInMap("Schema")
        public String schema;

        public static ValidateOmsMigrationObjectsResponseBodyDataMigrationObjectsInfoTables build(java.util.Map<String, ?> map) throws Exception {
            ValidateOmsMigrationObjectsResponseBodyDataMigrationObjectsInfoTables self = new ValidateOmsMigrationObjectsResponseBodyDataMigrationObjectsInfoTables();
            return TeaModel.build(map, self);
        }

        public ValidateOmsMigrationObjectsResponseBodyDataMigrationObjectsInfoTables setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ValidateOmsMigrationObjectsResponseBodyDataMigrationObjectsInfoTables setSchema(String schema) {
            this.schema = schema;
            return this;
        }
        public String getSchema() {
            return this.schema;
        }

    }

    public static class ValidateOmsMigrationObjectsResponseBodyDataMigrationObjectsInfoViews extends TeaModel {
        @NameInMap("Name")
        public String name;

        @NameInMap("Schema")
        public String schema;

        public static ValidateOmsMigrationObjectsResponseBodyDataMigrationObjectsInfoViews build(java.util.Map<String, ?> map) throws Exception {
            ValidateOmsMigrationObjectsResponseBodyDataMigrationObjectsInfoViews self = new ValidateOmsMigrationObjectsResponseBodyDataMigrationObjectsInfoViews();
            return TeaModel.build(map, self);
        }

        public ValidateOmsMigrationObjectsResponseBodyDataMigrationObjectsInfoViews setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ValidateOmsMigrationObjectsResponseBodyDataMigrationObjectsInfoViews setSchema(String schema) {
            this.schema = schema;
            return this;
        }
        public String getSchema() {
            return this.schema;
        }

    }

    public static class ValidateOmsMigrationObjectsResponseBodyDataMigrationObjectsInfo extends TeaModel {
        @NameInMap("Tables")
        public java.util.List<ValidateOmsMigrationObjectsResponseBodyDataMigrationObjectsInfoTables> tables;

        @NameInMap("Views")
        public java.util.List<ValidateOmsMigrationObjectsResponseBodyDataMigrationObjectsInfoViews> views;

        public static ValidateOmsMigrationObjectsResponseBodyDataMigrationObjectsInfo build(java.util.Map<String, ?> map) throws Exception {
            ValidateOmsMigrationObjectsResponseBodyDataMigrationObjectsInfo self = new ValidateOmsMigrationObjectsResponseBodyDataMigrationObjectsInfo();
            return TeaModel.build(map, self);
        }

        public ValidateOmsMigrationObjectsResponseBodyDataMigrationObjectsInfo setTables(java.util.List<ValidateOmsMigrationObjectsResponseBodyDataMigrationObjectsInfoTables> tables) {
            this.tables = tables;
            return this;
        }
        public java.util.List<ValidateOmsMigrationObjectsResponseBodyDataMigrationObjectsInfoTables> getTables() {
            return this.tables;
        }

        public ValidateOmsMigrationObjectsResponseBodyDataMigrationObjectsInfo setViews(java.util.List<ValidateOmsMigrationObjectsResponseBodyDataMigrationObjectsInfoViews> views) {
            this.views = views;
            return this;
        }
        public java.util.List<ValidateOmsMigrationObjectsResponseBodyDataMigrationObjectsInfoViews> getViews() {
            return this.views;
        }

    }

    public static class ValidateOmsMigrationObjectsResponseBodyDataObjectMappingInfoSchemaMappings extends TeaModel {
        @NameInMap("DestName")
        public String destName;

        @NameInMap("SourceName")
        public String sourceName;

        public static ValidateOmsMigrationObjectsResponseBodyDataObjectMappingInfoSchemaMappings build(java.util.Map<String, ?> map) throws Exception {
            ValidateOmsMigrationObjectsResponseBodyDataObjectMappingInfoSchemaMappings self = new ValidateOmsMigrationObjectsResponseBodyDataObjectMappingInfoSchemaMappings();
            return TeaModel.build(map, self);
        }

        public ValidateOmsMigrationObjectsResponseBodyDataObjectMappingInfoSchemaMappings setDestName(String destName) {
            this.destName = destName;
            return this;
        }
        public String getDestName() {
            return this.destName;
        }

        public ValidateOmsMigrationObjectsResponseBodyDataObjectMappingInfoSchemaMappings setSourceName(String sourceName) {
            this.sourceName = sourceName;
            return this;
        }
        public String getSourceName() {
            return this.sourceName;
        }

    }

    public static class ValidateOmsMigrationObjectsResponseBodyDataObjectMappingInfoTableMappings extends TeaModel {
        @NameInMap("DestName")
        public String destName;

        @NameInMap("SourceName")
        public String sourceName;

        @NameInMap("SourceSchema")
        public String sourceSchema;

        public static ValidateOmsMigrationObjectsResponseBodyDataObjectMappingInfoTableMappings build(java.util.Map<String, ?> map) throws Exception {
            ValidateOmsMigrationObjectsResponseBodyDataObjectMappingInfoTableMappings self = new ValidateOmsMigrationObjectsResponseBodyDataObjectMappingInfoTableMappings();
            return TeaModel.build(map, self);
        }

        public ValidateOmsMigrationObjectsResponseBodyDataObjectMappingInfoTableMappings setDestName(String destName) {
            this.destName = destName;
            return this;
        }
        public String getDestName() {
            return this.destName;
        }

        public ValidateOmsMigrationObjectsResponseBodyDataObjectMappingInfoTableMappings setSourceName(String sourceName) {
            this.sourceName = sourceName;
            return this;
        }
        public String getSourceName() {
            return this.sourceName;
        }

        public ValidateOmsMigrationObjectsResponseBodyDataObjectMappingInfoTableMappings setSourceSchema(String sourceSchema) {
            this.sourceSchema = sourceSchema;
            return this;
        }
        public String getSourceSchema() {
            return this.sourceSchema;
        }

    }

    public static class ValidateOmsMigrationObjectsResponseBodyDataObjectMappingInfoViewMappings extends TeaModel {
        @NameInMap("DestName")
        public String destName;

        @NameInMap("SourceName")
        public String sourceName;

        @NameInMap("SourceSchema")
        public String sourceSchema;

        public static ValidateOmsMigrationObjectsResponseBodyDataObjectMappingInfoViewMappings build(java.util.Map<String, ?> map) throws Exception {
            ValidateOmsMigrationObjectsResponseBodyDataObjectMappingInfoViewMappings self = new ValidateOmsMigrationObjectsResponseBodyDataObjectMappingInfoViewMappings();
            return TeaModel.build(map, self);
        }

        public ValidateOmsMigrationObjectsResponseBodyDataObjectMappingInfoViewMappings setDestName(String destName) {
            this.destName = destName;
            return this;
        }
        public String getDestName() {
            return this.destName;
        }

        public ValidateOmsMigrationObjectsResponseBodyDataObjectMappingInfoViewMappings setSourceName(String sourceName) {
            this.sourceName = sourceName;
            return this;
        }
        public String getSourceName() {
            return this.sourceName;
        }

        public ValidateOmsMigrationObjectsResponseBodyDataObjectMappingInfoViewMappings setSourceSchema(String sourceSchema) {
            this.sourceSchema = sourceSchema;
            return this;
        }
        public String getSourceSchema() {
            return this.sourceSchema;
        }

    }

    public static class ValidateOmsMigrationObjectsResponseBodyDataObjectMappingInfo extends TeaModel {
        @NameInMap("SchemaMappings")
        public java.util.List<ValidateOmsMigrationObjectsResponseBodyDataObjectMappingInfoSchemaMappings> schemaMappings;

        @NameInMap("TableMappings")
        public java.util.List<ValidateOmsMigrationObjectsResponseBodyDataObjectMappingInfoTableMappings> tableMappings;

        @NameInMap("ViewMappings")
        public java.util.List<ValidateOmsMigrationObjectsResponseBodyDataObjectMappingInfoViewMappings> viewMappings;

        public static ValidateOmsMigrationObjectsResponseBodyDataObjectMappingInfo build(java.util.Map<String, ?> map) throws Exception {
            ValidateOmsMigrationObjectsResponseBodyDataObjectMappingInfo self = new ValidateOmsMigrationObjectsResponseBodyDataObjectMappingInfo();
            return TeaModel.build(map, self);
        }

        public ValidateOmsMigrationObjectsResponseBodyDataObjectMappingInfo setSchemaMappings(java.util.List<ValidateOmsMigrationObjectsResponseBodyDataObjectMappingInfoSchemaMappings> schemaMappings) {
            this.schemaMappings = schemaMappings;
            return this;
        }
        public java.util.List<ValidateOmsMigrationObjectsResponseBodyDataObjectMappingInfoSchemaMappings> getSchemaMappings() {
            return this.schemaMappings;
        }

        public ValidateOmsMigrationObjectsResponseBodyDataObjectMappingInfo setTableMappings(java.util.List<ValidateOmsMigrationObjectsResponseBodyDataObjectMappingInfoTableMappings> tableMappings) {
            this.tableMappings = tableMappings;
            return this;
        }
        public java.util.List<ValidateOmsMigrationObjectsResponseBodyDataObjectMappingInfoTableMappings> getTableMappings() {
            return this.tableMappings;
        }

        public ValidateOmsMigrationObjectsResponseBodyDataObjectMappingInfo setViewMappings(java.util.List<ValidateOmsMigrationObjectsResponseBodyDataObjectMappingInfoViewMappings> viewMappings) {
            this.viewMappings = viewMappings;
            return this;
        }
        public java.util.List<ValidateOmsMigrationObjectsResponseBodyDataObjectMappingInfoViewMappings> getViewMappings() {
            return this.viewMappings;
        }

    }

    public static class ValidateOmsMigrationObjectsResponseBodyData extends TeaModel {
        @NameInMap("Message")
        public String message;

        @NameInMap("MigrationObjectsInfo")
        public ValidateOmsMigrationObjectsResponseBodyDataMigrationObjectsInfo migrationObjectsInfo;

        @NameInMap("ObjectMappingInfo")
        public ValidateOmsMigrationObjectsResponseBodyDataObjectMappingInfo objectMappingInfo;

        @NameInMap("Valid")
        public Boolean valid;

        public static ValidateOmsMigrationObjectsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ValidateOmsMigrationObjectsResponseBodyData self = new ValidateOmsMigrationObjectsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ValidateOmsMigrationObjectsResponseBodyData setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public ValidateOmsMigrationObjectsResponseBodyData setMigrationObjectsInfo(ValidateOmsMigrationObjectsResponseBodyDataMigrationObjectsInfo migrationObjectsInfo) {
            this.migrationObjectsInfo = migrationObjectsInfo;
            return this;
        }
        public ValidateOmsMigrationObjectsResponseBodyDataMigrationObjectsInfo getMigrationObjectsInfo() {
            return this.migrationObjectsInfo;
        }

        public ValidateOmsMigrationObjectsResponseBodyData setObjectMappingInfo(ValidateOmsMigrationObjectsResponseBodyDataObjectMappingInfo objectMappingInfo) {
            this.objectMappingInfo = objectMappingInfo;
            return this;
        }
        public ValidateOmsMigrationObjectsResponseBodyDataObjectMappingInfo getObjectMappingInfo() {
            return this.objectMappingInfo;
        }

        public ValidateOmsMigrationObjectsResponseBodyData setValid(Boolean valid) {
            this.valid = valid;
            return this;
        }
        public Boolean getValid() {
            return this.valid;
        }

    }

}
