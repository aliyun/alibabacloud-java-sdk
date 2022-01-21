// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class DescribeSnatEntriesResponseBody extends TeaModel {
    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SnatEntries")
    public DescribeSnatEntriesResponseBodySnatEntries snatEntries;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeSnatEntriesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSnatEntriesResponseBody self = new DescribeSnatEntriesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSnatEntriesResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeSnatEntriesResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeSnatEntriesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSnatEntriesResponseBody setSnatEntries(DescribeSnatEntriesResponseBodySnatEntries snatEntries) {
        this.snatEntries = snatEntries;
        return this;
    }
    public DescribeSnatEntriesResponseBodySnatEntries getSnatEntries() {
        return this.snatEntries;
    }

    public DescribeSnatEntriesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeSnatEntriesResponseBodySnatEntriesSnatEntry extends TeaModel {
        @NameInMap("CidrBlock")
        public String cidrBlock;

        @NameInMap("CreateTime")
        public Long createTime;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("SnatIp")
        public String snatIp;

        public static DescribeSnatEntriesResponseBodySnatEntriesSnatEntry build(java.util.Map<String, ?> map) throws Exception {
            DescribeSnatEntriesResponseBodySnatEntriesSnatEntry self = new DescribeSnatEntriesResponseBodySnatEntriesSnatEntry();
            return TeaModel.build(map, self);
        }

        public DescribeSnatEntriesResponseBodySnatEntriesSnatEntry setCidrBlock(String cidrBlock) {
            this.cidrBlock = cidrBlock;
            return this;
        }
        public String getCidrBlock() {
            return this.cidrBlock;
        }

        public DescribeSnatEntriesResponseBodySnatEntriesSnatEntry setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public DescribeSnatEntriesResponseBodySnatEntriesSnatEntry setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeSnatEntriesResponseBodySnatEntriesSnatEntry setSnatIp(String snatIp) {
            this.snatIp = snatIp;
            return this;
        }
        public String getSnatIp() {
            return this.snatIp;
        }

    }

    public static class DescribeSnatEntriesResponseBodySnatEntries extends TeaModel {
        @NameInMap("SnatEntry")
        public java.util.List<DescribeSnatEntriesResponseBodySnatEntriesSnatEntry> snatEntry;

        public static DescribeSnatEntriesResponseBodySnatEntries build(java.util.Map<String, ?> map) throws Exception {
            DescribeSnatEntriesResponseBodySnatEntries self = new DescribeSnatEntriesResponseBodySnatEntries();
            return TeaModel.build(map, self);
        }

        public DescribeSnatEntriesResponseBodySnatEntries setSnatEntry(java.util.List<DescribeSnatEntriesResponseBodySnatEntriesSnatEntry> snatEntry) {
            this.snatEntry = snatEntry;
            return this;
        }
        public java.util.List<DescribeSnatEntriesResponseBodySnatEntriesSnatEntry> getSnatEntry() {
            return this.snatEntry;
        }

    }

}
