// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class DescribeBindableSmartAccessGatewaysResponseBody extends TeaModel {
    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SmartAccessGateways")
    public DescribeBindableSmartAccessGatewaysResponseBodySmartAccessGateways smartAccessGateways;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeBindableSmartAccessGatewaysResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeBindableSmartAccessGatewaysResponseBody self = new DescribeBindableSmartAccessGatewaysResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeBindableSmartAccessGatewaysResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeBindableSmartAccessGatewaysResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeBindableSmartAccessGatewaysResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeBindableSmartAccessGatewaysResponseBody setSmartAccessGateways(DescribeBindableSmartAccessGatewaysResponseBodySmartAccessGateways smartAccessGateways) {
        this.smartAccessGateways = smartAccessGateways;
        return this;
    }
    public DescribeBindableSmartAccessGatewaysResponseBodySmartAccessGateways getSmartAccessGateways() {
        return this.smartAccessGateways;
    }

    public DescribeBindableSmartAccessGatewaysResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeBindableSmartAccessGatewaysResponseBodySmartAccessGatewaysSmartAccessGateway extends TeaModel {
        @NameInMap("Name")
        public String name;

        @NameInMap("SmartAGId")
        public String smartAGId;

        @NameInMap("SmartAGUid")
        public Long smartAGUid;

        public static DescribeBindableSmartAccessGatewaysResponseBodySmartAccessGatewaysSmartAccessGateway build(java.util.Map<String, ?> map) throws Exception {
            DescribeBindableSmartAccessGatewaysResponseBodySmartAccessGatewaysSmartAccessGateway self = new DescribeBindableSmartAccessGatewaysResponseBodySmartAccessGatewaysSmartAccessGateway();
            return TeaModel.build(map, self);
        }

        public DescribeBindableSmartAccessGatewaysResponseBodySmartAccessGatewaysSmartAccessGateway setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeBindableSmartAccessGatewaysResponseBodySmartAccessGatewaysSmartAccessGateway setSmartAGId(String smartAGId) {
            this.smartAGId = smartAGId;
            return this;
        }
        public String getSmartAGId() {
            return this.smartAGId;
        }

        public DescribeBindableSmartAccessGatewaysResponseBodySmartAccessGatewaysSmartAccessGateway setSmartAGUid(Long smartAGUid) {
            this.smartAGUid = smartAGUid;
            return this;
        }
        public Long getSmartAGUid() {
            return this.smartAGUid;
        }

    }

    public static class DescribeBindableSmartAccessGatewaysResponseBodySmartAccessGateways extends TeaModel {
        @NameInMap("SmartAccessGateway")
        public java.util.List<DescribeBindableSmartAccessGatewaysResponseBodySmartAccessGatewaysSmartAccessGateway> smartAccessGateway;

        public static DescribeBindableSmartAccessGatewaysResponseBodySmartAccessGateways build(java.util.Map<String, ?> map) throws Exception {
            DescribeBindableSmartAccessGatewaysResponseBodySmartAccessGateways self = new DescribeBindableSmartAccessGatewaysResponseBodySmartAccessGateways();
            return TeaModel.build(map, self);
        }

        public DescribeBindableSmartAccessGatewaysResponseBodySmartAccessGateways setSmartAccessGateway(java.util.List<DescribeBindableSmartAccessGatewaysResponseBodySmartAccessGatewaysSmartAccessGateway> smartAccessGateway) {
            this.smartAccessGateway = smartAccessGateway;
            return this;
        }
        public java.util.List<DescribeBindableSmartAccessGatewaysResponseBodySmartAccessGatewaysSmartAccessGateway> getSmartAccessGateway() {
            return this.smartAccessGateway;
        }

    }

}
