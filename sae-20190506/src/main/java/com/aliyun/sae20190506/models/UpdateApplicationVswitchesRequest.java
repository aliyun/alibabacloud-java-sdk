// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class UpdateApplicationVswitchesRequest extends TeaModel {
    /**
     * <p>The application ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>0099b7be-5f5b-4512-a7fc-56049ef1****</p>
     */
    @NameInMap("AppId")
    public String appId;

    @NameInMap("Deploy")
    public Boolean deploy;

    @NameInMap("MinReadyInstanceRatio")
    public Integer minReadyInstanceRatio;

    @NameInMap("MinReadyInstances")
    public Integer minReadyInstances;

    /**
     * <p>The ID of the vSwitch.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>vsw-2ze559r1z1bpwqxwp****</p>
     */
    @NameInMap("VSwitchId")
    public String vSwitchId;

    public static UpdateApplicationVswitchesRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateApplicationVswitchesRequest self = new UpdateApplicationVswitchesRequest();
        return TeaModel.build(map, self);
    }

    public UpdateApplicationVswitchesRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public UpdateApplicationVswitchesRequest setDeploy(Boolean deploy) {
        this.deploy = deploy;
        return this;
    }
    public Boolean getDeploy() {
        return this.deploy;
    }

    public UpdateApplicationVswitchesRequest setMinReadyInstanceRatio(Integer minReadyInstanceRatio) {
        this.minReadyInstanceRatio = minReadyInstanceRatio;
        return this;
    }
    public Integer getMinReadyInstanceRatio() {
        return this.minReadyInstanceRatio;
    }

    public UpdateApplicationVswitchesRequest setMinReadyInstances(Integer minReadyInstances) {
        this.minReadyInstances = minReadyInstances;
        return this;
    }
    public Integer getMinReadyInstances() {
        return this.minReadyInstances;
    }

    public UpdateApplicationVswitchesRequest setVSwitchId(String vSwitchId) {
        this.vSwitchId = vSwitchId;
        return this;
    }
    public String getVSwitchId() {
        return this.vSwitchId;
    }

}
