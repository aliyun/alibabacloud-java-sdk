// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeDBClusterProxyResponseBody extends TeaModel {
    @NameInMap("ChildInstances")
    public java.util.List<DescribeDBClusterProxyResponseBodyChildInstances> childInstances;

    /**
     * <strong>example:</strong>
     * <p>pe-xxxxxxxxx</p>
     */
    @NameInMap("DBProxyClusterId")
    public String DBProxyClusterId;

    /**
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("DBProxyClusterNum")
    public Long DBProxyClusterNum;

    /**
     * <strong>example:</strong>
     * <p>ClassChanging</p>
     */
    @NameInMap("DBProxyClusterStatus")
    public String DBProxyClusterStatus;

    /**
     * <strong>example:</strong>
     * <p>30E11ED2-C922-5B96-BCC6-11EE8C484AC6</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeDBClusterProxyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBClusterProxyResponseBody self = new DescribeDBClusterProxyResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDBClusterProxyResponseBody setChildInstances(java.util.List<DescribeDBClusterProxyResponseBodyChildInstances> childInstances) {
        this.childInstances = childInstances;
        return this;
    }
    public java.util.List<DescribeDBClusterProxyResponseBodyChildInstances> getChildInstances() {
        return this.childInstances;
    }

    public DescribeDBClusterProxyResponseBody setDBProxyClusterId(String DBProxyClusterId) {
        this.DBProxyClusterId = DBProxyClusterId;
        return this;
    }
    public String getDBProxyClusterId() {
        return this.DBProxyClusterId;
    }

    public DescribeDBClusterProxyResponseBody setDBProxyClusterNum(Long DBProxyClusterNum) {
        this.DBProxyClusterNum = DBProxyClusterNum;
        return this;
    }
    public Long getDBProxyClusterNum() {
        return this.DBProxyClusterNum;
    }

    public DescribeDBClusterProxyResponseBody setDBProxyClusterStatus(String DBProxyClusterStatus) {
        this.DBProxyClusterStatus = DBProxyClusterStatus;
        return this;
    }
    public String getDBProxyClusterStatus() {
        return this.DBProxyClusterStatus;
    }

    public DescribeDBClusterProxyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeDBClusterProxyResponseBodyChildInstances extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>polar.mysql.g4.medium</p>
         */
        @NameInMap("DBNodeClass")
        public String DBNodeClass;

        /**
         * <strong>example:</strong>
         * <p>10.*.*10</p>
         */
        @NameInMap("DBNodeIP")
        public String DBNodeIP;

        /**
         * <strong>example:</strong>
         * <p>pi-wz97h479y364g9du7</p>
         */
        @NameInMap("DBNodeId")
        public String DBNodeId;

        /**
         * <strong>example:</strong>
         * <p>2450</p>
         */
        @NameInMap("DBNodePort")
        public String DBNodePort;

        /**
         * <strong>example:</strong>
         * <p>Running</p>
         */
        @NameInMap("DBNodeStatus")
        public String DBNodeStatus;

        /**
         * <strong>example:</strong>
         * <p>sh-lsf01-144-37</p>
         */
        @NameInMap("HostName")
        public String hostName;

        public static DescribeDBClusterProxyResponseBodyChildInstances build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBClusterProxyResponseBodyChildInstances self = new DescribeDBClusterProxyResponseBodyChildInstances();
            return TeaModel.build(map, self);
        }

        public DescribeDBClusterProxyResponseBodyChildInstances setDBNodeClass(String DBNodeClass) {
            this.DBNodeClass = DBNodeClass;
            return this;
        }
        public String getDBNodeClass() {
            return this.DBNodeClass;
        }

        public DescribeDBClusterProxyResponseBodyChildInstances setDBNodeIP(String DBNodeIP) {
            this.DBNodeIP = DBNodeIP;
            return this;
        }
        public String getDBNodeIP() {
            return this.DBNodeIP;
        }

        public DescribeDBClusterProxyResponseBodyChildInstances setDBNodeId(String DBNodeId) {
            this.DBNodeId = DBNodeId;
            return this;
        }
        public String getDBNodeId() {
            return this.DBNodeId;
        }

        public DescribeDBClusterProxyResponseBodyChildInstances setDBNodePort(String DBNodePort) {
            this.DBNodePort = DBNodePort;
            return this;
        }
        public String getDBNodePort() {
            return this.DBNodePort;
        }

        public DescribeDBClusterProxyResponseBodyChildInstances setDBNodeStatus(String DBNodeStatus) {
            this.DBNodeStatus = DBNodeStatus;
            return this;
        }
        public String getDBNodeStatus() {
            return this.DBNodeStatus;
        }

        public DescribeDBClusterProxyResponseBodyChildInstances setHostName(String hostName) {
            this.hostName = hostName;
            return this;
        }
        public String getHostName() {
            return this.hostName;
        }

    }

}
