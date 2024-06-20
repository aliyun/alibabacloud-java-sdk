// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class DescribeFaultDiagnosisUserListRequest extends TeaModel {
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
    @NameInMap("EndTs")
    public Long endTs;

    /**
     * <strong>example:</strong>
     * <p>JOIN_SLOW,AUDIO_STUCK</p>
     */
    @NameInMap("FaultTypes")
    public String faultTypes;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNo")
    public Integer pageNo;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1615806196</p>
     */
    @NameInMap("StartTs")
    public Long startTs;

    /**
     * <strong>example:</strong>
     * <p>c906531af5f9****</p>
     */
    @NameInMap("UserId")
    public String userId;

    public static DescribeFaultDiagnosisUserListRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeFaultDiagnosisUserListRequest self = new DescribeFaultDiagnosisUserListRequest();
        return TeaModel.build(map, self);
    }

    public DescribeFaultDiagnosisUserListRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public DescribeFaultDiagnosisUserListRequest setChannelId(String channelId) {
        this.channelId = channelId;
        return this;
    }
    public String getChannelId() {
        return this.channelId;
    }

    public DescribeFaultDiagnosisUserListRequest setEndTs(Long endTs) {
        this.endTs = endTs;
        return this;
    }
    public Long getEndTs() {
        return this.endTs;
    }

    public DescribeFaultDiagnosisUserListRequest setFaultTypes(String faultTypes) {
        this.faultTypes = faultTypes;
        return this;
    }
    public String getFaultTypes() {
        return this.faultTypes;
    }

    public DescribeFaultDiagnosisUserListRequest setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Integer getPageNo() {
        return this.pageNo;
    }

    public DescribeFaultDiagnosisUserListRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeFaultDiagnosisUserListRequest setStartTs(Long startTs) {
        this.startTs = startTs;
        return this;
    }
    public Long getStartTs() {
        return this.startTs;
    }

    public DescribeFaultDiagnosisUserListRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
