// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class GetApplicationGroupResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ApplicationGroup")
    public GetApplicationGroupResponseBodyApplicationGroup applicationGroup;

    public static GetApplicationGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetApplicationGroupResponseBody self = new GetApplicationGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public GetApplicationGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetApplicationGroupResponseBody setApplicationGroup(GetApplicationGroupResponseBodyApplicationGroup applicationGroup) {
        this.applicationGroup = applicationGroup;
        return this;
    }
    public GetApplicationGroupResponseBodyApplicationGroup getApplicationGroup() {
        return this.applicationGroup;
    }

    public static class GetApplicationGroupResponseBodyApplicationGroup extends TeaModel {
        @NameInMap("DeployRegionId")
        public String deployRegionId;

        @NameInMap("Description")
        public String description;

        @NameInMap("UpdatedDate")
        public String updatedDate;

        @NameInMap("CreatedDate")
        public String createdDate;

        @NameInMap("ApplicationName")
        public String applicationName;

        @NameInMap("Name")
        public String name;

        @NameInMap("Environment")
        public String environment;

        @NameInMap("CreateType")
        public String createType;

        @NameInMap("ScalingGroupId")
        public String scalingGroupId;

        @NameInMap("ImportClusterId")
        public String importClusterId;

        public static GetApplicationGroupResponseBodyApplicationGroup build(java.util.Map<String, ?> map) throws Exception {
            GetApplicationGroupResponseBodyApplicationGroup self = new GetApplicationGroupResponseBodyApplicationGroup();
            return TeaModel.build(map, self);
        }

        public GetApplicationGroupResponseBodyApplicationGroup setDeployRegionId(String deployRegionId) {
            this.deployRegionId = deployRegionId;
            return this;
        }
        public String getDeployRegionId() {
            return this.deployRegionId;
        }

        public GetApplicationGroupResponseBodyApplicationGroup setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetApplicationGroupResponseBodyApplicationGroup setUpdatedDate(String updatedDate) {
            this.updatedDate = updatedDate;
            return this;
        }
        public String getUpdatedDate() {
            return this.updatedDate;
        }

        public GetApplicationGroupResponseBodyApplicationGroup setCreatedDate(String createdDate) {
            this.createdDate = createdDate;
            return this;
        }
        public String getCreatedDate() {
            return this.createdDate;
        }

        public GetApplicationGroupResponseBodyApplicationGroup setApplicationName(String applicationName) {
            this.applicationName = applicationName;
            return this;
        }
        public String getApplicationName() {
            return this.applicationName;
        }

        public GetApplicationGroupResponseBodyApplicationGroup setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetApplicationGroupResponseBodyApplicationGroup setEnvironment(String environment) {
            this.environment = environment;
            return this;
        }
        public String getEnvironment() {
            return this.environment;
        }

        public GetApplicationGroupResponseBodyApplicationGroup setCreateType(String createType) {
            this.createType = createType;
            return this;
        }
        public String getCreateType() {
            return this.createType;
        }

        public GetApplicationGroupResponseBodyApplicationGroup setScalingGroupId(String scalingGroupId) {
            this.scalingGroupId = scalingGroupId;
            return this;
        }
        public String getScalingGroupId() {
            return this.scalingGroupId;
        }

        public GetApplicationGroupResponseBodyApplicationGroup setImportClusterId(String importClusterId) {
            this.importClusterId = importClusterId;
            return this;
        }
        public String getImportClusterId() {
            return this.importClusterId;
        }

    }

}
