// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class GetApplicationGroupResponseBody extends TeaModel {
    @NameInMap("ApplicationGroup")
    public GetApplicationGroupResponseBodyApplicationGroup applicationGroup;

    @NameInMap("RequestId")
    public String requestId;

    public static GetApplicationGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetApplicationGroupResponseBody self = new GetApplicationGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public GetApplicationGroupResponseBody setApplicationGroup(GetApplicationGroupResponseBodyApplicationGroup applicationGroup) {
        this.applicationGroup = applicationGroup;
        return this;
    }
    public GetApplicationGroupResponseBodyApplicationGroup getApplicationGroup() {
        return this.applicationGroup;
    }

    public GetApplicationGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetApplicationGroupResponseBodyApplicationGroup extends TeaModel {
        @NameInMap("ApplicationName")
        public String applicationName;

        @NameInMap("CmsGroupId")
        public String cmsGroupId;

        @NameInMap("CreateDate")
        public String createDate;

        @NameInMap("DeployOutputs")
        public String deployOutputs;

        @NameInMap("DeployParameters")
        public String deployParameters;

        @NameInMap("DeployRegionId")
        public String deployRegionId;

        @NameInMap("Description")
        public String description;

        @NameInMap("ImportTagKey")
        public String importTagKey;

        @NameInMap("ImportTagValue")
        public String importTagValue;

        @NameInMap("Name")
        public String name;

        @NameInMap("Progress")
        public String progress;

        @NameInMap("Status")
        public String status;

        @NameInMap("StatusReason")
        public String statusReason;

        @NameInMap("UpdateDate")
        public String updateDate;

        public static GetApplicationGroupResponseBodyApplicationGroup build(java.util.Map<String, ?> map) throws Exception {
            GetApplicationGroupResponseBodyApplicationGroup self = new GetApplicationGroupResponseBodyApplicationGroup();
            return TeaModel.build(map, self);
        }

        public GetApplicationGroupResponseBodyApplicationGroup setApplicationName(String applicationName) {
            this.applicationName = applicationName;
            return this;
        }
        public String getApplicationName() {
            return this.applicationName;
        }

        public GetApplicationGroupResponseBodyApplicationGroup setCmsGroupId(String cmsGroupId) {
            this.cmsGroupId = cmsGroupId;
            return this;
        }
        public String getCmsGroupId() {
            return this.cmsGroupId;
        }

        public GetApplicationGroupResponseBodyApplicationGroup setCreateDate(String createDate) {
            this.createDate = createDate;
            return this;
        }
        public String getCreateDate() {
            return this.createDate;
        }

        public GetApplicationGroupResponseBodyApplicationGroup setDeployOutputs(String deployOutputs) {
            this.deployOutputs = deployOutputs;
            return this;
        }
        public String getDeployOutputs() {
            return this.deployOutputs;
        }

        public GetApplicationGroupResponseBodyApplicationGroup setDeployParameters(String deployParameters) {
            this.deployParameters = deployParameters;
            return this;
        }
        public String getDeployParameters() {
            return this.deployParameters;
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

        public GetApplicationGroupResponseBodyApplicationGroup setImportTagKey(String importTagKey) {
            this.importTagKey = importTagKey;
            return this;
        }
        public String getImportTagKey() {
            return this.importTagKey;
        }

        public GetApplicationGroupResponseBodyApplicationGroup setImportTagValue(String importTagValue) {
            this.importTagValue = importTagValue;
            return this;
        }
        public String getImportTagValue() {
            return this.importTagValue;
        }

        public GetApplicationGroupResponseBodyApplicationGroup setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetApplicationGroupResponseBodyApplicationGroup setProgress(String progress) {
            this.progress = progress;
            return this;
        }
        public String getProgress() {
            return this.progress;
        }

        public GetApplicationGroupResponseBodyApplicationGroup setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetApplicationGroupResponseBodyApplicationGroup setStatusReason(String statusReason) {
            this.statusReason = statusReason;
            return this;
        }
        public String getStatusReason() {
            return this.statusReason;
        }

        public GetApplicationGroupResponseBodyApplicationGroup setUpdateDate(String updateDate) {
            this.updateDate = updateDate;
            return this;
        }
        public String getUpdateDate() {
            return this.updateDate;
        }

    }

}
