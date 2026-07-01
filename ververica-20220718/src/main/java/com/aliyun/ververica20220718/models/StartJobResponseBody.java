// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ververica20220718.models;

import com.aliyun.tea.*;

public class StartJobResponseBody extends TeaModel {
    /**
     * <p>The detailed information about the access denial.</p>
     */
    @NameInMap("accessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <ul>
     * <li><p>When \<code>success\\</code> is \<code>true\\</code>, the created instance information is returned.</p>
     * </li>
     * <li><p>Returns an empty value if \<code>success\\</code> is false.</p>
     * </li>
     * </ul>
     */
    @NameInMap("data")
    public Job data;

    /**
     * <ul>
     * <li><p>If success is false, the call returns a business error code.If success is true, the call returns business data. The following table describes the data format.If success is true, the call returns business data. The following table describes the data format.</p>
     * </li>
     * <li><p>When success is true, an empty value is returned.</p>
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
     * <li><p>If success is false, a business error message is returned.</p>
     * </li>
     * <li><p>When \<code>success\\</code> is true, an empty value is returned.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>&quot;&quot;</p>
     */
    @NameInMap("errorMessage")
    public String errorMessage;

    /**
     * <p>Fixed value: 200.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("httpCode")
    public Integer httpCode;

    /**
     * <p>Request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>CBC799F0-AS7S-1D30-8A4F-882ED4DD****</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>Indicates whether the service request was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("success")
    public Boolean success;

    public static StartJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        StartJobResponseBody self = new StartJobResponseBody();
        return TeaModel.build(map, self);
    }

    public StartJobResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public StartJobResponseBody setData(Job data) {
        this.data = data;
        return this;
    }
    public Job getData() {
        return this.data;
    }

    public StartJobResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public StartJobResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public StartJobResponseBody setHttpCode(Integer httpCode) {
        this.httpCode = httpCode;
        return this;
    }
    public Integer getHttpCode() {
        return this.httpCode;
    }

    public StartJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public StartJobResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
