// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DisableLinkeantcodeAntcodeGroupsidinstallationsserviceidRequest extends TeaModel {
    @NameInMap("Id")
    public String id;

    @NameInMap("RequestGitOperate")
    public String requestGitOperate;

    @NameInMap("ServiceId")
    public String serviceId;

    public static DisableLinkeantcodeAntcodeGroupsidinstallationsserviceidRequest build(java.util.Map<String, ?> map) throws Exception {
        DisableLinkeantcodeAntcodeGroupsidinstallationsserviceidRequest self = new DisableLinkeantcodeAntcodeGroupsidinstallationsserviceidRequest();
        return TeaModel.build(map, self);
    }

    public DisableLinkeantcodeAntcodeGroupsidinstallationsserviceidRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public DisableLinkeantcodeAntcodeGroupsidinstallationsserviceidRequest setRequestGitOperate(String requestGitOperate) {
        this.requestGitOperate = requestGitOperate;
        return this;
    }
    public String getRequestGitOperate() {
        return this.requestGitOperate;
    }

    public DisableLinkeantcodeAntcodeGroupsidinstallationsserviceidRequest setServiceId(String serviceId) {
        this.serviceId = serviceId;
        return this;
    }
    public String getServiceId() {
        return this.serviceId;
    }

}
