// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.selectdb20230522.models;

import com.aliyun.tea.*;

public class DescribeSecurityIPListResponseBody extends TeaModel {
    @NameInMap("DBInstanceName")
    public String DBInstanceName;

    @NameInMap("GroupItems")
    public java.util.List<DescribeSecurityIPListResponseBodyGroupItems> groupItems;

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
        @NameInMap("AecurityIPType")
        public String aecurityIPType;

        @NameInMap("GroupName")
        public String groupName;

        @NameInMap("GroupTag")
        public String groupTag;

        @NameInMap("SecurityIPList")
        public String securityIPList;

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
