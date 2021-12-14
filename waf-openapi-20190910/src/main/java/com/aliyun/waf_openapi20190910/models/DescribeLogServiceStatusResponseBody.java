// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20190910.models;

import com.aliyun.tea.*;

public class DescribeLogServiceStatusResponseBody extends TeaModel {
    @NameInMap("DomainStatus")
    public java.util.List<DescribeLogServiceStatusResponseBodyDomainStatus> domainStatus;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeLogServiceStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeLogServiceStatusResponseBody self = new DescribeLogServiceStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeLogServiceStatusResponseBody setDomainStatus(java.util.List<DescribeLogServiceStatusResponseBodyDomainStatus> domainStatus) {
        this.domainStatus = domainStatus;
        return this;
    }
    public java.util.List<DescribeLogServiceStatusResponseBodyDomainStatus> getDomainStatus() {
        return this.domainStatus;
    }

    public DescribeLogServiceStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeLogServiceStatusResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeLogServiceStatusResponseBodyDomainStatus extends TeaModel {
        @NameInMap("Domain")
        public String domain;

        @NameInMap("SlsLogActive")
        public Integer slsLogActive;

        public static DescribeLogServiceStatusResponseBodyDomainStatus build(java.util.Map<String, ?> map) throws Exception {
            DescribeLogServiceStatusResponseBodyDomainStatus self = new DescribeLogServiceStatusResponseBodyDomainStatus();
            return TeaModel.build(map, self);
        }

        public DescribeLogServiceStatusResponseBodyDomainStatus setDomain(String domain) {
            this.domain = domain;
            return this;
        }
        public String getDomain() {
            return this.domain;
        }

        public DescribeLogServiceStatusResponseBodyDomainStatus setSlsLogActive(Integer slsLogActive) {
            this.slsLogActive = slsLogActive;
            return this;
        }
        public Integer getSlsLogActive() {
            return this.slsLogActive;
        }

    }

}
