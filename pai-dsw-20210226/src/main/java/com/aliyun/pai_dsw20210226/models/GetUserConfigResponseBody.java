// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dsw20210226.models;

import com.aliyun.tea.*;

public class GetUserConfigResponseBody extends TeaModel {
    // 当前版本
    @NameInMap("CurrentFeatureVersion")
    public String currentFeatureVersion;

    // 是否启用v2功能
    @NameInMap("EnableEmrCluster")
    public Boolean enableEmrCluster;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    // 是否显示特价版功能
    @NameInMap("UseOnSaleVersion")
    public Boolean useOnSaleVersion;

    // 是否使用团队版功能（v21）
    @NameInMap("UseV21Feature")
    public Boolean useV21Feature;

    public static GetUserConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetUserConfigResponseBody self = new GetUserConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public GetUserConfigResponseBody setCurrentFeatureVersion(String currentFeatureVersion) {
        this.currentFeatureVersion = currentFeatureVersion;
        return this;
    }
    public String getCurrentFeatureVersion() {
        return this.currentFeatureVersion;
    }

    public GetUserConfigResponseBody setEnableEmrCluster(Boolean enableEmrCluster) {
        this.enableEmrCluster = enableEmrCluster;
        return this;
    }
    public Boolean getEnableEmrCluster() {
        return this.enableEmrCluster;
    }

    public GetUserConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetUserConfigResponseBody setUseOnSaleVersion(Boolean useOnSaleVersion) {
        this.useOnSaleVersion = useOnSaleVersion;
        return this;
    }
    public Boolean getUseOnSaleVersion() {
        return this.useOnSaleVersion;
    }

    public GetUserConfigResponseBody setUseV21Feature(Boolean useV21Feature) {
        this.useV21Feature = useV21Feature;
        return this;
    }
    public Boolean getUseV21Feature() {
        return this.useV21Feature;
    }

}
