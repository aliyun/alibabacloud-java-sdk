// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DescribeTenantReadableScnResponseBody extends TeaModel {
    @NameInMap("Data")
    public DescribeTenantReadableScnResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeTenantReadableScnResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeTenantReadableScnResponseBody self = new DescribeTenantReadableScnResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeTenantReadableScnResponseBody setData(DescribeTenantReadableScnResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeTenantReadableScnResponseBodyData getData() {
        return this.data;
    }

    public DescribeTenantReadableScnResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeTenantReadableScnResponseBodyData extends TeaModel {
        @NameInMap("ReadableScn")
        public Long readableScn;

        public static DescribeTenantReadableScnResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeTenantReadableScnResponseBodyData self = new DescribeTenantReadableScnResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeTenantReadableScnResponseBodyData setReadableScn(Long readableScn) {
            this.readableScn = readableScn;
            return this;
        }
        public Long getReadableScn() {
            return this.readableScn;
        }

    }

}
