// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryMsSgServiceSubRelationsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("ServiceRelations")
    public java.util.List<QueryMsSgServiceSubRelationsResponseBodyServiceRelations> serviceRelations;

    public static QueryMsSgServiceSubRelationsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryMsSgServiceSubRelationsResponseBody self = new QueryMsSgServiceSubRelationsResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryMsSgServiceSubRelationsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryMsSgServiceSubRelationsResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryMsSgServiceSubRelationsResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public QueryMsSgServiceSubRelationsResponseBody setServiceRelations(java.util.List<QueryMsSgServiceSubRelationsResponseBodyServiceRelations> serviceRelations) {
        this.serviceRelations = serviceRelations;
        return this;
    }
    public java.util.List<QueryMsSgServiceSubRelationsResponseBodyServiceRelations> getServiceRelations() {
        return this.serviceRelations;
    }

    public static class QueryMsSgServiceSubRelationsResponseBodyServiceRelations extends TeaModel {
        @NameInMap("AppName")
        public String appName;

        @NameInMap("DataId")
        public String dataId;

        public static QueryMsSgServiceSubRelationsResponseBodyServiceRelations build(java.util.Map<String, ?> map) throws Exception {
            QueryMsSgServiceSubRelationsResponseBodyServiceRelations self = new QueryMsSgServiceSubRelationsResponseBodyServiceRelations();
            return TeaModel.build(map, self);
        }

        public QueryMsSgServiceSubRelationsResponseBodyServiceRelations setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public QueryMsSgServiceSubRelationsResponseBodyServiceRelations setDataId(String dataId) {
            this.dataId = dataId;
            return this;
        }
        public String getDataId() {
            return this.dataId;
        }

    }

}
