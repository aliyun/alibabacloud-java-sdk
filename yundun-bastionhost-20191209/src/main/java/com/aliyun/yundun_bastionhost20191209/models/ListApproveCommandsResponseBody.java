// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class ListApproveCommandsResponseBody extends TeaModel {
    /**
     * <p>The commands to be reviewed.</p>
     */
    @NameInMap("ApproveCommands")
    public java.util.List<ListApproveCommandsResponseBodyApproveCommands> approveCommands;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>E3EF7711-766D-5888-997B-EFBA76809229</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of commands to be reviewed.</p>
     * 
     * <strong>example:</strong>
     * <p>15</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    public static ListApproveCommandsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListApproveCommandsResponseBody self = new ListApproveCommandsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListApproveCommandsResponseBody setApproveCommands(java.util.List<ListApproveCommandsResponseBodyApproveCommands> approveCommands) {
        this.approveCommands = approveCommands;
        return this;
    }
    public java.util.List<ListApproveCommandsResponseBodyApproveCommands> getApproveCommands() {
        return this.approveCommands;
    }

    public ListApproveCommandsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListApproveCommandsResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListApproveCommandsResponseBodyApproveCommands extends TeaModel {
        /**
         * <p>The ID of the command to be reviewed.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ApproveCommandId")
        public String approveCommandId;

        /**
         * <p>The username of the asset account that is used for O\&amp;M.</p>
         * 
         * <strong>example:</strong>
         * <p>root</p>
         */
        @NameInMap("AssetAccountName")
        public String assetAccountName;

        /**
         * <p>The IP address of the asset for O\&amp;M.</p>
         * 
         * <strong>example:</strong>
         * <p>10.167.XX.XX</p>
         */
        @NameInMap("AssetIp")
        public String assetIp;

        /**
         * <p>The name of the asset.</p>
         * 
         * <strong>example:</strong>
         * <p>poros-test</p>
         */
        @NameInMap("AssetName")
        public String assetName;

        /**
         * <p>The source IP address from which the application is submitted.</p>
         * 
         * <strong>example:</strong>
         * <p>172.18.XX.XX</p>
         */
        @NameInMap("ClientIp")
        public String clientIp;

        /**
         * <p>The Bastionhost user who submitted the O\&amp;M application.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("ClientUser")
        public String clientUser;

        /**
         * <p>The command to be reviewed.</p>
         * 
         * <strong>example:</strong>
         * <p>/bin/bash</p>
         */
        @NameInMap("Command")
        public String command;

        /**
         * <p>The time when the O\&amp;M application was submitted. The value is a UNIX timestamp. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1679393152</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The O\&amp;M protocol.</p>
         * 
         * <strong>example:</strong>
         * <p>SSH</p>
         */
        @NameInMap("ProtocolName")
        public String protocolName;

        /**
         * <p>The ID of the O\&amp;M session that triggered the review.</p>
         * 
         * <strong>example:</strong>
         * <p>95f873ab64a76d5b0000000000004d5e</p>
         */
        @NameInMap("SessionId")
        public String sessionId;

        /**
         * <p>The status of the review. Valid values: <strong>Wait</strong>: The command is pending review.</p>
         * 
         * <strong>example:</strong>
         * <p>Wait</p>
         */
        @NameInMap("State")
        public String state;

        public static ListApproveCommandsResponseBodyApproveCommands build(java.util.Map<String, ?> map) throws Exception {
            ListApproveCommandsResponseBodyApproveCommands self = new ListApproveCommandsResponseBodyApproveCommands();
            return TeaModel.build(map, self);
        }

        public ListApproveCommandsResponseBodyApproveCommands setApproveCommandId(String approveCommandId) {
            this.approveCommandId = approveCommandId;
            return this;
        }
        public String getApproveCommandId() {
            return this.approveCommandId;
        }

        public ListApproveCommandsResponseBodyApproveCommands setAssetAccountName(String assetAccountName) {
            this.assetAccountName = assetAccountName;
            return this;
        }
        public String getAssetAccountName() {
            return this.assetAccountName;
        }

        public ListApproveCommandsResponseBodyApproveCommands setAssetIp(String assetIp) {
            this.assetIp = assetIp;
            return this;
        }
        public String getAssetIp() {
            return this.assetIp;
        }

        public ListApproveCommandsResponseBodyApproveCommands setAssetName(String assetName) {
            this.assetName = assetName;
            return this;
        }
        public String getAssetName() {
            return this.assetName;
        }

        public ListApproveCommandsResponseBodyApproveCommands setClientIp(String clientIp) {
            this.clientIp = clientIp;
            return this;
        }
        public String getClientIp() {
            return this.clientIp;
        }

        public ListApproveCommandsResponseBodyApproveCommands setClientUser(String clientUser) {
            this.clientUser = clientUser;
            return this;
        }
        public String getClientUser() {
            return this.clientUser;
        }

        public ListApproveCommandsResponseBodyApproveCommands setCommand(String command) {
            this.command = command;
            return this;
        }
        public String getCommand() {
            return this.command;
        }

        public ListApproveCommandsResponseBodyApproveCommands setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListApproveCommandsResponseBodyApproveCommands setProtocolName(String protocolName) {
            this.protocolName = protocolName;
            return this;
        }
        public String getProtocolName() {
            return this.protocolName;
        }

        public ListApproveCommandsResponseBodyApproveCommands setSessionId(String sessionId) {
            this.sessionId = sessionId;
            return this;
        }
        public String getSessionId() {
            return this.sessionId;
        }

        public ListApproveCommandsResponseBodyApproveCommands setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

    }

}
