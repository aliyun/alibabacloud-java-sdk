// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class AuditLogExportRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>2024-01-log.csv</p>
     */
    @NameInMap("file_name")
    public String fileName;

    /**
     * <strong>example:</strong>
     * <p>zh_CN</p>
     */
    @NameInMap("language")
    public String language;

    /**
     * <strong>example:</strong>
     * <p>acted_at DESC</p>
     */
    @NameInMap("order_by")
    public String orderBy;

    /**
     * <strong>example:</strong>
     * <p>acted_at &gt; \&quot;2025-03-10T16:00:00\&quot; and acted_at &lt; \&quot;2025-03-17T15:59:59\&quot;</p>
     */
    @NameInMap("query")
    public String query;

    public static AuditLogExportRequest build(java.util.Map<String, ?> map) throws Exception {
        AuditLogExportRequest self = new AuditLogExportRequest();
        return TeaModel.build(map, self);
    }

    public AuditLogExportRequest setFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }
    public String getFileName() {
        return this.fileName;
    }

    public AuditLogExportRequest setLanguage(String language) {
        this.language = language;
        return this;
    }
    public String getLanguage() {
        return this.language;
    }

    public AuditLogExportRequest setOrderBy(String orderBy) {
        this.orderBy = orderBy;
        return this;
    }
    public String getOrderBy() {
        return this.orderBy;
    }

    public AuditLogExportRequest setQuery(String query) {
        this.query = query;
        return this;
    }
    public String getQuery() {
        return this.query;
    }

}
