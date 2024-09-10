// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeCommonTargetConfigResponseBody extends TeaModel {
    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>09969D2C-4FAD-429E-BFBF-9A60DEF8BF6F</p>
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
         * <ul>
         * <li><strong>add</strong>: In this mode, the configuration takes effect on the assets.</li>
         * <li><strong>del</strong>: In this mode, the configuration does not take effect on the assets.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>add</p>
         */
        @NameInMap("Flag")
        public String flag;

        /**
         * <p>The ID of the asset on which the configuration takes effect.</p>
         * <blockquote>
         * </blockquote>
         * <ul>
         * <li><p>When you set the <strong>TargetType</strong> parameter to <strong>uuid</strong>, the value of this parameter indicates the UUID of an asset.</p>
         * </li>
         * <li><p>When you set the <strong>TargetType</strong> parameter to <strong>Cluster</strong>, the value of this parameter indicates the ID of a cluster.</p>
         * </li>
         * <li><p>When you set the <strong>TargetType</strong> parameter to <strong>image_repo</strong>, the value of this parameter indicates the ID of an image repository.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>c23551de6149343e8a54e69fbefe6****</p>
         */
        @NameInMap("Target")
        public String target;

        /**
         * <p>The dimension from on which the feature was configured. Valid values:</p>
         * <ul>
         * <li><strong>uuid</strong>: the UUID of the asset</li>
         * <li><strong>Cluster</strong>: the ID of the cluster</li>
         * <li><strong>image_repo</strong>: the ID of the image repository</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>image_repo</p>
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
