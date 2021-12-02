// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribeForwardTableEntriesResponseBody extends TeaModel {
    @NameInMap("ForwardTableEntries")
    public DescribeForwardTableEntriesResponseBodyForwardTableEntries forwardTableEntries;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeForwardTableEntriesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeForwardTableEntriesResponseBody self = new DescribeForwardTableEntriesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeForwardTableEntriesResponseBody setForwardTableEntries(DescribeForwardTableEntriesResponseBodyForwardTableEntries forwardTableEntries) {
        this.forwardTableEntries = forwardTableEntries;
        return this;
    }
    public DescribeForwardTableEntriesResponseBodyForwardTableEntries getForwardTableEntries() {
        return this.forwardTableEntries;
    }

    public DescribeForwardTableEntriesResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeForwardTableEntriesResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeForwardTableEntriesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeForwardTableEntriesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeForwardTableEntriesResponseBodyForwardTableEntriesForwardTableEntry extends TeaModel {
        @NameInMap("ExternalIp")
        public String externalIp;

        @NameInMap("ExternalPort")
        public String externalPort;

        @NameInMap("ForwardEntryId")
        public String forwardEntryId;

        @NameInMap("ForwardEntryName")
        public String forwardEntryName;

        @NameInMap("ForwardTableId")
        public String forwardTableId;

        @NameInMap("InternalIp")
        public String internalIp;

        @NameInMap("InternalPort")
        public String internalPort;

        @NameInMap("IpProtocol")
        public String ipProtocol;

        @NameInMap("Status")
        public String status;

        public static DescribeForwardTableEntriesResponseBodyForwardTableEntriesForwardTableEntry build(java.util.Map<String, ?> map) throws Exception {
            DescribeForwardTableEntriesResponseBodyForwardTableEntriesForwardTableEntry self = new DescribeForwardTableEntriesResponseBodyForwardTableEntriesForwardTableEntry();
            return TeaModel.build(map, self);
        }

        public DescribeForwardTableEntriesResponseBodyForwardTableEntriesForwardTableEntry setExternalIp(String externalIp) {
            this.externalIp = externalIp;
            return this;
        }
        public String getExternalIp() {
            return this.externalIp;
        }

        public DescribeForwardTableEntriesResponseBodyForwardTableEntriesForwardTableEntry setExternalPort(String externalPort) {
            this.externalPort = externalPort;
            return this;
        }
        public String getExternalPort() {
            return this.externalPort;
        }

        public DescribeForwardTableEntriesResponseBodyForwardTableEntriesForwardTableEntry setForwardEntryId(String forwardEntryId) {
            this.forwardEntryId = forwardEntryId;
            return this;
        }
        public String getForwardEntryId() {
            return this.forwardEntryId;
        }

        public DescribeForwardTableEntriesResponseBodyForwardTableEntriesForwardTableEntry setForwardEntryName(String forwardEntryName) {
            this.forwardEntryName = forwardEntryName;
            return this;
        }
        public String getForwardEntryName() {
            return this.forwardEntryName;
        }

        public DescribeForwardTableEntriesResponseBodyForwardTableEntriesForwardTableEntry setForwardTableId(String forwardTableId) {
            this.forwardTableId = forwardTableId;
            return this;
        }
        public String getForwardTableId() {
            return this.forwardTableId;
        }

        public DescribeForwardTableEntriesResponseBodyForwardTableEntriesForwardTableEntry setInternalIp(String internalIp) {
            this.internalIp = internalIp;
            return this;
        }
        public String getInternalIp() {
            return this.internalIp;
        }

        public DescribeForwardTableEntriesResponseBodyForwardTableEntriesForwardTableEntry setInternalPort(String internalPort) {
            this.internalPort = internalPort;
            return this;
        }
        public String getInternalPort() {
            return this.internalPort;
        }

        public DescribeForwardTableEntriesResponseBodyForwardTableEntriesForwardTableEntry setIpProtocol(String ipProtocol) {
            this.ipProtocol = ipProtocol;
            return this;
        }
        public String getIpProtocol() {
            return this.ipProtocol;
        }

        public DescribeForwardTableEntriesResponseBodyForwardTableEntriesForwardTableEntry setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class DescribeForwardTableEntriesResponseBodyForwardTableEntries extends TeaModel {
        @NameInMap("ForwardTableEntry")
        public java.util.List<DescribeForwardTableEntriesResponseBodyForwardTableEntriesForwardTableEntry> forwardTableEntry;

        public static DescribeForwardTableEntriesResponseBodyForwardTableEntries build(java.util.Map<String, ?> map) throws Exception {
            DescribeForwardTableEntriesResponseBodyForwardTableEntries self = new DescribeForwardTableEntriesResponseBodyForwardTableEntries();
            return TeaModel.build(map, self);
        }

        public DescribeForwardTableEntriesResponseBodyForwardTableEntries setForwardTableEntry(java.util.List<DescribeForwardTableEntriesResponseBodyForwardTableEntriesForwardTableEntry> forwardTableEntry) {
            this.forwardTableEntry = forwardTableEntry;
            return this;
        }
        public java.util.List<DescribeForwardTableEntriesResponseBodyForwardTableEntriesForwardTableEntry> getForwardTableEntry() {
            return this.forwardTableEntry;
        }

    }

}
