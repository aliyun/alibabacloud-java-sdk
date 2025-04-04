// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sophonsoar20220728.models;

import com.aliyun.tea.*;

public class DescribeProcessTaskCountResponseBody extends TeaModel {
    /**
     * <p>Transmitted data.</p>
     */
    @NameInMap("Data")
    public java.util.List<DescribeProcessTaskCountResponseBodyData> data;

    /**
     * <p>The ID of this call request, which is a unique identifier generated by Alibaba Cloud for this request, used for troubleshooting and problem localization.</p>
     * 
     * <strong>example:</strong>
     * <p>e866cce0-****-41de-817e-****8d5e2650</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeProcessTaskCountResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeProcessTaskCountResponseBody self = new DescribeProcessTaskCountResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeProcessTaskCountResponseBody setData(java.util.List<DescribeProcessTaskCountResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<DescribeProcessTaskCountResponseBodyData> getData() {
        return this.data;
    }

    public DescribeProcessTaskCountResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeProcessTaskCountResponseBodyData extends TeaModel {
        /**
         * <p>Count.</p>
         * 
         * <strong>example:</strong>
         * <p>67</p>
         */
        @NameInMap("Count")
        public Long count;

        /**
         * <p>Entity UUID.</p>
         * 
         * <strong>example:</strong>
         * <p>a680c9ae-<strong><strong>-4c39-</strong></strong>-0302****fc8e</p>
         */
        @NameInMap("EntityUuid")
        public String entityUuid;

        public static DescribeProcessTaskCountResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeProcessTaskCountResponseBodyData self = new DescribeProcessTaskCountResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeProcessTaskCountResponseBodyData setCount(Long count) {
            this.count = count;
            return this;
        }
        public Long getCount() {
            return this.count;
        }

        public DescribeProcessTaskCountResponseBodyData setEntityUuid(String entityUuid) {
            this.entityUuid = entityUuid;
            return this;
        }
        public String getEntityUuid() {
            return this.entityUuid;
        }

    }

}
