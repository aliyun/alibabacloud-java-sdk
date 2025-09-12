// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.umeng_finplus20220913.models;

import com.aliyun.tea.*;

public class GetCrowdDatasetResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetCrowdDatasetResponseBodyData data;

    @NameInMap("Msg")
    public String msg;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static GetCrowdDatasetResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetCrowdDatasetResponseBody self = new GetCrowdDatasetResponseBody();
        return TeaModel.build(map, self);
    }

    public GetCrowdDatasetResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetCrowdDatasetResponseBody setData(GetCrowdDatasetResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetCrowdDatasetResponseBodyData getData() {
        return this.data;
    }

    public GetCrowdDatasetResponseBody setMsg(String msg) {
        this.msg = msg;
        return this;
    }
    public String getMsg() {
        return this.msg;
    }

    public GetCrowdDatasetResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetCrowdDatasetResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetCrowdDatasetResponseBodyData extends TeaModel {
        @NameInMap("appId")
        public String appId;

        @NameInMap("crowdDatasetId")
        public String crowdDatasetId;

        @NameInMap("datasetIds")
        public String datasetIds;

        @NameInMap("description")
        public String description;

        @NameInMap("name")
        public String name;

        @NameInMap("uploadStatus")
        public String uploadStatus;

        public static GetCrowdDatasetResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetCrowdDatasetResponseBodyData self = new GetCrowdDatasetResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetCrowdDatasetResponseBodyData setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public GetCrowdDatasetResponseBodyData setCrowdDatasetId(String crowdDatasetId) {
            this.crowdDatasetId = crowdDatasetId;
            return this;
        }
        public String getCrowdDatasetId() {
            return this.crowdDatasetId;
        }

        public GetCrowdDatasetResponseBodyData setDatasetIds(String datasetIds) {
            this.datasetIds = datasetIds;
            return this;
        }
        public String getDatasetIds() {
            return this.datasetIds;
        }

        public GetCrowdDatasetResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetCrowdDatasetResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetCrowdDatasetResponseBodyData setUploadStatus(String uploadStatus) {
            this.uploadStatus = uploadStatus;
            return this;
        }
        public String getUploadStatus() {
            return this.uploadStatus;
        }

    }

}
