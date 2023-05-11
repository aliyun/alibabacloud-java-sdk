// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class DescribeDBInstanceHAResponseBody extends TeaModel {
    @NameInMap("Data")
    public DescribeDBInstanceHAResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static DescribeDBInstanceHAResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBInstanceHAResponseBody self = new DescribeDBInstanceHAResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDBInstanceHAResponseBody setData(DescribeDBInstanceHAResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeDBInstanceHAResponseBodyData getData() {
        return this.data;
    }

    public DescribeDBInstanceHAResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeDBInstanceHAResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDBInstanceHAResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeDBInstanceHAResponseBodyData extends TeaModel {
        @NameInMap("PrimaryAzoneId")
        public String primaryAzoneId;

        @NameInMap("PrimaryRegionId")
        public String primaryRegionId;

        @NameInMap("SecondaryAzoneId")
        public String secondaryAzoneId;

        @NameInMap("SecondaryRegionId")
        public String secondaryRegionId;

        @NameInMap("TopologyType")
        public String topologyType;

        public static DescribeDBInstanceHAResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBInstanceHAResponseBodyData self = new DescribeDBInstanceHAResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeDBInstanceHAResponseBodyData setPrimaryAzoneId(String primaryAzoneId) {
            this.primaryAzoneId = primaryAzoneId;
            return this;
        }
        public String getPrimaryAzoneId() {
            return this.primaryAzoneId;
        }

        public DescribeDBInstanceHAResponseBodyData setPrimaryRegionId(String primaryRegionId) {
            this.primaryRegionId = primaryRegionId;
            return this;
        }
        public String getPrimaryRegionId() {
            return this.primaryRegionId;
        }

        public DescribeDBInstanceHAResponseBodyData setSecondaryAzoneId(String secondaryAzoneId) {
            this.secondaryAzoneId = secondaryAzoneId;
            return this;
        }
        public String getSecondaryAzoneId() {
            return this.secondaryAzoneId;
        }

        public DescribeDBInstanceHAResponseBodyData setSecondaryRegionId(String secondaryRegionId) {
            this.secondaryRegionId = secondaryRegionId;
            return this;
        }
        public String getSecondaryRegionId() {
            return this.secondaryRegionId;
        }

        public DescribeDBInstanceHAResponseBodyData setTopologyType(String topologyType) {
            this.topologyType = topologyType;
            return this;
        }
        public String getTopologyType() {
            return this.topologyType;
        }

    }

}
