// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class DescribeMPULayoutListResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("LayoutIds")
    public DescribeMPULayoutListResponseBodyLayoutIds layoutIds;

    public static DescribeMPULayoutListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeMPULayoutListResponseBody self = new DescribeMPULayoutListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeMPULayoutListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeMPULayoutListResponseBody setLayoutIds(DescribeMPULayoutListResponseBodyLayoutIds layoutIds) {
        this.layoutIds = layoutIds;
        return this;
    }
    public DescribeMPULayoutListResponseBodyLayoutIds getLayoutIds() {
        return this.layoutIds;
    }

    public static class DescribeMPULayoutListResponseBodyLayoutIds extends TeaModel {
        @NameInMap("LayoutId")
        public java.util.List<String> layoutId;

        public static DescribeMPULayoutListResponseBodyLayoutIds build(java.util.Map<String, ?> map) throws Exception {
            DescribeMPULayoutListResponseBodyLayoutIds self = new DescribeMPULayoutListResponseBodyLayoutIds();
            return TeaModel.build(map, self);
        }

        public DescribeMPULayoutListResponseBodyLayoutIds setLayoutId(java.util.List<String> layoutId) {
            this.layoutId = layoutId;
            return this;
        }
        public java.util.List<String> getLayoutId() {
            return this.layoutId;
        }

    }

}
