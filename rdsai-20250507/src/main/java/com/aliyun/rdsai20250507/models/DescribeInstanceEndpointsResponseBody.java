// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rdsai20250507.models;

import com.aliyun.tea.*;

public class DescribeInstanceEndpointsResponseBody extends TeaModel {
    /**
     * <p>The information about the endpoints of the RDS instance.</p>
     */
    @NameInMap("DBInstanceEndpoints")
    public java.util.List<DescribeInstanceEndpointsResponseBodyDBInstanceEndpoints> DBInstanceEndpoints;

    /**
     * <p>The information about the endpoints of the RDS Supabase instance.</p>
     */
    @NameInMap("InstanceEndpoints")
    public java.util.List<DescribeInstanceEndpointsResponseBodyInstanceEndpoints> instanceEndpoints;

    /**
     * <p>The ID of the RDS Supabase instance.</p>
     * 
     * <strong>example:</strong>
     * <p>ra-supabase-8moov5lxba****</p>
     */
    @NameInMap("InstanceName")
    public String instanceName;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>32DEFB4A-861F-5D1D-ADD5-918E4FD7AB8C</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeInstanceEndpointsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceEndpointsResponseBody self = new DescribeInstanceEndpointsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceEndpointsResponseBody setDBInstanceEndpoints(java.util.List<DescribeInstanceEndpointsResponseBodyDBInstanceEndpoints> DBInstanceEndpoints) {
        this.DBInstanceEndpoints = DBInstanceEndpoints;
        return this;
    }
    public java.util.List<DescribeInstanceEndpointsResponseBodyDBInstanceEndpoints> getDBInstanceEndpoints() {
        return this.DBInstanceEndpoints;
    }

    public DescribeInstanceEndpointsResponseBody setInstanceEndpoints(java.util.List<DescribeInstanceEndpointsResponseBodyInstanceEndpoints> instanceEndpoints) {
        this.instanceEndpoints = instanceEndpoints;
        return this;
    }
    public java.util.List<DescribeInstanceEndpointsResponseBodyInstanceEndpoints> getInstanceEndpoints() {
        return this.instanceEndpoints;
    }

    public DescribeInstanceEndpointsResponseBody setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }
    public String getInstanceName() {
        return this.instanceName;
    }

    public DescribeInstanceEndpointsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeInstanceEndpointsResponseBodyDBInstanceEndpoints extends TeaModel {
        /**
         * <p>The endpoint of the RDS instance.</p>
         * 
         * <strong>example:</strong>
         * <p>pgm-xxxx.rds.aliyuncs.com</p>
         */
        @NameInMap("ConnectionString")
        public String connectionString;

        /**
         * <p>The network type of the RDS instance. Valid values:</p>
         * <ul>
         * <li><strong>public</strong>: Internet</li>
         * <li><strong>vpc</strong>: VPC</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>vpc</p>
         */
        @NameInMap("IpType")
        public String ipType;

        /**
         * <p>The port used to access the RDS instance.</p>
         * 
         * <strong>example:</strong>
         * <p>5432</p>
         */
        @NameInMap("Port")
        public String port;

        public static DescribeInstanceEndpointsResponseBodyDBInstanceEndpoints build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceEndpointsResponseBodyDBInstanceEndpoints self = new DescribeInstanceEndpointsResponseBodyDBInstanceEndpoints();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceEndpointsResponseBodyDBInstanceEndpoints setConnectionString(String connectionString) {
            this.connectionString = connectionString;
            return this;
        }
        public String getConnectionString() {
            return this.connectionString;
        }

        public DescribeInstanceEndpointsResponseBodyDBInstanceEndpoints setIpType(String ipType) {
            this.ipType = ipType;
            return this;
        }
        public String getIpType() {
            return this.ipType;
        }

        public DescribeInstanceEndpointsResponseBodyDBInstanceEndpoints setPort(String port) {
            this.port = port;
            return this;
        }
        public String getPort() {
            return this.port;
        }

    }

    public static class DescribeInstanceEndpointsResponseBodyInstanceEndpoints extends TeaModel {
        /**
         * <p>The endpoint of the RDS Supabase instance.</p>
         * 
         * <strong>example:</strong>
         * <p>8.152.XXX.XXX:8000</p>
         */
        @NameInMap("ConnectionString")
        public String connectionString;

        /**
         * <p>The IP address used to access the RDS Supabase instance.</p>
         * 
         * <strong>example:</strong>
         * <p>8.152.XXX.XXX</p>
         */
        @NameInMap("IP")
        public String IP;

        /**
         * <p>The network type of the RDS Supabase instance. Valid values:</p>
         * <ul>
         * <li><strong>public</strong>: Internet</li>
         * <li><strong>vpc</strong>: VPC</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>public</p>
         */
        @NameInMap("IpType")
        public String ipType;

        /**
         * <p>The port used to access the RDS Supabase instance.</p>
         * 
         * <strong>example:</strong>
         * <p>8000</p>
         */
        @NameInMap("Port")
        public String port;

        public static DescribeInstanceEndpointsResponseBodyInstanceEndpoints build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceEndpointsResponseBodyInstanceEndpoints self = new DescribeInstanceEndpointsResponseBodyInstanceEndpoints();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceEndpointsResponseBodyInstanceEndpoints setConnectionString(String connectionString) {
            this.connectionString = connectionString;
            return this;
        }
        public String getConnectionString() {
            return this.connectionString;
        }

        public DescribeInstanceEndpointsResponseBodyInstanceEndpoints setIP(String IP) {
            this.IP = IP;
            return this;
        }
        public String getIP() {
            return this.IP;
        }

        public DescribeInstanceEndpointsResponseBodyInstanceEndpoints setIpType(String ipType) {
            this.ipType = ipType;
            return this;
        }
        public String getIpType() {
            return this.ipType;
        }

        public DescribeInstanceEndpointsResponseBodyInstanceEndpoints setPort(String port) {
            this.port = port;
            return this;
        }
        public String getPort() {
            return this.port;
        }

    }

}
