// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ocr20191230.models;

import com.aliyun.tea.*;

public class RecognizeTableResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Data")
    @Validation(required = true)
    public RecognizeTableResponseData data;

    public static RecognizeTableResponse build(java.util.Map<String, ?> map) throws Exception {
        RecognizeTableResponse self = new RecognizeTableResponse();
        return TeaModel.build(map, self);
    }

    public RecognizeTableResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RecognizeTableResponse setData(RecognizeTableResponseData data) {
        this.data = data;
        return this;
    }
    public RecognizeTableResponseData getData() {
        return this.data;
    }

    public static class RecognizeTableResponseDataTablesTableRowsTableColumns extends TeaModel {
        @NameInMap("StartColumn")
        @Validation(required = true)
        public Integer startColumn;

        @NameInMap("StartRow")
        @Validation(required = true)
        public Integer startRow;

        @NameInMap("EndColumn")
        @Validation(required = true)
        public Integer endColumn;

        @NameInMap("EndRow")
        @Validation(required = true)
        public Integer endRow;

        @NameInMap("Height")
        @Validation(required = true)
        public Integer height;

        @NameInMap("Width")
        @Validation(required = true)
        public Integer width;

        @NameInMap("Texts")
        @Validation(required = true)
        public java.util.List<String> texts;

        public static RecognizeTableResponseDataTablesTableRowsTableColumns build(java.util.Map<String, ?> map) throws Exception {
            RecognizeTableResponseDataTablesTableRowsTableColumns self = new RecognizeTableResponseDataTablesTableRowsTableColumns();
            return TeaModel.build(map, self);
        }

        public RecognizeTableResponseDataTablesTableRowsTableColumns setStartColumn(Integer startColumn) {
            this.startColumn = startColumn;
            return this;
        }
        public Integer getStartColumn() {
            return this.startColumn;
        }

        public RecognizeTableResponseDataTablesTableRowsTableColumns setStartRow(Integer startRow) {
            this.startRow = startRow;
            return this;
        }
        public Integer getStartRow() {
            return this.startRow;
        }

        public RecognizeTableResponseDataTablesTableRowsTableColumns setEndColumn(Integer endColumn) {
            this.endColumn = endColumn;
            return this;
        }
        public Integer getEndColumn() {
            return this.endColumn;
        }

        public RecognizeTableResponseDataTablesTableRowsTableColumns setEndRow(Integer endRow) {
            this.endRow = endRow;
            return this;
        }
        public Integer getEndRow() {
            return this.endRow;
        }

        public RecognizeTableResponseDataTablesTableRowsTableColumns setHeight(Integer height) {
            this.height = height;
            return this;
        }
        public Integer getHeight() {
            return this.height;
        }

        public RecognizeTableResponseDataTablesTableRowsTableColumns setWidth(Integer width) {
            this.width = width;
            return this;
        }
        public Integer getWidth() {
            return this.width;
        }

        public RecognizeTableResponseDataTablesTableRowsTableColumns setTexts(java.util.List<String> texts) {
            this.texts = texts;
            return this;
        }
        public java.util.List<String> getTexts() {
            return this.texts;
        }

    }

    public static class RecognizeTableResponseDataTablesTableRows extends TeaModel {
        @NameInMap("TableColumns")
        @Validation(required = true)
        public java.util.List<RecognizeTableResponseDataTablesTableRowsTableColumns> tableColumns;

        public static RecognizeTableResponseDataTablesTableRows build(java.util.Map<String, ?> map) throws Exception {
            RecognizeTableResponseDataTablesTableRows self = new RecognizeTableResponseDataTablesTableRows();
            return TeaModel.build(map, self);
        }

        public RecognizeTableResponseDataTablesTableRows setTableColumns(java.util.List<RecognizeTableResponseDataTablesTableRowsTableColumns> tableColumns) {
            this.tableColumns = tableColumns;
            return this;
        }
        public java.util.List<RecognizeTableResponseDataTablesTableRowsTableColumns> getTableColumns() {
            return this.tableColumns;
        }

    }

    public static class RecognizeTableResponseDataTables extends TeaModel {
        @NameInMap("TableRows")
        @Validation(required = true)
        public java.util.List<RecognizeTableResponseDataTablesTableRows> tableRows;

        @NameInMap("Head")
        @Validation(required = true)
        public java.util.List<String> head;

        @NameInMap("Tail")
        @Validation(required = true)
        public java.util.List<String> tail;

        public static RecognizeTableResponseDataTables build(java.util.Map<String, ?> map) throws Exception {
            RecognizeTableResponseDataTables self = new RecognizeTableResponseDataTables();
            return TeaModel.build(map, self);
        }

        public RecognizeTableResponseDataTables setTableRows(java.util.List<RecognizeTableResponseDataTablesTableRows> tableRows) {
            this.tableRows = tableRows;
            return this;
        }
        public java.util.List<RecognizeTableResponseDataTablesTableRows> getTableRows() {
            return this.tableRows;
        }

        public RecognizeTableResponseDataTables setHead(java.util.List<String> head) {
            this.head = head;
            return this;
        }
        public java.util.List<String> getHead() {
            return this.head;
        }

        public RecognizeTableResponseDataTables setTail(java.util.List<String> tail) {
            this.tail = tail;
            return this;
        }
        public java.util.List<String> getTail() {
            return this.tail;
        }

    }

    public static class RecognizeTableResponseData extends TeaModel {
        @NameInMap("FileContent")
        @Validation(required = true)
        public String fileContent;

        @NameInMap("Tables")
        @Validation(required = true)
        public java.util.List<RecognizeTableResponseDataTables> tables;

        public static RecognizeTableResponseData build(java.util.Map<String, ?> map) throws Exception {
            RecognizeTableResponseData self = new RecognizeTableResponseData();
            return TeaModel.build(map, self);
        }

        public RecognizeTableResponseData setFileContent(String fileContent) {
            this.fileContent = fileContent;
            return this;
        }
        public String getFileContent() {
            return this.fileContent;
        }

        public RecognizeTableResponseData setTables(java.util.List<RecognizeTableResponseDataTables> tables) {
            this.tables = tables;
            return this;
        }
        public java.util.List<RecognizeTableResponseDataTables> getTables() {
            return this.tables;
        }

    }

}
