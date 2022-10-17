// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.threedvision20210131.models;

import com.aliyun.tea.*;

public class ReconstructBodyBySingleImageResponseBody extends TeaModel {
    @NameInMap("Data")
    public ReconstructBodyBySingleImageResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    public static ReconstructBodyBySingleImageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ReconstructBodyBySingleImageResponseBody self = new ReconstructBodyBySingleImageResponseBody();
        return TeaModel.build(map, self);
    }

    public ReconstructBodyBySingleImageResponseBody setData(ReconstructBodyBySingleImageResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ReconstructBodyBySingleImageResponseBodyData getData() {
        return this.data;
    }

    public ReconstructBodyBySingleImageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ReconstructBodyBySingleImageResponseBodyData extends TeaModel {
        @NameInMap("DepthURL")
        public String depthURL;

        @NameInMap("MeshURL")
        public String meshURL;

        public static ReconstructBodyBySingleImageResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ReconstructBodyBySingleImageResponseBodyData self = new ReconstructBodyBySingleImageResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ReconstructBodyBySingleImageResponseBodyData setDepthURL(String depthURL) {
            this.depthURL = depthURL;
            return this;
        }
        public String getDepthURL() {
            return this.depthURL;
        }

        public ReconstructBodyBySingleImageResponseBodyData setMeshURL(String meshURL) {
            this.meshURL = meshURL;
            return this;
        }
        public String getMeshURL() {
            return this.meshURL;
        }

    }

}
