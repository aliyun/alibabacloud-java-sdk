// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeCommonTargetConfigResponseBody extends TeaModel {
    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>An array that consists of the details of the configuration items.</p>
     */
    @NameInMap("TargetList")
    public java.util.List<DescribeCommonTargetConfigResponseBodyTargetList> targetList;

    public static DescribeCommonTargetConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeCommonTargetConfigResponseBody self = new DescribeCommonTargetConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeCommonTargetConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeCommonTargetConfigResponseBody setTargetList(java.util.List<DescribeCommonTargetConfigResponseBodyTargetList> targetList) {
        this.targetList = targetList;
        return this;
    }
    public java.util.List<DescribeCommonTargetConfigResponseBodyTargetList> getTargetList() {
        return this.targetList;
    }

    public static class DescribeCommonTargetConfigResponseBodyTargetList extends TeaModel {
        /**
         * <p>The mode in which the configuration takes effect. Valid values:</p>
         * <br>
         * <p>*   **add**: In this mode, the configuration takes effect on the assets.</p>
         * <p>*   **del**: In this mode, the configuration does not take effect on the assets.</p>
         */
        @NameInMap("Flag")
        public String flag;

        /**
         * <p>The ID of the asset on which the configuration takes effect.</p>
         * <br>
         * <p>> </p>
         * <br>
         * <p>*   When you set the **TargetType** parameter to **uuid**, the value of this parameter indicates the UUID of an asset.</p>
         * <br>
         * <p>*   When you set the **TargetType** parameter to **Cluster**, the value of this parameter indicates the ID of a cluster.</p>
         * <br>
         * <p>*   When you set the **TargetType** parameter to **image_repo**, the value of this parameter indicates the ID of an image repository.</p>
         */
        @NameInMap("Target")
        public String target;

        /**
         * <p>The dimension from on which the feature was configured. Valid values:</p>
         * <br>
         * <p>*   **uuid**: the UUID of the asset</p>
         * <p>*   **Cluster**: the ID of the cluster</p>
         * <p>*   **image_repo**: the ID of the image repository</p>
         */
        @NameInMap("TargetType")
        public String targetType;

        public static DescribeCommonTargetConfigResponseBodyTargetList build(java.util.Map<String, ?> map) throws Exception {
            DescribeCommonTargetConfigResponseBodyTargetList self = new DescribeCommonTargetConfigResponseBodyTargetList();
            return TeaModel.build(map, self);
        }

        public DescribeCommonTargetConfigResponseBodyTargetList setFlag(String flag) {
            this.flag = flag;
            return this;
        }
        public String getFlag() {
            return this.flag;
        }

        public DescribeCommonTargetConfigResponseBodyTargetList setTarget(String target) {
            this.target = target;
            return this;
        }
        public String getTarget() {
            return this.target;
        }

        public DescribeCommonTargetConfigResponseBodyTargetList setTargetType(String targetType) {
            this.targetType = targetType;
            return this;
        }
        public String getTargetType() {
            return this.targetType;
        }

    }

}
