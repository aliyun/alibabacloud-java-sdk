// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeAllRegionsStatisticsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public DescribeAllRegionsStatisticsResponseBodyData data;

    public static DescribeAllRegionsStatisticsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAllRegionsStatisticsResponseBody self = new DescribeAllRegionsStatisticsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAllRegionsStatisticsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAllRegionsStatisticsResponseBody setData(DescribeAllRegionsStatisticsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeAllRegionsStatisticsResponseBodyData getData() {
        return this.data;
    }

    public static class DescribeAllRegionsStatisticsResponseBodyData extends TeaModel {
        @NameInMap("Account")
        public Integer account;

        @NameInMap("Vul")
        public Integer vul;

        @NameInMap("Health")
        public Integer health;

        @NameInMap("Trojan")
        public Integer trojan;

        @NameInMap("NewSuspicious")
        public Integer newSuspicious;

        @NameInMap("Suspicious")
        public Integer suspicious;

        public static DescribeAllRegionsStatisticsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeAllRegionsStatisticsResponseBodyData self = new DescribeAllRegionsStatisticsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeAllRegionsStatisticsResponseBodyData setAccount(Integer account) {
            this.account = account;
            return this;
        }
        public Integer getAccount() {
            return this.account;
        }

        public DescribeAllRegionsStatisticsResponseBodyData setVul(Integer vul) {
            this.vul = vul;
            return this;
        }
        public Integer getVul() {
            return this.vul;
        }

        public DescribeAllRegionsStatisticsResponseBodyData setHealth(Integer health) {
            this.health = health;
            return this;
        }
        public Integer getHealth() {
            return this.health;
        }

        public DescribeAllRegionsStatisticsResponseBodyData setTrojan(Integer trojan) {
            this.trojan = trojan;
            return this;
        }
        public Integer getTrojan() {
            return this.trojan;
        }

        public DescribeAllRegionsStatisticsResponseBodyData setNewSuspicious(Integer newSuspicious) {
            this.newSuspicious = newSuspicious;
            return this;
        }
        public Integer getNewSuspicious() {
            return this.newSuspicious;
        }

        public DescribeAllRegionsStatisticsResponseBodyData setSuspicious(Integer suspicious) {
            this.suspicious = suspicious;
            return this;
        }
        public Integer getSuspicious() {
            return this.suspicious;
        }

    }

}
