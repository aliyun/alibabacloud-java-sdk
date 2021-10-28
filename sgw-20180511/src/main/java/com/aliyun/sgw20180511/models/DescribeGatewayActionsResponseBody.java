// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sgw20180511.models;

import com.aliyun.tea.*;

public class DescribeGatewayActionsResponseBody extends TeaModel {
    @NameInMap("Actions")
    public DescribeGatewayActionsResponseBodyActions actions;

    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static DescribeGatewayActionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeGatewayActionsResponseBody self = new DescribeGatewayActionsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeGatewayActionsResponseBody setActions(DescribeGatewayActionsResponseBodyActions actions) {
        this.actions = actions;
        return this;
    }
    public DescribeGatewayActionsResponseBodyActions getActions() {
        return this.actions;
    }

    public DescribeGatewayActionsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeGatewayActionsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeGatewayActionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeGatewayActionsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeGatewayActionsResponseBodyActionsAction extends TeaModel {
        @NameInMap("AdLdap")
        public String adLdap;

        @NameInMap("Cache")
        public String cache;

        @NameInMap("Disk")
        public String disk;

        @NameInMap("GatewayId")
        public String gatewayId;

        @NameInMap("Monitor")
        public String monitor;

        @NameInMap("Self")
        public String self;

        @NameInMap("SmbUser")
        public String smbUser;

        @NameInMap("Target")
        public String target;

        public static DescribeGatewayActionsResponseBodyActionsAction build(java.util.Map<String, ?> map) throws Exception {
            DescribeGatewayActionsResponseBodyActionsAction self = new DescribeGatewayActionsResponseBodyActionsAction();
            return TeaModel.build(map, self);
        }

        public DescribeGatewayActionsResponseBodyActionsAction setAdLdap(String adLdap) {
            this.adLdap = adLdap;
            return this;
        }
        public String getAdLdap() {
            return this.adLdap;
        }

        public DescribeGatewayActionsResponseBodyActionsAction setCache(String cache) {
            this.cache = cache;
            return this;
        }
        public String getCache() {
            return this.cache;
        }

        public DescribeGatewayActionsResponseBodyActionsAction setDisk(String disk) {
            this.disk = disk;
            return this;
        }
        public String getDisk() {
            return this.disk;
        }

        public DescribeGatewayActionsResponseBodyActionsAction setGatewayId(String gatewayId) {
            this.gatewayId = gatewayId;
            return this;
        }
        public String getGatewayId() {
            return this.gatewayId;
        }

        public DescribeGatewayActionsResponseBodyActionsAction setMonitor(String monitor) {
            this.monitor = monitor;
            return this;
        }
        public String getMonitor() {
            return this.monitor;
        }

        public DescribeGatewayActionsResponseBodyActionsAction setSelf(String self) {
            this.self = self;
            return this;
        }
        public String getSelf() {
            return this.self;
        }

        public DescribeGatewayActionsResponseBodyActionsAction setSmbUser(String smbUser) {
            this.smbUser = smbUser;
            return this;
        }
        public String getSmbUser() {
            return this.smbUser;
        }

        public DescribeGatewayActionsResponseBodyActionsAction setTarget(String target) {
            this.target = target;
            return this;
        }
        public String getTarget() {
            return this.target;
        }

    }

    public static class DescribeGatewayActionsResponseBodyActions extends TeaModel {
        @NameInMap("Action")
        public java.util.List<DescribeGatewayActionsResponseBodyActionsAction> action;

        public static DescribeGatewayActionsResponseBodyActions build(java.util.Map<String, ?> map) throws Exception {
            DescribeGatewayActionsResponseBodyActions self = new DescribeGatewayActionsResponseBodyActions();
            return TeaModel.build(map, self);
        }

        public DescribeGatewayActionsResponseBodyActions setAction(java.util.List<DescribeGatewayActionsResponseBodyActionsAction> action) {
            this.action = action;
            return this;
        }
        public java.util.List<DescribeGatewayActionsResponseBodyActionsAction> getAction() {
            return this.action;
        }

    }

}
