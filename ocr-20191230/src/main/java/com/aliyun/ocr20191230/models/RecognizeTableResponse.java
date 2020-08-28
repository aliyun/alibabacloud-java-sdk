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

    }

    public static class RecognizeTableResponseDataTablesTableRows extends TeaModel {
        @NameInMap("TableColumns")
        @Validation(required = true)
        public java.util.List<RecognizeTableResponseDataTablesTableRowsTableColumns> tableColumns;

        public static RecognizeTableResponseDataTablesTableRows build(java.util.Map<String, ?> map) throws Exception {
            RecognizeTableResponseDataTablesTableRows self = new RecognizeTableResponseDataTablesTableRows();
            return TeaModel.build(map, self);
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

    }

}
