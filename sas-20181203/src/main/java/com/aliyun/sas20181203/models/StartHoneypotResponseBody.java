// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class StartHoneypotResponseBody extends TeaModel {
    /**
     * <p>The information about the honeypot.</p>
     */
    @NameInMap("Data")
    public StartHoneypotResponseBodyData data;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>20456DD5-5CBF-5015-9173-12CA4246B***</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static StartHoneypotResponseBody build(java.util.Map<String, ?> map) throws Exception {
        StartHoneypotResponseBody self = new StartHoneypotResponseBody();
        return TeaModel.build(map, self);
    }

    public StartHoneypotResponseBody setData(StartHoneypotResponseBodyData data) {
        this.data = data;
        return this;
    }
    public StartHoneypotResponseBodyData getData() {
        return this.data;
    }

    public StartHoneypotResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class StartHoneypotResponseBodyData extends TeaModel {
        /**
         * <p>The name of the management node to which the honeypot belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>managerNodename</p>
         */
        @NameInMap("ControlNodeName")
        public String controlNodeName;

        /**
         * <p>The ID of the honeypot.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("HoneypotId")
        public String honeypotId;

        /**
         * <p>The display name of the image.</p>
         * 
         * <strong>example:</strong>
         * <p>Webmin</p>
         */
        @NameInMap("HoneypotImageDisplayName")
        public String honeypotImageDisplayName;

        /**
         * <p>The name of the image that is used for the honeypot.</p>
         * 
         * <strong>example:</strong>
         * <p>tcp_proxy</p>
         */
        @NameInMap("HoneypotImageName")
        public String honeypotImageName;

        /**
         * <p>The custom name of the honeypot.</p>
         * 
         * <strong>example:</strong>
         * <p>ruoyi</p>
         */
        @NameInMap("HoneypotName")
        public String honeypotName;

        /**
         * <p>The ID of the management node.</p>
         * 
         * <strong>example:</strong>
         * <p>a882e590-b87b-45a6-87b9-d0a3e5a0****</p>
         */
        @NameInMap("NodeId")
        public String nodeId;

        /**
         * <p>The ID of the custom configuration for the honeypot.</p>
         * 
         * <strong>example:</strong>
         * <p>ddh3731641137fe4b72b245346a2721d4b6tdgg3731641137fe4b72b245346a2721***</p>
         */
        @NameInMap("PresetId")
        public String presetId;

        /**
         * <p>The statuses of the honeypots.</p>
         */
        @NameInMap("State")
        public java.util.List<String> state;

        public static StartHoneypotResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            StartHoneypotResponseBodyData self = new StartHoneypotResponseBodyData();
            return TeaModel.build(map, self);
        }

        public StartHoneypotResponseBodyData setControlNodeName(String controlNodeName) {
            this.controlNodeName = controlNodeName;
            return this;
        }
        public String getControlNodeName() {
            return this.controlNodeName;
        }

        public StartHoneypotResponseBodyData setHoneypotId(String honeypotId) {
            this.honeypotId = honeypotId;
            return this;
        }
        public String getHoneypotId() {
            return this.honeypotId;
        }

        public StartHoneypotResponseBodyData setHoneypotImageDisplayName(String honeypotImageDisplayName) {
            this.honeypotImageDisplayName = honeypotImageDisplayName;
            return this;
        }
        public String getHoneypotImageDisplayName() {
            return this.honeypotImageDisplayName;
        }

        public StartHoneypotResponseBodyData setHoneypotImageName(String honeypotImageName) {
            this.honeypotImageName = honeypotImageName;
            return this;
        }
        public String getHoneypotImageName() {
            return this.honeypotImageName;
        }

        public StartHoneypotResponseBodyData setHoneypotName(String honeypotName) {
            this.honeypotName = honeypotName;
            return this;
        }
        public String getHoneypotName() {
            return this.honeypotName;
        }

        public StartHoneypotResponseBodyData setNodeId(String nodeId) {
            this.nodeId = nodeId;
            return this;
        }
        public String getNodeId() {
            return this.nodeId;
        }

        public StartHoneypotResponseBodyData setPresetId(String presetId) {
            this.presetId = presetId;
            return this;
        }
        public String getPresetId() {
            return this.presetId;
        }

        public StartHoneypotResponseBodyData setState(java.util.List<String> state) {
            this.state = state;
            return this;
        }
        public java.util.List<String> getState() {
            return this.state;
        }

    }

}
