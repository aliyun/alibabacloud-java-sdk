// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.snsuapi20180709.models;

import com.aliyun.tea.*;

public class BandOfferOrderResponseBody extends TeaModel {
    @NameInMap("ResultModule")
    public BandOfferOrderResponseBodyResultModule resultModule;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("ResultCode")
    public String resultCode;

    public static BandOfferOrderResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BandOfferOrderResponseBody self = new BandOfferOrderResponseBody();
        return TeaModel.build(map, self);
    }

    public BandOfferOrderResponseBody setResultModule(BandOfferOrderResponseBodyResultModule resultModule) {
        this.resultModule = resultModule;
        return this;
    }
    public BandOfferOrderResponseBodyResultModule getResultModule() {
        return this.resultModule;
    }

    public BandOfferOrderResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public BandOfferOrderResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public BandOfferOrderResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public static class BandOfferOrderResponseBodyResultModule extends TeaModel {
        @NameInMap("LxOrderId")
        public Long lxOrderId;

        public static BandOfferOrderResponseBodyResultModule build(java.util.Map<String, ?> map) throws Exception {
            BandOfferOrderResponseBodyResultModule self = new BandOfferOrderResponseBodyResultModule();
            return TeaModel.build(map, self);
        }

        public BandOfferOrderResponseBodyResultModule setLxOrderId(Long lxOrderId) {
            this.lxOrderId = lxOrderId;
            return this;
        }
        public Long getLxOrderId() {
            return this.lxOrderId;
        }

    }

}
