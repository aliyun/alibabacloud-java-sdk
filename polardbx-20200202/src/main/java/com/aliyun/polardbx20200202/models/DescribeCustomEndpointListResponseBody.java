// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class DescribeCustomEndpointListResponseBody extends TeaModel {
    @NameInMap("Data")
    public DescribeCustomEndpointListResponseBodyData data;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>6352AC16-76BF-5135-B1EA-ED49293526E6</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeCustomEndpointListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeCustomEndpointListResponseBody self = new DescribeCustomEndpointListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeCustomEndpointListResponseBody setData(DescribeCustomEndpointListResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeCustomEndpointListResponseBodyData getData() {
        return this.data;
    }

    public DescribeCustomEndpointListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeCustomEndpointListResponseBodyDataEndpoints extends TeaModel {
        /**
         * <p>[\&quot;pxc-i-vb1sqa7llp\&quot;,\&quot;pxc-i-bemprx50ad\&quot;]</p>
         */
        @NameInMap("CnNames")
        public java.util.List<String> cnNames;

        /**
         * <strong>example:</strong>
         * <p>pxc-shra****zq0j01.polarx.rds.aliyuncs.com</p>
         */
        @NameInMap("ConnectionString")
        public String connectionString;

        /**
         * <strong>example:</strong>
         * <p>pxe-b6e****o4pfap1s</p>
         */
        @NameInMap("CustomEndpointId")
        public String customEndpointId;

        /**
         * <strong>example:</strong>
         * <p>pxc-hz****zoxherr7</p>
         */
        @NameInMap("DBInstanceName")
        public String DBInstanceName;

        /**
         * <strong>example:</strong>
         * <p>Name</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("NodeAutoEnter")
        public String nodeAutoEnter;

        /**
         * <strong>example:</strong>
         * <p>same_azone_as_last</p>
         */
        @NameInMap("NodeRole")
        public String nodeRole;

        /**
         * <strong>example:</strong>
         * <p>3306</p>
         */
        @NameInMap("Port")
        public Integer port;

        /**
         * <strong>example:</strong>
         * <p>created</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <strong>example:</strong>
         * <p>vsw-8vbkw****5yh4nrd639ih</p>
         */
        @NameInMap("VSwitchId")
        public String vSwitchId;

        /**
         * <strong>example:</strong>
         * <p>vpc-uf61h****dj1zg5fqp5x7</p>
         */
        @NameInMap("VpcId")
        public String vpcId;

        public static DescribeCustomEndpointListResponseBodyDataEndpoints build(java.util.Map<String, ?> map) throws Exception {
            DescribeCustomEndpointListResponseBodyDataEndpoints self = new DescribeCustomEndpointListResponseBodyDataEndpoints();
            return TeaModel.build(map, self);
        }

        public DescribeCustomEndpointListResponseBodyDataEndpoints setCnNames(java.util.List<String> cnNames) {
            this.cnNames = cnNames;
            return this;
        }
        public java.util.List<String> getCnNames() {
            return this.cnNames;
        }

        public DescribeCustomEndpointListResponseBodyDataEndpoints setConnectionString(String connectionString) {
            this.connectionString = connectionString;
            return this;
        }
        public String getConnectionString() {
            return this.connectionString;
        }

        public DescribeCustomEndpointListResponseBodyDataEndpoints setCustomEndpointId(String customEndpointId) {
            this.customEndpointId = customEndpointId;
            return this;
        }
        public String getCustomEndpointId() {
            return this.customEndpointId;
        }

        public DescribeCustomEndpointListResponseBodyDataEndpoints setDBInstanceName(String DBInstanceName) {
            this.DBInstanceName = DBInstanceName;
            return this;
        }
        public String getDBInstanceName() {
            return this.DBInstanceName;
        }

        public DescribeCustomEndpointListResponseBodyDataEndpoints setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeCustomEndpointListResponseBodyDataEndpoints setNodeAutoEnter(String nodeAutoEnter) {
            this.nodeAutoEnter = nodeAutoEnter;
            return this;
        }
        public String getNodeAutoEnter() {
            return this.nodeAutoEnter;
        }

        public DescribeCustomEndpointListResponseBodyDataEndpoints setNodeRole(String nodeRole) {
            this.nodeRole = nodeRole;
            return this;
        }
        public String getNodeRole() {
            return this.nodeRole;
        }

        public DescribeCustomEndpointListResponseBodyDataEndpoints setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

        public DescribeCustomEndpointListResponseBodyDataEndpoints setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeCustomEndpointListResponseBodyDataEndpoints setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        public DescribeCustomEndpointListResponseBodyDataEndpoints setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

    }

    public static class DescribeCustomEndpointListResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("CanDeleteCount")
        public Integer canDeleteCount;

        @NameInMap("Endpoints")
        public java.util.List<DescribeCustomEndpointListResponseBodyDataEndpoints> endpoints;

        public static DescribeCustomEndpointListResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeCustomEndpointListResponseBodyData self = new DescribeCustomEndpointListResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeCustomEndpointListResponseBodyData setCanDeleteCount(Integer canDeleteCount) {
            this.canDeleteCount = canDeleteCount;
            return this;
        }
        public Integer getCanDeleteCount() {
            return this.canDeleteCount;
        }

        public DescribeCustomEndpointListResponseBodyData setEndpoints(java.util.List<DescribeCustomEndpointListResponseBodyDataEndpoints> endpoints) {
            this.endpoints = endpoints;
            return this;
        }
        public java.util.List<DescribeCustomEndpointListResponseBodyDataEndpoints> getEndpoints() {
            return this.endpoints;
        }

    }

}
