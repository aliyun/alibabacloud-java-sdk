// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class PushLinkeBahamutSubmitreleaeinmultienvRequest extends TeaModel {
    @NameInMap("IterationId")
    public String iterationId;

    @NameInMap("MultiEnvConfigsRepeatList")
    public java.util.List<String> multiEnvConfigsRepeatList;

    @NameInMap("ReleaseId")
    public String releaseId;

    @NameInMap("TenantId")
    public String tenantId;

    public static PushLinkeBahamutSubmitreleaeinmultienvRequest build(java.util.Map<String, ?> map) throws Exception {
        PushLinkeBahamutSubmitreleaeinmultienvRequest self = new PushLinkeBahamutSubmitreleaeinmultienvRequest();
        return TeaModel.build(map, self);
    }

    public PushLinkeBahamutSubmitreleaeinmultienvRequest setIterationId(String iterationId) {
        this.iterationId = iterationId;
        return this;
    }
    public String getIterationId() {
        return this.iterationId;
    }

    public PushLinkeBahamutSubmitreleaeinmultienvRequest setMultiEnvConfigsRepeatList(java.util.List<String> multiEnvConfigsRepeatList) {
        this.multiEnvConfigsRepeatList = multiEnvConfigsRepeatList;
        return this;
    }
    public java.util.List<String> getMultiEnvConfigsRepeatList() {
        return this.multiEnvConfigsRepeatList;
    }

    public PushLinkeBahamutSubmitreleaeinmultienvRequest setReleaseId(String releaseId) {
        this.releaseId = releaseId;
        return this;
    }
    public String getReleaseId() {
        return this.releaseId;
    }

    public PushLinkeBahamutSubmitreleaeinmultienvRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
