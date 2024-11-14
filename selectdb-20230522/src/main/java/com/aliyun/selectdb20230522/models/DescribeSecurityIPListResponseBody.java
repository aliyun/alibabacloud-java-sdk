// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.selectdb20230522.models;

import com.aliyun.tea.*;

public class DescribeSecurityIPListResponseBody extends TeaModel {
    /**
     * <p>The instance ID.</p>
     * 
     * <strong>example:</strong>
     * <p>selectdb-cn-7213cjv****</p>
     */
    @NameInMap("DBInstanceName")
    public String DBInstanceName;

    /**
     * <p>The details about each IP address whitelist returned.</p>
     */
    @NameInMap("GroupItems")
    public java.util.List<DescribeSecurityIPListResponseBodyGroupItems> groupItems;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>5CBE044D-4594-525D-AC65-E988553D853E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeSecurityIPListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSecurityIPListResponseBody self = new DescribeSecurityIPListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSecurityIPListResponseBody setDBInstanceName(String DBInstanceName) {
        this.DBInstanceName = DBInstanceName;
        return this;
    }
    public String getDBInstanceName() {
        return this.DBInstanceName;
    }

    public DescribeSecurityIPListResponseBody setGroupItems(java.util.List<DescribeSecurityIPListResponseBodyGroupItems> groupItems) {
        this.groupItems = groupItems;
        return this;
    }
    public java.util.List<DescribeSecurityIPListResponseBodyGroupItems> getGroupItems() {
        return this.groupItems;
    }

    public DescribeSecurityIPListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeSecurityIPListResponseBodyGroupItems extends TeaModel {
        /**
         * <p>The IP address type. Valid values:</p>
         * <ul>
         * <li>ipv4</li>
         * <li>ipv6 (not supported)</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ipv4</p>
         */
        @NameInMap("AecurityIPType")
        public String aecurityIPType;

        /**
         * <p>The name of the whitelist.</p>
         * 
         * <strong>example:</strong>
         * <p>group1</p>
         */
        @NameInMap("GroupName")
        public String groupName;

        /**
         * <p>The tag of the whitelist.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;&quot;</p>
         */
        @NameInMap("GroupTag")
        public String groupTag;

        /**
         * <p>The IP addresses in the whitelist. Multiple IP addresses are separated by commas (,).</p>
         * 
         * <strong>example:</strong>
         * <p>127.0.XX.XX</p>
         */
        @NameInMap("SecurityIPList")
        public String securityIPList;

        /**
         * <p>The network type of the whitelist.</p>
         * 
         * <strong>example:</strong>
         * <p>mix</p>
         */
        @NameInMap("WhitelistNetType")
        public String whitelistNetType;

        public static DescribeSecurityIPListResponseBodyGroupItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeSecurityIPListResponseBodyGroupItems self = new DescribeSecurityIPListResponseBodyGroupItems();
            return TeaModel.build(map, self);
        }

        public DescribeSecurityIPListResponseBodyGroupItems setAecurityIPType(String aecurityIPType) {
            this.aecurityIPType = aecurityIPType;
            return this;
        }
        public String getAecurityIPType() {
            return this.aecurityIPType;
        }

        public DescribeSecurityIPListResponseBodyGroupItems setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public DescribeSecurityIPListResponseBodyGroupItems setGroupTag(String groupTag) {
            this.groupTag = groupTag;
            return this;
        }
        public String getGroupTag() {
            return this.groupTag;
        }

        public DescribeSecurityIPListResponseBodyGroupItems setSecurityIPList(String securityIPList) {
            this.securityIPList = securityIPList;
            return this;
        }
        public String getSecurityIPList() {
            return this.securityIPList;
        }

        public DescribeSecurityIPListResponseBodyGroupItems setWhitelistNetType(String whitelistNetType) {
            this.whitelistNetType = whitelistNetType;
            return this;
        }
        public String getWhitelistNetType() {
            return this.whitelistNetType;
        }

    }

}
