// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ReInitAKSClusterKubeconfigResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("KubeConfig")
    public String kubeConfig;

    public static ReInitAKSClusterKubeconfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ReInitAKSClusterKubeconfigResponseBody self = new ReInitAKSClusterKubeconfigResponseBody();
        return TeaModel.build(map, self);
    }

    public ReInitAKSClusterKubeconfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ReInitAKSClusterKubeconfigResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ReInitAKSClusterKubeconfigResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public ReInitAKSClusterKubeconfigResponseBody setKubeConfig(String kubeConfig) {
        this.kubeConfig = kubeConfig;
        return this;
    }
    public String getKubeConfig() {
        return this.kubeConfig;
    }

}
