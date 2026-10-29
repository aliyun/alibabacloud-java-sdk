// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class StartRenderingSessionResponseBody extends TeaModel {
    /**
     * <p>The instance hostname. The default value is the access elastic IP address (EIP).</p>
     * 
     * <strong>example:</strong>
     * <p>cn-xxx.ecr.aliyuncs.com</p>
     */
    @NameInMap("Hostname")
    public String hostname;

    /**
     * <p>Indicates whether the request is a repeated request.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("IsRepeatedRequest")
    public Boolean isRepeatedRequest;

    /**
     * <p>The location information of the cloud application service instance.</p>
     */
    @NameInMap("Location")
    public StartRenderingSessionResponseBodyLocation location;

    /**
     * <p>The port mapping information.</p>
     */
    @NameInMap("PortMappings")
    public java.util.List<StartRenderingSessionResponseBodyPortMappings> portMappings;

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
     * <p>The session state information.</p>
     */
    @NameInMap("StateInfo")
    public StartRenderingSessionResponseBodyStateInfo stateInfo;

    public static StartRenderingSessionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        StartRenderingSessionResponseBody self = new StartRenderingSessionResponseBody();
        return TeaModel.build(map, self);
    }

    public StartRenderingSessionResponseBody setHostname(String hostname) {
        this.hostname = hostname;
        return this;
    }
    public String getHostname() {
        return this.hostname;
    }

    public StartRenderingSessionResponseBody setIsRepeatedRequest(Boolean isRepeatedRequest) {
        this.isRepeatedRequest = isRepeatedRequest;
        return this;
    }
    public Boolean getIsRepeatedRequest() {
        return this.isRepeatedRequest;
    }

    public StartRenderingSessionResponseBody setLocation(StartRenderingSessionResponseBodyLocation location) {
        this.location = location;
        return this;
    }
    public StartRenderingSessionResponseBodyLocation getLocation() {
        return this.location;
    }

    public StartRenderingSessionResponseBody setPortMappings(java.util.List<StartRenderingSessionResponseBodyPortMappings> portMappings) {
        this.portMappings = portMappings;
        return this;
    }
    public java.util.List<StartRenderingSessionResponseBodyPortMappings> getPortMappings() {
        return this.portMappings;
    }

    public StartRenderingSessionResponseBody setRenderingInstanceId(String renderingInstanceId) {
        this.renderingInstanceId = renderingInstanceId;
        return this;
    }
    public String getRenderingInstanceId() {
        return this.renderingInstanceId;
    }

    public StartRenderingSessionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public StartRenderingSessionResponseBody setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

    public StartRenderingSessionResponseBody setStateInfo(StartRenderingSessionResponseBodyStateInfo stateInfo) {
        this.stateInfo = stateInfo;
        return this;
    }
    public StartRenderingSessionResponseBodyStateInfo getStateInfo() {
        return this.stateInfo;
    }

    public static class StartRenderingSessionResponseBodyLocation extends TeaModel {
        /**
         * <p>The province code of the cloud application service instance.</p>
         * 
         * <strong>example:</strong>
         * <p>610000</p>
         */
        @NameInMap("ProvinceCode")
        public String provinceCode;

        public static StartRenderingSessionResponseBodyLocation build(java.util.Map<String, ?> map) throws Exception {
            StartRenderingSessionResponseBodyLocation self = new StartRenderingSessionResponseBodyLocation();
            return TeaModel.build(map, self);
        }

        public StartRenderingSessionResponseBodyLocation setProvinceCode(String provinceCode) {
            this.provinceCode = provinceCode;
            return this;
        }
        public String getProvinceCode() {
            return this.provinceCode;
        }

    }

    public static class StartRenderingSessionResponseBodyPortMappings extends TeaModel {
        /**
         * <p>The public port or port range, such as 22. For a port range, separate the start port and end port with a forward slash (/), for example, 10/20.</p>
         * 
         * <strong>example:</strong>
         * <p>10013/10020</p>
         */
        @NameInMap("ExternalPort")
        public String externalPort;

        /**
         * <p>The internal port or port range. The internal port corresponds to the public port on a one-to-one basis. For a port range, separate the start port and end port with a forward slash (/), for example, 10/20.</p>
         * 
         * <strong>example:</strong>
         * <p>49008/49015</p>
         */
        @NameInMap("InternalPort")
        public String internalPort;

        public static StartRenderingSessionResponseBodyPortMappings build(java.util.Map<String, ?> map) throws Exception {
            StartRenderingSessionResponseBodyPortMappings self = new StartRenderingSessionResponseBodyPortMappings();
            return TeaModel.build(map, self);
        }

        public StartRenderingSessionResponseBodyPortMappings setExternalPort(String externalPort) {
            this.externalPort = externalPort;
            return this;
        }
        public String getExternalPort() {
            return this.externalPort;
        }

        public StartRenderingSessionResponseBodyPortMappings setInternalPort(String internalPort) {
            this.internalPort = internalPort;
            return this;
        }
        public String getInternalPort() {
            return this.internalPort;
        }

    }

    public static class StartRenderingSessionResponseBodyStateInfo extends TeaModel {
        /**
         * <p>The state description.</p>
         * 
         * <strong>example:</strong>
         * <p>Session starting</p>
         */
        @NameInMap("Comment")
        public String comment;

        /**
         * <p>The session state.</p>
         * 
         * <strong>example:</strong>
         * <p>SessionStarting</p>
         */
        @NameInMap("State")
        public String state;

        /**
         * <p>The time when the state was last updated. The value is a UTC time in the YYYY-MM-DDTHH:mmZ format based on the ISO 8601 standard.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-05-06T06:37Z</p>
         */
        @NameInMap("UpdateTime")
        public String updateTime;

        public static StartRenderingSessionResponseBodyStateInfo build(java.util.Map<String, ?> map) throws Exception {
            StartRenderingSessionResponseBodyStateInfo self = new StartRenderingSessionResponseBodyStateInfo();
            return TeaModel.build(map, self);
        }

        public StartRenderingSessionResponseBodyStateInfo setComment(String comment) {
            this.comment = comment;
            return this;
        }
        public String getComment() {
            return this.comment;
        }

        public StartRenderingSessionResponseBodyStateInfo setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public StartRenderingSessionResponseBodyStateInfo setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

    }

}
