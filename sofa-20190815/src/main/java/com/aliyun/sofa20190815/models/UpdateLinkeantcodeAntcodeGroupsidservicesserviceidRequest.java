// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateLinkeantcodeAntcodeGroupsidservicesserviceidRequest extends TeaModel {
    @NameInMap("Id")
    public String id;

    @NameInMap("RequestGitOperate")
    public String requestGitOperate;

    @NameInMap("ServiceId")
    public String serviceId;

    @NameInMap("UpdateDTOJsonStr")
    public String updateDTOJsonStr;

    public static UpdateLinkeantcodeAntcodeGroupsidservicesserviceidRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateLinkeantcodeAntcodeGroupsidservicesserviceidRequest self = new UpdateLinkeantcodeAntcodeGroupsidservicesserviceidRequest();
        return TeaModel.build(map, self);
    }

    public UpdateLinkeantcodeAntcodeGroupsidservicesserviceidRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public UpdateLinkeantcodeAntcodeGroupsidservicesserviceidRequest setRequestGitOperate(String requestGitOperate) {
        this.requestGitOperate = requestGitOperate;
        return this;
    }
    public String getRequestGitOperate() {
        return this.requestGitOperate;
    }

    public UpdateLinkeantcodeAntcodeGroupsidservicesserviceidRequest setServiceId(String serviceId) {
        this.serviceId = serviceId;
        return this;
    }
    public String getServiceId() {
        return this.serviceId;
    }

    public UpdateLinkeantcodeAntcodeGroupsidservicesserviceidRequest setUpdateDTOJsonStr(String updateDTOJsonStr) {
        this.updateDTOJsonStr = updateDTOJsonStr;
        return this;
    }
    public String getUpdateDTOJsonStr() {
        return this.updateDTOJsonStr;
    }

}
