// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CountRmsAlertrecordsResponseBody extends TeaModel {
    @NameInMap("Response")
    public CountRmsAlertrecordsResponseBodyResponse response;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("ResultCode")
    public String resultCode;

    public static CountRmsAlertrecordsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CountRmsAlertrecordsResponseBody self = new CountRmsAlertrecordsResponseBody();
        return TeaModel.build(map, self);
    }

    public CountRmsAlertrecordsResponseBody setResponse(CountRmsAlertrecordsResponseBodyResponse response) {
        this.response = response;
        return this;
    }
    public CountRmsAlertrecordsResponseBodyResponse getResponse() {
        return this.response;
    }

    public CountRmsAlertrecordsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CountRmsAlertrecordsResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public CountRmsAlertrecordsResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public static class CountRmsAlertrecordsResponseBodyResponseEntityData extends TeaModel {
        @NameInMap("Timestamp")
        public Long timestamp;

        @NameInMap("Count")
        public Long count;

        public static CountRmsAlertrecordsResponseBodyResponseEntityData build(java.util.Map<String, ?> map) throws Exception {
            CountRmsAlertrecordsResponseBodyResponseEntityData self = new CountRmsAlertrecordsResponseBodyResponseEntityData();
            return TeaModel.build(map, self);
        }

        public CountRmsAlertrecordsResponseBodyResponseEntityData setTimestamp(Long timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public Long getTimestamp() {
            return this.timestamp;
        }

        public CountRmsAlertrecordsResponseBodyResponseEntityData setCount(Long count) {
            this.count = count;
            return this;
        }
        public Long getCount() {
            return this.count;
        }

    }

    public static class CountRmsAlertrecordsResponseBodyResponseEntity extends TeaModel {
        @NameInMap("Data")
        public java.util.List<CountRmsAlertrecordsResponseBodyResponseEntityData> data;

        public static CountRmsAlertrecordsResponseBodyResponseEntity build(java.util.Map<String, ?> map) throws Exception {
            CountRmsAlertrecordsResponseBodyResponseEntity self = new CountRmsAlertrecordsResponseBodyResponseEntity();
            return TeaModel.build(map, self);
        }

        public CountRmsAlertrecordsResponseBodyResponseEntity setData(java.util.List<CountRmsAlertrecordsResponseBodyResponseEntityData> data) {
            this.data = data;
            return this;
        }
        public java.util.List<CountRmsAlertrecordsResponseBodyResponseEntityData> getData() {
            return this.data;
        }

    }

    public static class CountRmsAlertrecordsResponseBodyResponse extends TeaModel {
        @NameInMap("Layer")
        public String layer;

        @NameInMap("Entity")
        public CountRmsAlertrecordsResponseBodyResponseEntity entity;

        public static CountRmsAlertrecordsResponseBodyResponse build(java.util.Map<String, ?> map) throws Exception {
            CountRmsAlertrecordsResponseBodyResponse self = new CountRmsAlertrecordsResponseBodyResponse();
            return TeaModel.build(map, self);
        }

        public CountRmsAlertrecordsResponseBodyResponse setLayer(String layer) {
            this.layer = layer;
            return this;
        }
        public String getLayer() {
            return this.layer;
        }

        public CountRmsAlertrecordsResponseBodyResponse setEntity(CountRmsAlertrecordsResponseBodyResponseEntity entity) {
            this.entity = entity;
            return this;
        }
        public CountRmsAlertrecordsResponseBodyResponseEntity getEntity() {
            return this.entity;
        }

    }

}
