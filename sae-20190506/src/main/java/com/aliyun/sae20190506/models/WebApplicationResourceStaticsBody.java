// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class WebApplicationResourceStaticsBody extends TeaModel {
    /**
     * <p>The HTTP status code. Valid values:</p>
     * <ul>
     * <li><strong>2xx</strong>: The request was successful.</li>
     * <li><strong>3xx</strong>: The request was redirected.</li>
     * <li><strong>4xx</strong>: The request failed.</li>
     * <li><strong>5xx</strong>: A server error occurred.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The data returned for the operation.</p>
     */
    @NameInMap("Data")
    public DescribeWebAppStaticsOutput data;

    /**
     * <p>The message returned for the operation. Valid values:</p>
     * <ul>
     * <li>success is returned when the request succeeds.</li>
     * <li>An error code is returned if the request failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>91F93257-7A4A-4BD3-9A7E-2F6EAE6D****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the call was successful. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: The request was successful.</li>
     * <li><strong>false</strong>: The request failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static WebApplicationResourceStaticsBody build(java.util.Map<String, ?> map) throws Exception {
        WebApplicationResourceStaticsBody self = new WebApplicationResourceStaticsBody();
        return TeaModel.build(map, self);
    }

    public WebApplicationResourceStaticsBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public WebApplicationResourceStaticsBody setData(DescribeWebAppStaticsOutput data) {
        this.data = data;
        return this;
    }
    public DescribeWebAppStaticsOutput getData() {
        return this.data;
    }

    public WebApplicationResourceStaticsBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public WebApplicationResourceStaticsBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public WebApplicationResourceStaticsBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
