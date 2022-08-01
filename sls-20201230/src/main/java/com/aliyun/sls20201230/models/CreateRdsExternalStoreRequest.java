// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class CreateRdsExternalStoreRequest extends TeaModel {
    @NameInMap("externalStoreName")
    public String externalStoreName;

    @NameInMap("parameter")
    public CreateRdsExternalStoreRequestParameter parameter;

    @NameInMap("storeType")
    public String storeType;

    public static CreateRdsExternalStoreRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateRdsExternalStoreRequest self = new CreateRdsExternalStoreRequest();
        return TeaModel.build(map, self);
    }

    public CreateRdsExternalStoreRequest setExternalStoreName(String externalStoreName) {
        this.externalStoreName = externalStoreName;
        return this;
    }
    public String getExternalStoreName() {
        return this.externalStoreName;
    }

    public CreateRdsExternalStoreRequest setParameter(CreateRdsExternalStoreRequestParameter parameter) {
        this.parameter = parameter;
        return this;
    }
    public CreateRdsExternalStoreRequestParameter getParameter() {
        return this.parameter;
    }

    public CreateRdsExternalStoreRequest setStoreType(String storeType) {
        this.storeType = storeType;
        return this;
    }
    public String getStoreType() {
        return this.storeType;
    }

    public static class CreateRdsExternalStoreRequestParameter extends TeaModel {
        @NameInMap("db")
        public String db;

        @NameInMap("host")
        public String host;

        @NameInMap("instance-id")
        public String instanceId;

        @NameInMap("password")
        public String password;

        @NameInMap("port")
        public String port;

        @NameInMap("region")
        public String region;

        @NameInMap("table")
        public String table;

        @NameInMap("username")
        public String username;

        @NameInMap("vpc-id")
        public String vpcId;

        public static CreateRdsExternalStoreRequestParameter build(java.util.Map<String, ?> map) throws Exception {
            CreateRdsExternalStoreRequestParameter self = new CreateRdsExternalStoreRequestParameter();
            return TeaModel.build(map, self);
        }

        public CreateRdsExternalStoreRequestParameter setDb(String db) {
            this.db = db;
            return this;
        }
        public String getDb() {
            return this.db;
        }

        public CreateRdsExternalStoreRequestParameter setHost(String host) {
            this.host = host;
            return this;
        }
        public String getHost() {
            return this.host;
        }

        public CreateRdsExternalStoreRequestParameter setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public CreateRdsExternalStoreRequestParameter setPassword(String password) {
            this.password = password;
            return this;
        }
        public String getPassword() {
            return this.password;
        }

        public CreateRdsExternalStoreRequestParameter setPort(String port) {
            this.port = port;
            return this;
        }
        public String getPort() {
            return this.port;
        }

        public CreateRdsExternalStoreRequestParameter setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public CreateRdsExternalStoreRequestParameter setTable(String table) {
            this.table = table;
            return this;
        }
        public String getTable() {
            return this.table;
        }

        public CreateRdsExternalStoreRequestParameter setUsername(String username) {
            this.username = username;
            return this;
        }
        public String getUsername() {
            return this.username;
        }

        public CreateRdsExternalStoreRequestParameter setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

    }

}
