// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class ModifyAppRecordTemplateRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ac7N****</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <strong>example:</strong>
     * <p>53200b81-b761-4c10-842a-a0726d97xxxx</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("RecordTemplate")
    public ModifyAppRecordTemplateRequestRecordTemplate recordTemplate;

    public static ModifyAppRecordTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyAppRecordTemplateRequest self = new ModifyAppRecordTemplateRequest();
        return TeaModel.build(map, self);
    }

    public ModifyAppRecordTemplateRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public ModifyAppRecordTemplateRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public ModifyAppRecordTemplateRequest setRecordTemplate(ModifyAppRecordTemplateRequestRecordTemplate recordTemplate) {
        this.recordTemplate = recordTemplate;
        return this;
    }
    public ModifyAppRecordTemplateRequestRecordTemplate getRecordTemplate() {
        return this.recordTemplate;
    }

    public static class ModifyAppRecordTemplateRequestRecordTemplate extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>180</p>
         */
        @NameInMap("DelayStopTime")
        public Integer delayStopTime;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>record/{AppId}/{ChannelId}<em>{TaskId}/{EscapedStartTime}</em>{EscapedEndTime}</p>
         */
        @NameInMap("FilePrefix")
        public String filePrefix;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1800</p>
         */
        @NameInMap("FileSplitInterval")
        public Integer fileSplitInterval;

        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("Formats")
        public java.util.List<String> formats;

        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("LayoutIds")
        public java.util.List<String> layoutIds;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("MediaEncode")
        public Integer mediaEncode;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>模版</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2xh6****</p>
         */
        @NameInMap("TemplateId")
        public String templateId;

        public static ModifyAppRecordTemplateRequestRecordTemplate build(java.util.Map<String, ?> map) throws Exception {
            ModifyAppRecordTemplateRequestRecordTemplate self = new ModifyAppRecordTemplateRequestRecordTemplate();
            return TeaModel.build(map, self);
        }

        public ModifyAppRecordTemplateRequestRecordTemplate setDelayStopTime(Integer delayStopTime) {
            this.delayStopTime = delayStopTime;
            return this;
        }
        public Integer getDelayStopTime() {
            return this.delayStopTime;
        }

        public ModifyAppRecordTemplateRequestRecordTemplate setFilePrefix(String filePrefix) {
            this.filePrefix = filePrefix;
            return this;
        }
        public String getFilePrefix() {
            return this.filePrefix;
        }

        public ModifyAppRecordTemplateRequestRecordTemplate setFileSplitInterval(Integer fileSplitInterval) {
            this.fileSplitInterval = fileSplitInterval;
            return this;
        }
        public Integer getFileSplitInterval() {
            return this.fileSplitInterval;
        }

        public ModifyAppRecordTemplateRequestRecordTemplate setFormats(java.util.List<String> formats) {
            this.formats = formats;
            return this;
        }
        public java.util.List<String> getFormats() {
            return this.formats;
        }

        public ModifyAppRecordTemplateRequestRecordTemplate setLayoutIds(java.util.List<String> layoutIds) {
            this.layoutIds = layoutIds;
            return this;
        }
        public java.util.List<String> getLayoutIds() {
            return this.layoutIds;
        }

        public ModifyAppRecordTemplateRequestRecordTemplate setMediaEncode(Integer mediaEncode) {
            this.mediaEncode = mediaEncode;
            return this;
        }
        public Integer getMediaEncode() {
            return this.mediaEncode;
        }

        public ModifyAppRecordTemplateRequestRecordTemplate setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ModifyAppRecordTemplateRequestRecordTemplate setTemplateId(String templateId) {
            this.templateId = templateId;
            return this;
        }
        public String getTemplateId() {
            return this.templateId;
        }

    }

}
