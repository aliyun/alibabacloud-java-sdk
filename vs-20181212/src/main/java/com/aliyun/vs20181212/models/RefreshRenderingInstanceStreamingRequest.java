// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class RefreshRenderingInstanceStreamingRequest extends TeaModel {
    @NameInMap("ClientInfo")
    public RefreshRenderingInstanceStreamingRequestClientInfo clientInfo;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>render-9f8c57355d224ad7beaf95e145f22111</p>
     */
    @NameInMap("RenderingInstanceId")
    public String renderingInstanceId;

    public static RefreshRenderingInstanceStreamingRequest build(java.util.Map<String, ?> map) throws Exception {
        RefreshRenderingInstanceStreamingRequest self = new RefreshRenderingInstanceStreamingRequest();
        return TeaModel.build(map, self);
    }

    public RefreshRenderingInstanceStreamingRequest setClientInfo(RefreshRenderingInstanceStreamingRequestClientInfo clientInfo) {
        this.clientInfo = clientInfo;
        return this;
    }
    public RefreshRenderingInstanceStreamingRequestClientInfo getClientInfo() {
        return this.clientInfo;
    }

    public RefreshRenderingInstanceStreamingRequest setRenderingInstanceId(String renderingInstanceId) {
        this.renderingInstanceId = renderingInstanceId;
        return this;
    }
    public String getRenderingInstanceId() {
        return this.renderingInstanceId;
    }

    public static class RefreshRenderingInstanceStreamingRequestClientInfo extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>172.21.128.110</p>
         */
        @NameInMap("ClientIp")
        public String clientIp;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("NewClient")
        public Boolean newClient;

        public static RefreshRenderingInstanceStreamingRequestClientInfo build(java.util.Map<String, ?> map) throws Exception {
            RefreshRenderingInstanceStreamingRequestClientInfo self = new RefreshRenderingInstanceStreamingRequestClientInfo();
            return TeaModel.build(map, self);
        }

        public RefreshRenderingInstanceStreamingRequestClientInfo setClientIp(String clientIp) {
            this.clientIp = clientIp;
            return this;
        }
        public String getClientIp() {
            return this.clientIp;
        }

        public RefreshRenderingInstanceStreamingRequestClientInfo setNewClient(Boolean newClient) {
            this.newClient = newClient;
            return this;
        }
        public Boolean getNewClient() {
            return this.newClient;
        }

    }

}
