// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeKmsAssociateResourcesResponseBody extends TeaModel {
    @NameInMap("AssociateDBInstances")
    public java.util.List<DescribeKmsAssociateResourcesResponseBodyAssociateDBInstances> associateDBInstances;

    @NameInMap("AssociateStatus")
    public Boolean associateStatus;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeKmsAssociateResourcesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeKmsAssociateResourcesResponseBody self = new DescribeKmsAssociateResourcesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeKmsAssociateResourcesResponseBody setAssociateDBInstances(java.util.List<DescribeKmsAssociateResourcesResponseBodyAssociateDBInstances> associateDBInstances) {
        this.associateDBInstances = associateDBInstances;
        return this;
    }
    public java.util.List<DescribeKmsAssociateResourcesResponseBodyAssociateDBInstances> getAssociateDBInstances() {
        return this.associateDBInstances;
    }

    public DescribeKmsAssociateResourcesResponseBody setAssociateStatus(Boolean associateStatus) {
        this.associateStatus = associateStatus;
        return this;
    }
    public Boolean getAssociateStatus() {
        return this.associateStatus;
    }

    public DescribeKmsAssociateResourcesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeKmsAssociateResourcesResponseBodyAssociateDBInstances extends TeaModel {
        @NameInMap("DBInstanceName")
        public String DBInstanceName;

        @NameInMap("Engine")
        public String engine;

        @NameInMap("KeyUsedBy")
        public String keyUsedBy;

        @NameInMap("Status")
        public String status;

        public static DescribeKmsAssociateResourcesResponseBodyAssociateDBInstances build(java.util.Map<String, ?> map) throws Exception {
            DescribeKmsAssociateResourcesResponseBodyAssociateDBInstances self = new DescribeKmsAssociateResourcesResponseBodyAssociateDBInstances();
            return TeaModel.build(map, self);
        }

        public DescribeKmsAssociateResourcesResponseBodyAssociateDBInstances setDBInstanceName(String DBInstanceName) {
            this.DBInstanceName = DBInstanceName;
            return this;
        }
        public String getDBInstanceName() {
            return this.DBInstanceName;
        }

        public DescribeKmsAssociateResourcesResponseBodyAssociateDBInstances setEngine(String engine) {
            this.engine = engine;
            return this;
        }
        public String getEngine() {
            return this.engine;
        }

        public DescribeKmsAssociateResourcesResponseBodyAssociateDBInstances setKeyUsedBy(String keyUsedBy) {
            this.keyUsedBy = keyUsedBy;
            return this;
        }
        public String getKeyUsedBy() {
            return this.keyUsedBy;
        }

        public DescribeKmsAssociateResourcesResponseBodyAssociateDBInstances setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
