// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ListMqSofamqNodeResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("Data")
    public java.util.List<ListMqSofamqNodeResponseBodyData> data;

    public static ListMqSofamqNodeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListMqSofamqNodeResponseBody self = new ListMqSofamqNodeResponseBody();
        return TeaModel.build(map, self);
    }

    public ListMqSofamqNodeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListMqSofamqNodeResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ListMqSofamqNodeResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public ListMqSofamqNodeResponseBody setData(java.util.List<ListMqSofamqNodeResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListMqSofamqNodeResponseBodyData> getData() {
        return this.data;
    }

    public static class ListMqSofamqNodeResponseBodyData extends TeaModel {
        @NameInMap("Cluster")
        public String cluster;

        @NameInMap("DataCenter")
        public String dataCenter;

        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("GmtModified")
        public String gmtModified;

        @NameInMap("Hostname")
        public String hostname;

        @NameInMap("Id")
        public Long id;

        @NameInMap("NodeGroup")
        public String nodeGroup;

        @NameInMap("NodeType")
        public String nodeType;

        @NameInMap("Perm")
        public String perm;

        @NameInMap("Rip")
        public String rip;

        @NameInMap("Room")
        public String room;

        @NameInMap("Vip")
        public String vip;

        public static ListMqSofamqNodeResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListMqSofamqNodeResponseBodyData self = new ListMqSofamqNodeResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListMqSofamqNodeResponseBodyData setCluster(String cluster) {
            this.cluster = cluster;
            return this;
        }
        public String getCluster() {
            return this.cluster;
        }

        public ListMqSofamqNodeResponseBodyData setDataCenter(String dataCenter) {
            this.dataCenter = dataCenter;
            return this;
        }
        public String getDataCenter() {
            return this.dataCenter;
        }

        public ListMqSofamqNodeResponseBodyData setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public ListMqSofamqNodeResponseBodyData setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public ListMqSofamqNodeResponseBodyData setHostname(String hostname) {
            this.hostname = hostname;
            return this;
        }
        public String getHostname() {
            return this.hostname;
        }

        public ListMqSofamqNodeResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListMqSofamqNodeResponseBodyData setNodeGroup(String nodeGroup) {
            this.nodeGroup = nodeGroup;
            return this;
        }
        public String getNodeGroup() {
            return this.nodeGroup;
        }

        public ListMqSofamqNodeResponseBodyData setNodeType(String nodeType) {
            this.nodeType = nodeType;
            return this;
        }
        public String getNodeType() {
            return this.nodeType;
        }

        public ListMqSofamqNodeResponseBodyData setPerm(String perm) {
            this.perm = perm;
            return this;
        }
        public String getPerm() {
            return this.perm;
        }

        public ListMqSofamqNodeResponseBodyData setRip(String rip) {
            this.rip = rip;
            return this;
        }
        public String getRip() {
            return this.rip;
        }

        public ListMqSofamqNodeResponseBodyData setRoom(String room) {
            this.room = room;
            return this;
        }
        public String getRoom() {
            return this.room;
        }

        public ListMqSofamqNodeResponseBodyData setVip(String vip) {
            this.vip = vip;
            return this;
        }
        public String getVip() {
            return this.vip;
        }

    }

}
