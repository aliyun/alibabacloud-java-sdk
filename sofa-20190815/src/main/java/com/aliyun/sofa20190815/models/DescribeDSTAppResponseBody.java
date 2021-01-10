// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DescribeDSTAppResponseBody extends TeaModel {
    @NameInMap("App")
    public DescribeDSTAppResponseBodyApp app;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("ResultCode")
    public String resultCode;

    public static DescribeDSTAppResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDSTAppResponseBody self = new DescribeDSTAppResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDSTAppResponseBody setApp(DescribeDSTAppResponseBodyApp app) {
        this.app = app;
        return this;
    }
    public DescribeDSTAppResponseBodyApp getApp() {
        return this.app;
    }

    public DescribeDSTAppResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDSTAppResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public DescribeDSTAppResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public static class DescribeDSTAppResponseBodyApp extends TeaModel {
        @NameInMap("BizLogEnabled")
        public Boolean bizLogEnabled;

        @NameInMap("Name")
        public String name;

        @NameInMap("Collected")
        public Boolean collected;

        public static DescribeDSTAppResponseBodyApp build(java.util.Map<String, ?> map) throws Exception {
            DescribeDSTAppResponseBodyApp self = new DescribeDSTAppResponseBodyApp();
            return TeaModel.build(map, self);
        }

        public DescribeDSTAppResponseBodyApp setBizLogEnabled(Boolean bizLogEnabled) {
            this.bizLogEnabled = bizLogEnabled;
            return this;
        }
        public Boolean getBizLogEnabled() {
            return this.bizLogEnabled;
        }

        public DescribeDSTAppResponseBodyApp setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeDSTAppResponseBodyApp setCollected(Boolean collected) {
            this.collected = collected;
            return this;
        }
        public Boolean getCollected() {
            return this.collected;
        }

    }

}
