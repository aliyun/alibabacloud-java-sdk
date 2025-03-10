// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.selectdb20230522.models;

import com.aliyun.tea.*;

public class EnDisableScalingRulesResponseBody extends TeaModel {
    /**
     * <p>The data returned.</p>
     */
    @NameInMap("Data")
    public EnDisableScalingRulesResponseBodyData data;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>4773E4EC-025D-509F-AEA9-D53123FDFB0F</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static EnDisableScalingRulesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        EnDisableScalingRulesResponseBody self = new EnDisableScalingRulesResponseBody();
        return TeaModel.build(map, self);
    }

    public EnDisableScalingRulesResponseBody setData(EnDisableScalingRulesResponseBodyData data) {
        this.data = data;
        return this;
    }
    public EnDisableScalingRulesResponseBodyData getData() {
        return this.data;
    }

    public EnDisableScalingRulesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class EnDisableScalingRulesResponseBodyData extends TeaModel {
        /**
         * <p>The cluster ID.</p>
         * 
         * <strong>example:</strong>
         * <p>selectdb-cn-pe33jc1nd01-be</p>
         */
        @NameInMap("ClusterId")
        public String clusterId;

        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>selectdb-cn-7213cjv****</p>
         */
        @NameInMap("DbInstanceId")
        public String dbInstanceId;

        /**
         * <p>Indicates whether the scheduled scaling policy is enabled.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("ScalingRulesEnable")
        public Boolean scalingRulesEnable;

        public static EnDisableScalingRulesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            EnDisableScalingRulesResponseBodyData self = new EnDisableScalingRulesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public EnDisableScalingRulesResponseBodyData setClusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public String getClusterId() {
            return this.clusterId;
        }

        public EnDisableScalingRulesResponseBodyData setDbInstanceId(String dbInstanceId) {
            this.dbInstanceId = dbInstanceId;
            return this;
        }
        public String getDbInstanceId() {
            return this.dbInstanceId;
        }

        public EnDisableScalingRulesResponseBodyData setScalingRulesEnable(Boolean scalingRulesEnable) {
            this.scalingRulesEnable = scalingRulesEnable;
            return this;
        }
        public Boolean getScalingRulesEnable() {
            return this.scalingRulesEnable;
        }

    }

}
