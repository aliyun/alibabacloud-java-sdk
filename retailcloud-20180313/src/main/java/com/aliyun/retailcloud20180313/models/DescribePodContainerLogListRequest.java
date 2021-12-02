// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailcloud20180313.models;

import com.aliyun.tea.*;

public class DescribePodContainerLogListRequest extends TeaModel {
    @NameInMap("AppId")
    public Long appId;

    @NameInMap("EnvId")
    public Long envId;

    @NameInMap("Line")
    public Integer line;

    @NameInMap("PodName")
    public String podName;

    public static DescribePodContainerLogListRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribePodContainerLogListRequest self = new DescribePodContainerLogListRequest();
        return TeaModel.build(map, self);
    }

    public DescribePodContainerLogListRequest setAppId(Long appId) {
        this.appId = appId;
        return this;
    }
    public Long getAppId() {
        return this.appId;
    }

    public DescribePodContainerLogListRequest setEnvId(Long envId) {
        this.envId = envId;
        return this;
    }
    public Long getEnvId() {
        return this.envId;
    }

    public DescribePodContainerLogListRequest setLine(Integer line) {
        this.line = line;
        return this;
    }
    public Integer getLine() {
        return this.line;
    }

    public DescribePodContainerLogListRequest setPodName(String podName) {
        this.podName = podName;
        return this;
    }
    public String getPodName() {
        return this.podName;
    }

}
