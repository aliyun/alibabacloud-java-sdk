// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class CreateApplicationGroupResponseBody extends TeaModel {
    /**
     * <p>The information about the application group.</p>
     */
    @NameInMap("ApplicationGroup")
    public CreateApplicationGroupResponseBodyApplicationGroup applicationGroup;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateApplicationGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateApplicationGroupResponseBody self = new CreateApplicationGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateApplicationGroupResponseBody setApplicationGroup(CreateApplicationGroupResponseBodyApplicationGroup applicationGroup) {
        this.applicationGroup = applicationGroup;
        return this;
    }
    public CreateApplicationGroupResponseBodyApplicationGroup getApplicationGroup() {
        return this.applicationGroup;
    }

    public CreateApplicationGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CreateApplicationGroupResponseBodyApplicationGroup extends TeaModel {
        /**
         * <p>The application name.</p>
         */
        @NameInMap("ApplicationName")
        public String applicationName;

        /**
         * <p>The ID of the application group in CloudMonitor.</p>
         */
        @NameInMap("CmsGroupId")
        public String cmsGroupId;

        /**
         * <p>The time when the application group was created.</p>
         */
        @NameInMap("CreateDate")
        public String createDate;

        /**
         * <p>The ID of the region in which the related sources reside.</p>
         */
        @NameInMap("DeployRegionId")
        public String deployRegionId;

        /**
         * <p>The description of the application group.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The key of the tag.</p>
         */
        @NameInMap("ImportTagKey")
        public String importTagKey;

        /**
         * <p>The value of the tag.</p>
         */
        @NameInMap("ImportTagValue")
        public String importTagValue;

        /**
         * <p>The name of the application group.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The time when the application group was updated.</p>
         */
        @NameInMap("UpdateDate")
        public String updateDate;

        public static CreateApplicationGroupResponseBodyApplicationGroup build(java.util.Map<String, ?> map) throws Exception {
            CreateApplicationGroupResponseBodyApplicationGroup self = new CreateApplicationGroupResponseBodyApplicationGroup();
            return TeaModel.build(map, self);
        }

        public CreateApplicationGroupResponseBodyApplicationGroup setApplicationName(String applicationName) {
            this.applicationName = applicationName;
            return this;
        }
        public String getApplicationName() {
            return this.applicationName;
        }

        public CreateApplicationGroupResponseBodyApplicationGroup setCmsGroupId(String cmsGroupId) {
            this.cmsGroupId = cmsGroupId;
            return this;
        }
        public String getCmsGroupId() {
            return this.cmsGroupId;
        }

        public CreateApplicationGroupResponseBodyApplicationGroup setCreateDate(String createDate) {
            this.createDate = createDate;
            return this;
        }
        public String getCreateDate() {
            return this.createDate;
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

        public CreateApplicationGroupResponseBodyApplicationGroup setImportTagKey(String importTagKey) {
            this.importTagKey = importTagKey;
            return this;
        }
        public String getImportTagKey() {
            return this.importTagKey;
        }

        public CreateApplicationGroupResponseBodyApplicationGroup setImportTagValue(String importTagValue) {
            this.importTagValue = importTagValue;
            return this;
        }
        public String getImportTagValue() {
            return this.importTagValue;
        }

        public CreateApplicationGroupResponseBodyApplicationGroup setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateApplicationGroupResponseBodyApplicationGroup setUpdateDate(String updateDate) {
            this.updateDate = updateDate;
            return this;
        }
        public String getUpdateDate() {
            return this.updateDate;
        }

    }

}
