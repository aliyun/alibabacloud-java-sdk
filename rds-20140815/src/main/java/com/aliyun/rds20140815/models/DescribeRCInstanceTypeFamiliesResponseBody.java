// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeRCInstanceTypeFamiliesResponseBody extends TeaModel {
    /**
     * <p>The instance families.</p>
     */
    @NameInMap("InstanceTypeFamilies")
    public DescribeRCInstanceTypeFamiliesResponseBodyInstanceTypeFamilies instanceTypeFamilies;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>F2911788-25E8-42E5-A3A3-1B38D263F01E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeRCInstanceTypeFamiliesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeRCInstanceTypeFamiliesResponseBody self = new DescribeRCInstanceTypeFamiliesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeRCInstanceTypeFamiliesResponseBody setInstanceTypeFamilies(DescribeRCInstanceTypeFamiliesResponseBodyInstanceTypeFamilies instanceTypeFamilies) {
        this.instanceTypeFamilies = instanceTypeFamilies;
        return this;
    }
    public DescribeRCInstanceTypeFamiliesResponseBodyInstanceTypeFamilies getInstanceTypeFamilies() {
        return this.instanceTypeFamilies;
    }

    public DescribeRCInstanceTypeFamiliesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeRCInstanceTypeFamiliesResponseBodyInstanceTypeFamiliesInstanceTypeFamily extends TeaModel {
        /**
         * <p>The description of the instance family.</p>
         */
        @NameInMap("InstanceTypeFamilyDesc")
        public String instanceTypeFamilyDesc;

        /**
         * <p>The ID of the instance family.</p>
         * 
         * <strong>example:</strong>
         * <p>x.6cm</p>
         */
        @NameInMap("InstanceTypeFamilyId")
        public String instanceTypeFamilyId;

        public static DescribeRCInstanceTypeFamiliesResponseBodyInstanceTypeFamiliesInstanceTypeFamily build(java.util.Map<String, ?> map) throws Exception {
            DescribeRCInstanceTypeFamiliesResponseBodyInstanceTypeFamiliesInstanceTypeFamily self = new DescribeRCInstanceTypeFamiliesResponseBodyInstanceTypeFamiliesInstanceTypeFamily();
            return TeaModel.build(map, self);
        }

        public DescribeRCInstanceTypeFamiliesResponseBodyInstanceTypeFamiliesInstanceTypeFamily setInstanceTypeFamilyDesc(String instanceTypeFamilyDesc) {
            this.instanceTypeFamilyDesc = instanceTypeFamilyDesc;
            return this;
        }
        public String getInstanceTypeFamilyDesc() {
            return this.instanceTypeFamilyDesc;
        }

        public DescribeRCInstanceTypeFamiliesResponseBodyInstanceTypeFamiliesInstanceTypeFamily setInstanceTypeFamilyId(String instanceTypeFamilyId) {
            this.instanceTypeFamilyId = instanceTypeFamilyId;
            return this;
        }
        public String getInstanceTypeFamilyId() {
            return this.instanceTypeFamilyId;
        }

    }

    public static class DescribeRCInstanceTypeFamiliesResponseBodyInstanceTypeFamilies extends TeaModel {
        /**
         * <p>The instance family.</p>
         */
        @NameInMap("InstanceTypeFamily")
        public java.util.List<DescribeRCInstanceTypeFamiliesResponseBodyInstanceTypeFamiliesInstanceTypeFamily> instanceTypeFamily;

        public static DescribeRCInstanceTypeFamiliesResponseBodyInstanceTypeFamilies build(java.util.Map<String, ?> map) throws Exception {
            DescribeRCInstanceTypeFamiliesResponseBodyInstanceTypeFamilies self = new DescribeRCInstanceTypeFamiliesResponseBodyInstanceTypeFamilies();
            return TeaModel.build(map, self);
        }

        public DescribeRCInstanceTypeFamiliesResponseBodyInstanceTypeFamilies setInstanceTypeFamily(java.util.List<DescribeRCInstanceTypeFamiliesResponseBodyInstanceTypeFamiliesInstanceTypeFamily> instanceTypeFamily) {
            this.instanceTypeFamily = instanceTypeFamily;
            return this;
        }
        public java.util.List<DescribeRCInstanceTypeFamiliesResponseBodyInstanceTypeFamiliesInstanceTypeFamily> getInstanceTypeFamily() {
            return this.instanceTypeFamily;
        }

    }

}
