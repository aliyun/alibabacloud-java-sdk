// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class DescribeCdcVersionListResponseBody extends TeaModel {
    @NameInMap("Data")
    public DescribeCdcVersionListResponseBodyData data;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>97632117-E477-5FE8-B424-F059CBBDD919</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeCdcVersionListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeCdcVersionListResponseBody self = new DescribeCdcVersionListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeCdcVersionListResponseBody setData(DescribeCdcVersionListResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeCdcVersionListResponseBodyData getData() {
        return this.data;
    }

    public DescribeCdcVersionListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeCdcVersionListResponseBodyData extends TeaModel {
        @NameInMap("VersionList")
        public java.util.List<String> versionList;

        public static DescribeCdcVersionListResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeCdcVersionListResponseBodyData self = new DescribeCdcVersionListResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeCdcVersionListResponseBodyData setVersionList(java.util.List<String> versionList) {
            this.versionList = versionList;
            return this;
        }
        public java.util.List<String> getVersionList() {
            return this.versionList;
        }

    }

}
