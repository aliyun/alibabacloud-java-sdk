// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vdc20201214.models;

import com.aliyun.tea.*;

public class DescribeFaultDiagnosisUserListRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    @NameInMap("ChannelId")
    public String channelId;

    @NameInMap("EndTs")
    public Long endTs;

    @NameInMap("FaultTypes")
    public String faultTypes;

    @NameInMap("PageNo")
    public Integer pageNo;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("StartTs")
    public Long startTs;

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
