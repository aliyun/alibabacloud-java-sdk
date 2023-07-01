// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListAgentlessRelateMaliciousResponseBody extends TeaModel {
    @NameInMap("List")
    public java.util.List<ListAgentlessRelateMaliciousResponseBodyList> list;

    @NameInMap("PageInfo")
    public ListAgentlessRelateMaliciousResponseBodyPageInfo pageInfo;

    @NameInMap("RequestId")
    public String requestId;

    public static ListAgentlessRelateMaliciousResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAgentlessRelateMaliciousResponseBody self = new ListAgentlessRelateMaliciousResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAgentlessRelateMaliciousResponseBody setList(java.util.List<ListAgentlessRelateMaliciousResponseBodyList> list) {
        this.list = list;
        return this;
    }
    public java.util.List<ListAgentlessRelateMaliciousResponseBodyList> getList() {
        return this.list;
    }

    public ListAgentlessRelateMaliciousResponseBody setPageInfo(ListAgentlessRelateMaliciousResponseBodyPageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }
    public ListAgentlessRelateMaliciousResponseBodyPageInfo getPageInfo() {
        return this.pageInfo;
    }

    public ListAgentlessRelateMaliciousResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListAgentlessRelateMaliciousResponseBodyList extends TeaModel {
        @NameInMap("FilePath")
        public String filePath;

        @NameInMap("FirstScanTimestamp")
        public Long firstScanTimestamp;

        @NameInMap("InstanceName")
        public String instanceName;

        @NameInMap("InternetIp")
        public String internetIp;

        @NameInMap("IntranetIp")
        public String intranetIp;

        @NameInMap("LatestScanTimestamp")
        public Long latestScanTimestamp;

        @NameInMap("Uuid")
        public String uuid;

        public static ListAgentlessRelateMaliciousResponseBodyList build(java.util.Map<String, ?> map) throws Exception {
            ListAgentlessRelateMaliciousResponseBodyList self = new ListAgentlessRelateMaliciousResponseBodyList();
            return TeaModel.build(map, self);
        }

        public ListAgentlessRelateMaliciousResponseBodyList setFilePath(String filePath) {
            this.filePath = filePath;
            return this;
        }
        public String getFilePath() {
            return this.filePath;
        }

        public ListAgentlessRelateMaliciousResponseBodyList setFirstScanTimestamp(Long firstScanTimestamp) {
            this.firstScanTimestamp = firstScanTimestamp;
            return this;
        }
        public Long getFirstScanTimestamp() {
            return this.firstScanTimestamp;
        }

        public ListAgentlessRelateMaliciousResponseBodyList setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public ListAgentlessRelateMaliciousResponseBodyList setInternetIp(String internetIp) {
            this.internetIp = internetIp;
            return this;
        }
        public String getInternetIp() {
            return this.internetIp;
        }

        public ListAgentlessRelateMaliciousResponseBodyList setIntranetIp(String intranetIp) {
            this.intranetIp = intranetIp;
            return this;
        }
        public String getIntranetIp() {
            return this.intranetIp;
        }

        public ListAgentlessRelateMaliciousResponseBodyList setLatestScanTimestamp(Long latestScanTimestamp) {
            this.latestScanTimestamp = latestScanTimestamp;
            return this;
        }
        public Long getLatestScanTimestamp() {
            return this.latestScanTimestamp;
        }

        public ListAgentlessRelateMaliciousResponseBodyList setUuid(String uuid) {
            this.uuid = uuid;
            return this;
        }
        public String getUuid() {
            return this.uuid;
        }

    }

    public static class ListAgentlessRelateMaliciousResponseBodyPageInfo extends TeaModel {
        @NameInMap("Count")
        public Integer count;

        @NameInMap("CurrentPage")
        public Integer currentPage;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("TotalCount")
        public Integer totalCount;

        public static ListAgentlessRelateMaliciousResponseBodyPageInfo build(java.util.Map<String, ?> map) throws Exception {
            ListAgentlessRelateMaliciousResponseBodyPageInfo self = new ListAgentlessRelateMaliciousResponseBodyPageInfo();
            return TeaModel.build(map, self);
        }

        public ListAgentlessRelateMaliciousResponseBodyPageInfo setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

        public ListAgentlessRelateMaliciousResponseBodyPageInfo setCurrentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        public ListAgentlessRelateMaliciousResponseBodyPageInfo setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListAgentlessRelateMaliciousResponseBodyPageInfo setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
