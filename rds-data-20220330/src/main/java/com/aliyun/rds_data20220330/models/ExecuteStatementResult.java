// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds_data20220330.models;

import com.aliyun.tea.*;

public class ExecuteStatementResult extends TeaModel {
    @NameInMap("ColumnMetadata")
    public java.util.List<ColumnMetadata> columnMetadata;

    @NameInMap("FormattedRecords")
    public String formattedRecords;

    @NameInMap("GeneratedFields")
    public java.util.List<Field> generatedFields;

    @NameInMap("NumberOfRecordsUpdated")
    public Long numberOfRecordsUpdated;

    @NameInMap("Records")
    public java.util.List<java.util.List<Field>> records;

    public static ExecuteStatementResult build(java.util.Map<String, ?> map) throws Exception {
        ExecuteStatementResult self = new ExecuteStatementResult();
        return TeaModel.build(map, self);
    }

    public ExecuteStatementResult setColumnMetadata(java.util.List<ColumnMetadata> columnMetadata) {
        this.columnMetadata = columnMetadata;
        return this;
    }
    public java.util.List<ColumnMetadata> getColumnMetadata() {
        return this.columnMetadata;
    }

    public ExecuteStatementResult setFormattedRecords(String formattedRecords) {
        this.formattedRecords = formattedRecords;
        return this;
    }
    public String getFormattedRecords() {
        return this.formattedRecords;
    }

    public ExecuteStatementResult setGeneratedFields(java.util.List<Field> generatedFields) {
        this.generatedFields = generatedFields;
        return this;
    }
    public java.util.List<Field> getGeneratedFields() {
        return this.generatedFields;
    }

    public ExecuteStatementResult setNumberOfRecordsUpdated(Long numberOfRecordsUpdated) {
        this.numberOfRecordsUpdated = numberOfRecordsUpdated;
        return this;
    }
    public Long getNumberOfRecordsUpdated() {
        return this.numberOfRecordsUpdated;
    }

    public ExecuteStatementResult setRecords(java.util.List<java.util.List<Field>> records) {
        this.records = records;
        return this;
    }
    public java.util.List<java.util.List<Field>> getRecords() {
        return this.records;
    }

}
