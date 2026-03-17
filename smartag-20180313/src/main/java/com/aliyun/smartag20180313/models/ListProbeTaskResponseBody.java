// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class ListProbeTaskResponseBody extends TeaModel {
    /**
     * <p>The response code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The information about the probe task.</p>
     * 
     * <strong>example:</strong>
     * <p>probe-xxx</p>
     */
    @NameInMap("Data")
    public java.util.List<ListProbeTaskResponseBodyData> data;

    /**
     * <p>The response message.</p>
     * 
     * <strong>example:</strong>
     * <p>successful</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The page number of the returned page.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries returned per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>324223F3-93D3-4CE4-B26F-66C0C3809922</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
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
        /**
         * <p>The domain name that is probed by the task.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://www.example.com">www.example.com</a></p>
         */
        @NameInMap("Domain")
        public String domain;

        /**
         * <p>Indicates whether the probe task is enabled. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: enabled</li>
         * <li><strong>false</strong>: disabled</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Enable")
        public Boolean enable;

        /**
         * <p>The time when the probe task was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-11-23 14:09</p>
         */
        @NameInMap("GmtCreate")
        public String gmtCreate;

        /**
         * <p>The time when the probe task was modified.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-11-23 14:09</p>
         */
        @NameInMap("GmtModify")
        public String gmtModify;

        /**
         * <p>The number of probe packets transmitted by the probe task per minute.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("PacketNumber")
        public Integer packetNumber;

        /**
         * <p>The port that is probed by the task.</p>
         * 
         * <strong>example:</strong>
         * <p>80</p>
         */
        @NameInMap("Port")
        public Integer port;

        /**
         * <p>The ID of the probe task.</p>
         * 
         * <strong>example:</strong>
         * <p>probe-****</p>
         */
        @NameInMap("ProbeTaskId")
        public String probeTaskId;

        /**
         * <p>The source address of the probe task.</p>
         * 
         * <strong>example:</strong>
         * <p>192.168.1.1</p>
         */
        @NameInMap("ProbeTaskSourceAddress")
        public String probeTaskSourceAddress;

        /**
         * <p>The protocol of the probe task. Valid values:</p>
         * <ul>
         * <li><strong>ICMP</strong></li>
         * <li><strong>TCP</strong></li>
         * <li><strong>HTTP</strong></li>
         * </ul>
         * <blockquote>
         * <p>Tasks that probe private networks support only ICMP and TCP.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>ICMP</p>
         */
        @NameInMap("Protocol")
        public String protocol;

        /**
         * <p>The ID of the SAG instance.</p>
         * 
         * <strong>example:</strong>
         * <p>sag-asdfz6ac74oj5v****</p>
         */
        @NameInMap("SagId")
        public String sagId;

        /**
         * <p>The serial number of the SAG device.</p>
         * 
         * <strong>example:</strong>
         * <p>sag****</p>
         */
        @NameInMap("Sn")
        public String sn;

        /**
         * <p>The name of the probe task.</p>
         * 
         * <strong>example:</strong>
         * <p>test-ping</p>
         */
        @NameInMap("TaskName")
        public String taskName;

        /**
         * <p>The type of the probe task. Valid values:</p>
         * <ul>
         * <li><strong>Internet</strong>: probes a public network.</li>
         * <li><strong>Intranet</strong>: probes a private network.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Internet</p>
         */
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
