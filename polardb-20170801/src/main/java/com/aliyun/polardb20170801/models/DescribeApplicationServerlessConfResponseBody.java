// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeApplicationServerlessConfResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>pa-**************</p>
     */
    @NameInMap("ApplicationId")
    public String applicationId;

    /**
     * <strong>example:</strong>
     * <p>CDB3258F-B5DE-43C4-8935-CBA0CA******</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ServerlessConfItems")
    public java.util.List<DescribeApplicationServerlessConfResponseBodyServerlessConfItems> serverlessConfItems;

    public static DescribeApplicationServerlessConfResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeApplicationServerlessConfResponseBody self = new DescribeApplicationServerlessConfResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeApplicationServerlessConfResponseBody setApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }
    public String getApplicationId() {
        return this.applicationId;
    }

    public DescribeApplicationServerlessConfResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeApplicationServerlessConfResponseBody setServerlessConfItems(java.util.List<DescribeApplicationServerlessConfResponseBodyServerlessConfItems> serverlessConfItems) {
        this.serverlessConfItems = serverlessConfItems;
        return this;
    }
    public java.util.List<DescribeApplicationServerlessConfResponseBodyServerlessConfItems> getServerlessConfItems() {
        return this.serverlessConfItems;
    }

    public static class DescribeApplicationServerlessConfResponseBodyServerlessConfItems extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>gateway</p>
         */
        @NameInMap("ComponentType")
        public String componentType;

        /**
         * <strong>example:</strong>
         * <p>16</p>
         */
        @NameInMap("ScaleMax")
        public String scaleMax;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ScaleMin")
        public String scaleMin;

        public static DescribeApplicationServerlessConfResponseBodyServerlessConfItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeApplicationServerlessConfResponseBodyServerlessConfItems self = new DescribeApplicationServerlessConfResponseBodyServerlessConfItems();
            return TeaModel.build(map, self);
        }

        public DescribeApplicationServerlessConfResponseBodyServerlessConfItems setComponentType(String componentType) {
            this.componentType = componentType;
            return this;
        }
        public String getComponentType() {
            return this.componentType;
        }

        public DescribeApplicationServerlessConfResponseBodyServerlessConfItems setScaleMax(String scaleMax) {
            this.scaleMax = scaleMax;
            return this;
        }
        public String getScaleMax() {
            return this.scaleMax;
        }

        public DescribeApplicationServerlessConfResponseBodyServerlessConfItems setScaleMin(String scaleMin) {
            this.scaleMin = scaleMin;
            return this;
        }
        public String getScaleMin() {
            return this.scaleMin;
        }

    }

}
