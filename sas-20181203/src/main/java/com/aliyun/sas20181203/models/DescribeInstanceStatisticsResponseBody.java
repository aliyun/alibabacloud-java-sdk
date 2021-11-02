// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeInstanceStatisticsResponseBody extends TeaModel {
    @NameInMap("Data")
    public java.util.List<DescribeInstanceStatisticsResponseBodyData> data;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeInstanceStatisticsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceStatisticsResponseBody self = new DescribeInstanceStatisticsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceStatisticsResponseBody setData(java.util.List<DescribeInstanceStatisticsResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<DescribeInstanceStatisticsResponseBodyData> getData() {
        return this.data;
    }

    public DescribeInstanceStatisticsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeInstanceStatisticsResponseBodyData extends TeaModel {
        @NameInMap("Account")
        public Integer account;

        @NameInMap("AppNum")
        public Integer appNum;

        @NameInMap("CmsNum")
        public Integer cmsNum;

        @NameInMap("CveNum")
        public Integer cveNum;

        @NameInMap("EmgNum")
        public Integer emgNum;

        @NameInMap("Health")
        public Integer health;

        @NameInMap("ScaNum")
        public Integer scaNum;

        @NameInMap("Suspicious")
        public Integer suspicious;

        @NameInMap("SysNum")
        public Integer sysNum;

        @NameInMap("Trojan")
        public Integer trojan;

        @NameInMap("Uuid")
        public String uuid;

        @NameInMap("Vul")
        public Integer vul;

        public static DescribeInstanceStatisticsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceStatisticsResponseBodyData self = new DescribeInstanceStatisticsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceStatisticsResponseBodyData setAccount(Integer account) {
            this.account = account;
            return this;
        }
        public Integer getAccount() {
            return this.account;
        }

        public DescribeInstanceStatisticsResponseBodyData setAppNum(Integer appNum) {
            this.appNum = appNum;
            return this;
        }
        public Integer getAppNum() {
            return this.appNum;
        }

        public DescribeInstanceStatisticsResponseBodyData setCmsNum(Integer cmsNum) {
            this.cmsNum = cmsNum;
            return this;
        }
        public Integer getCmsNum() {
            return this.cmsNum;
        }

        public DescribeInstanceStatisticsResponseBodyData setCveNum(Integer cveNum) {
            this.cveNum = cveNum;
            return this;
        }
        public Integer getCveNum() {
            return this.cveNum;
        }

        public DescribeInstanceStatisticsResponseBodyData setEmgNum(Integer emgNum) {
            this.emgNum = emgNum;
            return this;
        }
        public Integer getEmgNum() {
            return this.emgNum;
        }

        public DescribeInstanceStatisticsResponseBodyData setHealth(Integer health) {
            this.health = health;
            return this;
        }
        public Integer getHealth() {
            return this.health;
        }

        public DescribeInstanceStatisticsResponseBodyData setScaNum(Integer scaNum) {
            this.scaNum = scaNum;
            return this;
        }
        public Integer getScaNum() {
            return this.scaNum;
        }

        public DescribeInstanceStatisticsResponseBodyData setSuspicious(Integer suspicious) {
            this.suspicious = suspicious;
            return this;
        }
        public Integer getSuspicious() {
            return this.suspicious;
        }

        public DescribeInstanceStatisticsResponseBodyData setSysNum(Integer sysNum) {
            this.sysNum = sysNum;
            return this;
        }
        public Integer getSysNum() {
            return this.sysNum;
        }

        public DescribeInstanceStatisticsResponseBodyData setTrojan(Integer trojan) {
            this.trojan = trojan;
            return this;
        }
        public Integer getTrojan() {
            return this.trojan;
        }

        public DescribeInstanceStatisticsResponseBodyData setUuid(String uuid) {
            this.uuid = uuid;
            return this;
        }
        public String getUuid() {
            return this.uuid;
        }

        public DescribeInstanceStatisticsResponseBodyData setVul(Integer vul) {
            this.vul = vul;
            return this;
        }
        public Integer getVul() {
            return this.vul;
        }

    }

}
