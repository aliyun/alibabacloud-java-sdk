// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class DescribeIstioGatewayRoutesResponseBody extends TeaModel {
    /**
     * <p>The routing rules.</p>
     */
    @NameInMap("ManagementRoutes")
    public java.util.List<DescribeIstioGatewayRoutesResponseBodyManagementRoutes> managementRoutes;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>31d3a0f0-07ed-4f6e-9004-1804498c****</p>
     */
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
        /**
         * <p>The name of the ASM gateway.</p>
         * 
         * <strong>example:</strong>
         * <p>ingressgateway</p>
         */
        @NameInMap("ASMGatewayName")
        public String ASMGatewayName;

        /**
         * <p>The description of the routing rule.</p>
         * 
         * <strong>example:</strong>
         * <p>demo route</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>Destination hosts list.</p>
         */
        @NameInMap("DestinationHost")
        public java.util.List<String> destinationHost;

        /**
         * <p>Destination subset list.</p>
         */
        @NameInMap("DestinationSubSet")
        public java.util.List<String> destinationSubSet;

        /**
         * <p>The namespace.</p>
         * 
         * <strong>example:</strong>
         * <p>istio-demo</p>
         */
        @NameInMap("Namespace")
        public String namespace;

        /**
         * <p>The priority of the routing rule. The value of this parameter is an integer. A smaller value indicates a higher priority.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Priority")
        public Integer priority;

        /**
         * <p>The name of the routing rule.</p>
         * 
         * <strong>example:</strong>
         * <p>http-route</p>
         */
        @NameInMap("RouteName")
        public String routeName;

        /**
         * <p>The path that is used to match request URLs.</p>
         * 
         * <strong>example:</strong>
         * <p>/reviews/v1</p>
         */
        @NameInMap("RoutePath")
        public String routePath;

        /**
         * <p>The status of the routing rule. Valid values:</p>
         * <ul>
         * <li><code>0</code>: The routing rule is valid.</li>
         * <li><code>1</code>: The routing rule is invalid.</li>
         * <li><code>2</code>: An error occurs during the creation or update of the routing rule.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
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

        public DescribeIstioGatewayRoutesResponseBodyManagementRoutes setDestinationHost(java.util.List<String> destinationHost) {
            this.destinationHost = destinationHost;
            return this;
        }
        public java.util.List<String> getDestinationHost() {
            return this.destinationHost;
        }

        public DescribeIstioGatewayRoutesResponseBodyManagementRoutes setDestinationSubSet(java.util.List<String> destinationSubSet) {
            this.destinationSubSet = destinationSubSet;
            return this;
        }
        public java.util.List<String> getDestinationSubSet() {
            return this.destinationSubSet;
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
