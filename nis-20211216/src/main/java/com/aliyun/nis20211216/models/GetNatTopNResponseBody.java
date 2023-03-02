// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nis20211216.models;

import com.aliyun.tea.*;

public class GetNatTopNResponseBody extends TeaModel {
    /**
     * <p>Indicates whether Network Intelligence Service (NIS) is activated. The NatGatewayTopN parameter returns an empty array when NIS is not activated.</p>
     * <br>
     * <p>*   **true**: activated</p>
     * <p>*   **false**: not activated</p>
     */
    @NameInMap("IsTopNOpen")
    public Boolean isTopNOpen;

    /**
     * <p>An array of statistics about real-time SNAT performance ranking.</p>
     */
    @NameInMap("NatGatewayTopN")
    public java.util.List<GetNatTopNResponseBodyNatGatewayTopN> natGatewayTopN;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetNatTopNResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetNatTopNResponseBody self = new GetNatTopNResponseBody();
        return TeaModel.build(map, self);
    }

    public GetNatTopNResponseBody setIsTopNOpen(Boolean isTopNOpen) {
        this.isTopNOpen = isTopNOpen;
        return this;
    }
    public Boolean getIsTopNOpen() {
        return this.isTopNOpen;
    }

    public GetNatTopNResponseBody setNatGatewayTopN(java.util.List<GetNatTopNResponseBodyNatGatewayTopN> natGatewayTopN) {
        this.natGatewayTopN = natGatewayTopN;
        return this;
    }
    public java.util.List<GetNatTopNResponseBodyNatGatewayTopN> getNatGatewayTopN() {
        return this.natGatewayTopN;
    }

    public GetNatTopNResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetNatTopNResponseBodyNatGatewayTopN extends TeaModel {
        /**
         * <p>The number of concurrent connections. Unit: connections.</p>
         */
        @NameInMap("ActiveSessionCount")
        public Float activeSessionCount;

        /**
         * <p>The inbound data transfer. Unit: bit/s.</p>
         */
        @NameInMap("InBps")
        public Float inBps;

        /**
         * <p>This field is reserved and not in use.</p>
         */
        @NameInMap("InFlowPerMinute")
        public Float inFlowPerMinute;

        /**
         * <p>The inbound packet forwarding rate. Unit: packets per second.</p>
         */
        @NameInMap("InPps")
        public Float inPps;

        /**
         * <p>The IP address.</p>
         */
        @NameInMap("Ip")
        public String ip;

        /**
         * <p>The new connection creation rate. Unit: connections per second.</p>
         */
        @NameInMap("NewSessionPerSecond")
        public Float newSessionPerSecond;

        /**
         * <p>The outbound data transfer. Unit: bit/s.</p>
         */
        @NameInMap("OutBps")
        public Float outBps;

        /**
         * <p>This field is reserved and not in use.</p>
         */
        @NameInMap("OutFlowPerMinute")
        public Float outFlowPerMinute;

        /**
         * <p>The outbound packet forwarding rate. Unit: packets per second.</p>
         */
        @NameInMap("OutPps")
        public Float outPps;

        public static GetNatTopNResponseBodyNatGatewayTopN build(java.util.Map<String, ?> map) throws Exception {
            GetNatTopNResponseBodyNatGatewayTopN self = new GetNatTopNResponseBodyNatGatewayTopN();
            return TeaModel.build(map, self);
        }

        public GetNatTopNResponseBodyNatGatewayTopN setActiveSessionCount(Float activeSessionCount) {
            this.activeSessionCount = activeSessionCount;
            return this;
        }
        public Float getActiveSessionCount() {
            return this.activeSessionCount;
        }

        public GetNatTopNResponseBodyNatGatewayTopN setInBps(Float inBps) {
            this.inBps = inBps;
            return this;
        }
        public Float getInBps() {
            return this.inBps;
        }

        public GetNatTopNResponseBodyNatGatewayTopN setInFlowPerMinute(Float inFlowPerMinute) {
            this.inFlowPerMinute = inFlowPerMinute;
            return this;
        }
        public Float getInFlowPerMinute() {
            return this.inFlowPerMinute;
        }

        public GetNatTopNResponseBodyNatGatewayTopN setInPps(Float inPps) {
            this.inPps = inPps;
            return this;
        }
        public Float getInPps() {
            return this.inPps;
        }

        public GetNatTopNResponseBodyNatGatewayTopN setIp(String ip) {
            this.ip = ip;
            return this;
        }
        public String getIp() {
            return this.ip;
        }

        public GetNatTopNResponseBodyNatGatewayTopN setNewSessionPerSecond(Float newSessionPerSecond) {
            this.newSessionPerSecond = newSessionPerSecond;
            return this;
        }
        public Float getNewSessionPerSecond() {
            return this.newSessionPerSecond;
        }

        public GetNatTopNResponseBodyNatGatewayTopN setOutBps(Float outBps) {
            this.outBps = outBps;
            return this;
        }
        public Float getOutBps() {
            return this.outBps;
        }

        public GetNatTopNResponseBodyNatGatewayTopN setOutFlowPerMinute(Float outFlowPerMinute) {
            this.outFlowPerMinute = outFlowPerMinute;
            return this;
        }
        public Float getOutFlowPerMinute() {
            return this.outFlowPerMinute;
        }

        public GetNatTopNResponseBodyNatGatewayTopN setOutPps(Float outPps) {
            this.outPps = outPps;
            return this;
        }
        public Float getOutPps() {
            return this.outPps;
        }

    }

}
