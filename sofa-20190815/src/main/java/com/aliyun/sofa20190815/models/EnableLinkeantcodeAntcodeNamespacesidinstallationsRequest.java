// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class EnableLinkeantcodeAntcodeNamespacesidinstallationsRequest extends TeaModel {
    @NameInMap("Id")
    public String id;

    @NameInMap("RequestGitOperate")
    public String requestGitOperate;

    @NameInMap("ServiceId")
    public String serviceId;

    public static EnableLinkeantcodeAntcodeNamespacesidinstallationsRequest build(java.util.Map<String, ?> map) throws Exception {
        EnableLinkeantcodeAntcodeNamespacesidinstallationsRequest self = new EnableLinkeantcodeAntcodeNamespacesidinstallationsRequest();
        return TeaModel.build(map, self);
    }

    public EnableLinkeantcodeAntcodeNamespacesidinstallationsRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public EnableLinkeantcodeAntcodeNamespacesidinstallationsRequest setRequestGitOperate(String requestGitOperate) {
        this.requestGitOperate = requestGitOperate;
        return this;
    }
    public String getRequestGitOperate() {
        return this.requestGitOperate;
    }

    public EnableLinkeantcodeAntcodeNamespacesidinstallationsRequest setServiceId(String serviceId) {
        this.serviceId = serviceId;
        return this;
    }
    public String getServiceId() {
        return this.serviceId;
    }

}
