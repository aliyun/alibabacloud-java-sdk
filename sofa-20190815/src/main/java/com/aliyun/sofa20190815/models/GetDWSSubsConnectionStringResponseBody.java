// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetDWSSubsConnectionStringResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("Data")
    public GetDWSSubsConnectionStringResponseBodyData data;

    public static GetDWSSubsConnectionStringResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDWSSubsConnectionStringResponseBody self = new GetDWSSubsConnectionStringResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDWSSubsConnectionStringResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetDWSSubsConnectionStringResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetDWSSubsConnectionStringResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public GetDWSSubsConnectionStringResponseBody setData(GetDWSSubsConnectionStringResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetDWSSubsConnectionStringResponseBodyData getData() {
        return this.data;
    }

    public static class GetDWSSubsConnectionStringResponseBodyData extends TeaModel {
        @NameInMap("ClusterUrl")
        public String clusterUrl;

        @NameInMap("Consumer")
        public String consumer;

        @NameInMap("Group")
        public String group;

        @NameInMap("Id")
        public Long id;

        @NameInMap("Password")
        public String password;

        @NameInMap("TableId")
        public String tableId;

        public static GetDWSSubsConnectionStringResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetDWSSubsConnectionStringResponseBodyData self = new GetDWSSubsConnectionStringResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetDWSSubsConnectionStringResponseBodyData setClusterUrl(String clusterUrl) {
            this.clusterUrl = clusterUrl;
            return this;
        }
        public String getClusterUrl() {
            return this.clusterUrl;
        }

        public GetDWSSubsConnectionStringResponseBodyData setConsumer(String consumer) {
            this.consumer = consumer;
            return this;
        }
        public String getConsumer() {
            return this.consumer;
        }

        public GetDWSSubsConnectionStringResponseBodyData setGroup(String group) {
            this.group = group;
            return this;
        }
        public String getGroup() {
            return this.group;
        }

        public GetDWSSubsConnectionStringResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetDWSSubsConnectionStringResponseBodyData setPassword(String password) {
            this.password = password;
            return this;
        }
        public String getPassword() {
            return this.password;
        }

        public GetDWSSubsConnectionStringResponseBodyData setTableId(String tableId) {
            this.tableId = tableId;
            return this;
        }
        public String getTableId() {
            return this.tableId;
        }

    }

}
