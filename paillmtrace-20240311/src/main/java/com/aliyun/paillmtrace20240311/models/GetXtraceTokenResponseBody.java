// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paillmtrace20240311.models;

import com.aliyun.tea.*;

public class GetXtraceTokenResponseBody extends TeaModel {
    /**
     * <p>The internal error code. This parameter is returned only when an error occurs.</p>
     * 
     * <strong>example:</strong>
     * <p>InvalidInputParams</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The gRPC endpoint used for uploading ARM traces.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="http://tracing-analysis-dc-hz.aliyuncs.com:8090">http://tracing-analysis-dc-hz.aliyuncs.com:8090</a></p>
     */
    @NameInMap("GrpcEndpoint")
    public String grpcEndpoint;

    /**
     * <p>The internal gRPC endpoint used for uploading ARMS traces used by Alibaba Cloud.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="http://tracing-analysis-dc-hz-internal.aliyuncs.com:8090">http://tracing-analysis-dc-hz-internal.aliyuncs.com:8090</a></p>
     */
    @NameInMap("GrpcInternalEndpoint")
    public String grpcInternalEndpoint;

    /**
     * <p>The endpoint used for uploading ARMS traces.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="http://tracing-analysis-dc-hz.aliyuncs.com/aaa@bbb@ccc/api/otlp/traces">http://tracing-analysis-dc-hz.aliyuncs.com/aaa@bbb@ccc/api/otlp/traces</a></p>
     */
    @NameInMap("HttpEndpoint")
    public String httpEndpoint;

    /**
     * <p>The internal endpoint used for uploading ARMS traces used by Alibaba Cloud.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="http://tracing-analysis-dc-hz-internal.aliyuncs.com/aaa@bbb@ccc/api/otlp/traces">http://tracing-analysis-dc-hz-internal.aliyuncs.com/aaa@bbb@ccc/api/otlp/traces</a></p>
     */
    @NameInMap("HttpInternalEndpoint")
    public String httpInternalEndpoint;

    /**
     * <p>The error message. This parameter is returned only when an error occurs.</p>
     * 
     * <strong>example:</strong>
     * <p>get_xtrace_token: failed, ERROR: NoPermission</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>6A87228C-969A-1381-98CF-AE07AE630FA5</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The token used for uploading ARMS traces.</p>
     * 
     * <strong>example:</strong>
     * <p>h1abcw7@5abcb_h1abcw7@5abc01</p>
     */
    @NameInMap("Token")
    public String token;

    public static GetXtraceTokenResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetXtraceTokenResponseBody self = new GetXtraceTokenResponseBody();
        return TeaModel.build(map, self);
    }

    public GetXtraceTokenResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetXtraceTokenResponseBody setGrpcEndpoint(String grpcEndpoint) {
        this.grpcEndpoint = grpcEndpoint;
        return this;
    }
    public String getGrpcEndpoint() {
        return this.grpcEndpoint;
    }

    public GetXtraceTokenResponseBody setGrpcInternalEndpoint(String grpcInternalEndpoint) {
        this.grpcInternalEndpoint = grpcInternalEndpoint;
        return this;
    }
    public String getGrpcInternalEndpoint() {
        return this.grpcInternalEndpoint;
    }

    public GetXtraceTokenResponseBody setHttpEndpoint(String httpEndpoint) {
        this.httpEndpoint = httpEndpoint;
        return this;
    }
    public String getHttpEndpoint() {
        return this.httpEndpoint;
    }

    public GetXtraceTokenResponseBody setHttpInternalEndpoint(String httpInternalEndpoint) {
        this.httpInternalEndpoint = httpInternalEndpoint;
        return this;
    }
    public String getHttpInternalEndpoint() {
        return this.httpInternalEndpoint;
    }

    public GetXtraceTokenResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetXtraceTokenResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetXtraceTokenResponseBody setToken(String token) {
        this.token = token;
        return this;
    }
    public String getToken() {
        return this.token;
    }

}
