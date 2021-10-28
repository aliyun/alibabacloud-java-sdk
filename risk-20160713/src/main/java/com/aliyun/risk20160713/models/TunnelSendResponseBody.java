// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.risk20160713.models;

import com.aliyun.tea.*;

public class TunnelSendResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public TunnelSendResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    public static TunnelSendResponseBody build(java.util.Map<String, ?> map) throws Exception {
        TunnelSendResponseBody self = new TunnelSendResponseBody();
        return TeaModel.build(map, self);
    }

    public TunnelSendResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public TunnelSendResponseBody setData(TunnelSendResponseBodyData data) {
        this.data = data;
        return this;
    }
    public TunnelSendResponseBodyData getData() {
        return this.data;
    }

    public TunnelSendResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class TunnelSendResponseBodyData extends TeaModel {
        @NameInMap("TunnelId")
        public String tunnelId;

        public static TunnelSendResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            TunnelSendResponseBodyData self = new TunnelSendResponseBodyData();
            return TeaModel.build(map, self);
        }

        public TunnelSendResponseBodyData setTunnelId(String tunnelId) {
            this.tunnelId = tunnelId;
            return this;
        }
        public String getTunnelId() {
            return this.tunnelId;
        }

    }

}
