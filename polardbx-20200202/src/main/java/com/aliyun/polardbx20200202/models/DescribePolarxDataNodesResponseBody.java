// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class DescribePolarxDataNodesResponseBody extends TeaModel {
    @NameInMap("DBInstanceDataNodes")
    public java.util.List<DescribePolarxDataNodesResponseBodyDBInstanceDataNodes> DBInstanceDataNodes;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <strong>example:</strong>
     * <p>BD99340C-4A45-548B-****-27584B0BCFFF</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("TotalNumber")
    public Integer totalNumber;

    public static DescribePolarxDataNodesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribePolarxDataNodesResponseBody self = new DescribePolarxDataNodesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribePolarxDataNodesResponseBody setDBInstanceDataNodes(java.util.List<DescribePolarxDataNodesResponseBodyDBInstanceDataNodes> DBInstanceDataNodes) {
        this.DBInstanceDataNodes = DBInstanceDataNodes;
        return this;
    }
    public java.util.List<DescribePolarxDataNodesResponseBodyDBInstanceDataNodes> getDBInstanceDataNodes() {
        return this.DBInstanceDataNodes;
    }

    public DescribePolarxDataNodesResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribePolarxDataNodesResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribePolarxDataNodesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribePolarxDataNodesResponseBody setTotalNumber(Integer totalNumber) {
        this.totalNumber = totalNumber;
        return this;
    }
    public Integer getTotalNumber() {
        return this.totalNumber;
    }

    public static class DescribePolarxDataNodesResponseBodyDBInstanceDataNodes extends TeaModel {
        @NameInMap("DBInstanceDescription")
        public String DBInstanceDescription;

        /**
         * <strong>example:</strong>
         * <p>pxc-hzrlcjc****sz9</p>
         */
        @NameInMap("DBInstanceId")
        public String DBInstanceId;

        /**
         * <strong>example:</strong>
         * <p>pxc-hzrp5m****04w4</p>
         */
        @NameInMap("DBInstanceName")
        public String DBInstanceName;

        public static DescribePolarxDataNodesResponseBodyDBInstanceDataNodes build(java.util.Map<String, ?> map) throws Exception {
            DescribePolarxDataNodesResponseBodyDBInstanceDataNodes self = new DescribePolarxDataNodesResponseBodyDBInstanceDataNodes();
            return TeaModel.build(map, self);
        }

        public DescribePolarxDataNodesResponseBodyDBInstanceDataNodes setDBInstanceDescription(String DBInstanceDescription) {
            this.DBInstanceDescription = DBInstanceDescription;
            return this;
        }
        public String getDBInstanceDescription() {
            return this.DBInstanceDescription;
        }

        public DescribePolarxDataNodesResponseBodyDBInstanceDataNodes setDBInstanceId(String DBInstanceId) {
            this.DBInstanceId = DBInstanceId;
            return this;
        }
        public String getDBInstanceId() {
            return this.DBInstanceId;
        }

        public DescribePolarxDataNodesResponseBodyDBInstanceDataNodes setDBInstanceName(String DBInstanceName) {
            this.DBInstanceName = DBInstanceName;
            return this;
        }
        public String getDBInstanceName() {
            return this.DBInstanceName;
        }

    }

}
