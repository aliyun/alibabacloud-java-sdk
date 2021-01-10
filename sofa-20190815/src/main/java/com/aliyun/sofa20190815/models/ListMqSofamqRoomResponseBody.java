// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ListMqSofamqRoomResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("Data")
    public java.util.List<ListMqSofamqRoomResponseBodyData> data;

    public static ListMqSofamqRoomResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListMqSofamqRoomResponseBody self = new ListMqSofamqRoomResponseBody();
        return TeaModel.build(map, self);
    }

    public ListMqSofamqRoomResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListMqSofamqRoomResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ListMqSofamqRoomResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public ListMqSofamqRoomResponseBody setData(java.util.List<ListMqSofamqRoomResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListMqSofamqRoomResponseBodyData> getData() {
        return this.data;
    }

    public static class ListMqSofamqRoomResponseBodyData extends TeaModel {
        @NameInMap("Cluster")
        public String cluster;

        @NameInMap("Endpoint")
        public String endpoint;

        @NameInMap("EndpointType")
        public String endpointType;

        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("GmtModified")
        public String gmtModified;

        @NameInMap("Id")
        public Long id;

        @NameInMap("Region")
        public String region;

        @NameInMap("Room")
        public String room;

        public static ListMqSofamqRoomResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListMqSofamqRoomResponseBodyData self = new ListMqSofamqRoomResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListMqSofamqRoomResponseBodyData setCluster(String cluster) {
            this.cluster = cluster;
            return this;
        }
        public String getCluster() {
            return this.cluster;
        }

        public ListMqSofamqRoomResponseBodyData setEndpoint(String endpoint) {
            this.endpoint = endpoint;
            return this;
        }
        public String getEndpoint() {
            return this.endpoint;
        }

        public ListMqSofamqRoomResponseBodyData setEndpointType(String endpointType) {
            this.endpointType = endpointType;
            return this;
        }
        public String getEndpointType() {
            return this.endpointType;
        }

        public ListMqSofamqRoomResponseBodyData setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public ListMqSofamqRoomResponseBodyData setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public ListMqSofamqRoomResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListMqSofamqRoomResponseBodyData setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public ListMqSofamqRoomResponseBodyData setRoom(String room) {
            this.room = room;
            return this;
        }
        public String getRoom() {
            return this.room;
        }

    }

}
