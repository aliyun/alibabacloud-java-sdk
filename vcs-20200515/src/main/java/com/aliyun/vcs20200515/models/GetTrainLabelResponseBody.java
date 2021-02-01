// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class GetTrainLabelResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("Data")
    public GetTrainLabelResponseBodyData data;

    public static GetTrainLabelResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetTrainLabelResponseBody self = new GetTrainLabelResponseBody();
        return TeaModel.build(map, self);
    }

    public GetTrainLabelResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetTrainLabelResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetTrainLabelResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetTrainLabelResponseBody setData(GetTrainLabelResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetTrainLabelResponseBodyData getData() {
        return this.data;
    }

    public static class GetTrainLabelResponseBodyData extends TeaModel {
        @NameInMap("ID")
        public String ID;

        @NameInMap("LabelName")
        public String labelName;

        @NameInMap("AlgorithmId")
        public String algorithmId;

        @NameInMap("TrainMarkerCnt")
        public Long trainMarkerCnt;

        @NameInMap("TestMarkerCnt")
        public Long testMarkerCnt;

        @NameInMap("Deleted")
        public String deleted;

        @NameInMap("GmtCreated")
        public String gmtCreated;

        @NameInMap("GmtModified")
        public String gmtModified;

        public static GetTrainLabelResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetTrainLabelResponseBodyData self = new GetTrainLabelResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetTrainLabelResponseBodyData setID(String ID) {
            this.ID = ID;
            return this;
        }
        public String getID() {
            return this.ID;
        }

        public GetTrainLabelResponseBodyData setLabelName(String labelName) {
            this.labelName = labelName;
            return this;
        }
        public String getLabelName() {
            return this.labelName;
        }

        public GetTrainLabelResponseBodyData setAlgorithmId(String algorithmId) {
            this.algorithmId = algorithmId;
            return this;
        }
        public String getAlgorithmId() {
            return this.algorithmId;
        }

        public GetTrainLabelResponseBodyData setTrainMarkerCnt(Long trainMarkerCnt) {
            this.trainMarkerCnt = trainMarkerCnt;
            return this;
        }
        public Long getTrainMarkerCnt() {
            return this.trainMarkerCnt;
        }

        public GetTrainLabelResponseBodyData setTestMarkerCnt(Long testMarkerCnt) {
            this.testMarkerCnt = testMarkerCnt;
            return this;
        }
        public Long getTestMarkerCnt() {
            return this.testMarkerCnt;
        }

        public GetTrainLabelResponseBodyData setDeleted(String deleted) {
            this.deleted = deleted;
            return this;
        }
        public String getDeleted() {
            return this.deleted;
        }

        public GetTrainLabelResponseBodyData setGmtCreated(String gmtCreated) {
            this.gmtCreated = gmtCreated;
            return this;
        }
        public String getGmtCreated() {
            return this.gmtCreated;
        }

        public GetTrainLabelResponseBodyData setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

    }

}
