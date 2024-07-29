// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class CreateAppRecordTemplateRequest extends TeaModel {
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
     * <p>123e4567-e89b-12d3-a456-42665544****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("RecordTemplate")
    public CreateAppRecordTemplateRequestRecordTemplate recordTemplate;

    public static CreateAppRecordTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAppRecordTemplateRequest self = new CreateAppRecordTemplateRequest();
        return TeaModel.build(map, self);
    }

    public CreateAppRecordTemplateRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public CreateAppRecordTemplateRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateAppRecordTemplateRequest setRecordTemplate(CreateAppRecordTemplateRequestRecordTemplate recordTemplate) {
        this.recordTemplate = recordTemplate;
        return this;
    }
    public CreateAppRecordTemplateRequestRecordTemplate getRecordTemplate() {
        return this.recordTemplate;
    }

    public static class CreateAppRecordTemplateRequestRecordTemplate extends TeaModel {
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

        public static CreateAppRecordTemplateRequestRecordTemplate build(java.util.Map<String, ?> map) throws Exception {
            CreateAppRecordTemplateRequestRecordTemplate self = new CreateAppRecordTemplateRequestRecordTemplate();
            return TeaModel.build(map, self);
        }

        public CreateAppRecordTemplateRequestRecordTemplate setDelayStopTime(Integer delayStopTime) {
            this.delayStopTime = delayStopTime;
            return this;
        }
        public Integer getDelayStopTime() {
            return this.delayStopTime;
        }

        public CreateAppRecordTemplateRequestRecordTemplate setFilePrefix(String filePrefix) {
            this.filePrefix = filePrefix;
            return this;
        }
        public String getFilePrefix() {
            return this.filePrefix;
        }

        public CreateAppRecordTemplateRequestRecordTemplate setFileSplitInterval(Integer fileSplitInterval) {
            this.fileSplitInterval = fileSplitInterval;
            return this;
        }
        public Integer getFileSplitInterval() {
            return this.fileSplitInterval;
        }

        public CreateAppRecordTemplateRequestRecordTemplate setFormats(java.util.List<String> formats) {
            this.formats = formats;
            return this;
        }
        public java.util.List<String> getFormats() {
            return this.formats;
        }

        public CreateAppRecordTemplateRequestRecordTemplate setLayoutIds(java.util.List<String> layoutIds) {
            this.layoutIds = layoutIds;
            return this;
        }
        public java.util.List<String> getLayoutIds() {
            return this.layoutIds;
        }

        public CreateAppRecordTemplateRequestRecordTemplate setMediaEncode(Integer mediaEncode) {
            this.mediaEncode = mediaEncode;
            return this;
        }
        public Integer getMediaEncode() {
            return this.mediaEncode;
        }

        public CreateAppRecordTemplateRequestRecordTemplate setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

}
