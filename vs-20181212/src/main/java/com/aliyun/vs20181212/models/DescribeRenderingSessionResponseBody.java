// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class DescribeRenderingSessionResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>cap-b06b26edfhytbn b94a75ae1a79efc90eb</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <strong>example:</strong>
     * <p>c91263a0-f9ac-45bd-bbe9-6e293ad32d91</p>
     */
    @NameInMap("ClientId")
    public String clientId;

    /**
     * <strong>example:</strong>
     * <p>111.45.29.96</p>
     */
    @NameInMap("Hostname")
    public String hostname;

    @NameInMap("Location")
    public DescribeRenderingSessionResponseBodyLocation location;

    @NameInMap("PortMappings")
    public java.util.List<DescribeRenderingSessionResponseBodyPortMappings> portMappings;

    /**
     * <strong>example:</strong>
     * <p>BEA5625F-8FCF-48F4-851B-CA63946DA664</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>session-i205217481741918129226</p>
     */
    @NameInMap("SessionId")
    public String sessionId;

    /**
     * <strong>example:</strong>
     * <p>2025-05-18T02:20:00Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    @NameInMap("StateInfo")
    public DescribeRenderingSessionResponseBodyStateInfo stateInfo;

    public static DescribeRenderingSessionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeRenderingSessionResponseBody self = new DescribeRenderingSessionResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeRenderingSessionResponseBody setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public DescribeRenderingSessionResponseBody setClientId(String clientId) {
        this.clientId = clientId;
        return this;
    }
    public String getClientId() {
        return this.clientId;
    }

    public DescribeRenderingSessionResponseBody setHostname(String hostname) {
        this.hostname = hostname;
        return this;
    }
    public String getHostname() {
        return this.hostname;
    }

    public DescribeRenderingSessionResponseBody setLocation(DescribeRenderingSessionResponseBodyLocation location) {
        this.location = location;
        return this;
    }
    public DescribeRenderingSessionResponseBodyLocation getLocation() {
        return this.location;
    }

    public DescribeRenderingSessionResponseBody setPortMappings(java.util.List<DescribeRenderingSessionResponseBodyPortMappings> portMappings) {
        this.portMappings = portMappings;
        return this;
    }
    public java.util.List<DescribeRenderingSessionResponseBodyPortMappings> getPortMappings() {
        return this.portMappings;
    }

    public DescribeRenderingSessionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeRenderingSessionResponseBody setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

    public DescribeRenderingSessionResponseBody setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public DescribeRenderingSessionResponseBody setStateInfo(DescribeRenderingSessionResponseBodyStateInfo stateInfo) {
        this.stateInfo = stateInfo;
        return this;
    }
    public DescribeRenderingSessionResponseBodyStateInfo getStateInfo() {
        return this.stateInfo;
    }

    public static class DescribeRenderingSessionResponseBodyLocation extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>310000</p>
         */
        @NameInMap("ProvinceCode")
        public String provinceCode;

        public static DescribeRenderingSessionResponseBodyLocation build(java.util.Map<String, ?> map) throws Exception {
            DescribeRenderingSessionResponseBodyLocation self = new DescribeRenderingSessionResponseBodyLocation();
            return TeaModel.build(map, self);
        }

        public DescribeRenderingSessionResponseBodyLocation setProvinceCode(String provinceCode) {
            this.provinceCode = provinceCode;
            return this;
        }
        public String getProvinceCode() {
            return this.provinceCode;
        }

    }

    public static class DescribeRenderingSessionResponseBodyPortMappings extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>10013/10020</p>
         */
        @NameInMap("ExternalPort")
        public String externalPort;

        /**
         * <strong>example:</strong>
         * <p>49008/49015</p>
         */
        @NameInMap("InternalPort")
        public String internalPort;

        public static DescribeRenderingSessionResponseBodyPortMappings build(java.util.Map<String, ?> map) throws Exception {
            DescribeRenderingSessionResponseBodyPortMappings self = new DescribeRenderingSessionResponseBodyPortMappings();
            return TeaModel.build(map, self);
        }

        public DescribeRenderingSessionResponseBodyPortMappings setExternalPort(String externalPort) {
            this.externalPort = externalPort;
            return this;
        }
        public String getExternalPort() {
            return this.externalPort;
        }

        public DescribeRenderingSessionResponseBodyPortMappings setInternalPort(String internalPort) {
            this.internalPort = internalPort;
            return this;
        }
        public String getInternalPort() {
            return this.internalPort;
        }

    }

    public static class DescribeRenderingSessionResponseBodyStateInfo extends TeaModel {
        @NameInMap("Comment")
        public String comment;

        /**
         * <strong>example:</strong>
         * <p>SessionStarted</p>
         */
        @NameInMap("State")
        public String state;

        /**
         * <strong>example:</strong>
         * <p>2024-10-15T10:05:20+08:00</p>
         */
        @NameInMap("UpdateTime")
        public String updateTime;

        public static DescribeRenderingSessionResponseBodyStateInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeRenderingSessionResponseBodyStateInfo self = new DescribeRenderingSessionResponseBodyStateInfo();
            return TeaModel.build(map, self);
        }

        public DescribeRenderingSessionResponseBodyStateInfo setComment(String comment) {
            this.comment = comment;
            return this;
        }
        public String getComment() {
            return this.comment;
        }

        public DescribeRenderingSessionResponseBodyStateInfo setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public DescribeRenderingSessionResponseBodyStateInfo setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

    }

}
