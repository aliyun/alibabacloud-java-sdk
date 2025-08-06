// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DescribeVodAppNameResponseBody extends TeaModel {
    @NameInMap("Data")
    public java.util.List<DescribeVodAppNameResponseBodyData> data;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeVodAppNameResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeVodAppNameResponseBody self = new DescribeVodAppNameResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeVodAppNameResponseBody setData(java.util.List<DescribeVodAppNameResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<DescribeVodAppNameResponseBodyData> getData() {
        return this.data;
    }

    public DescribeVodAppNameResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeVodAppNameResponseBodyData extends TeaModel {
        @NameInMap("AppName")
        public String appName;

        public static DescribeVodAppNameResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeVodAppNameResponseBodyData self = new DescribeVodAppNameResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeVodAppNameResponseBodyData setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

    }

}
