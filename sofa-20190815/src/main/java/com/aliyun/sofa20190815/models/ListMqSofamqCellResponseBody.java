// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ListMqSofamqCellResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("Data")
    public java.util.List<ListMqSofamqCellResponseBodyData> data;

    public static ListMqSofamqCellResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListMqSofamqCellResponseBody self = new ListMqSofamqCellResponseBody();
        return TeaModel.build(map, self);
    }

    public ListMqSofamqCellResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListMqSofamqCellResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ListMqSofamqCellResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public ListMqSofamqCellResponseBody setData(java.util.List<ListMqSofamqCellResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListMqSofamqCellResponseBodyData> getData() {
        return this.data;
    }

    public static class ListMqSofamqCellResponseBodyData extends TeaModel {
        @NameInMap("Cell")
        public String cell;

        @NameInMap("CellType")
        public String cellType;

        @NameInMap("Datacenter")
        public String datacenter;

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

        @NameInMap("NamespaceId")
        public String namespaceId;

        @NameInMap("Room")
        public String room;

        public static ListMqSofamqCellResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListMqSofamqCellResponseBodyData self = new ListMqSofamqCellResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListMqSofamqCellResponseBodyData setCell(String cell) {
            this.cell = cell;
            return this;
        }
        public String getCell() {
            return this.cell;
        }

        public ListMqSofamqCellResponseBodyData setCellType(String cellType) {
            this.cellType = cellType;
            return this;
        }
        public String getCellType() {
            return this.cellType;
        }

        public ListMqSofamqCellResponseBodyData setDatacenter(String datacenter) {
            this.datacenter = datacenter;
            return this;
        }
        public String getDatacenter() {
            return this.datacenter;
        }

        public ListMqSofamqCellResponseBodyData setEndpoint(String endpoint) {
            this.endpoint = endpoint;
            return this;
        }
        public String getEndpoint() {
            return this.endpoint;
        }

        public ListMqSofamqCellResponseBodyData setEndpointType(String endpointType) {
            this.endpointType = endpointType;
            return this;
        }
        public String getEndpointType() {
            return this.endpointType;
        }

        public ListMqSofamqCellResponseBodyData setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public ListMqSofamqCellResponseBodyData setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public ListMqSofamqCellResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListMqSofamqCellResponseBodyData setNamespaceId(String namespaceId) {
            this.namespaceId = namespaceId;
            return this;
        }
        public String getNamespaceId() {
            return this.namespaceId;
        }

        public ListMqSofamqCellResponseBodyData setRoom(String room) {
            this.room = room;
            return this;
        }
        public String getRoom() {
            return this.room;
        }

    }

}
