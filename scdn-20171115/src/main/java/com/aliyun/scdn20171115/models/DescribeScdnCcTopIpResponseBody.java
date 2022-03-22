// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.scdn20171115.models;

import com.aliyun.tea.*;

public class DescribeScdnCcTopIpResponseBody extends TeaModel {
    @NameInMap("AttackIpDataList")
    public DescribeScdnCcTopIpResponseBodyAttackIpDataList attackIpDataList;

    @NameInMap("DomainName")
    public String domainName;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Total")
    public String total;

    public static DescribeScdnCcTopIpResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeScdnCcTopIpResponseBody self = new DescribeScdnCcTopIpResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeScdnCcTopIpResponseBody setAttackIpDataList(DescribeScdnCcTopIpResponseBodyAttackIpDataList attackIpDataList) {
        this.attackIpDataList = attackIpDataList;
        return this;
    }
    public DescribeScdnCcTopIpResponseBodyAttackIpDataList getAttackIpDataList() {
        return this.attackIpDataList;
    }

    public DescribeScdnCcTopIpResponseBody setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public DescribeScdnCcTopIpResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeScdnCcTopIpResponseBody setTotal(String total) {
        this.total = total;
        return this;
    }
    public String getTotal() {
        return this.total;
    }

    public static class DescribeScdnCcTopIpResponseBodyAttackIpDataListAttackIpDatas extends TeaModel {
        @NameInMap("AttackCount")
        public String attackCount;

        @NameInMap("Ip")
        public String ip;

        public static DescribeScdnCcTopIpResponseBodyAttackIpDataListAttackIpDatas build(java.util.Map<String, ?> map) throws Exception {
            DescribeScdnCcTopIpResponseBodyAttackIpDataListAttackIpDatas self = new DescribeScdnCcTopIpResponseBodyAttackIpDataListAttackIpDatas();
            return TeaModel.build(map, self);
        }

        public DescribeScdnCcTopIpResponseBodyAttackIpDataListAttackIpDatas setAttackCount(String attackCount) {
            this.attackCount = attackCount;
            return this;
        }
        public String getAttackCount() {
            return this.attackCount;
        }

        public DescribeScdnCcTopIpResponseBodyAttackIpDataListAttackIpDatas setIp(String ip) {
            this.ip = ip;
            return this;
        }
        public String getIp() {
            return this.ip;
        }

    }

    public static class DescribeScdnCcTopIpResponseBodyAttackIpDataList extends TeaModel {
        @NameInMap("AttackIpDatas")
        public java.util.List<DescribeScdnCcTopIpResponseBodyAttackIpDataListAttackIpDatas> attackIpDatas;

        public static DescribeScdnCcTopIpResponseBodyAttackIpDataList build(java.util.Map<String, ?> map) throws Exception {
            DescribeScdnCcTopIpResponseBodyAttackIpDataList self = new DescribeScdnCcTopIpResponseBodyAttackIpDataList();
            return TeaModel.build(map, self);
        }

        public DescribeScdnCcTopIpResponseBodyAttackIpDataList setAttackIpDatas(java.util.List<DescribeScdnCcTopIpResponseBodyAttackIpDataListAttackIpDatas> attackIpDatas) {
            this.attackIpDatas = attackIpDatas;
            return this;
        }
        public java.util.List<DescribeScdnCcTopIpResponseBodyAttackIpDataListAttackIpDatas> getAttackIpDatas() {
            return this.attackIpDatas;
        }

    }

}
