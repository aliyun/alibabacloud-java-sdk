// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class GetRenderingInstanceStreamingInfoResponseBody extends TeaModel {
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
     * <p>10.18.20.2</p>
     */
    @NameInMap("Hostname")
    public String hostname;

    /**
     * <strong>example:</strong>
     * <p>10003</p>
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
