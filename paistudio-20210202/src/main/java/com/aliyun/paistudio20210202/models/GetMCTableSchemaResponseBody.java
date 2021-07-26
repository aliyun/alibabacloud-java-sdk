// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20210202.models;

import com.aliyun.tea.*;

public class GetMCTableSchemaResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Columns")
    public java.util.List<GetMCTableSchemaResponseBodyColumns> columns;

    @NameInMap("PartitionColumns")
    public java.util.List<String> partitionColumns;

    public static GetMCTableSchemaResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetMCTableSchemaResponseBody self = new GetMCTableSchemaResponseBody();
        return TeaModel.build(map, self);
    }

    public GetMCTableSchemaResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetMCTableSchemaResponseBody setColumns(java.util.List<GetMCTableSchemaResponseBodyColumns> columns) {
        this.columns = columns;
        return this;
    }
    public java.util.List<GetMCTableSchemaResponseBodyColumns> getColumns() {
        return this.columns;
    }

    public GetMCTableSchemaResponseBody setPartitionColumns(java.util.List<String> partitionColumns) {
        this.partitionColumns = partitionColumns;
        return this;
    }
    public java.util.List<String> getPartitionColumns() {
        return this.partitionColumns;
    }

    public static class GetMCTableSchemaResponseBodyColumns extends TeaModel {
        @NameInMap("Name")
        public String name;

        @NameInMap("Type")
        public String type;

        @NameInMap("Preview")
        public java.util.List<String> preview;

        public static GetMCTableSchemaResponseBodyColumns build(java.util.Map<String, ?> map) throws Exception {
            GetMCTableSchemaResponseBodyColumns self = new GetMCTableSchemaResponseBodyColumns();
            return TeaModel.build(map, self);
        }

        public GetMCTableSchemaResponseBodyColumns setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetMCTableSchemaResponseBodyColumns setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public GetMCTableSchemaResponseBodyColumns setPreview(java.util.List<String> preview) {
            this.preview = preview;
            return this;
        }
        public java.util.List<String> getPreview() {
            return this.preview;
        }

    }

}
