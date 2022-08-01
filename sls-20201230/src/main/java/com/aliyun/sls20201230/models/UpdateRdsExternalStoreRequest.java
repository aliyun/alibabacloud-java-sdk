// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class UpdateRdsExternalStoreRequest extends TeaModel {
    @NameInMap("externalStoreName")
    public String externalStoreName;

    @NameInMap("parameter")
    public UpdateRdsExternalStoreRequestParameter parameter;

    @NameInMap("storeType")
    public String storeType;

    public static UpdateRdsExternalStoreRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateRdsExternalStoreRequest self = new UpdateRdsExternalStoreRequest();
        return TeaModel.build(map, self);
    }

    public UpdateRdsExternalStoreRequest setExternalStoreName(String externalStoreName) {
        this.externalStoreName = externalStoreName;
        return this;
    }
    public String getExternalStoreName() {
        return this.externalStoreName;
    }

    public UpdateRdsExternalStoreRequest setParameter(UpdateRdsExternalStoreRequestParameter parameter) {
        this.parameter = parameter;
        return this;
    }
    public UpdateRdsExternalStoreRequestParameter getParameter() {
        return this.parameter;
    }

    public UpdateRdsExternalStoreRequest setStoreType(String storeType) {
        this.storeType = storeType;
        return this;
    }
    public String getStoreType() {
        return this.storeType;
    }

    public static class UpdateRdsExternalStoreRequestParameter extends TeaModel {
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

        public static UpdateRdsExternalStoreRequestParameter build(java.util.Map<String, ?> map) throws Exception {
            UpdateRdsExternalStoreRequestParameter self = new UpdateRdsExternalStoreRequestParameter();
            return TeaModel.build(map, self);
        }

        public UpdateRdsExternalStoreRequestParameter setDb(String db) {
            this.db = db;
            return this;
        }
        public String getDb() {
            return this.db;
        }

        public UpdateRdsExternalStoreRequestParameter setHost(String host) {
            this.host = host;
            return this;
        }
        public String getHost() {
            return this.host;
        }

        public UpdateRdsExternalStoreRequestParameter setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public UpdateRdsExternalStoreRequestParameter setPassword(String password) {
            this.password = password;
            return this;
        }
        public String getPassword() {
            return this.password;
        }

        public UpdateRdsExternalStoreRequestParameter setPort(String port) {
            this.port = port;
            return this;
        }
        public String getPort() {
            return this.port;
        }

        public UpdateRdsExternalStoreRequestParameter setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public UpdateRdsExternalStoreRequestParameter setTable(String table) {
            this.table = table;
            return this;
        }
        public String getTable() {
            return this.table;
        }

        public UpdateRdsExternalStoreRequestParameter setUsername(String username) {
            this.username = username;
            return this;
        }
        public String getUsername() {
            return this.username;
        }

        public UpdateRdsExternalStoreRequestParameter setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

    }

}
