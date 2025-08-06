// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class CreateMediaDNALibResponseBody extends TeaModel {
    @NameInMap("AIDNALibInfo")
    public CreateMediaDNALibResponseBodyAIDNALibInfo AIDNALibInfo;

    @NameInMap("RequestId")
    public String requestId;

    public static CreateMediaDNALibResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateMediaDNALibResponseBody self = new CreateMediaDNALibResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateMediaDNALibResponseBody setAIDNALibInfo(CreateMediaDNALibResponseBodyAIDNALibInfo AIDNALibInfo) {
        this.AIDNALibInfo = AIDNALibInfo;
        return this;
    }
    public CreateMediaDNALibResponseBodyAIDNALibInfo getAIDNALibInfo() {
        return this.AIDNALibInfo;
    }

    public CreateMediaDNALibResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CreateMediaDNALibResponseBodyAIDNALibInfo extends TeaModel {
        @NameInMap("FpDBId")
        public String fpDBId;

        @NameInMap("ModelType")
        public String modelType;

        @NameInMap("State")
        public String state;

        public static CreateMediaDNALibResponseBodyAIDNALibInfo build(java.util.Map<String, ?> map) throws Exception {
            CreateMediaDNALibResponseBodyAIDNALibInfo self = new CreateMediaDNALibResponseBodyAIDNALibInfo();
            return TeaModel.build(map, self);
        }

        public CreateMediaDNALibResponseBodyAIDNALibInfo setFpDBId(String fpDBId) {
            this.fpDBId = fpDBId;
            return this;
        }
        public String getFpDBId() {
            return this.fpDBId;
        }

        public CreateMediaDNALibResponseBodyAIDNALibInfo setModelType(String modelType) {
            this.modelType = modelType;
            return this;
        }
        public String getModelType() {
            return this.modelType;
        }

        public CreateMediaDNALibResponseBodyAIDNALibInfo setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

    }

}
