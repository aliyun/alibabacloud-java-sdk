// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.uis20180821.models;

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

    @NameInMap("UisDnatEntries")
    public DescribeDnatEntriesResponseBodyUisDnatEntries uisDnatEntries;

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

    public DescribeDnatEntriesResponseBody setUisDnatEntries(DescribeDnatEntriesResponseBodyUisDnatEntries uisDnatEntries) {
        this.uisDnatEntries = uisDnatEntries;
        return this;
    }
    public DescribeDnatEntriesResponseBodyUisDnatEntries getUisDnatEntries() {
        return this.uisDnatEntries;
    }

    public static class DescribeDnatEntriesResponseBodyUisDnatEntriesUisDnatEntry extends TeaModel {
        @NameInMap("OriginalPort")
        public Integer originalPort;

        @NameInMap("DestinationPort")
        public Integer destinationPort;

        @NameInMap("OriginalIp")
        public String originalIp;

        @NameInMap("IpProtocol")
        public String ipProtocol;

        @NameInMap("UisDnatId")
        public String uisDnatId;

        @NameInMap("DestinationIp")
        public String destinationIp;

        public static DescribeDnatEntriesResponseBodyUisDnatEntriesUisDnatEntry build(java.util.Map<String, ?> map) throws Exception {
            DescribeDnatEntriesResponseBodyUisDnatEntriesUisDnatEntry self = new DescribeDnatEntriesResponseBodyUisDnatEntriesUisDnatEntry();
            return TeaModel.build(map, self);
        }

        public DescribeDnatEntriesResponseBodyUisDnatEntriesUisDnatEntry setOriginalPort(Integer originalPort) {
            this.originalPort = originalPort;
            return this;
        }
        public Integer getOriginalPort() {
            return this.originalPort;
        }

        public DescribeDnatEntriesResponseBodyUisDnatEntriesUisDnatEntry setDestinationPort(Integer destinationPort) {
            this.destinationPort = destinationPort;
            return this;
        }
        public Integer getDestinationPort() {
            return this.destinationPort;
        }

        public DescribeDnatEntriesResponseBodyUisDnatEntriesUisDnatEntry setOriginalIp(String originalIp) {
            this.originalIp = originalIp;
            return this;
        }
        public String getOriginalIp() {
            return this.originalIp;
        }

        public DescribeDnatEntriesResponseBodyUisDnatEntriesUisDnatEntry setIpProtocol(String ipProtocol) {
            this.ipProtocol = ipProtocol;
            return this;
        }
        public String getIpProtocol() {
            return this.ipProtocol;
        }

        public DescribeDnatEntriesResponseBodyUisDnatEntriesUisDnatEntry setUisDnatId(String uisDnatId) {
            this.uisDnatId = uisDnatId;
            return this;
        }
        public String getUisDnatId() {
            return this.uisDnatId;
        }

        public DescribeDnatEntriesResponseBodyUisDnatEntriesUisDnatEntry setDestinationIp(String destinationIp) {
            this.destinationIp = destinationIp;
            return this;
        }
        public String getDestinationIp() {
            return this.destinationIp;
        }

    }

    public static class DescribeDnatEntriesResponseBodyUisDnatEntries extends TeaModel {
        @NameInMap("UisDnatEntry")
        public java.util.List<DescribeDnatEntriesResponseBodyUisDnatEntriesUisDnatEntry> uisDnatEntry;

        public static DescribeDnatEntriesResponseBodyUisDnatEntries build(java.util.Map<String, ?> map) throws Exception {
            DescribeDnatEntriesResponseBodyUisDnatEntries self = new DescribeDnatEntriesResponseBodyUisDnatEntries();
            return TeaModel.build(map, self);
        }

        public DescribeDnatEntriesResponseBodyUisDnatEntries setUisDnatEntry(java.util.List<DescribeDnatEntriesResponseBodyUisDnatEntriesUisDnatEntry> uisDnatEntry) {
            this.uisDnatEntry = uisDnatEntry;
            return this;
        }
        public java.util.List<DescribeDnatEntriesResponseBodyUisDnatEntriesUisDnatEntry> getUisDnatEntry() {
            return this.uisDnatEntry;
        }

    }

}
