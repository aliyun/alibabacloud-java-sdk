// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class GetRenderingInstanceStreamingInfoResponseBody extends TeaModel {
    /**
     * <p>The token for the current connection.</p>
     * 
     * <strong>example:</strong>
     * <p>792fy125-594c-4dde-ab35-9ff8hrf0a86f</p>
     */
    @NameInMap("FlowId")
    public String flowId;

    /**
     * <p>The domain name of the streaming gateway for the cloud application service instance.</p>
     * 
     * <strong>example:</strong>
     * <p>10.178.208.22</p>
     */
    @NameInMap("Gateway")
    public String gateway;

    /**
     * <p>The streaming domain name or IP address of the cloud application service instance.</p>
     * 
     * <strong>example:</strong>
     * <p>10.18.20.2</p>
     */
    @NameInMap("Hostname")
    public String hostname;

    /**
     * <p>The streaming connection port.</p>
     * 
     * <strong>example:</strong>
     * <p>10003</p>
     */
    @NameInMap("Port")
    public String port;

    /**
     * <p>The cloud application service instance ID.</p>
     * 
     * <strong>example:</strong>
     * <p>render-9f8c57355d224ad7beaf95e145f22111</p>
     */
    @NameInMap("RenderingInstanceId")
    public String renderingInstanceId;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>BEA5625F-8FCF-48F4-851B-CA63946DA664</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetRenderingInstanceStreamingInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetRenderingInstanceStreamingInfoResponseBody self = new GetRenderingInstanceStreamingInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public GetRenderingInstanceStreamingInfoResponseBody setFlowId(String flowId) {
        this.flowId = flowId;
        return this;
    }
    public String getFlowId() {
        return this.flowId;
    }

    public GetRenderingInstanceStreamingInfoResponseBody setGateway(String gateway) {
        this.gateway = gateway;
        return this;
    }
    public String getGateway() {
        return this.gateway;
    }

    public GetRenderingInstanceStreamingInfoResponseBody setHostname(String hostname) {
        this.hostname = hostname;
        return this;
    }
    public String getHostname() {
        return this.hostname;
    }

    public GetRenderingInstanceStreamingInfoResponseBody setPort(String port) {
        this.port = port;
        return this;
    }
    public String getPort() {
        return this.port;
    }

    public GetRenderingInstanceStreamingInfoResponseBody setRenderingInstanceId(String renderingInstanceId) {
        this.renderingInstanceId = renderingInstanceId;
        return this;
    }
    public String getRenderingInstanceId() {
        return this.renderingInstanceId;
    }

    public GetRenderingInstanceStreamingInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
