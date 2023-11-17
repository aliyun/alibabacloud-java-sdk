// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sophonsoar20220728.models;

import com.aliyun.tea.*;

public class DescribeApiListResponseBody extends TeaModel {
    @NameInMap("ApiList")
    public java.util.List<DescribeApiListResponseBodyApiList> apiList;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeApiListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeApiListResponseBody self = new DescribeApiListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeApiListResponseBody setApiList(java.util.List<DescribeApiListResponseBodyApiList> apiList) {
        this.apiList = apiList;
        return this;
    }
    public java.util.List<DescribeApiListResponseBodyApiList> getApiList() {
        return this.apiList;
    }

    public DescribeApiListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeApiListResponseBodyApiList extends TeaModel {
        @NameInMap("DocUrl")
        public String docUrl;

        @NameInMap("PopCode")
        public String popCode;

        @NameInMap("ProductName")
        public String productName;

        public static DescribeApiListResponseBodyApiList build(java.util.Map<String, ?> map) throws Exception {
            DescribeApiListResponseBodyApiList self = new DescribeApiListResponseBodyApiList();
            return TeaModel.build(map, self);
        }

        public DescribeApiListResponseBodyApiList setDocUrl(String docUrl) {
            this.docUrl = docUrl;
            return this;
        }
        public String getDocUrl() {
            return this.docUrl;
        }

        public DescribeApiListResponseBodyApiList setPopCode(String popCode) {
            this.popCode = popCode;
            return this;
        }
        public String getPopCode() {
            return this.popCode;
        }

        public DescribeApiListResponseBodyApiList setProductName(String productName) {
            this.productName = productName;
            return this;
        }
        public String getProductName() {
            return this.productName;
        }

    }

}
