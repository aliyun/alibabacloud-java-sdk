// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeAccountMaskingPrivilegeResponseBody extends TeaModel {
    @NameInMap("Data")
    public DescribeAccountMaskingPrivilegeResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeAccountMaskingPrivilegeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAccountMaskingPrivilegeResponseBody self = new DescribeAccountMaskingPrivilegeResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAccountMaskingPrivilegeResponseBody setData(DescribeAccountMaskingPrivilegeResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeAccountMaskingPrivilegeResponseBodyData getData() {
        return this.data;
    }

    public DescribeAccountMaskingPrivilegeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeAccountMaskingPrivilegeResponseBodyDataUserPrivilege extends TeaModel {
        @NameInMap("ExpireTime")
        public String expireTime;

        @NameInMap("Privilege")
        public String privilege;

        @NameInMap("UserName")
        public String userName;

        public static DescribeAccountMaskingPrivilegeResponseBodyDataUserPrivilege build(java.util.Map<String, ?> map) throws Exception {
            DescribeAccountMaskingPrivilegeResponseBodyDataUserPrivilege self = new DescribeAccountMaskingPrivilegeResponseBodyDataUserPrivilege();
            return TeaModel.build(map, self);
        }

        public DescribeAccountMaskingPrivilegeResponseBodyDataUserPrivilege setExpireTime(String expireTime) {
            this.expireTime = expireTime;
            return this;
        }
        public String getExpireTime() {
            return this.expireTime;
        }

        public DescribeAccountMaskingPrivilegeResponseBodyDataUserPrivilege setPrivilege(String privilege) {
            this.privilege = privilege;
            return this;
        }
        public String getPrivilege() {
            return this.privilege;
        }

        public DescribeAccountMaskingPrivilegeResponseBodyDataUserPrivilege setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

    }

    public static class DescribeAccountMaskingPrivilegeResponseBodyData extends TeaModel {
        @NameInMap("UserPrivilege")
        public java.util.List<DescribeAccountMaskingPrivilegeResponseBodyDataUserPrivilege> userPrivilege;

        public static DescribeAccountMaskingPrivilegeResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeAccountMaskingPrivilegeResponseBodyData self = new DescribeAccountMaskingPrivilegeResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeAccountMaskingPrivilegeResponseBodyData setUserPrivilege(java.util.List<DescribeAccountMaskingPrivilegeResponseBodyDataUserPrivilege> userPrivilege) {
            this.userPrivilege = userPrivilege;
            return this;
        }
        public java.util.List<DescribeAccountMaskingPrivilegeResponseBodyDataUserPrivilege> getUserPrivilege() {
            return this.userPrivilege;
        }

    }

}
