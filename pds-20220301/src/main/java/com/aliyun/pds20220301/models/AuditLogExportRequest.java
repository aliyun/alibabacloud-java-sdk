// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class AuditLogExportRequest extends TeaModel {
    /**
     * <p>The name of the exported file. The name can be up to 1,024 characters in length. The default name suffix is log.csv.</p>
     * 
     * <strong>example:</strong>
     * <p>2024-01-log.csv</p>
     */
    @NameInMap("file_name")
    public String fileName;

    /**
     * <p>The export language. Default value: zh-CN. Valid values:</p>
     * <ul>
     * <li>zh-CN: Chinese</li>
     * <li>en_US: English</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh_CN</p>
     */
    @NameInMap("language")
    public String language;

    /**
     * <p>The sort order based on the operation time. If you leave this parameter empty, the value acted_at DESC is used. Valid values:</p>
     * <ul>
     * <li>acted_at DESC: sorts the entries by operation time in descending order</li>
     * <li>acted_at ASC: sorts the entries by operation time in ascending order</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>acted_at DESC</p>
     */
    @NameInMap("order_by")
    public String orderBy;

    /**
     * <p>The fields used for query. You can specify one or more of the following fields:</p>
     * <ul>
     * <li>drive_id (space ID, in the form of a string)</li>
     * <li>actor_id (operator ID, in the form of a string)</li>
     * <li>acted_at (operation time, in the yyyy-MM-ddTHH:mm:ssZ format in UTC, for example, 2006-01-02T00:00:00)</li>
     * <li>action_type (operation type, in the form of a string)</li>
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
