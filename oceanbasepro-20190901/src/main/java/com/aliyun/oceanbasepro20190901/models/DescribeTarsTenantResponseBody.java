// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DescribeTarsTenantResponseBody extends TeaModel {
    @NameInMap("Data")
    public DescribeTarsTenantResponseBodyData data;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeTarsTenantResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeTarsTenantResponseBody self = new DescribeTarsTenantResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeTarsTenantResponseBody setData(DescribeTarsTenantResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeTarsTenantResponseBodyData getData() {
        return this.data;
    }

    public DescribeTarsTenantResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeTarsTenantResponseBodyData extends TeaModel {
        @NameInMap("Qps")
        public Float qps;

        @NameInMap("TenantId")
        public String tenantId;

        @NameInMap("TenantName")
        public String tenantName;

        public static DescribeTarsTenantResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeTarsTenantResponseBodyData self = new DescribeTarsTenantResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeTarsTenantResponseBodyData setQps(Float qps) {
            this.qps = qps;
            return this;
        }
        public Float getQps() {
            return this.qps;
        }

        public DescribeTarsTenantResponseBodyData setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

        public DescribeTarsTenantResponseBodyData setTenantName(String tenantName) {
            this.tenantName = tenantName;
            return this;
        }
        public String getTenantName() {
            return this.tenantName;
        }

    }

}
