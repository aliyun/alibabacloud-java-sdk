// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryODPEnvironmentResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("Data")
    public QueryODPEnvironmentResponseBodyData data;

    public static QueryODPEnvironmentResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryODPEnvironmentResponseBody self = new QueryODPEnvironmentResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryODPEnvironmentResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryODPEnvironmentResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryODPEnvironmentResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public QueryODPEnvironmentResponseBody setData(QueryODPEnvironmentResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryODPEnvironmentResponseBodyData getData() {
        return this.data;
    }

    public static class QueryODPEnvironmentResponseBodyData extends TeaModel {
        @NameInMap("AdvancedUser")
        public Boolean advancedUser;

        @NameInMap("AutoCreateSchema")
        public Boolean autoCreateSchema;

        @NameInMap("DepolyMode")
        public String depolyMode;

        @NameInMap("Ldc")
        public Boolean ldc;

        @NameInMap("NetMode")
        public String netMode;

        @NameInMap("Datacenters")
        public java.util.List<String> datacenters;

        public static QueryODPEnvironmentResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryODPEnvironmentResponseBodyData self = new QueryODPEnvironmentResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryODPEnvironmentResponseBodyData setAdvancedUser(Boolean advancedUser) {
            this.advancedUser = advancedUser;
            return this;
        }
        public Boolean getAdvancedUser() {
            return this.advancedUser;
        }

        public QueryODPEnvironmentResponseBodyData setAutoCreateSchema(Boolean autoCreateSchema) {
            this.autoCreateSchema = autoCreateSchema;
            return this;
        }
        public Boolean getAutoCreateSchema() {
            return this.autoCreateSchema;
        }

        public QueryODPEnvironmentResponseBodyData setDepolyMode(String depolyMode) {
            this.depolyMode = depolyMode;
            return this;
        }
        public String getDepolyMode() {
            return this.depolyMode;
        }

        public QueryODPEnvironmentResponseBodyData setLdc(Boolean ldc) {
            this.ldc = ldc;
            return this;
        }
        public Boolean getLdc() {
            return this.ldc;
        }

        public QueryODPEnvironmentResponseBodyData setNetMode(String netMode) {
            this.netMode = netMode;
            return this;
        }
        public String getNetMode() {
            return this.netMode;
        }

        public QueryODPEnvironmentResponseBodyData setDatacenters(java.util.List<String> datacenters) {
            this.datacenters = datacenters;
            return this;
        }
        public java.util.List<String> getDatacenters() {
            return this.datacenters;
        }

    }

}
