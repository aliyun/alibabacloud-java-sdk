// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class RefreshRenderingInstanceStreamingResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>792fy125-594c-4dde-ab35-9ff8hrf0a86f</p>
     */
    @NameInMap("FlowId")
    public String flowId;

    /**
     * <strong>example:</strong>
     * <p>10.178.208.22</p>
     */
    @NameInMap("Gateway")
    public String gateway;

    /**
     * <strong>example:</strong>
     * <p>cn-xxx.ecr.aliyuncs.com</p>
     */
    @NameInMap("Hostname")
    public String hostname;

    /**
     * <strong>example:</strong>
     * <p>8080</p>
     */
    @NameInMap("Port")
    public String port;

    /**
     * <strong>example:</strong>
     * <p>render-9f8c57355d224ad7beaf95e145f22111</p>
     */
    @NameInMap("RenderingInstanceId")
    public String renderingInstanceId;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>BEA5625F-8FCF-48F4-851B-CA63946DA664</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static RefreshRenderingInstanceStreamingResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RefreshRenderingInstanceStreamingResponseBody self = new RefreshRenderingInstanceStreamingResponseBody();
        return TeaModel.build(map, self);
    }

    public RefreshRenderingInstanceStreamingResponseBody setFlowId(String flowId) {
        this.flowId = flowId;
        return this;
    }
    public String getFlowId() {
        return this.flowId;
    }

    public RefreshRenderingInstanceStreamingResponseBody setGateway(String gateway) {
        this.gateway = gateway;
        return this;
    }
    public String getGateway() {
        return this.gateway;
    }

    public RefreshRenderingInstanceStreamingResponseBody setHostname(String hostname) {
        this.hostname = hostname;
        return this;
    }
    public String getHostname() {
        return this.hostname;
    }

    public RefreshRenderingInstanceStreamingResponseBody setPort(String port) {
        this.port = port;
        return this;
    }
    public String getPort() {
        return this.port;
    }

    public RefreshRenderingInstanceStreamingResponseBody setRenderingInstanceId(String renderingInstanceId) {
        this.renderingInstanceId = renderingInstanceId;
        return this;
    }
    public String getRenderingInstanceId() {
        return this.renderingInstanceId;
    }

    public RefreshRenderingInstanceStreamingResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
