// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.snsuapi20180709.models;

import com.aliyun.tea.*;

public class BandStatusQueryResponseBody extends TeaModel {
    @NameInMap("ResultModule")
    public BandStatusQueryResponseBodyResultModule resultModule;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("ResultCode")
    public String resultCode;

    public static BandStatusQueryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BandStatusQueryResponseBody self = new BandStatusQueryResponseBody();
        return TeaModel.build(map, self);
    }

    public BandStatusQueryResponseBody setResultModule(BandStatusQueryResponseBodyResultModule resultModule) {
        this.resultModule = resultModule;
        return this;
    }
    public BandStatusQueryResponseBodyResultModule getResultModule() {
        return this.resultModule;
    }

    public BandStatusQueryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public BandStatusQueryResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public BandStatusQueryResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public static class BandStatusQueryResponseBodyResultModule extends TeaModel {
        @NameInMap("UploadTarget")
        public Integer uploadTarget;

        @NameInMap("DownloadTarget")
        public Integer downloadTarget;

        public static BandStatusQueryResponseBodyResultModule build(java.util.Map<String, ?> map) throws Exception {
            BandStatusQueryResponseBodyResultModule self = new BandStatusQueryResponseBodyResultModule();
            return TeaModel.build(map, self);
        }

        public BandStatusQueryResponseBodyResultModule setUploadTarget(Integer uploadTarget) {
            this.uploadTarget = uploadTarget;
            return this;
        }
        public Integer getUploadTarget() {
            return this.uploadTarget;
        }

        public BandStatusQueryResponseBodyResultModule setDownloadTarget(Integer downloadTarget) {
            this.downloadTarget = downloadTarget;
            return this;
        }
        public Integer getDownloadTarget() {
            return this.downloadTarget;
        }

    }

}
