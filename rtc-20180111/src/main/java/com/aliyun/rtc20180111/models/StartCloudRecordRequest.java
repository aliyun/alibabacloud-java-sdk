// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class StartCloudRecordRequest extends TeaModel {
    /**
     * <p>appId</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>channelName</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ChannelId")
    public String channelId;

    /**
     * <p>panes</p>
     */
    @NameInMap("Panes")
    public java.util.List<StartCloudRecordRequestPanes> panes;

    /**
     * <p>storageConfig</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("StorageConfig")
    public StartCloudRecordRequestStorageConfig storageConfig;

    /**
     * <p>taskId</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    /**
     * <p>templateId</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("TemplateId")
    public String templateId;

    public static StartCloudRecordRequest build(java.util.Map<String, ?> map) throws Exception {
        StartCloudRecordRequest self = new StartCloudRecordRequest();
        return TeaModel.build(map, self);
    }

    public StartCloudRecordRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public StartCloudRecordRequest setChannelId(String channelId) {
        this.channelId = channelId;
        return this;
    }
    public String getChannelId() {
        return this.channelId;
    }

    public StartCloudRecordRequest setPanes(java.util.List<StartCloudRecordRequestPanes> panes) {
        this.panes = panes;
        return this;
    }
    public java.util.List<StartCloudRecordRequestPanes> getPanes() {
        return this.panes;
    }

    public StartCloudRecordRequest setStorageConfig(StartCloudRecordRequestStorageConfig storageConfig) {
        this.storageConfig = storageConfig;
        return this;
    }
    public StartCloudRecordRequestStorageConfig getStorageConfig() {
        return this.storageConfig;
    }

    public StartCloudRecordRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public StartCloudRecordRequest setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

    public static class StartCloudRecordRequestPanes extends TeaModel {
        /**
         * <p>paneId</p>
         * <br>
         * <p>This parameter is required.</p>
         */
        @NameInMap("PaneId")
        public Integer paneId;

        /**
         * <p>sourceType</p>
         */
        @NameInMap("SourceType")
        public String sourceType;

        public static StartCloudRecordRequestPanes build(java.util.Map<String, ?> map) throws Exception {
            StartCloudRecordRequestPanes self = new StartCloudRecordRequestPanes();
            return TeaModel.build(map, self);
        }

        public StartCloudRecordRequestPanes setPaneId(Integer paneId) {
            this.paneId = paneId;
            return this;
        }
        public Integer getPaneId() {
            return this.paneId;
        }

        public StartCloudRecordRequestPanes setSourceType(String sourceType) {
            this.sourceType = sourceType;
            return this;
        }
        public String getSourceType() {
            return this.sourceType;
        }

    }

    public static class StartCloudRecordRequestStorageConfig extends TeaModel {
        /**
         * <p>accessKey</p>
         * <br>
         * <p>This parameter is required.</p>
         */
        @NameInMap("AccessKey")
        public String accessKey;

        /**
         * <p>bucket</p>
         * <br>
         * <p>This parameter is required.</p>
         */
        @NameInMap("Bucket")
        public String bucket;

        /**
         * <p>region</p>
         * <br>
         * <p>This parameter is required.</p>
         */
        @NameInMap("Region")
        public Integer region;

        /**
         * <p>secretKey</p>
         * <br>
         * <p>This parameter is required.</p>
         */
        @NameInMap("SecretKey")
        public String secretKey;

        /**
         * <p>vendor</p>
         * <br>
         * <p>This parameter is required.</p>
         */
        @NameInMap("Vendor")
        public Integer vendor;

        public static StartCloudRecordRequestStorageConfig build(java.util.Map<String, ?> map) throws Exception {
            StartCloudRecordRequestStorageConfig self = new StartCloudRecordRequestStorageConfig();
            return TeaModel.build(map, self);
        }

        public StartCloudRecordRequestStorageConfig setAccessKey(String accessKey) {
            this.accessKey = accessKey;
            return this;
        }
        public String getAccessKey() {
            return this.accessKey;
        }

        public StartCloudRecordRequestStorageConfig setBucket(String bucket) {
            this.bucket = bucket;
            return this;
        }
        public String getBucket() {
            return this.bucket;
        }

        public StartCloudRecordRequestStorageConfig setRegion(Integer region) {
            this.region = region;
            return this;
        }
        public Integer getRegion() {
            return this.region;
        }

        public StartCloudRecordRequestStorageConfig setSecretKey(String secretKey) {
            this.secretKey = secretKey;
            return this;
        }
        public String getSecretKey() {
            return this.secretKey;
        }

        public StartCloudRecordRequestStorageConfig setVendor(Integer vendor) {
            this.vendor = vendor;
            return this;
        }
        public Integer getVendor() {
            return this.vendor;
        }

    }

}
