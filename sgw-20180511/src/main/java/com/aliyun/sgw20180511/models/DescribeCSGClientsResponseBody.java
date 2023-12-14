// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sgw20180511.models;

import com.aliyun.tea.*;

public class DescribeCSGClientsResponseBody extends TeaModel {
    @NameInMap("Clients")
    public java.util.List<DescribeCSGClientsResponseBodyClients> clients;

    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeCSGClientsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeCSGClientsResponseBody self = new DescribeCSGClientsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeCSGClientsResponseBody setClients(java.util.List<DescribeCSGClientsResponseBodyClients> clients) {
        this.clients = clients;
        return this;
    }
    public java.util.List<DescribeCSGClientsResponseBodyClients> getClients() {
        return this.clients;
    }

    public DescribeCSGClientsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeCSGClientsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeCSGClientsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeCSGClientsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeCSGClientsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeCSGClientsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DescribeCSGClientsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeCSGClientsResponseBodyClients extends TeaModel {
        @NameInMap("ClientDeletionCommand")
        public String clientDeletionCommand;

        @NameInMap("ClientId")
        public String clientId;

        @NameInMap("ClientInstallationCommand")
        public String clientInstallationCommand;

        @NameInMap("ClientVersion")
        public String clientVersion;

        @NameInMap("EcsInstanceId")
        public String ecsInstanceId;

        @NameInMap("HostInstanceId")
        public String hostInstanceId;

        @NameInMap("LastHeartbeatTime")
        public Long lastHeartbeatTime;

        @NameInMap("Status")
        public String status;

        @NameInMap("VpcId")
        public String vpcId;

        @NameInMap("WorkDirectory")
        public String workDirectory;

        public static DescribeCSGClientsResponseBodyClients build(java.util.Map<String, ?> map) throws Exception {
            DescribeCSGClientsResponseBodyClients self = new DescribeCSGClientsResponseBodyClients();
            return TeaModel.build(map, self);
        }

        public DescribeCSGClientsResponseBodyClients setClientDeletionCommand(String clientDeletionCommand) {
            this.clientDeletionCommand = clientDeletionCommand;
            return this;
        }
        public String getClientDeletionCommand() {
            return this.clientDeletionCommand;
        }

        public DescribeCSGClientsResponseBodyClients setClientId(String clientId) {
            this.clientId = clientId;
            return this;
        }
        public String getClientId() {
            return this.clientId;
        }

        public DescribeCSGClientsResponseBodyClients setClientInstallationCommand(String clientInstallationCommand) {
            this.clientInstallationCommand = clientInstallationCommand;
            return this;
        }
        public String getClientInstallationCommand() {
            return this.clientInstallationCommand;
        }

        public DescribeCSGClientsResponseBodyClients setClientVersion(String clientVersion) {
            this.clientVersion = clientVersion;
            return this;
        }
        public String getClientVersion() {
            return this.clientVersion;
        }

        public DescribeCSGClientsResponseBodyClients setEcsInstanceId(String ecsInstanceId) {
            this.ecsInstanceId = ecsInstanceId;
            return this;
        }
        public String getEcsInstanceId() {
            return this.ecsInstanceId;
        }

        public DescribeCSGClientsResponseBodyClients setHostInstanceId(String hostInstanceId) {
            this.hostInstanceId = hostInstanceId;
            return this;
        }
        public String getHostInstanceId() {
            return this.hostInstanceId;
        }

        public DescribeCSGClientsResponseBodyClients setLastHeartbeatTime(Long lastHeartbeatTime) {
            this.lastHeartbeatTime = lastHeartbeatTime;
            return this;
        }
        public Long getLastHeartbeatTime() {
            return this.lastHeartbeatTime;
        }

        public DescribeCSGClientsResponseBodyClients setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeCSGClientsResponseBodyClients setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public DescribeCSGClientsResponseBodyClients setWorkDirectory(String workDirectory) {
            this.workDirectory = workDirectory;
            return this;
        }
        public String getWorkDirectory() {
            return this.workDirectory;
        }

    }

}
