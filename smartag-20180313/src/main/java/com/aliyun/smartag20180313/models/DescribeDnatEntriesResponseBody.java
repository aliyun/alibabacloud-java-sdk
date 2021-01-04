// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class DescribeDnatEntriesResponseBody extends TeaModel {
    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("DnatEntries")
    public DescribeDnatEntriesResponseBodyDnatEntries dnatEntries;

    public static DescribeDnatEntriesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDnatEntriesResponseBody self = new DescribeDnatEntriesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDnatEntriesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public DescribeDnatEntriesResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeDnatEntriesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDnatEntriesResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeDnatEntriesResponseBody setDnatEntries(DescribeDnatEntriesResponseBodyDnatEntries dnatEntries) {
        this.dnatEntries = dnatEntries;
        return this;
    }
    public DescribeDnatEntriesResponseBodyDnatEntries getDnatEntries() {
        return this.dnatEntries;
    }

    public static class DescribeDnatEntriesResponseBodyDnatEntriesDnatEntry extends TeaModel {
        @NameInMap("Type")
        public String type;

        @NameInMap("SagId")
        public String sagId;

        @NameInMap("InternalIp")
        public String internalIp;

        @NameInMap("InternalPort")
        public String internalPort;

        @NameInMap("IpProtocol")
        public String ipProtocol;

        @NameInMap("ExternalPort")
        public String externalPort;

        @NameInMap("DnatEntryId")
        public String dnatEntryId;

        @NameInMap("ExternalIp")
        public String externalIp;

        public static DescribeDnatEntriesResponseBodyDnatEntriesDnatEntry build(java.util.Map<String, ?> map) throws Exception {
            DescribeDnatEntriesResponseBodyDnatEntriesDnatEntry self = new DescribeDnatEntriesResponseBodyDnatEntriesDnatEntry();
            return TeaModel.build(map, self);
        }

        public DescribeDnatEntriesResponseBodyDnatEntriesDnatEntry setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribeDnatEntriesResponseBodyDnatEntriesDnatEntry setSagId(String sagId) {
            this.sagId = sagId;
            return this;
        }
        public String getSagId() {
            return this.sagId;
        }

        public DescribeDnatEntriesResponseBodyDnatEntriesDnatEntry setInternalIp(String internalIp) {
            this.internalIp = internalIp;
            return this;
        }
        public String getInternalIp() {
            return this.internalIp;
        }

        public DescribeDnatEntriesResponseBodyDnatEntriesDnatEntry setInternalPort(String internalPort) {
            this.internalPort = internalPort;
            return this;
        }
        public String getInternalPort() {
            return this.internalPort;
        }

        public DescribeDnatEntriesResponseBodyDnatEntriesDnatEntry setIpProtocol(String ipProtocol) {
            this.ipProtocol = ipProtocol;
            return this;
        }
        public String getIpProtocol() {
            return this.ipProtocol;
        }

        public DescribeDnatEntriesResponseBodyDnatEntriesDnatEntry setExternalPort(String externalPort) {
            this.externalPort = externalPort;
            return this;
        }
        public String getExternalPort() {
            return this.externalPort;
        }

        public DescribeDnatEntriesResponseBodyDnatEntriesDnatEntry setDnatEntryId(String dnatEntryId) {
            this.dnatEntryId = dnatEntryId;
            return this;
        }
        public String getDnatEntryId() {
            return this.dnatEntryId;
        }

        public DescribeDnatEntriesResponseBodyDnatEntriesDnatEntry setExternalIp(String externalIp) {
            this.externalIp = externalIp;
            return this;
        }
        public String getExternalIp() {
            return this.externalIp;
        }

    }

    public static class DescribeDnatEntriesResponseBodyDnatEntries extends TeaModel {
        @NameInMap("DnatEntry")
        public java.util.List<DescribeDnatEntriesResponseBodyDnatEntriesDnatEntry> dnatEntry;

        public static DescribeDnatEntriesResponseBodyDnatEntries build(java.util.Map<String, ?> map) throws Exception {
            DescribeDnatEntriesResponseBodyDnatEntries self = new DescribeDnatEntriesResponseBodyDnatEntries();
            return TeaModel.build(map, self);
        }

        public DescribeDnatEntriesResponseBodyDnatEntries setDnatEntry(java.util.List<DescribeDnatEntriesResponseBodyDnatEntriesDnatEntry> dnatEntry) {
            this.dnatEntry = dnatEntry;
            return this;
        }
        public java.util.List<DescribeDnatEntriesResponseBodyDnatEntriesDnatEntry> getDnatEntry() {
            return this.dnatEntry;
        }

    }

}
