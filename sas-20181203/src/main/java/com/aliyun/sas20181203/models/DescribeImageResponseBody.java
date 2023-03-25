// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeImageResponseBody extends TeaModel {
    /**
     * <p>The information about the image digest.</p>
     */
    @NameInMap("Data")
    public DescribeImageResponseBodyData data;

    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeImageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeImageResponseBody self = new DescribeImageResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeImageResponseBody setData(DescribeImageResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeImageResponseBodyData getData() {
        return this.data;
    }

    public DescribeImageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeImageResponseBodyData extends TeaModel {
        /**
         * <p>The digest value of the image.</p>
         */
        @NameInMap("Digest")
        public String digest;

        public static DescribeImageResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeImageResponseBodyData self = new DescribeImageResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeImageResponseBodyData setDigest(String digest) {
            this.digest = digest;
            return this;
        }
        public String getDigest() {
            return this.digest;
        }

    }

}
