// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateLinkeantcodeAntcodeNamespacesidservicesRequest extends TeaModel {
    @NameInMap("Id")
    public String id;

    @NameInMap("RequestGitOperate")
    public String requestGitOperate;

    @NameInMap("ServiceId")
    public String serviceId;

    @NameInMap("UpdateDTOJsonStr")
    public String updateDTOJsonStr;

    public static UpdateLinkeantcodeAntcodeNamespacesidservicesRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateLinkeantcodeAntcodeNamespacesidservicesRequest self = new UpdateLinkeantcodeAntcodeNamespacesidservicesRequest();
        return TeaModel.build(map, self);
    }

    public UpdateLinkeantcodeAntcodeNamespacesidservicesRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public UpdateLinkeantcodeAntcodeNamespacesidservicesRequest setRequestGitOperate(String requestGitOperate) {
        this.requestGitOperate = requestGitOperate;
        return this;
    }
    public String getRequestGitOperate() {
        return this.requestGitOperate;
    }

    public UpdateLinkeantcodeAntcodeNamespacesidservicesRequest setServiceId(String serviceId) {
        this.serviceId = serviceId;
        return this;
    }
    public String getServiceId() {
        return this.serviceId;
    }

    public UpdateLinkeantcodeAntcodeNamespacesidservicesRequest setUpdateDTOJsonStr(String updateDTOJsonStr) {
        this.updateDTOJsonStr = updateDTOJsonStr;
        return this;
    }
    public String getUpdateDTOJsonStr() {
        return this.updateDTOJsonStr;
    }

}
