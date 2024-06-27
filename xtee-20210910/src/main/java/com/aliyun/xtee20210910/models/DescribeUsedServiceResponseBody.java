// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeUsedServiceResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("records")
    public java.util.List<DescribeUsedServiceResponseBodyRecords> records;

    public static DescribeUsedServiceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeUsedServiceResponseBody self = new DescribeUsedServiceResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeUsedServiceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeUsedServiceResponseBody setRecords(java.util.List<DescribeUsedServiceResponseBodyRecords> records) {
        this.records = records;
        return this;
    }
    public java.util.List<DescribeUsedServiceResponseBodyRecords> getRecords() {
        return this.records;
    }

    public static class DescribeUsedServiceResponseBodyRecords extends TeaModel {
        @NameInMap("enName")
        public String enName;

        @NameInMap("name")
        public String name;

        @NameInMap("serviceCode")
        public String serviceCode;

        public static DescribeUsedServiceResponseBodyRecords build(java.util.Map<String, ?> map) throws Exception {
            DescribeUsedServiceResponseBodyRecords self = new DescribeUsedServiceResponseBodyRecords();
            return TeaModel.build(map, self);
        }

        public DescribeUsedServiceResponseBodyRecords setEnName(String enName) {
            this.enName = enName;
            return this;
        }
        public String getEnName() {
            return this.enName;
        }

        public DescribeUsedServiceResponseBodyRecords setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeUsedServiceResponseBodyRecords setServiceCode(String serviceCode) {
            this.serviceCode = serviceCode;
            return this;
        }
        public String getServiceCode() {
            return this.serviceCode;
        }

    }

}
