// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class QueryPrimaryObjectDataResponseBody extends TeaModel {
    /**
     * <p>The business status code. A value of 200 indicates success. A failure returns a backend error code (ERR.* / InvalidParameter.*).</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The incremental information list.</p>
     * 
     * <strong>example:</strong>
     * <p>string_value</p>
     */
    @NameInMap("items")
    public java.util.List<java.util.Map<String, String>> items;

    /**
     * <p>The error description. This parameter is empty when the request succeeds.</p>
     * 
     * <strong>example:</strong>
     * <p>ok</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>The current page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("page")
    public Long page;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("pageSize")
    public Long pageSize;

    /**
     * <p>The request trace ID.</p>
     * 
     * <strong>example:</strong>
     * <p>019FF406-1B10-0065-A97D-2D1920C2A03D</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The total number of entries.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("total")
    public Long total;

    public static QueryPrimaryObjectDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryPrimaryObjectDataResponseBody self = new QueryPrimaryObjectDataResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryPrimaryObjectDataResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryPrimaryObjectDataResponseBody setItems(java.util.List<java.util.Map<String, String>> items) {
        this.items = items;
        return this;
    }
    public java.util.List<java.util.Map<String, String>> getItems() {
        return this.items;
    }

    public QueryPrimaryObjectDataResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryPrimaryObjectDataResponseBody setPage(Long page) {
        this.page = page;
        return this;
    }
    public Long getPage() {
        return this.page;
    }

    public QueryPrimaryObjectDataResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public QueryPrimaryObjectDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryPrimaryObjectDataResponseBody setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

}
