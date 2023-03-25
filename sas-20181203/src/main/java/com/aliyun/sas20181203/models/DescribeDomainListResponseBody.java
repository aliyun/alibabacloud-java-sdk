// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeDomainListResponseBody extends TeaModel {
    /**
     * <p>An array that consists of the information about domain names.</p>
     */
    @NameInMap("DomainListResponseList")
    public java.util.List<DescribeDomainListResponseBodyDomainListResponseList> domainListResponseList;

    /**
     * <p>The pagination information.</p>
     */
    @NameInMap("PageInfo")
    public DescribeDomainListResponseBodyPageInfo pageInfo;

    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeDomainListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDomainListResponseBody self = new DescribeDomainListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDomainListResponseBody setDomainListResponseList(java.util.List<DescribeDomainListResponseBodyDomainListResponseList> domainListResponseList) {
        this.domainListResponseList = domainListResponseList;
        return this;
    }
    public java.util.List<DescribeDomainListResponseBodyDomainListResponseList> getDomainListResponseList() {
        return this.domainListResponseList;
    }

    public DescribeDomainListResponseBody setPageInfo(DescribeDomainListResponseBodyPageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }
    public DescribeDomainListResponseBodyPageInfo getPageInfo() {
        return this.pageInfo;
    }

    public DescribeDomainListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeDomainListResponseBodyDomainListResponseList extends TeaModel {
        /**
         * <p>The name of the domain or website.</p>
         */
        @NameInMap("Domain")
        public String domain;

        /**
         * <p>The IP addresses of the domain name.</p>
         */
        @NameInMap("IpList")
        public String ipList;

        public static DescribeDomainListResponseBodyDomainListResponseList build(java.util.Map<String, ?> map) throws Exception {
            DescribeDomainListResponseBodyDomainListResponseList self = new DescribeDomainListResponseBodyDomainListResponseList();
            return TeaModel.build(map, self);
        }

        public DescribeDomainListResponseBodyDomainListResponseList setDomain(String domain) {
            this.domain = domain;
            return this;
        }
        public String getDomain() {
            return this.domain;
        }

        public DescribeDomainListResponseBodyDomainListResponseList setIpList(String ipList) {
            this.ipList = ipList;
            return this;
        }
        public String getIpList() {
            return this.ipList;
        }

    }

    public static class DescribeDomainListResponseBodyPageInfo extends TeaModel {
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
         * <p>The number of entries returned per page. Default value: **10**.</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The total number of entries returned.</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static DescribeDomainListResponseBodyPageInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeDomainListResponseBodyPageInfo self = new DescribeDomainListResponseBodyPageInfo();
            return TeaModel.build(map, self);
        }

        public DescribeDomainListResponseBodyPageInfo setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

        public DescribeDomainListResponseBodyPageInfo setCurrentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        public DescribeDomainListResponseBodyPageInfo setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public DescribeDomainListResponseBodyPageInfo setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
