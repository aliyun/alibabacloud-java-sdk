// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class ListApproveCommandsResponseBody extends TeaModel {
    @NameInMap("ApproveCommands")
    public java.util.List<ListApproveCommandsResponseBodyApproveCommands> approveCommands;

    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("ApproveCommandId")
        public String approveCommandId;

        @NameInMap("AssetAccountName")
        public String assetAccountName;

        @NameInMap("AssetIp")
        public String assetIp;

        @NameInMap("AssetName")
        public String assetName;

        @NameInMap("ClientIp")
        public String clientIp;

        @NameInMap("ClientUser")
        public String clientUser;

        @NameInMap("Command")
        public String command;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("ProtocolName")
        public String protocolName;

        @NameInMap("SessionId")
        public String sessionId;

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
