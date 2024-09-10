// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeAssetsScaProcessNumResponseBody extends TeaModel {
    /**
     * <p>The statistical results.</p>
     */
    @NameInMap("Data")
    public java.util.List<DescribeAssetsScaProcessNumResponseBodyData> data;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>ACF97412-FD09-4D1F-994F-34DF12BREF20</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeAssetsScaProcessNumResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAssetsScaProcessNumResponseBody self = new DescribeAssetsScaProcessNumResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAssetsScaProcessNumResponseBody setData(java.util.List<DescribeAssetsScaProcessNumResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<DescribeAssetsScaProcessNumResponseBodyData> getData() {
        return this.data;
    }

    public DescribeAssetsScaProcessNumResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeAssetsScaProcessNumResponseBodyData extends TeaModel {
        /**
         * <p>The number of Java processes.</p>
         * <blockquote>
         * <p> If no processes exist on the asset, no statistical result is returned.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("Count")
        public Integer count;

        /**
         * <p>The UUID of the asset.</p>
         * <blockquote>
         * <p> If no processes exist on the asset, no statistical result is returned.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>6690a46c-0edb-4663-a641-3629d1a9****</p>
         */
        @NameInMap("Uuid")
        public String uuid;

        public static DescribeAssetsScaProcessNumResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeAssetsScaProcessNumResponseBodyData self = new DescribeAssetsScaProcessNumResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeAssetsScaProcessNumResponseBodyData setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

        public DescribeAssetsScaProcessNumResponseBodyData setUuid(String uuid) {
            this.uuid = uuid;
            return this;
        }
        public String getUuid() {
            return this.uuid;
        }

    }

}
