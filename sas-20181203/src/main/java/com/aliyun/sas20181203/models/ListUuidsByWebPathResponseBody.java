// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListUuidsByWebPathResponseBody extends TeaModel {
    @NameInMap("List")
    public java.util.List<ListUuidsByWebPathResponseBodyList> list;

    @NameInMap("PageInfo")
    public ListUuidsByWebPathResponseBodyPageInfo pageInfo;

    @NameInMap("RequestId")
    public String requestId;

    public static ListUuidsByWebPathResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListUuidsByWebPathResponseBody self = new ListUuidsByWebPathResponseBody();
        return TeaModel.build(map, self);
    }

    public ListUuidsByWebPathResponseBody setList(java.util.List<ListUuidsByWebPathResponseBodyList> list) {
        this.list = list;
        return this;
    }
    public java.util.List<ListUuidsByWebPathResponseBodyList> getList() {
        return this.list;
    }

    public ListUuidsByWebPathResponseBody setPageInfo(ListUuidsByWebPathResponseBodyPageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }
    public ListUuidsByWebPathResponseBodyPageInfo getPageInfo() {
        return this.pageInfo;
    }

    public ListUuidsByWebPathResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListUuidsByWebPathResponseBodyList extends TeaModel {
        @NameInMap("InternetIp")
        public String internetIp;

        @NameInMap("IntranetIp")
        public String intranetIp;

        @NameInMap("MachineName")
        public String machineName;

        @NameInMap("Uuid")
        public String uuid;

        public static ListUuidsByWebPathResponseBodyList build(java.util.Map<String, ?> map) throws Exception {
            ListUuidsByWebPathResponseBodyList self = new ListUuidsByWebPathResponseBodyList();
            return TeaModel.build(map, self);
        }

        public ListUuidsByWebPathResponseBodyList setInternetIp(String internetIp) {
            this.internetIp = internetIp;
            return this;
        }
        public String getInternetIp() {
            return this.internetIp;
        }

        public ListUuidsByWebPathResponseBodyList setIntranetIp(String intranetIp) {
            this.intranetIp = intranetIp;
            return this;
        }
        public String getIntranetIp() {
            return this.intranetIp;
        }

        public ListUuidsByWebPathResponseBodyList setMachineName(String machineName) {
            this.machineName = machineName;
            return this;
        }
        public String getMachineName() {
            return this.machineName;
        }

        public ListUuidsByWebPathResponseBodyList setUuid(String uuid) {
            this.uuid = uuid;
            return this;
        }
        public String getUuid() {
            return this.uuid;
        }

    }

    public static class ListUuidsByWebPathResponseBodyPageInfo extends TeaModel {
        @NameInMap("Count")
        public Integer count;

        @NameInMap("CurrentPage")
        public Integer currentPage;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("TotalCount")
        public Integer totalCount;

        public static ListUuidsByWebPathResponseBodyPageInfo build(java.util.Map<String, ?> map) throws Exception {
            ListUuidsByWebPathResponseBodyPageInfo self = new ListUuidsByWebPathResponseBodyPageInfo();
            return TeaModel.build(map, self);
        }

        public ListUuidsByWebPathResponseBodyPageInfo setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

        public ListUuidsByWebPathResponseBodyPageInfo setCurrentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        public ListUuidsByWebPathResponseBodyPageInfo setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListUuidsByWebPathResponseBodyPageInfo setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
