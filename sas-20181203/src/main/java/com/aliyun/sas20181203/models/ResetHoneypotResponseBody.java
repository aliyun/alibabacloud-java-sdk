// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ResetHoneypotResponseBody extends TeaModel {
    /**
     * <p>The information about the honeypot.</p>
     */
    @NameInMap("Data")
    public ResetHoneypotResponseBodyData data;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>A57C711B-AA15-55B2-8F61-4D09CEXXXXX</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ResetHoneypotResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ResetHoneypotResponseBody self = new ResetHoneypotResponseBody();
        return TeaModel.build(map, self);
    }

    public ResetHoneypotResponseBody setData(ResetHoneypotResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ResetHoneypotResponseBodyData getData() {
        return this.data;
    }

    public ResetHoneypotResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ResetHoneypotResponseBodyData extends TeaModel {
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
         * <p>9bf8cd373112263d4bc102fc5dba9d9f812ee05d4d35c487d330d52e937f****</p>
         */
        @NameInMap("HoneypotId")
        public String honeypotId;

        /**
         * <p>The display name of the image.</p>
         * 
         * <strong>example:</strong>
         * <p>RuoYi</p>
         */
        @NameInMap("HoneypotImageDisplayName")
        public String honeypotImageDisplayName;

        /**
         * <p>The name of the image that is used for the honeypot.</p>
         * 
         * <strong>example:</strong>
         * <p>ruoyi</p>
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
         * <p>868a7579-00b5-4a74-999d-8bd3f411****</p>
         */
        @NameInMap("PresetId")
        public String presetId;

        /**
         * <p>The statuses of the honeypots.</p>
         */
        @NameInMap("State")
        public java.util.List<String> state;

        public static ResetHoneypotResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ResetHoneypotResponseBodyData self = new ResetHoneypotResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ResetHoneypotResponseBodyData setControlNodeName(String controlNodeName) {
            this.controlNodeName = controlNodeName;
            return this;
        }
        public String getControlNodeName() {
            return this.controlNodeName;
        }

        public ResetHoneypotResponseBodyData setHoneypotId(String honeypotId) {
            this.honeypotId = honeypotId;
            return this;
        }
        public String getHoneypotId() {
            return this.honeypotId;
        }

        public ResetHoneypotResponseBodyData setHoneypotImageDisplayName(String honeypotImageDisplayName) {
            this.honeypotImageDisplayName = honeypotImageDisplayName;
            return this;
        }
        public String getHoneypotImageDisplayName() {
            return this.honeypotImageDisplayName;
        }

        public ResetHoneypotResponseBodyData setHoneypotImageName(String honeypotImageName) {
            this.honeypotImageName = honeypotImageName;
            return this;
        }
        public String getHoneypotImageName() {
            return this.honeypotImageName;
        }

        public ResetHoneypotResponseBodyData setHoneypotName(String honeypotName) {
            this.honeypotName = honeypotName;
            return this;
        }
        public String getHoneypotName() {
            return this.honeypotName;
        }

        public ResetHoneypotResponseBodyData setNodeId(String nodeId) {
            this.nodeId = nodeId;
            return this;
        }
        public String getNodeId() {
            return this.nodeId;
        }

        public ResetHoneypotResponseBodyData setPresetId(String presetId) {
            this.presetId = presetId;
            return this;
        }
        public String getPresetId() {
            return this.presetId;
        }

        public ResetHoneypotResponseBodyData setState(java.util.List<String> state) {
            this.state = state;
            return this;
        }
        public java.util.List<String> getState() {
            return this.state;
        }

    }

}
