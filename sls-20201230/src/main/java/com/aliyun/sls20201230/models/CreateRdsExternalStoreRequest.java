// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class CreateRdsExternalStoreRequest extends TeaModel {
    /**
     * <p>The name of the external store. The name must be unique in a project and must be different from Logstore names.</p>
     */
    @NameInMap("externalStoreName")
    public String externalStoreName;

    /**
     * <p>The parameter struct.</p>
     */
    @NameInMap("parameter")
    public CreateRdsExternalStoreRequestParameter parameter;

    /**
     * <p>The storage type. Set the value to rds-vpc, which indicates an ApsaraDB RDS for MySQL database in a virtual private cloud (VPC).</p>
     */
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
        /**
         * <p>The name of the database in the ApsaraDB RDS for MySQL instance.</p>
         */
        @NameInMap("db")
        public String db;

        /**
         * <p>The internal or public endpoint of the ApsaraDB RDS for MySQL instance.</p>
         */
        @NameInMap("host")
        public String host;

        /**
         * <p>The ID of the ApsaraDB RDS for MySQL instance.</p>
         */
        @NameInMap("instance-id")
        public String instanceId;

        /**
         * <p>The password that is used to log on to the ApsaraDB RDS for MySQL instance.</p>
         */
        @NameInMap("password")
        public String password;

        /**
         * <p>The internal or public port of the ApsaraDB RDS for MySQL instance.</p>
         */
        @NameInMap("port")
        public String port;

        /**
         * <p>The region where the ApsaraDB RDS for MySQL instance resides. Valid values: cn-qingdao, cn-beijing, and cn-hangzhou.</p>
         */
        @NameInMap("region")
        public String region;

        /**
         * <p>The name of the database table in the ApsaraDB RDS for MySQL instance.</p>
         */
        @NameInMap("table")
        public String table;

        /**
         * <p>The username that is used to log on to the ApsaraDB RDS for MySQL instance.</p>
         */
        @NameInMap("username")
        public String username;

        /**
         * <p>The ID of the VPC to which the ApsaraDB RDS for MySQL instance belongs.</p>
         */
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
