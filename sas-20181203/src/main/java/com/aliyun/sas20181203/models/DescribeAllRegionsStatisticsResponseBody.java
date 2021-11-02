// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeAllRegionsStatisticsResponseBody extends TeaModel {
    @NameInMap("Data")
    public DescribeAllRegionsStatisticsResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeAllRegionsStatisticsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAllRegionsStatisticsResponseBody self = new DescribeAllRegionsStatisticsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAllRegionsStatisticsResponseBody setData(DescribeAllRegionsStatisticsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeAllRegionsStatisticsResponseBodyData getData() {
        return this.data;
    }

    public DescribeAllRegionsStatisticsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeAllRegionsStatisticsResponseBodyData extends TeaModel {
        @NameInMap("Account")
        public Integer account;

        @NameInMap("Health")
        public Integer health;

        @NameInMap("NewSuspicious")
        public Integer newSuspicious;

        @NameInMap("Suspicious")
        public Integer suspicious;

        @NameInMap("Trojan")
        public Integer trojan;

        @NameInMap("Vul")
        public Integer vul;

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

        public DescribeAllRegionsStatisticsResponseBodyData setHealth(Integer health) {
            this.health = health;
            return this;
        }
        public Integer getHealth() {
            return this.health;
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

        public DescribeAllRegionsStatisticsResponseBodyData setTrojan(Integer trojan) {
            this.trojan = trojan;
            return this;
        }
        public Integer getTrojan() {
            return this.trojan;
        }

        public DescribeAllRegionsStatisticsResponseBodyData setVul(Integer vul) {
            this.vul = vul;
            return this;
        }
        public Integer getVul() {
            return this.vul;
        }

    }

}
