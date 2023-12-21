// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xrengine20230313.models;

import com.aliyun.tea.*;

public class PopBatchQueryObjectGenerationProjectStatusResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<PopBatchQueryObjectGenerationProjectStatusResponseBodyData> data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static PopBatchQueryObjectGenerationProjectStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        PopBatchQueryObjectGenerationProjectStatusResponseBody self = new PopBatchQueryObjectGenerationProjectStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public PopBatchQueryObjectGenerationProjectStatusResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public PopBatchQueryObjectGenerationProjectStatusResponseBody setData(java.util.List<PopBatchQueryObjectGenerationProjectStatusResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<PopBatchQueryObjectGenerationProjectStatusResponseBodyData> getData() {
        return this.data;
    }

    public PopBatchQueryObjectGenerationProjectStatusResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public PopBatchQueryObjectGenerationProjectStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public PopBatchQueryObjectGenerationProjectStatusResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class PopBatchQueryObjectGenerationProjectStatusResponseBodyDataDataset extends TeaModel {
        @NameInMap("BuildResultUrl")
        public java.util.Map<String, ?> buildResultUrl;

        public static PopBatchQueryObjectGenerationProjectStatusResponseBodyDataDataset build(java.util.Map<String, ?> map) throws Exception {
            PopBatchQueryObjectGenerationProjectStatusResponseBodyDataDataset self = new PopBatchQueryObjectGenerationProjectStatusResponseBodyDataDataset();
            return TeaModel.build(map, self);
        }

        public PopBatchQueryObjectGenerationProjectStatusResponseBodyDataDataset setBuildResultUrl(java.util.Map<String, ?> buildResultUrl) {
            this.buildResultUrl = buildResultUrl;
            return this;
        }
        public java.util.Map<String, ?> getBuildResultUrl() {
            return this.buildResultUrl;
        }

    }

    public static class PopBatchQueryObjectGenerationProjectStatusResponseBodyData extends TeaModel {
        @NameInMap("BizUsage")
        public String bizUsage;

        @NameInMap("Dataset")
        public PopBatchQueryObjectGenerationProjectStatusResponseBodyDataDataset dataset;

        @NameInMap("Id")
        public String id;

        @NameInMap("Status")
        public String status;

        public static PopBatchQueryObjectGenerationProjectStatusResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            PopBatchQueryObjectGenerationProjectStatusResponseBodyData self = new PopBatchQueryObjectGenerationProjectStatusResponseBodyData();
            return TeaModel.build(map, self);
        }

        public PopBatchQueryObjectGenerationProjectStatusResponseBodyData setBizUsage(String bizUsage) {
            this.bizUsage = bizUsage;
            return this;
        }
        public String getBizUsage() {
            return this.bizUsage;
        }

        public PopBatchQueryObjectGenerationProjectStatusResponseBodyData setDataset(PopBatchQueryObjectGenerationProjectStatusResponseBodyDataDataset dataset) {
            this.dataset = dataset;
            return this;
        }
        public PopBatchQueryObjectGenerationProjectStatusResponseBodyDataDataset getDataset() {
            return this.dataset;
        }

        public PopBatchQueryObjectGenerationProjectStatusResponseBodyData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public PopBatchQueryObjectGenerationProjectStatusResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
