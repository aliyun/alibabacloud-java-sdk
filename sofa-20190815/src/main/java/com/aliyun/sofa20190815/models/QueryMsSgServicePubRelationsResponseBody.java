// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryMsSgServicePubRelationsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("ServiceRelations")
    public java.util.List<QueryMsSgServicePubRelationsResponseBodyServiceRelations> serviceRelations;

    public static QueryMsSgServicePubRelationsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryMsSgServicePubRelationsResponseBody self = new QueryMsSgServicePubRelationsResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryMsSgServicePubRelationsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryMsSgServicePubRelationsResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryMsSgServicePubRelationsResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public QueryMsSgServicePubRelationsResponseBody setServiceRelations(java.util.List<QueryMsSgServicePubRelationsResponseBodyServiceRelations> serviceRelations) {
        this.serviceRelations = serviceRelations;
        return this;
    }
    public java.util.List<QueryMsSgServicePubRelationsResponseBodyServiceRelations> getServiceRelations() {
        return this.serviceRelations;
    }

    public static class QueryMsSgServicePubRelationsResponseBodyServiceRelations extends TeaModel {
        @NameInMap("AppName")
        public String appName;

        @NameInMap("DataId")
        public String dataId;

        public static QueryMsSgServicePubRelationsResponseBodyServiceRelations build(java.util.Map<String, ?> map) throws Exception {
            QueryMsSgServicePubRelationsResponseBodyServiceRelations self = new QueryMsSgServicePubRelationsResponseBodyServiceRelations();
            return TeaModel.build(map, self);
        }

        public QueryMsSgServicePubRelationsResponseBodyServiceRelations setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public QueryMsSgServicePubRelationsResponseBodyServiceRelations setDataId(String dataId) {
            this.dataId = dataId;
            return this;
        }
        public String getDataId() {
            return this.dataId;
        }

    }

}
