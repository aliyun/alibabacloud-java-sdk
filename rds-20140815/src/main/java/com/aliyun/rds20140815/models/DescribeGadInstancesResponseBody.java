// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeGadInstancesResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("GadInstances")
    public java.util.List<DescribeGadInstancesResponseBodyGadInstances> gadInstances;

    public static DescribeGadInstancesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeGadInstancesResponseBody self = new DescribeGadInstancesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeGadInstancesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeGadInstancesResponseBody setGadInstances(java.util.List<DescribeGadInstancesResponseBodyGadInstances> gadInstances) {
        this.gadInstances = gadInstances;
        return this;
    }
    public java.util.List<DescribeGadInstancesResponseBodyGadInstances> getGadInstances() {
        return this.gadInstances;
    }

    public static class DescribeGadInstancesResponseBodyGadInstancesGadInstanceMembers extends TeaModel {
        @NameInMap("DBInstanceID")
        public String DBInstanceID;

        @NameInMap("Engine")
        public String engine;

        @NameInMap("EngineVersion")
        public String engineVersion;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("Role")
        public String role;

        @NameInMap("Status")
        public String status;

        @NameInMap("DtsInstance")
        public String dtsInstance;

        public static DescribeGadInstancesResponseBodyGadInstancesGadInstanceMembers build(java.util.Map<String, ?> map) throws Exception {
            DescribeGadInstancesResponseBodyGadInstancesGadInstanceMembers self = new DescribeGadInstancesResponseBodyGadInstancesGadInstanceMembers();
            return TeaModel.build(map, self);
        }

        public DescribeGadInstancesResponseBodyGadInstancesGadInstanceMembers setDBInstanceID(String DBInstanceID) {
            this.DBInstanceID = DBInstanceID;
            return this;
        }
        public String getDBInstanceID() {
            return this.DBInstanceID;
        }

        public DescribeGadInstancesResponseBodyGadInstancesGadInstanceMembers setEngine(String engine) {
            this.engine = engine;
            return this;
        }
        public String getEngine() {
            return this.engine;
        }

        public DescribeGadInstancesResponseBodyGadInstancesGadInstanceMembers setEngineVersion(String engineVersion) {
            this.engineVersion = engineVersion;
            return this;
        }
        public String getEngineVersion() {
            return this.engineVersion;
        }

        public DescribeGadInstancesResponseBodyGadInstancesGadInstanceMembers setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeGadInstancesResponseBodyGadInstancesGadInstanceMembers setRole(String role) {
            this.role = role;
            return this;
        }
        public String getRole() {
            return this.role;
        }

        public DescribeGadInstancesResponseBodyGadInstancesGadInstanceMembers setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeGadInstancesResponseBodyGadInstancesGadInstanceMembers setDtsInstance(String dtsInstance) {
            this.dtsInstance = dtsInstance;
            return this;
        }
        public String getDtsInstance() {
            return this.dtsInstance;
        }

    }

    public static class DescribeGadInstancesResponseBodyGadInstances extends TeaModel {
        @NameInMap("GadInstanceName")
        public String gadInstanceName;

        @NameInMap("Description")
        public String description;

        @NameInMap("Status")
        public String status;

        @NameInMap("CreationTime")
        public String creationTime;

        @NameInMap("ModificationTime")
        public String modificationTime;

        @NameInMap("GadInstanceMembers")
        public java.util.List<DescribeGadInstancesResponseBodyGadInstancesGadInstanceMembers> gadInstanceMembers;

        @NameInMap("Service")
        public String service;

        public static DescribeGadInstancesResponseBodyGadInstances build(java.util.Map<String, ?> map) throws Exception {
            DescribeGadInstancesResponseBodyGadInstances self = new DescribeGadInstancesResponseBodyGadInstances();
            return TeaModel.build(map, self);
        }

        public DescribeGadInstancesResponseBodyGadInstances setGadInstanceName(String gadInstanceName) {
            this.gadInstanceName = gadInstanceName;
            return this;
        }
        public String getGadInstanceName() {
            return this.gadInstanceName;
        }

        public DescribeGadInstancesResponseBodyGadInstances setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeGadInstancesResponseBodyGadInstances setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeGadInstancesResponseBodyGadInstances setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public DescribeGadInstancesResponseBodyGadInstances setModificationTime(String modificationTime) {
            this.modificationTime = modificationTime;
            return this;
        }
        public String getModificationTime() {
            return this.modificationTime;
        }

        public DescribeGadInstancesResponseBodyGadInstances setGadInstanceMembers(java.util.List<DescribeGadInstancesResponseBodyGadInstancesGadInstanceMembers> gadInstanceMembers) {
            this.gadInstanceMembers = gadInstanceMembers;
            return this;
        }
        public java.util.List<DescribeGadInstancesResponseBodyGadInstancesGadInstanceMembers> getGadInstanceMembers() {
            return this.gadInstanceMembers;
        }

        public DescribeGadInstancesResponseBodyGadInstances setService(String service) {
            this.service = service;
            return this;
        }
        public String getService() {
            return this.service;
        }

    }

}
