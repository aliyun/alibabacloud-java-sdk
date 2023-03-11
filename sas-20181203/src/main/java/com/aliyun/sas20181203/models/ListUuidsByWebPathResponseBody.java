// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListUuidsByWebPathResponseBody extends TeaModel {
    /**
     * <p>An array that consists of the protected assets.</p>
     */
    @NameInMap("List")
    public java.util.List<ListUuidsByWebPathResponseBodyList> list;

    /**
     * <p>The pagination information.</p>
     */
    @NameInMap("PageInfo")
    public ListUuidsByWebPathResponseBodyPageInfo pageInfo;

    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     */
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
        /**
         * <p>The public IP address of the server.</p>
         */
        @NameInMap("InternetIp")
        public String internetIp;

        /**
         * <p>The private IP address of the server.</p>
         */
        @NameInMap("IntranetIp")
        public String intranetIp;

        /**
         * <p>The name of the server.</p>
         */
        @NameInMap("MachineName")
        public String machineName;

        /**
         * <p>The UUID of the server.</p>
         */
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
        /**
         * <p>The number of entries returned on the current page.</p>
         */
        @NameInMap("Count")
        public Integer count;

        /**
         * <p>The page number of the returned page.</p>
         */
        @NameInMap("CurrentPage")
        public Integer currentPage;

        /**
         * <p>The number of entries returned per page.</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The total number of entries returned.</p>
         */
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
