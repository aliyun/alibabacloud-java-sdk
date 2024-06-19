// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class DescribeSecurityIpsResponseBody extends TeaModel {
    @NameInMap("Data")
    public DescribeSecurityIpsResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>14036EBE-CF2E-44DB-ACE9-AC6157D3A6FC</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static DescribeSecurityIpsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSecurityIpsResponseBody self = new DescribeSecurityIpsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSecurityIpsResponseBody setData(DescribeSecurityIpsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeSecurityIpsResponseBodyData getData() {
        return this.data;
    }

    public DescribeSecurityIpsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeSecurityIpsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSecurityIpsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeSecurityIpsResponseBodyDataGroupItems extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>defaultGroup</p>
         */
        @NameInMap("GroupName")
        public String groupName;

        /**
         * <strong>example:</strong>
         * <p>127.0.0.1,172.168.0.0</p>
         */
        @NameInMap("SecurityIPList")
        public String securityIPList;

        public static DescribeSecurityIpsResponseBodyDataGroupItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeSecurityIpsResponseBodyDataGroupItems self = new DescribeSecurityIpsResponseBodyDataGroupItems();
            return TeaModel.build(map, self);
        }

        public DescribeSecurityIpsResponseBodyDataGroupItems setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public DescribeSecurityIpsResponseBodyDataGroupItems setSecurityIPList(String securityIPList) {
            this.securityIPList = securityIPList;
            return this;
        }
        public String getSecurityIPList() {
            return this.securityIPList;
        }

    }

    public static class DescribeSecurityIpsResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>pxc-hzjasd****</p>
         */
        @NameInMap("DBInstanceName")
        public String DBInstanceName;

        @NameInMap("GroupItems")
        public java.util.List<DescribeSecurityIpsResponseBodyDataGroupItems> groupItems;

        public static DescribeSecurityIpsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeSecurityIpsResponseBodyData self = new DescribeSecurityIpsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeSecurityIpsResponseBodyData setDBInstanceName(String DBInstanceName) {
            this.DBInstanceName = DBInstanceName;
            return this;
        }
        public String getDBInstanceName() {
            return this.DBInstanceName;
        }

        public DescribeSecurityIpsResponseBodyData setGroupItems(java.util.List<DescribeSecurityIpsResponseBodyDataGroupItems> groupItems) {
            this.groupItems = groupItems;
            return this;
        }
        public java.util.List<DescribeSecurityIpsResponseBodyDataGroupItems> getGroupItems() {
            return this.groupItems;
        }

    }

}
