// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryODPInstancesUsersResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("Data")
    public java.util.List<QueryODPInstancesUsersResponseBodyData> data;

    public static QueryODPInstancesUsersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryODPInstancesUsersResponseBody self = new QueryODPInstancesUsersResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryODPInstancesUsersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryODPInstancesUsersResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryODPInstancesUsersResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public QueryODPInstancesUsersResponseBody setData(java.util.List<QueryODPInstancesUsersResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<QueryODPInstancesUsersResponseBodyData> getData() {
        return this.data;
    }

    public static class QueryODPInstancesUsersResponseBodyDataPrivilegedSchemas extends TeaModel {
        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("Password")
        public String password;

        @NameInMap("Privilege")
        public String privilege;

        @NameInMap("SchemaName")
        public String schemaName;

        @NameInMap("Username")
        public String username;

        public static QueryODPInstancesUsersResponseBodyDataPrivilegedSchemas build(java.util.Map<String, ?> map) throws Exception {
            QueryODPInstancesUsersResponseBodyDataPrivilegedSchemas self = new QueryODPInstancesUsersResponseBodyDataPrivilegedSchemas();
            return TeaModel.build(map, self);
        }

        public QueryODPInstancesUsersResponseBodyDataPrivilegedSchemas setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public QueryODPInstancesUsersResponseBodyDataPrivilegedSchemas setPassword(String password) {
            this.password = password;
            return this;
        }
        public String getPassword() {
            return this.password;
        }

        public QueryODPInstancesUsersResponseBodyDataPrivilegedSchemas setPrivilege(String privilege) {
            this.privilege = privilege;
            return this;
        }
        public String getPrivilege() {
            return this.privilege;
        }

        public QueryODPInstancesUsersResponseBodyDataPrivilegedSchemas setSchemaName(String schemaName) {
            this.schemaName = schemaName;
            return this;
        }
        public String getSchemaName() {
            return this.schemaName;
        }

        public QueryODPInstancesUsersResponseBodyDataPrivilegedSchemas setUsername(String username) {
            this.username = username;
            return this;
        }
        public String getUsername() {
            return this.username;
        }

    }

    public static class QueryODPInstancesUsersResponseBodyData extends TeaModel {
        @NameInMap("Description")
        public String description;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("Password")
        public String password;

        @NameInMap("Username")
        public String username;

        @NameInMap("UserType")
        public String userType;

        @NameInMap("PrivilegedSchemas")
        public java.util.List<QueryODPInstancesUsersResponseBodyDataPrivilegedSchemas> privilegedSchemas;

        public static QueryODPInstancesUsersResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryODPInstancesUsersResponseBodyData self = new QueryODPInstancesUsersResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryODPInstancesUsersResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public QueryODPInstancesUsersResponseBodyData setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public QueryODPInstancesUsersResponseBodyData setPassword(String password) {
            this.password = password;
            return this;
        }
        public String getPassword() {
            return this.password;
        }

        public QueryODPInstancesUsersResponseBodyData setUsername(String username) {
            this.username = username;
            return this;
        }
        public String getUsername() {
            return this.username;
        }

        public QueryODPInstancesUsersResponseBodyData setUserType(String userType) {
            this.userType = userType;
            return this;
        }
        public String getUserType() {
            return this.userType;
        }

        public QueryODPInstancesUsersResponseBodyData setPrivilegedSchemas(java.util.List<QueryODPInstancesUsersResponseBodyDataPrivilegedSchemas> privilegedSchemas) {
            this.privilegedSchemas = privilegedSchemas;
            return this;
        }
        public java.util.List<QueryODPInstancesUsersResponseBodyDataPrivilegedSchemas> getPrivilegedSchemas() {
            return this.privilegedSchemas;
        }

    }

}
