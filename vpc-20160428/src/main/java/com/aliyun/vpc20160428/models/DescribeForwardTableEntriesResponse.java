// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribeForwardTableEntriesResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("TotalCount")
    @Validation(required = true)
    public Integer totalCount;

    @NameInMap("PageNumber")
    @Validation(required = true)
    public Integer pageNumber;

    @NameInMap("PageSize")
    @Validation(required = true)
    public Integer pageSize;

    @NameInMap("ForwardTableEntries")
    @Validation(required = true)
    public DescribeForwardTableEntriesResponseForwardTableEntries forwardTableEntries;

    public static DescribeForwardTableEntriesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeForwardTableEntriesResponse self = new DescribeForwardTableEntriesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeForwardTableEntriesResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeForwardTableEntriesResponse setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public DescribeForwardTableEntriesResponse setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeForwardTableEntriesResponse setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeForwardTableEntriesResponse setForwardTableEntries(DescribeForwardTableEntriesResponseForwardTableEntries forwardTableEntries) {
        this.forwardTableEntries = forwardTableEntries;
        return this;
    }
    public DescribeForwardTableEntriesResponseForwardTableEntries getForwardTableEntries() {
        return this.forwardTableEntries;
    }

    public static class DescribeForwardTableEntriesResponseForwardTableEntriesForwardTableEntry extends TeaModel {
        @NameInMap("ForwardTableId")
        @Validation(required = true)
        public String forwardTableId;

        @NameInMap("ForwardEntryId")
        @Validation(required = true)
        public String forwardEntryId;

        @NameInMap("ExternalIp")
        @Validation(required = true)
        public String externalIp;

        @NameInMap("ExternalPort")
        @Validation(required = true)
        public String externalPort;

        @NameInMap("IpProtocol")
        @Validation(required = true)
        public String ipProtocol;

        @NameInMap("InternalIp")
        @Validation(required = true)
        public String internalIp;

        @NameInMap("InternalPort")
        @Validation(required = true)
        public String internalPort;

        @NameInMap("Status")
        @Validation(required = true)
        public String status;

        @NameInMap("ForwardEntryName")
        @Validation(required = true)
        public String forwardEntryName;

        public static DescribeForwardTableEntriesResponseForwardTableEntriesForwardTableEntry build(java.util.Map<String, ?> map) throws Exception {
            DescribeForwardTableEntriesResponseForwardTableEntriesForwardTableEntry self = new DescribeForwardTableEntriesResponseForwardTableEntriesForwardTableEntry();
            return TeaModel.build(map, self);
        }

        public DescribeForwardTableEntriesResponseForwardTableEntriesForwardTableEntry setForwardTableId(String forwardTableId) {
            this.forwardTableId = forwardTableId;
            return this;
        }
        public String getForwardTableId() {
            return this.forwardTableId;
        }

        public DescribeForwardTableEntriesResponseForwardTableEntriesForwardTableEntry setForwardEntryId(String forwardEntryId) {
            this.forwardEntryId = forwardEntryId;
            return this;
        }
        public String getForwardEntryId() {
            return this.forwardEntryId;
        }

        public DescribeForwardTableEntriesResponseForwardTableEntriesForwardTableEntry setExternalIp(String externalIp) {
            this.externalIp = externalIp;
            return this;
        }
        public String getExternalIp() {
            return this.externalIp;
        }

        public DescribeForwardTableEntriesResponseForwardTableEntriesForwardTableEntry setExternalPort(String externalPort) {
            this.externalPort = externalPort;
            return this;
        }
        public String getExternalPort() {
            return this.externalPort;
        }

        public DescribeForwardTableEntriesResponseForwardTableEntriesForwardTableEntry setIpProtocol(String ipProtocol) {
            this.ipProtocol = ipProtocol;
            return this;
        }
        public String getIpProtocol() {
            return this.ipProtocol;
        }

        public DescribeForwardTableEntriesResponseForwardTableEntriesForwardTableEntry setInternalIp(String internalIp) {
            this.internalIp = internalIp;
            return this;
        }
        public String getInternalIp() {
            return this.internalIp;
        }

        public DescribeForwardTableEntriesResponseForwardTableEntriesForwardTableEntry setInternalPort(String internalPort) {
            this.internalPort = internalPort;
            return this;
        }
        public String getInternalPort() {
            return this.internalPort;
        }

        public DescribeForwardTableEntriesResponseForwardTableEntriesForwardTableEntry setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeForwardTableEntriesResponseForwardTableEntriesForwardTableEntry setForwardEntryName(String forwardEntryName) {
            this.forwardEntryName = forwardEntryName;
            return this;
        }
        public String getForwardEntryName() {
            return this.forwardEntryName;
        }

    }

    public static class DescribeForwardTableEntriesResponseForwardTableEntries extends TeaModel {
        @NameInMap("ForwardTableEntry")
        @Validation(required = true)
        public java.util.List<DescribeForwardTableEntriesResponseForwardTableEntriesForwardTableEntry> forwardTableEntry;

        public static DescribeForwardTableEntriesResponseForwardTableEntries build(java.util.Map<String, ?> map) throws Exception {
            DescribeForwardTableEntriesResponseForwardTableEntries self = new DescribeForwardTableEntriesResponseForwardTableEntries();
            return TeaModel.build(map, self);
        }

        public DescribeForwardTableEntriesResponseForwardTableEntries setForwardTableEntry(java.util.List<DescribeForwardTableEntriesResponseForwardTableEntriesForwardTableEntry> forwardTableEntry) {
            this.forwardTableEntry = forwardTableEntry;
            return this;
        }
        public java.util.List<DescribeForwardTableEntriesResponseForwardTableEntriesForwardTableEntry> getForwardTableEntry() {
            return this.forwardTableEntry;
        }

    }

}
