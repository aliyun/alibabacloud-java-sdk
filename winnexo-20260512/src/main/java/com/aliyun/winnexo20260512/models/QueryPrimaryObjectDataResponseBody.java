// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class QueryPrimaryObjectDataResponseBody extends TeaModel {
    /**
     * <p>业务状态码：成功为 200，失败为后端错误码（ERR.* / InvalidParameter.*）</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("code")
    public String code;

    @NameInMap("items")
    public java.util.List<java.util.Map<String, String>> items;

    /**
     * <p>错误描述，成功时为空</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>当前页码</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("page")
    public Long page;

    /**
     * <p>每页数量</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("pageSize")
    public Long pageSize;

    /**
     * <p>请求追踪 ID</p>
     * 
     * <strong>example:</strong>
     * <p>019FF406-1B10-0065-A97D-2D1920C2A03D</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>总数</p>
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
