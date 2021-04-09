// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.threedvision20210131.models;

import com.aliyun.tea.*;

public class ReconstructThreeDMultiViewResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public ReconstructThreeDMultiViewResponseBodyData data;

    public static ReconstructThreeDMultiViewResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ReconstructThreeDMultiViewResponseBody self = new ReconstructThreeDMultiViewResponseBody();
        return TeaModel.build(map, self);
    }

    public ReconstructThreeDMultiViewResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ReconstructThreeDMultiViewResponseBody setData(ReconstructThreeDMultiViewResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ReconstructThreeDMultiViewResponseBodyData getData() {
        return this.data;
    }

    public static class ReconstructThreeDMultiViewResponseBodyData extends TeaModel {
        @NameInMap("PointCloudURL")
        public String pointCloudURL;

        public static ReconstructThreeDMultiViewResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ReconstructThreeDMultiViewResponseBodyData self = new ReconstructThreeDMultiViewResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ReconstructThreeDMultiViewResponseBodyData setPointCloudURL(String pointCloudURL) {
            this.pointCloudURL = pointCloudURL;
            return this;
        }
        public String getPointCloudURL() {
            return this.pointCloudURL;
        }

    }

}
