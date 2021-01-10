// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class AllCasDatabaseEngineResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public java.util.List<AllCasDatabaseEngineResponseBodyData> data;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("ResultCode")
    public String resultCode;

    public static AllCasDatabaseEngineResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AllCasDatabaseEngineResponseBody self = new AllCasDatabaseEngineResponseBody();
        return TeaModel.build(map, self);
    }

    public AllCasDatabaseEngineResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AllCasDatabaseEngineResponseBody setData(java.util.List<AllCasDatabaseEngineResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<AllCasDatabaseEngineResponseBodyData> getData() {
        return this.data;
    }

    public AllCasDatabaseEngineResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public AllCasDatabaseEngineResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public static class AllCasDatabaseEngineResponseBodyData extends TeaModel {
        @NameInMap("IaasType")
        public String iaasType;

        @NameInMap("Engine")
        public String engine;

        @NameInMap("EngineVersions")
        public java.util.List<String> engineVersions;

        public static AllCasDatabaseEngineResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            AllCasDatabaseEngineResponseBodyData self = new AllCasDatabaseEngineResponseBodyData();
            return TeaModel.build(map, self);
        }

        public AllCasDatabaseEngineResponseBodyData setIaasType(String iaasType) {
            this.iaasType = iaasType;
            return this;
        }
        public String getIaasType() {
            return this.iaasType;
        }

        public AllCasDatabaseEngineResponseBodyData setEngine(String engine) {
            this.engine = engine;
            return this;
        }
        public String getEngine() {
            return this.engine;
        }

        public AllCasDatabaseEngineResponseBodyData setEngineVersions(java.util.List<String> engineVersions) {
            this.engineVersions = engineVersions;
            return this;
        }
        public java.util.List<String> getEngineVersions() {
            return this.engineVersions;
        }

    }

}
