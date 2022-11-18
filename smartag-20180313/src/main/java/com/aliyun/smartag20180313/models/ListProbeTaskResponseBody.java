// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class ListProbeTaskResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<ListProbeTaskResponseBodyData> data;

    @NameInMap("Message")
    public String message;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListProbeTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListProbeTaskResponseBody self = new ListProbeTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public ListProbeTaskResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListProbeTaskResponseBody setData(java.util.List<ListProbeTaskResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListProbeTaskResponseBodyData> getData() {
        return this.data;
    }

    public ListProbeTaskResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListProbeTaskResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListProbeTaskResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListProbeTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListProbeTaskResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListProbeTaskResponseBodyData extends TeaModel {
        @NameInMap("Domain")
        public String domain;

        @NameInMap("Enable")
        public Boolean enable;

        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("GmtModify")
        public String gmtModify;

        @NameInMap("PacketNumber")
        public Integer packetNumber;

        @NameInMap("Port")
        public Integer port;

        @NameInMap("ProbeTaskId")
        public String probeTaskId;

        @NameInMap("ProbeTaskSourceAddress")
        public String probeTaskSourceAddress;

        @NameInMap("Protocol")
        public String protocol;

        @NameInMap("SagId")
        public String sagId;

        @NameInMap("Sn")
        public String sn;

        @NameInMap("TaskName")
        public String taskName;

        @NameInMap("Type")
        public String type;

        public static ListProbeTaskResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListProbeTaskResponseBodyData self = new ListProbeTaskResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListProbeTaskResponseBodyData setDomain(String domain) {
            this.domain = domain;
            return this;
        }
        public String getDomain() {
            return this.domain;
        }

        public ListProbeTaskResponseBodyData setEnable(Boolean enable) {
            this.enable = enable;
            return this;
        }
        public Boolean getEnable() {
            return this.enable;
        }

        public ListProbeTaskResponseBodyData setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public ListProbeTaskResponseBodyData setGmtModify(String gmtModify) {
            this.gmtModify = gmtModify;
            return this;
        }
        public String getGmtModify() {
            return this.gmtModify;
        }

        public ListProbeTaskResponseBodyData setPacketNumber(Integer packetNumber) {
            this.packetNumber = packetNumber;
            return this;
        }
        public Integer getPacketNumber() {
            return this.packetNumber;
        }

        public ListProbeTaskResponseBodyData setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

        public ListProbeTaskResponseBodyData setProbeTaskId(String probeTaskId) {
            this.probeTaskId = probeTaskId;
            return this;
        }
        public String getProbeTaskId() {
            return this.probeTaskId;
        }

        public ListProbeTaskResponseBodyData setProbeTaskSourceAddress(String probeTaskSourceAddress) {
            this.probeTaskSourceAddress = probeTaskSourceAddress;
            return this;
        }
        public String getProbeTaskSourceAddress() {
            return this.probeTaskSourceAddress;
        }

        public ListProbeTaskResponseBodyData setProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }
        public String getProtocol() {
            return this.protocol;
        }

        public ListProbeTaskResponseBodyData setSagId(String sagId) {
            this.sagId = sagId;
            return this;
        }
        public String getSagId() {
            return this.sagId;
        }

        public ListProbeTaskResponseBodyData setSn(String sn) {
            this.sn = sn;
            return this;
        }
        public String getSn() {
            return this.sn;
        }

        public ListProbeTaskResponseBodyData setTaskName(String taskName) {
            this.taskName = taskName;
            return this;
        }
        public String getTaskName() {
            return this.taskName;
        }

        public ListProbeTaskResponseBodyData setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
