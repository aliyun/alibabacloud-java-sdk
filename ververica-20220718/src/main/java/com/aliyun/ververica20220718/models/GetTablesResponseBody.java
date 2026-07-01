// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ververica20220718.models;

import com.aliyun.tea.*;

public class GetTablesResponseBody extends TeaModel {
    /**
     * <p>If success is true, a list of tables that meet the criteria and their details are returned. If success is false, this parameter is empty.</p>
     */
    @NameInMap("data")
    public java.util.List<Table> data;

    /**
     * <ul>
     * <li><p>If success is false, an error code is returned.</p>
     * </li>
     * <li><p>If success is true, this parameter is empty.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>&quot;&quot;</p>
     */
    @NameInMap("errorCode")
    public String errorCode;

    /**
     * <ul>
     * <li><p>If success is false, an error message is returned.</p>
     * </li>
     * <li><p>If success is true, this parameter is empty.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>&quot;&quot;</p>
     */
    @NameInMap("errorMessage")
    public String errorMessage;

    /**
     * <p>The business status code. This is always 200. Use the success parameter to determine whether the request was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("httpCode")
    public Integer httpCode;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>ECE641B2-AB0B-4174-9C3B-885881558637</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("success")
    public Boolean success;

    public static GetTablesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetTablesResponseBody self = new GetTablesResponseBody();
        return TeaModel.build(map, self);
    }

    public GetTablesResponseBody setData(java.util.List<Table> data) {
        this.data = data;
        return this;
    }
    public java.util.List<Table> getData() {
        return this.data;
    }

    public GetTablesResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GetTablesResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetTablesResponseBody setHttpCode(Integer httpCode) {
        this.httpCode = httpCode;
        return this;
    }
    public Integer getHttpCode() {
        return this.httpCode;
    }

    public GetTablesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetTablesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
