// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class AuditLogExportRequest extends TeaModel {
    /**
     * <p>The name of the exported file. The name can be up to 1,024 characters in length. The default value is <code>log.csv</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>2024-01-log.csv</p>
     */
    @NameInMap("file_name")
    public String fileName;

    /**
     * <p>The language of the exported file. Default: zh_CN (Chinese). Valid values:</p>
     * <ul>
     * <li><p><code>zh_CN</code>: Chinese</p>
     * </li>
     * <li><p><code>en_US</code>: English</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh_CN</p>
     */
    @NameInMap("language")
    public String language;

    /**
     * <p>The sort field. You can sort by the operation time (<code>acted_at</code>). If this parameter is not specified, the results are sorted by operation time in descending order. Valid values:</p>
     * <ul>
     * <li><p><code>acted_at DESC</code>: Sorts by operation time in descending order.</p>
     * </li>
     * <li><p><code>acted_at ASC</code>: Sorts by operation time in ascending order.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>acted_at DESC</p>
     */
    @NameInMap("order_by")
    public String orderBy;

    /**
     * <p>Query audit logs by using a combination of the following fields:</p>
     * <ul>
     * <li><p><code>drive_id</code> (string): The drive ID.</p>
     * </li>
     * <li><p><code>actor_id</code> (string): The actor ID.</p>
     * </li>
     * <li><p><code>acted_at</code> (date): The operation time. The time must be in UTC and specified in the <code>YYYY-MM-DDTHH:mm:ss</code> format.</p>
     * </li>
     * <li><p><code>action_type</code> (string): The operation type.</p>
     * </li>
     * </ul>
     * 
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
