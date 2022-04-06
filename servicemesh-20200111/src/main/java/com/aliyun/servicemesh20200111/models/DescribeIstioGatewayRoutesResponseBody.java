// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class DescribeIstioGatewayRoutesResponseBody extends TeaModel {
    @NameInMap("ManagementRoutes")
    public java.util.List<DescribeIstioGatewayRoutesResponseBodyManagementRoutes> managementRoutes;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeIstioGatewayRoutesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeIstioGatewayRoutesResponseBody self = new DescribeIstioGatewayRoutesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeIstioGatewayRoutesResponseBody setManagementRoutes(java.util.List<DescribeIstioGatewayRoutesResponseBodyManagementRoutes> managementRoutes) {
        this.managementRoutes = managementRoutes;
        return this;
    }
    public java.util.List<DescribeIstioGatewayRoutesResponseBodyManagementRoutes> getManagementRoutes() {
        return this.managementRoutes;
    }

    public DescribeIstioGatewayRoutesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeIstioGatewayRoutesResponseBodyManagementRoutes extends TeaModel {
        @NameInMap("ASMGatewayName")
        public String ASMGatewayName;

        @NameInMap("Description")
        public String description;

        @NameInMap("Namespace")
        public String namespace;

        @NameInMap("Priority")
        public Integer priority;

        @NameInMap("RouteName")
        public String routeName;

        @NameInMap("RoutePath")
        public String routePath;

        @NameInMap("Status")
        public Integer status;

        public static DescribeIstioGatewayRoutesResponseBodyManagementRoutes build(java.util.Map<String, ?> map) throws Exception {
            DescribeIstioGatewayRoutesResponseBodyManagementRoutes self = new DescribeIstioGatewayRoutesResponseBodyManagementRoutes();
            return TeaModel.build(map, self);
        }

        public DescribeIstioGatewayRoutesResponseBodyManagementRoutes setASMGatewayName(String ASMGatewayName) {
            this.ASMGatewayName = ASMGatewayName;
            return this;
        }
        public String getASMGatewayName() {
            return this.ASMGatewayName;
        }

        public DescribeIstioGatewayRoutesResponseBodyManagementRoutes setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeIstioGatewayRoutesResponseBodyManagementRoutes setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public DescribeIstioGatewayRoutesResponseBodyManagementRoutes setPriority(Integer priority) {
            this.priority = priority;
            return this;
        }
        public Integer getPriority() {
            return this.priority;
        }

        public DescribeIstioGatewayRoutesResponseBodyManagementRoutes setRouteName(String routeName) {
            this.routeName = routeName;
            return this;
        }
        public String getRouteName() {
            return this.routeName;
        }

        public DescribeIstioGatewayRoutesResponseBodyManagementRoutes setRoutePath(String routePath) {
            this.routePath = routePath;
            return this;
        }
        public String getRoutePath() {
            return this.routePath;
        }

        public DescribeIstioGatewayRoutesResponseBodyManagementRoutes setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

    }

}
