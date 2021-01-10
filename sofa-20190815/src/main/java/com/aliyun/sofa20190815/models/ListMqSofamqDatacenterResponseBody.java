// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ListMqSofamqDatacenterResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("Data")
    public java.util.List<ListMqSofamqDatacenterResponseBodyData> data;

    public static ListMqSofamqDatacenterResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListMqSofamqDatacenterResponseBody self = new ListMqSofamqDatacenterResponseBody();
        return TeaModel.build(map, self);
    }

    public ListMqSofamqDatacenterResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListMqSofamqDatacenterResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ListMqSofamqDatacenterResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public ListMqSofamqDatacenterResponseBody setData(java.util.List<ListMqSofamqDatacenterResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListMqSofamqDatacenterResponseBodyData> getData() {
        return this.data;
    }

    public static class ListMqSofamqDatacenterResponseBodyData extends TeaModel {
        @NameInMap("Cluster")
        public String cluster;

        @NameInMap("Datacenter")
        public String datacenter;

        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("GmtModified")
        public String gmtModified;

        @NameInMap("Id")
        public Long id;

        @NameInMap("Room")
        public String room;

        public static ListMqSofamqDatacenterResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListMqSofamqDatacenterResponseBodyData self = new ListMqSofamqDatacenterResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListMqSofamqDatacenterResponseBodyData setCluster(String cluster) {
            this.cluster = cluster;
            return this;
        }
        public String getCluster() {
            return this.cluster;
        }

        public ListMqSofamqDatacenterResponseBodyData setDatacenter(String datacenter) {
            this.datacenter = datacenter;
            return this;
        }
        public String getDatacenter() {
            return this.datacenter;
        }

        public ListMqSofamqDatacenterResponseBodyData setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public ListMqSofamqDatacenterResponseBodyData setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public ListMqSofamqDatacenterResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListMqSofamqDatacenterResponseBodyData setRoom(String room) {
            this.room = room;
            return this;
        }
        public String getRoom() {
            return this.room;
        }

    }

}
