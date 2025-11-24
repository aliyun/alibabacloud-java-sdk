// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class GetDeploymentBySelectorResponseBody extends TeaModel {
    /**
     * <p>The queried workloads.</p>
     */
    @NameInMap("DeploymentNameList")
    public java.util.List<byte[]> deploymentNameList;

    /**
     * <p>The end-of-data marker.</p>
     * 
     * <strong>example:</strong>
     * <p>eyJ2IjoibWV0YS5rOHMuaW8vdjEiLCJydiI6NTgyMDUzMzk5MCwic3RhcnQiOiJwbXMtYWRhcHRlci1kZGxsXHUwMDA****</p>
     */
    @NameInMap("Mark")
    public String mark;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>946690C2-41D3-55A0-A501-E2FFAB5F****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetDeploymentBySelectorResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDeploymentBySelectorResponseBody self = new GetDeploymentBySelectorResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDeploymentBySelectorResponseBody setDeploymentNameList(java.util.List<byte[]> deploymentNameList) {
        this.deploymentNameList = deploymentNameList;
        return this;
    }
    public java.util.List<byte[]> getDeploymentNameList() {
        return this.deploymentNameList;
    }

    public GetDeploymentBySelectorResponseBody setMark(String mark) {
        this.mark = mark;
        return this;
    }
    public String getMark() {
        return this.mark;
    }

    public GetDeploymentBySelectorResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
