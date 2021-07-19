// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class CreateApplicationGroupResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ApplicationGroup")
    public CreateApplicationGroupResponseBodyApplicationGroup applicationGroup;

    public static CreateApplicationGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateApplicationGroupResponseBody self = new CreateApplicationGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateApplicationGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateApplicationGroupResponseBody setApplicationGroup(CreateApplicationGroupResponseBodyApplicationGroup applicationGroup) {
        this.applicationGroup = applicationGroup;
        return this;
    }
    public CreateApplicationGroupResponseBodyApplicationGroup getApplicationGroup() {
        return this.applicationGroup;
    }

    public static class CreateApplicationGroupResponseBodyApplicationGroup extends TeaModel {
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

        public static CreateApplicationGroupResponseBodyApplicationGroup build(java.util.Map<String, ?> map) throws Exception {
            CreateApplicationGroupResponseBodyApplicationGroup self = new CreateApplicationGroupResponseBodyApplicationGroup();
            return TeaModel.build(map, self);
        }

        public CreateApplicationGroupResponseBodyApplicationGroup setDeployRegionId(String deployRegionId) {
            this.deployRegionId = deployRegionId;
            return this;
        }
        public String getDeployRegionId() {
            return this.deployRegionId;
        }

        public CreateApplicationGroupResponseBodyApplicationGroup setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public CreateApplicationGroupResponseBodyApplicationGroup setUpdatedDate(String updatedDate) {
            this.updatedDate = updatedDate;
            return this;
        }
        public String getUpdatedDate() {
            return this.updatedDate;
        }

        public CreateApplicationGroupResponseBodyApplicationGroup setCreatedDate(String createdDate) {
            this.createdDate = createdDate;
            return this;
        }
        public String getCreatedDate() {
            return this.createdDate;
        }

        public CreateApplicationGroupResponseBodyApplicationGroup setApplicationName(String applicationName) {
            this.applicationName = applicationName;
            return this;
        }
        public String getApplicationName() {
            return this.applicationName;
        }

        public CreateApplicationGroupResponseBodyApplicationGroup setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateApplicationGroupResponseBodyApplicationGroup setEnvironment(String environment) {
            this.environment = environment;
            return this;
        }
        public String getEnvironment() {
            return this.environment;
        }

        public CreateApplicationGroupResponseBodyApplicationGroup setCreateType(String createType) {
            this.createType = createType;
            return this;
        }
        public String getCreateType() {
            return this.createType;
        }

        public CreateApplicationGroupResponseBodyApplicationGroup setScalingGroupId(String scalingGroupId) {
            this.scalingGroupId = scalingGroupId;
            return this;
        }
        public String getScalingGroupId() {
            return this.scalingGroupId;
        }

        public CreateApplicationGroupResponseBodyApplicationGroup setImportClusterId(String importClusterId) {
            this.importClusterId = importClusterId;
            return this;
        }
        public String getImportClusterId() {
            return this.importClusterId;
        }

    }

}
