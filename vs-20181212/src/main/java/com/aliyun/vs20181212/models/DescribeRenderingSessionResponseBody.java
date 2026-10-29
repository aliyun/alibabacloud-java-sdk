// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class DescribeRenderingSessionResponseBody extends TeaModel {
    /**
     * <p>The additional optional ingress network information.</p>
     */
    @NameInMap("AdditionalIngresses")
    public java.util.List<DescribeRenderingSessionResponseBodyAdditionalIngresses> additionalIngresses;

    /**
     * <p>The cloud application ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cap-b06b26edfhytbn b94a75ae1a79efc90eb</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>The client ID.</p>
     * 
     * <strong>example:</strong>
     * <p>c91263a0-f9ac-45bd-bbe9-6e293ad32d91</p>
     */
    @NameInMap("ClientId")
    public String clientId;

    /**
     * <p>The instance hostname. By default, the value is the elastic IP address (EIP) used for access.</p>
     * 
     * <strong>example:</strong>
     * <p>111.45.29.96</p>
     */
    @NameInMap("Hostname")
    public String hostname;

    /**
     * <p>The ISP code. Valid values:</p>
     * <ol>
     * <li>cmcc</li>
     * <li>unicom</li>
     * <li>telecom</li>
     * </ol>
     * 
     * <strong>example:</strong>
     * <p>telecom</p>
     */
    @NameInMap("Isp")
    public String isp;

    /**
     * <p>The location information of the cloud application service instance.</p>
     */
    @NameInMap("Location")
    public DescribeRenderingSessionResponseBodyLocation location;

    /**
     * <p>The cloud application patch package ID. An empty value indicates the original version.</p>
     * 
     * <strong>example:</strong>
     * <p>patch-03fa76e8e13a49b6a966b063d9d309b4</p>
     */
    @NameInMap("PatchId")
    public String patchId;

    /**
     * <p>The port mapping information.</p>
     */
    @NameInMap("PortMappings")
    public java.util.List<DescribeRenderingSessionResponseBodyPortMappings> portMappings;

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

    /**
     * <p>The session ID.</p>
     * 
     * <strong>example:</strong>
     * <p>session-i205217481741918129226</p>
     */
    @NameInMap("SessionId")
    public String sessionId;

    /**
     * <p>The start time. The time is in UTC and follows the ISO 8601 standard. The format is YYYY-MM-DDTHH:mm:ssZ.</p>
     * 
     * <strong>example:</strong>
     * <p>2025-05-18T02:20:00Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>The session status information.</p>
     */
    @NameInMap("StateInfo")
    public DescribeRenderingSessionResponseBodyStateInfo stateInfo;

    public static DescribeRenderingSessionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeRenderingSessionResponseBody self = new DescribeRenderingSessionResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeRenderingSessionResponseBody setAdditionalIngresses(java.util.List<DescribeRenderingSessionResponseBodyAdditionalIngresses> additionalIngresses) {
        this.additionalIngresses = additionalIngresses;
        return this;
    }
    public java.util.List<DescribeRenderingSessionResponseBodyAdditionalIngresses> getAdditionalIngresses() {
        return this.additionalIngresses;
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

    public DescribeRenderingSessionResponseBody setIsp(String isp) {
        this.isp = isp;
        return this;
    }
    public String getIsp() {
        return this.isp;
    }

    public DescribeRenderingSessionResponseBody setLocation(DescribeRenderingSessionResponseBodyLocation location) {
        this.location = location;
        return this;
    }
    public DescribeRenderingSessionResponseBodyLocation getLocation() {
        return this.location;
    }

    public DescribeRenderingSessionResponseBody setPatchId(String patchId) {
        this.patchId = patchId;
        return this;
    }
    public String getPatchId() {
        return this.patchId;
    }

    public DescribeRenderingSessionResponseBody setPortMappings(java.util.List<DescribeRenderingSessionResponseBodyPortMappings> portMappings) {
        this.portMappings = portMappings;
        return this;
    }
    public java.util.List<DescribeRenderingSessionResponseBodyPortMappings> getPortMappings() {
        return this.portMappings;
    }

    public DescribeRenderingSessionResponseBody setRenderingInstanceId(String renderingInstanceId) {
        this.renderingInstanceId = renderingInstanceId;
        return this;
    }
    public String getRenderingInstanceId() {
        return this.renderingInstanceId;
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

    public static class DescribeRenderingSessionResponseBodyAdditionalIngressesPortMappings extends TeaModel {
        /**
         * <p>The external port or port range, such as 22. For a port range, separate the start and end ports with a forward slash (/), for example, 10/20.</p>
         * 
         * <strong>example:</strong>
         * <p>11060/11079</p>
         */
        @NameInMap("ExternalPort")
        public String externalPort;

        /**
         * <p>The internal port or port range. The internal ports correspond one-to-one to the external ports. For a port range, separate the start and end ports with a forward slash (/), for example, 10/20.</p>
         * 
         * <strong>example:</strong>
         * <p>11060/11079</p>
         */
        @NameInMap("InternalPort")
        public String internalPort;

        public static DescribeRenderingSessionResponseBodyAdditionalIngressesPortMappings build(java.util.Map<String, ?> map) throws Exception {
            DescribeRenderingSessionResponseBodyAdditionalIngressesPortMappings self = new DescribeRenderingSessionResponseBodyAdditionalIngressesPortMappings();
            return TeaModel.build(map, self);
        }

        public DescribeRenderingSessionResponseBodyAdditionalIngressesPortMappings setExternalPort(String externalPort) {
            this.externalPort = externalPort;
            return this;
        }
        public String getExternalPort() {
            return this.externalPort;
        }

        public DescribeRenderingSessionResponseBodyAdditionalIngressesPortMappings setInternalPort(String internalPort) {
            this.internalPort = internalPort;
            return this;
        }
        public String getInternalPort() {
            return this.internalPort;
        }

    }

    public static class DescribeRenderingSessionResponseBodyAdditionalIngresses extends TeaModel {
        /**
         * <p>The domain name or IP address of the cloud application service instance.</p>
         * 
         * <strong>example:</strong>
         * <p>111.45.29.96</p>
         */
        @NameInMap("Hostname")
        public String hostname;

        /**
         * <p>The ISP code. Valid values:</p>
         * <ol>
         * <li>cmcc</li>
         * <li>unicom</li>
         * <li>telecom</li>
         * </ol>
         * 
         * <strong>example:</strong>
         * <p>unicom</p>
         */
        @NameInMap("Isp")
        public String isp;

        /**
         * <p>The port mapping list.</p>
         */
        @NameInMap("PortMappings")
        public java.util.List<DescribeRenderingSessionResponseBodyAdditionalIngressesPortMappings> portMappings;

        public static DescribeRenderingSessionResponseBodyAdditionalIngresses build(java.util.Map<String, ?> map) throws Exception {
            DescribeRenderingSessionResponseBodyAdditionalIngresses self = new DescribeRenderingSessionResponseBodyAdditionalIngresses();
            return TeaModel.build(map, self);
        }

        public DescribeRenderingSessionResponseBodyAdditionalIngresses setHostname(String hostname) {
            this.hostname = hostname;
            return this;
        }
        public String getHostname() {
            return this.hostname;
        }

        public DescribeRenderingSessionResponseBodyAdditionalIngresses setIsp(String isp) {
            this.isp = isp;
            return this;
        }
        public String getIsp() {
            return this.isp;
        }

        public DescribeRenderingSessionResponseBodyAdditionalIngresses setPortMappings(java.util.List<DescribeRenderingSessionResponseBodyAdditionalIngressesPortMappings> portMappings) {
            this.portMappings = portMappings;
            return this;
        }
        public java.util.List<DescribeRenderingSessionResponseBodyAdditionalIngressesPortMappings> getPortMappings() {
            return this.portMappings;
        }

    }

    public static class DescribeRenderingSessionResponseBodyLocation extends TeaModel {
        /**
         * <p>The province code of the cloud application service instance.</p>
         * 
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
         * <p>The external port or port range, such as 22. For a port range, separate the start and end ports with a forward slash (/), for example, 10/20.</p>
         * 
         * <strong>example:</strong>
         * <p>10013/10020</p>
         */
        @NameInMap("ExternalPort")
        public String externalPort;

        /**
         * <p>The internal port or port range. The internal ports correspond one-to-one to the external ports. For a port range, separate the start and end ports with a forward slash (/), for example, 10/20.</p>
         * 
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
        /**
         * <p>The status description.</p>
         * 
         * <strong>example:</strong>
         * <p>Started</p>
         */
        @NameInMap("Comment")
        public String comment;

        /**
         * <p>The session status. Valid values:</p>
         * <ol>
         * <li>SessionStarting: The session is starting.</li>
         * <li>SessionStartSuspended: The session start is suspended. You can initiate start again to retry.</li>
         * <li>SessionStarted: The session is started or in use.</li>
         * <li>SessionStartFailed: The session failed to start.</li>
         * <li>SessionAbnormal: The session is abnormal after a successful start.</li>
         * <li>SessionStopping: The session is stopping.</li>
         * <li>SessionStopFailed: The session failed to stop.</li>
         * </ol>
         * 
         * <strong>example:</strong>
         * <p>SessionStarted</p>
         */
        @NameInMap("State")
        public String state;

        /**
         * <p>The time when the status was last updated. The time follows the ISO 8601 standard and includes the time zone offset. The format is YYYY-MM-DDTHH:mm:ss+HH:mm.</p>
         * 
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
