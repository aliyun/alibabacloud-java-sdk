// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class DescribeColumnarVersionListResponseBody extends TeaModel {
    @NameInMap("Data")
    public DescribeColumnarVersionListResponseBodyData data;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>9B2F3840-****-475C-B269-2D5C3A31797C</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeColumnarVersionListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeColumnarVersionListResponseBody self = new DescribeColumnarVersionListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeColumnarVersionListResponseBody setData(DescribeColumnarVersionListResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeColumnarVersionListResponseBodyData getData() {
        return this.data;
    }

    public DescribeColumnarVersionListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeColumnarVersionListResponseBodyData extends TeaModel {
        @NameInMap("VersionList")
        public java.util.List<String> versionList;

        public static DescribeColumnarVersionListResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeColumnarVersionListResponseBodyData self = new DescribeColumnarVersionListResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeColumnarVersionListResponseBodyData setVersionList(java.util.List<String> versionList) {
            this.versionList = versionList;
            return this;
        }
        public java.util.List<String> getVersionList() {
            return this.versionList;
        }

    }

}
