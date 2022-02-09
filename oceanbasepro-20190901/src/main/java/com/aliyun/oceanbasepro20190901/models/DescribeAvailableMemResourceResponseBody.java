// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DescribeAvailableMemResourceResponseBody extends TeaModel {
    // 可用的内存资源信息。
    @NameInMap("Data")
    public DescribeAvailableMemResourceResponseBodyData data;

    // 请求ID。
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeAvailableMemResourceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAvailableMemResourceResponseBody self = new DescribeAvailableMemResourceResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAvailableMemResourceResponseBody setData(DescribeAvailableMemResourceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeAvailableMemResourceResponseBodyData getData() {
        return this.data;
    }

    public DescribeAvailableMemResourceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeAvailableMemResourceResponseBodyData extends TeaModel {
        // 单个unit最大可申请的内存大小，单位：GB。
        @NameInMap("MaxMem")
        public Long maxMem;

        // 单个unit最小需要申请的内存大小，单位：GB。
        @NameInMap("MinMem")
        public Long minMem;

        // 租户的unit个数。
        @NameInMap("UsedMem")
        public Long usedMem;

        public static DescribeAvailableMemResourceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeAvailableMemResourceResponseBodyData self = new DescribeAvailableMemResourceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeAvailableMemResourceResponseBodyData setMaxMem(Long maxMem) {
            this.maxMem = maxMem;
            return this;
        }
        public Long getMaxMem() {
            return this.maxMem;
        }

        public DescribeAvailableMemResourceResponseBodyData setMinMem(Long minMem) {
            this.minMem = minMem;
            return this;
        }
        public Long getMinMem() {
            return this.minMem;
        }

        public DescribeAvailableMemResourceResponseBodyData setUsedMem(Long usedMem) {
            this.usedMem = usedMem;
            return this;
        }
        public Long getUsedMem() {
            return this.usedMem;
        }

    }

}
