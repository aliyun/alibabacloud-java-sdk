// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ververica20220718.models;

import com.aliyun.tea.*;

public class GetDatabasesResponseBody extends TeaModel {
    /**
     * <p>The list of databases. This parameter is returned only if the request is successful. If the request fails, this parameter is empty.</p>
     */
    @NameInMap("data")
    public java.util.List<Database> data;

    /**
     * <ul>
     * <li><p>If \<code>success\\</code> is \<code>false\\</code>, an error code is returned.</p>
     * </li>
     * <li><p>If \<code>success\\</code> is \<code>true\\</code>, this parameter is empty.</p>
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
     * <li><p>If \<code>success\\</code> is \<code>false\\</code>, an error message is returned.</p>
     * </li>
     * <li><p>If \<code>success\\</code> is \<code>true\\</code>, this parameter is empty.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>&quot;&quot;</p>
     */
    @NameInMap("errorMessage")
    public String errorMessage;

    /**
     * <p>The HTTP status code. A value of 200 is always returned. To determine whether the request was successful, check the value of the \<code>success\\</code> parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("httpCode")
    public Integer httpCode;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>CBC799F0-AS7S-1D30-8A4F-882ED4DD****</p>
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

    public static GetDatabasesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDatabasesResponseBody self = new GetDatabasesResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDatabasesResponseBody setData(java.util.List<Database> data) {
        this.data = data;
        return this;
    }
    public java.util.List<Database> getData() {
        return this.data;
    }

    public GetDatabasesResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GetDatabasesResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetDatabasesResponseBody setHttpCode(Integer httpCode) {
        this.httpCode = httpCode;
        return this;
    }
    public Integer getHttpCode() {
        return this.httpCode;
    }

    public GetDatabasesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetDatabasesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
