// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class DescribeDBInstanceHAResponseBody extends TeaModel {
    /**
     * <p>The high availability deployment information of the instance.</p>
     */
    @NameInMap("Data")
    public DescribeDBInstanceHAResponseBodyData data;

    /**
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>successs</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1A6D328C-84B8-40DC-BF49-6C73984D7494</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request is successful.</p>
     */
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
        /**
         * <p>The zone ID of the primary node.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou-d</p>
         */
        @NameInMap("PrimaryAzoneId")
        public String primaryAzoneId;

        /**
         * <p>The region ID of the primary node.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("PrimaryRegionId")
        public String primaryRegionId;

        /**
         * <p>The zone ID of the secondary node.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou-b</p>
         */
        @NameInMap("SecondaryAzoneId")
        public String secondaryAzoneId;

        /**
         * <p>The region ID of the secondary node.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("SecondaryRegionId")
        public String secondaryRegionId;

        /**
         * <p>The high availability topology type of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>3azones</p>
         */
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
