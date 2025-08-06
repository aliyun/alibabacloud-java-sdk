// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DescribeVodDomainCnameResponseBody extends TeaModel {
    @NameInMap("CnameDatas")
    public DescribeVodDomainCnameResponseBodyCnameDatas cnameDatas;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeVodDomainCnameResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeVodDomainCnameResponseBody self = new DescribeVodDomainCnameResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeVodDomainCnameResponseBody setCnameDatas(DescribeVodDomainCnameResponseBodyCnameDatas cnameDatas) {
        this.cnameDatas = cnameDatas;
        return this;
    }
    public DescribeVodDomainCnameResponseBodyCnameDatas getCnameDatas() {
        return this.cnameDatas;
    }

    public DescribeVodDomainCnameResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeVodDomainCnameResponseBodyCnameDatasData extends TeaModel {
        @NameInMap("Cname")
        public String cname;

        @NameInMap("Domain")
        public String domain;

        @NameInMap("Status")
        public Integer status;

        public static DescribeVodDomainCnameResponseBodyCnameDatasData build(java.util.Map<String, ?> map) throws Exception {
            DescribeVodDomainCnameResponseBodyCnameDatasData self = new DescribeVodDomainCnameResponseBodyCnameDatasData();
            return TeaModel.build(map, self);
        }

        public DescribeVodDomainCnameResponseBodyCnameDatasData setCname(String cname) {
            this.cname = cname;
            return this;
        }
        public String getCname() {
            return this.cname;
        }

        public DescribeVodDomainCnameResponseBodyCnameDatasData setDomain(String domain) {
            this.domain = domain;
            return this;
        }
        public String getDomain() {
            return this.domain;
        }

        public DescribeVodDomainCnameResponseBodyCnameDatasData setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

    }

    public static class DescribeVodDomainCnameResponseBodyCnameDatas extends TeaModel {
        @NameInMap("Data")
        public java.util.List<DescribeVodDomainCnameResponseBodyCnameDatasData> data;

        public static DescribeVodDomainCnameResponseBodyCnameDatas build(java.util.Map<String, ?> map) throws Exception {
            DescribeVodDomainCnameResponseBodyCnameDatas self = new DescribeVodDomainCnameResponseBodyCnameDatas();
            return TeaModel.build(map, self);
        }

        public DescribeVodDomainCnameResponseBodyCnameDatas setData(java.util.List<DescribeVodDomainCnameResponseBodyCnameDatasData> data) {
            this.data = data;
            return this;
        }
        public java.util.List<DescribeVodDomainCnameResponseBodyCnameDatasData> getData() {
            return this.data;
        }

    }

}
