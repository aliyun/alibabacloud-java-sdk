// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DescribeZonesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public java.util.List<DescribeZonesResponseBodyData> data;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("ResultCode")
    public String resultCode;

    public static DescribeZonesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeZonesResponseBody self = new DescribeZonesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeZonesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeZonesResponseBody setData(java.util.List<DescribeZonesResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<DescribeZonesResponseBodyData> getData() {
        return this.data;
    }

    public DescribeZonesResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public DescribeZonesResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public static class DescribeZonesResponseBodyData extends TeaModel {
        @NameInMap("State")
        public String state;

        @NameInMap("IaasId")
        public String iaasId;

        @NameInMap("Name")
        public String name;

        @NameInMap("Id")
        public String id;

        @NameInMap("PaasId")
        public String paasId;

        @NameInMap("RegionId")
        public String regionId;

        public static DescribeZonesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeZonesResponseBodyData self = new DescribeZonesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeZonesResponseBodyData setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public DescribeZonesResponseBodyData setIaasId(String iaasId) {
            this.iaasId = iaasId;
            return this;
        }
        public String getIaasId() {
            return this.iaasId;
        }

        public DescribeZonesResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeZonesResponseBodyData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public DescribeZonesResponseBodyData setPaasId(String paasId) {
            this.paasId = paasId;
            return this;
        }
        public String getPaasId() {
            return this.paasId;
        }

        public DescribeZonesResponseBodyData setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

    }

}
