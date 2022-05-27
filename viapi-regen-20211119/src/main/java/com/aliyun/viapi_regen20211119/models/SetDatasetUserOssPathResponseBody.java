// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.viapi_regen20211119.models;

import com.aliyun.tea.*;

public class SetDatasetUserOssPathResponseBody extends TeaModel {
    @NameInMap("Data")
    public SetDatasetUserOssPathResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    public static SetDatasetUserOssPathResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SetDatasetUserOssPathResponseBody self = new SetDatasetUserOssPathResponseBody();
        return TeaModel.build(map, self);
    }

    public SetDatasetUserOssPathResponseBody setData(SetDatasetUserOssPathResponseBodyData data) {
        this.data = data;
        return this;
    }
    public SetDatasetUserOssPathResponseBodyData getData() {
        return this.data;
    }

    public SetDatasetUserOssPathResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class SetDatasetUserOssPathResponseBodyData extends TeaModel {
        @NameInMap("Id")
        public Long id;

        @NameInMap("OssUrl")
        public String ossUrl;

        public static SetDatasetUserOssPathResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            SetDatasetUserOssPathResponseBodyData self = new SetDatasetUserOssPathResponseBodyData();
            return TeaModel.build(map, self);
        }

        public SetDatasetUserOssPathResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public SetDatasetUserOssPathResponseBodyData setOssUrl(String ossUrl) {
            this.ossUrl = ossUrl;
            return this;
        }
        public String getOssUrl() {
            return this.ossUrl;
        }

    }

}
