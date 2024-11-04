// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sophonsoar20220728.models;

import com.aliyun.tea.*;

public class DescribeProcessTaskCountResponseBody extends TeaModel {
    @NameInMap("Data")
    public java.util.List<DescribeProcessTaskCountResponseBodyData> data;

    /**
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
         * <strong>example:</strong>
         * <p>67</p>
         */
        @NameInMap("Count")
        public Long count;

        /**
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
