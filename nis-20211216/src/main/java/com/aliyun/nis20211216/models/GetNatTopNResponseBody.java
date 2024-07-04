// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nis20211216.models;

import com.aliyun.tea.*;

public class GetNatTopNResponseBody extends TeaModel {
    /**
     * <p>Indicates whether Network Intelligence Service (NIS) is activated. The NatGatewayTopN parameter returns an empty array when NIS is not activated.</p>
     * <ul>
     * <li><strong>true</strong>: activated</li>
     * <li><strong>false</strong>: not activated</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
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
     * 
     * <strong>example:</strong>
     * <p>77C512B5-12f3-f892-BD94-88A98271C1A0</p>
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
         * 
         * <strong>example:</strong>
         * <p>8</p>
         */
        @NameInMap("ActiveSessionCount")
        public Float activeSessionCount;

        /**
         * <p>The inbound data transfer. Unit: bit/s.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("InBps")
        public Float inBps;

        /**
         * <p>This field is reserved and not in use.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("InFlowPerMinute")
        public Float inFlowPerMinute;

        /**
         * <p>The inbound packet forwarding rate. Unit: packets per second.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("InPps")
        public Float inPps;

        /**
         * <p>The IP address.</p>
         * 
         * <strong>example:</strong>
         * <p>192.168.156.101</p>
         */
        @NameInMap("Ip")
        public String ip;

        /**
         * <p>The new connection creation rate. Unit: connections per second.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("NewSessionPerSecond")
        public Float newSessionPerSecond;

        /**
         * <p>The outbound data transfer. Unit: bit/s.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        @NameInMap("OutBps")
        public Float outBps;

        /**
         * <p>This field is reserved and not in use.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("OutFlowPerMinute")
        public Float outFlowPerMinute;

        /**
         * <p>The outbound packet forwarding rate. Unit: packets per second.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
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
