// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.scdn20171115.models;

import com.aliyun.tea.*;

public class DescribeScdnDomainCnameResponseBody extends TeaModel {
    @NameInMap("CnameDatas")
    public DescribeScdnDomainCnameResponseBodyCnameDatas cnameDatas;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeScdnDomainCnameResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeScdnDomainCnameResponseBody self = new DescribeScdnDomainCnameResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeScdnDomainCnameResponseBody setCnameDatas(DescribeScdnDomainCnameResponseBodyCnameDatas cnameDatas) {
        this.cnameDatas = cnameDatas;
        return this;
    }
    public DescribeScdnDomainCnameResponseBodyCnameDatas getCnameDatas() {
        return this.cnameDatas;
    }

    public DescribeScdnDomainCnameResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeScdnDomainCnameResponseBodyCnameDatasData extends TeaModel {
        @NameInMap("Cname")
        public String cname;

        @NameInMap("Domain")
        public String domain;

        @NameInMap("Status")
        public Integer status;

        public static DescribeScdnDomainCnameResponseBodyCnameDatasData build(java.util.Map<String, ?> map) throws Exception {
            DescribeScdnDomainCnameResponseBodyCnameDatasData self = new DescribeScdnDomainCnameResponseBodyCnameDatasData();
            return TeaModel.build(map, self);
        }

        public DescribeScdnDomainCnameResponseBodyCnameDatasData setCname(String cname) {
            this.cname = cname;
            return this;
        }
        public String getCname() {
            return this.cname;
        }

        public DescribeScdnDomainCnameResponseBodyCnameDatasData setDomain(String domain) {
            this.domain = domain;
            return this;
        }
        public String getDomain() {
            return this.domain;
        }

        public DescribeScdnDomainCnameResponseBodyCnameDatasData setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

    }

    public static class DescribeScdnDomainCnameResponseBodyCnameDatas extends TeaModel {
        @NameInMap("Data")
        public java.util.List<DescribeScdnDomainCnameResponseBodyCnameDatasData> data;

        public static DescribeScdnDomainCnameResponseBodyCnameDatas build(java.util.Map<String, ?> map) throws Exception {
            DescribeScdnDomainCnameResponseBodyCnameDatas self = new DescribeScdnDomainCnameResponseBodyCnameDatas();
            return TeaModel.build(map, self);
        }

        public DescribeScdnDomainCnameResponseBodyCnameDatas setData(java.util.List<DescribeScdnDomainCnameResponseBodyCnameDatasData> data) {
            this.data = data;
            return this;
        }
        public java.util.List<DescribeScdnDomainCnameResponseBodyCnameDatasData> getData() {
            return this.data;
        }

    }

}
