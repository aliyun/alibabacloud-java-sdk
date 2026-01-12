// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xrengine20221111.models;

import com.aliyun.tea.*;

public class GetProjectDatasetResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetProjectDatasetResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static GetProjectDatasetResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetProjectDatasetResponseBody self = new GetProjectDatasetResponseBody();
        return TeaModel.build(map, self);
    }

    public GetProjectDatasetResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetProjectDatasetResponseBody setData(GetProjectDatasetResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetProjectDatasetResponseBodyData getData() {
        return this.data;
    }

    public GetProjectDatasetResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetProjectDatasetResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetProjectDatasetResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetProjectDatasetResponseBodyDataDataset extends TeaModel {
        @NameInMap("CoverUrl")
        public String coverUrl;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("Id")
        public String id;

        @NameInMap("ModelUrl")
        public String modelUrl;

        @NameInMap("ModifiedTime")
        public String modifiedTime;

        @NameInMap("OriginResultUrl")
        public String originResultUrl;

        @NameInMap("OssKey")
        public String ossKey;

        @NameInMap("PoseUrl")
        public String poseUrl;

        @NameInMap("PreviewUrl")
        public String previewUrl;

        public static GetProjectDatasetResponseBodyDataDataset build(java.util.Map<String, ?> map) throws Exception {
            GetProjectDatasetResponseBodyDataDataset self = new GetProjectDatasetResponseBodyDataDataset();
            return TeaModel.build(map, self);
        }

        public GetProjectDatasetResponseBodyDataDataset setCoverUrl(String coverUrl) {
            this.coverUrl = coverUrl;
            return this;
        }
        public String getCoverUrl() {
            return this.coverUrl;
        }

        public GetProjectDatasetResponseBodyDataDataset setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public GetProjectDatasetResponseBodyDataDataset setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetProjectDatasetResponseBodyDataDataset setModelUrl(String modelUrl) {
            this.modelUrl = modelUrl;
            return this;
        }
        public String getModelUrl() {
            return this.modelUrl;
        }

        public GetProjectDatasetResponseBodyDataDataset setModifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        public GetProjectDatasetResponseBodyDataDataset setOriginResultUrl(String originResultUrl) {
            this.originResultUrl = originResultUrl;
            return this;
        }
        public String getOriginResultUrl() {
            return this.originResultUrl;
        }

        public GetProjectDatasetResponseBodyDataDataset setOssKey(String ossKey) {
            this.ossKey = ossKey;
            return this;
        }
        public String getOssKey() {
            return this.ossKey;
        }

        public GetProjectDatasetResponseBodyDataDataset setPoseUrl(String poseUrl) {
            this.poseUrl = poseUrl;
            return this;
        }
        public String getPoseUrl() {
            return this.poseUrl;
        }

        public GetProjectDatasetResponseBodyDataDataset setPreviewUrl(String previewUrl) {
            this.previewUrl = previewUrl;
            return this;
        }
        public String getPreviewUrl() {
            return this.previewUrl;
        }

    }

    public static class GetProjectDatasetResponseBodyData extends TeaModel {
        @NameInMap("CreateMode")
        public String createMode;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("Dataset")
        public GetProjectDatasetResponseBodyDataDataset dataset;

        @NameInMap("Id")
        public String id;

        @NameInMap("Intro")
        public String intro;

        @NameInMap("ModifiedTime")
        public String modifiedTime;

        @NameInMap("Status")
        public String status;

        @NameInMap("Title")
        public String title;

        @NameInMap("Type")
        public String type;

        @NameInMap("bizUsage")
        public String bizUsage;

        public static GetProjectDatasetResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetProjectDatasetResponseBodyData self = new GetProjectDatasetResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetProjectDatasetResponseBodyData setCreateMode(String createMode) {
            this.createMode = createMode;
            return this;
        }
        public String getCreateMode() {
            return this.createMode;
        }

        public GetProjectDatasetResponseBodyData setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public GetProjectDatasetResponseBodyData setDataset(GetProjectDatasetResponseBodyDataDataset dataset) {
            this.dataset = dataset;
            return this;
        }
        public GetProjectDatasetResponseBodyDataDataset getDataset() {
            return this.dataset;
        }

        public GetProjectDatasetResponseBodyData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetProjectDatasetResponseBodyData setIntro(String intro) {
            this.intro = intro;
            return this;
        }
        public String getIntro() {
            return this.intro;
        }

        public GetProjectDatasetResponseBodyData setModifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        public GetProjectDatasetResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetProjectDatasetResponseBodyData setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public GetProjectDatasetResponseBodyData setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public GetProjectDatasetResponseBodyData setBizUsage(String bizUsage) {
            this.bizUsage = bizUsage;
            return this;
        }
        public String getBizUsage() {
            return this.bizUsage;
        }

    }

}
