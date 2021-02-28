// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.scdn20171115.models;

import com.aliyun.tea.*;

public class DescribeScdnCcTopUrlResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("DomainName")
    public String domainName;

    @NameInMap("Total")
    public String total;

    @NameInMap("AttackUrlDataList")
    public DescribeScdnCcTopUrlResponseBodyAttackUrlDataList attackUrlDataList;

    public static DescribeScdnCcTopUrlResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeScdnCcTopUrlResponseBody self = new DescribeScdnCcTopUrlResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeScdnCcTopUrlResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeScdnCcTopUrlResponseBody setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public DescribeScdnCcTopUrlResponseBody setTotal(String total) {
        this.total = total;
        return this;
    }
    public String getTotal() {
        return this.total;
    }

    public DescribeScdnCcTopUrlResponseBody setAttackUrlDataList(DescribeScdnCcTopUrlResponseBodyAttackUrlDataList attackUrlDataList) {
        this.attackUrlDataList = attackUrlDataList;
        return this;
    }
    public DescribeScdnCcTopUrlResponseBodyAttackUrlDataList getAttackUrlDataList() {
        return this.attackUrlDataList;
    }

    public static class DescribeScdnCcTopUrlResponseBodyAttackUrlDataListAttackUrlDatas extends TeaModel {
        @NameInMap("Url")
        public String url;

        @NameInMap("AttackCount")
        public String attackCount;

        public static DescribeScdnCcTopUrlResponseBodyAttackUrlDataListAttackUrlDatas build(java.util.Map<String, ?> map) throws Exception {
            DescribeScdnCcTopUrlResponseBodyAttackUrlDataListAttackUrlDatas self = new DescribeScdnCcTopUrlResponseBodyAttackUrlDataListAttackUrlDatas();
            return TeaModel.build(map, self);
        }

        public DescribeScdnCcTopUrlResponseBodyAttackUrlDataListAttackUrlDatas setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

        public DescribeScdnCcTopUrlResponseBodyAttackUrlDataListAttackUrlDatas setAttackCount(String attackCount) {
            this.attackCount = attackCount;
            return this;
        }
        public String getAttackCount() {
            return this.attackCount;
        }

    }

    public static class DescribeScdnCcTopUrlResponseBodyAttackUrlDataList extends TeaModel {
        @NameInMap("AttackUrlDatas")
        public java.util.List<DescribeScdnCcTopUrlResponseBodyAttackUrlDataListAttackUrlDatas> attackUrlDatas;

        public static DescribeScdnCcTopUrlResponseBodyAttackUrlDataList build(java.util.Map<String, ?> map) throws Exception {
            DescribeScdnCcTopUrlResponseBodyAttackUrlDataList self = new DescribeScdnCcTopUrlResponseBodyAttackUrlDataList();
            return TeaModel.build(map, self);
        }

        public DescribeScdnCcTopUrlResponseBodyAttackUrlDataList setAttackUrlDatas(java.util.List<DescribeScdnCcTopUrlResponseBodyAttackUrlDataListAttackUrlDatas> attackUrlDatas) {
            this.attackUrlDatas = attackUrlDatas;
            return this;
        }
        public java.util.List<DescribeScdnCcTopUrlResponseBodyAttackUrlDataListAttackUrlDatas> getAttackUrlDatas() {
            return this.attackUrlDatas;
        }

    }

}
