// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class DescribeFaultDiagnosisUserDetailRequest extends TeaModel {
    /**
     * <p>APP ID。</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>0rbd****</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>311</p>
     */
    @NameInMap("ChannelId")
    public String channelId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1615892596</p>
     */
    @NameInMap("CreatedTs")
    public Long createdTs;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>JOIN_SLOW</p>
     */
    @NameInMap("FaultType")
    public String faultType;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("QueryCallUserInfo")
    public Boolean queryCallUserInfo;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>c906531af5f9****</p>
     */
    @NameInMap("UserId")
    public String userId;

    public static DescribeFaultDiagnosisUserDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeFaultDiagnosisUserDetailRequest self = new DescribeFaultDiagnosisUserDetailRequest();
        return TeaModel.build(map, self);
    }

    public DescribeFaultDiagnosisUserDetailRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public DescribeFaultDiagnosisUserDetailRequest setChannelId(String channelId) {
        this.channelId = channelId;
        return this;
    }
    public String getChannelId() {
        return this.channelId;
    }

    public DescribeFaultDiagnosisUserDetailRequest setCreatedTs(Long createdTs) {
        this.createdTs = createdTs;
        return this;
    }
    public Long getCreatedTs() {
        return this.createdTs;
    }

    public DescribeFaultDiagnosisUserDetailRequest setFaultType(String faultType) {
        this.faultType = faultType;
        return this;
    }
    public String getFaultType() {
        return this.faultType;
    }

    public DescribeFaultDiagnosisUserDetailRequest setQueryCallUserInfo(Boolean queryCallUserInfo) {
        this.queryCallUserInfo = queryCallUserInfo;
        return this;
    }
    public Boolean getQueryCallUserInfo() {
        return this.queryCallUserInfo;
    }

    public DescribeFaultDiagnosisUserDetailRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
