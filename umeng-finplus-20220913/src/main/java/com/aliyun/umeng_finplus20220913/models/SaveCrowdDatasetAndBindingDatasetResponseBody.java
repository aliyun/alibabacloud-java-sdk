// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.umeng_finplus20220913.models;

import com.aliyun.tea.*;

public class SaveCrowdDatasetAndBindingDatasetResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public SaveCrowdDatasetAndBindingDatasetResponseBodyData data;

    @NameInMap("Msg")
    public String msg;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static SaveCrowdDatasetAndBindingDatasetResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SaveCrowdDatasetAndBindingDatasetResponseBody self = new SaveCrowdDatasetAndBindingDatasetResponseBody();
        return TeaModel.build(map, self);
    }

    public SaveCrowdDatasetAndBindingDatasetResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public SaveCrowdDatasetAndBindingDatasetResponseBody setData(SaveCrowdDatasetAndBindingDatasetResponseBodyData data) {
        this.data = data;
        return this;
    }
    public SaveCrowdDatasetAndBindingDatasetResponseBodyData getData() {
        return this.data;
    }

    public SaveCrowdDatasetAndBindingDatasetResponseBody setMsg(String msg) {
        this.msg = msg;
        return this;
    }
    public String getMsg() {
        return this.msg;
    }

    public SaveCrowdDatasetAndBindingDatasetResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SaveCrowdDatasetAndBindingDatasetResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class SaveCrowdDatasetAndBindingDatasetResponseBodyData extends TeaModel {
        @NameInMap("appId")
        public String appId;

        @NameInMap("crowdDatasetId")
        public String crowdDatasetId;

        @NameInMap("datasetIds")
        public java.util.List<String> datasetIds;

        @NameInMap("description")
        public String description;

        @NameInMap("name")
        public String name;

        @NameInMap("uploadStatus")
        public String uploadStatus;

        public static SaveCrowdDatasetAndBindingDatasetResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            SaveCrowdDatasetAndBindingDatasetResponseBodyData self = new SaveCrowdDatasetAndBindingDatasetResponseBodyData();
            return TeaModel.build(map, self);
        }

        public SaveCrowdDatasetAndBindingDatasetResponseBodyData setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public SaveCrowdDatasetAndBindingDatasetResponseBodyData setCrowdDatasetId(String crowdDatasetId) {
            this.crowdDatasetId = crowdDatasetId;
            return this;
        }
        public String getCrowdDatasetId() {
            return this.crowdDatasetId;
        }

        public SaveCrowdDatasetAndBindingDatasetResponseBodyData setDatasetIds(java.util.List<String> datasetIds) {
            this.datasetIds = datasetIds;
            return this;
        }
        public java.util.List<String> getDatasetIds() {
            return this.datasetIds;
        }

        public SaveCrowdDatasetAndBindingDatasetResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public SaveCrowdDatasetAndBindingDatasetResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public SaveCrowdDatasetAndBindingDatasetResponseBodyData setUploadStatus(String uploadStatus) {
            this.uploadStatus = uploadStatus;
            return this;
        }
        public String getUploadStatus() {
            return this.uploadStatus;
        }

    }

}
