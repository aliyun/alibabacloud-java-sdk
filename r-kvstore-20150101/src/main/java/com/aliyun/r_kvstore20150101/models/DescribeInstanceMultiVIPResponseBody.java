// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class DescribeInstanceMultiVIPResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>r-8vb30e8n0m4nvu7tff.redis.zhangbei.rds.aliyuncs.com</p>
     */
    @NameInMap("MasterDns")
    public String masterDns;

    @NameInMap("MasterDnsRecord")
    public java.util.List<String> masterDnsRecord;

    /**
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("MaxQuota")
    public Long maxQuota;

    @NameInMap("MultiVIPList")
    public java.util.List<DescribeInstanceMultiVIPResponseBodyMultiVIPList> multiVIPList;

    /**
     * <strong>example:</strong>
     * <p>ABAF95F6-35C1-4177-AF3A-70969EBD****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeInstanceMultiVIPResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceMultiVIPResponseBody self = new DescribeInstanceMultiVIPResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceMultiVIPResponseBody setMasterDns(String masterDns) {
        this.masterDns = masterDns;
        return this;
    }
    public String getMasterDns() {
        return this.masterDns;
    }

    public DescribeInstanceMultiVIPResponseBody setMasterDnsRecord(java.util.List<String> masterDnsRecord) {
        this.masterDnsRecord = masterDnsRecord;
        return this;
    }
    public java.util.List<String> getMasterDnsRecord() {
        return this.masterDnsRecord;
    }

    public DescribeInstanceMultiVIPResponseBody setMaxQuota(Long maxQuota) {
        this.maxQuota = maxQuota;
        return this;
    }
    public Long getMaxQuota() {
        return this.maxQuota;
    }

    public DescribeInstanceMultiVIPResponseBody setMultiVIPList(java.util.List<DescribeInstanceMultiVIPResponseBodyMultiVIPList> multiVIPList) {
        this.multiVIPList = multiVIPList;
        return this;
    }
    public java.util.List<DescribeInstanceMultiVIPResponseBodyMultiVIPList> getMultiVIPList() {
        return this.multiVIPList;
    }

    public DescribeInstanceMultiVIPResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeInstanceMultiVIPResponseBodyMultiVIPList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>r-bp1p4pzsr2rtubcvns-conn1.redis.rds.aliyuncs.com</p>
         */
        @NameInMap("ConnectionString")
        public String connectionString;

        public static DescribeInstanceMultiVIPResponseBodyMultiVIPList build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceMultiVIPResponseBodyMultiVIPList self = new DescribeInstanceMultiVIPResponseBodyMultiVIPList();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceMultiVIPResponseBodyMultiVIPList setConnectionString(String connectionString) {
            this.connectionString = connectionString;
            return this;
        }
        public String getConnectionString() {
            return this.connectionString;
        }

    }

}
