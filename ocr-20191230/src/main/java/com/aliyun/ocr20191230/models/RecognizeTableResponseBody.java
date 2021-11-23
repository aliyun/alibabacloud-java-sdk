// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ocr20191230.models;

import com.aliyun.tea.*;

public class RecognizeTableResponseBody extends TeaModel {
    @NameInMap("Data")
    public RecognizeTableResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    public static RecognizeTableResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RecognizeTableResponseBody self = new RecognizeTableResponseBody();
        return TeaModel.build(map, self);
    }

    public RecognizeTableResponseBody setData(RecognizeTableResponseBodyData data) {
        this.data = data;
        return this;
    }
    public RecognizeTableResponseBodyData getData() {
        return this.data;
    }

    public RecognizeTableResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class RecognizeTableResponseBodyDataTablesTableRowsTableColumns extends TeaModel {
        @NameInMap("EndColumn")
        public Integer endColumn;

        @NameInMap("EndRow")
        public Integer endRow;

        @NameInMap("Height")
        public Integer height;

        @NameInMap("StartColumn")
        public Integer startColumn;

        @NameInMap("StartRow")
        public Integer startRow;

        @NameInMap("Texts")
        public java.util.List<String> texts;

        @NameInMap("Width")
        public Integer width;

        public static RecognizeTableResponseBodyDataTablesTableRowsTableColumns build(java.util.Map<String, ?> map) throws Exception {
            RecognizeTableResponseBodyDataTablesTableRowsTableColumns self = new RecognizeTableResponseBodyDataTablesTableRowsTableColumns();
            return TeaModel.build(map, self);
        }

        public RecognizeTableResponseBodyDataTablesTableRowsTableColumns setEndColumn(Integer endColumn) {
            this.endColumn = endColumn;
            return this;
        }
        public Integer getEndColumn() {
            return this.endColumn;
        }

        public RecognizeTableResponseBodyDataTablesTableRowsTableColumns setEndRow(Integer endRow) {
            this.endRow = endRow;
            return this;
        }
        public Integer getEndRow() {
            return this.endRow;
        }

        public RecognizeTableResponseBodyDataTablesTableRowsTableColumns setHeight(Integer height) {
            this.height = height;
            return this;
        }
        public Integer getHeight() {
            return this.height;
        }

        public RecognizeTableResponseBodyDataTablesTableRowsTableColumns setStartColumn(Integer startColumn) {
            this.startColumn = startColumn;
            return this;
        }
        public Integer getStartColumn() {
            return this.startColumn;
        }

        public RecognizeTableResponseBodyDataTablesTableRowsTableColumns setStartRow(Integer startRow) {
            this.startRow = startRow;
            return this;
        }
        public Integer getStartRow() {
            return this.startRow;
        }

        public RecognizeTableResponseBodyDataTablesTableRowsTableColumns setTexts(java.util.List<String> texts) {
            this.texts = texts;
            return this;
        }
        public java.util.List<String> getTexts() {
            return this.texts;
        }

        public RecognizeTableResponseBodyDataTablesTableRowsTableColumns setWidth(Integer width) {
            this.width = width;
            return this;
        }
        public Integer getWidth() {
            return this.width;
        }

    }

    public static class RecognizeTableResponseBodyDataTablesTableRows extends TeaModel {
        @NameInMap("TableColumns")
        public java.util.List<RecognizeTableResponseBodyDataTablesTableRowsTableColumns> tableColumns;

        public static RecognizeTableResponseBodyDataTablesTableRows build(java.util.Map<String, ?> map) throws Exception {
            RecognizeTableResponseBodyDataTablesTableRows self = new RecognizeTableResponseBodyDataTablesTableRows();
            return TeaModel.build(map, self);
        }

        public RecognizeTableResponseBodyDataTablesTableRows setTableColumns(java.util.List<RecognizeTableResponseBodyDataTablesTableRowsTableColumns> tableColumns) {
            this.tableColumns = tableColumns;
            return this;
        }
        public java.util.List<RecognizeTableResponseBodyDataTablesTableRowsTableColumns> getTableColumns() {
            return this.tableColumns;
        }

    }

    public static class RecognizeTableResponseBodyDataTables extends TeaModel {
        @NameInMap("Head")
        public java.util.List<String> head;

        @NameInMap("TableRows")
        public java.util.List<RecognizeTableResponseBodyDataTablesTableRows> tableRows;

        @NameInMap("Tail")
        public java.util.List<String> tail;

        public static RecognizeTableResponseBodyDataTables build(java.util.Map<String, ?> map) throws Exception {
            RecognizeTableResponseBodyDataTables self = new RecognizeTableResponseBodyDataTables();
            return TeaModel.build(map, self);
        }

        public RecognizeTableResponseBodyDataTables setHead(java.util.List<String> head) {
            this.head = head;
            return this;
        }
        public java.util.List<String> getHead() {
            return this.head;
        }

        public RecognizeTableResponseBodyDataTables setTableRows(java.util.List<RecognizeTableResponseBodyDataTablesTableRows> tableRows) {
            this.tableRows = tableRows;
            return this;
        }
        public java.util.List<RecognizeTableResponseBodyDataTablesTableRows> getTableRows() {
            return this.tableRows;
        }

        public RecognizeTableResponseBodyDataTables setTail(java.util.List<String> tail) {
            this.tail = tail;
            return this;
        }
        public java.util.List<String> getTail() {
            return this.tail;
        }

    }

    public static class RecognizeTableResponseBodyData extends TeaModel {
        @NameInMap("FileContent")
        public String fileContent;

        @NameInMap("Tables")
        public java.util.List<RecognizeTableResponseBodyDataTables> tables;

        public static RecognizeTableResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            RecognizeTableResponseBodyData self = new RecognizeTableResponseBodyData();
            return TeaModel.build(map, self);
        }

        public RecognizeTableResponseBodyData setFileContent(String fileContent) {
            this.fileContent = fileContent;
            return this;
        }
        public String getFileContent() {
            return this.fileContent;
        }

        public RecognizeTableResponseBodyData setTables(java.util.List<RecognizeTableResponseBodyDataTables> tables) {
            this.tables = tables;
            return this;
        }
        public java.util.List<RecognizeTableResponseBodyDataTables> getTables() {
            return this.tables;
        }

    }

}
