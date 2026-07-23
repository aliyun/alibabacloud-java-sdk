// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class ListInstanceResourceSchemasResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>728C5E01-ABF6-5AA8-B9FC-B3BA05DECC77</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The list of schemas.</p>
     */
    @NameInMap("Schemas")
    public java.util.List<ListInstanceResourceSchemasResponseBodySchemas> schemas;

    /**
     * <p>The total count of schemas.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    public static ListInstanceResourceSchemasResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListInstanceResourceSchemasResponseBody self = new ListInstanceResourceSchemasResponseBody();
        return TeaModel.build(map, self);
    }

    public ListInstanceResourceSchemasResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListInstanceResourceSchemasResponseBody setSchemas(java.util.List<ListInstanceResourceSchemasResponseBodySchemas> schemas) {
        this.schemas = schemas;
        return this;
    }
    public java.util.List<ListInstanceResourceSchemasResponseBodySchemas> getSchemas() {
        return this.schemas;
    }

    public ListInstanceResourceSchemasResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListInstanceResourceSchemasResponseBodySchemas extends TeaModel {
        /**
         * <p>The schema name.</p>
         * 
         * <strong>example:</strong>
         * <p>default</p>
         */
        @NameInMap("SchemaName")
        public String schemaName;

        public static ListInstanceResourceSchemasResponseBodySchemas build(java.util.Map<String, ?> map) throws Exception {
            ListInstanceResourceSchemasResponseBodySchemas self = new ListInstanceResourceSchemasResponseBodySchemas();
            return TeaModel.build(map, self);
        }

        public ListInstanceResourceSchemasResponseBodySchemas setSchemaName(String schemaName) {
            this.schemaName = schemaName;
            return this;
        }
        public String getSchemaName() {
            return this.schemaName;
        }

    }

}
